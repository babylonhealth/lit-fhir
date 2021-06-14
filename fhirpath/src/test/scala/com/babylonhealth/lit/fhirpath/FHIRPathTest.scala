package com.babylonhealth.lit.fhirpath

import cats.instances.either._
import fastparse.Parsed

import com.babylonhealth.lit.core.ChoiceImplicits._
import com.babylonhealth.lit.core.model._
import com.babylonhealth.lit.core.{ toCode, FHIRDate, FHIRDateTime, LitSeq }
import com.babylonhealth.lit.hl7.{ BUNDLE_TYPE,OBSERVATION_STATUS, QUESTIONNAIRE_ANSWERS_STATUS }
import java.time.{LocalTime, ZonedDateTime}

import com.babylonhealth.lit.hl7.model._
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class FHIRPathTest extends AnyFreeSpec with Matchers {
  type EitherErr[+T] = Either[Exception, T]
  val patient =
    Patient(
      id = Some("patient123"),
      name = LitSeq(HumanName(given = LitSeq("Walter"), family = Some("White"))),
      extension = LitSeq(Extension(url = "http://a.123", value = Some(choice(toCode("a patient extension")))))
    )
  val observation = Observation(
    code = CodeableConcept(
      coding = LitSeq(
        Coding(system = Some("Code-123"), code = Some("Code-123"))
      )),
    value = Some(choice(Quantity(unit = Some("mm"), value = Some(12.3)))),
    status = OBSERVATION_STATUS.FINAL,
    subject = Some(Reference(reference = Some("patient123")))
  )
  val practitioner = Practitioner(
    id = Some("Practitioner"),
    extension = LitSeq(Extension(url = "http://b.456", value = Some(choice("a practitioner extension")))))

  val parser = Parser

  implicit val fhirCli: FHIRReadClient[EitherErr] = {
    case "patient123" => Right(patient)
    case _            => Left(new RuntimeException("no client"))
  }

  val bundle = Bundle(
    `type` = BUNDLE_TYPE.TRANSACTION,
    entry = LitSeq(
      Bundle.Entry(resource = Some(patient)),
      Bundle.Entry(resource = Some(observation)),
      Bundle.Entry(resource = Some(practitioner)))
  )

  "Base case works" in {
    val p1 = parser.parseUnsafe("Patient.name.given")
    p1[EitherErr](patient).toTry.get shouldEqual List("Walter")
  }
  "Base case returns error if type mismatch on initial element" in {
    val p1 = parser.parseUnsafe("Account.name.given")
    p1[EitherErr](patient).left.get.getMessage should fullyMatch regex "This FHIR path expects the initial object to be a .*Account, but it's a Patient"
  }
  "Base case works without initial root" in {
    val p1 = parser.parseUnsafe("name.given")
    p1[EitherErr](patient).toTry.get shouldEqual List("Walter")
  }

  "ofType works" in {
    val p1 = parser.parseUnsafe("Bundle.entry.resource.ofType(Observation)")
    p1[EitherErr](bundle).toTry.get shouldEqual List(observation)
  }
  "$this case works" in {
    val p1 = parser.parseUnsafe("$this.name.given")
    p1[EitherErr](patient).toTry.get shouldEqual List("Walter")
  }
  "omg works w/ syntax" in {
    import parser._
    fhir"Patient.name.given" [EitherErr](patient).toTry.get shouldEqual List("Walter")
  }
  "resolve might work" in {
    parser.parseUnsafe("Bundle.entry.resource.subject.resolve().name.given")[EitherErr](bundle).toTry.get shouldEqual List(
      "Walter")
  }
  "extension works" in {
    parser
      .parseUnsafe("Bundle.entry.resource.extension(\"http://a.123\")")[EitherErr](bundle)
      .toTry
      .get shouldEqual patient.extension.toList
    parser
      .parseUnsafe("Bundle.entry.resource.extension(\"http://b.456\")")[EitherErr](bundle)
      .toTry
      .get shouldEqual practitioner.extension.toList
  }
  "where works" in {
    parser
      .parseUnsafe("Bundle.entry.resource.where(name.family = \"White\").id")[EitherErr](bundle)
      .toTry
      .get shouldEqual List("patient123")
  }
  "where works without a chained inner path" in {
    parser
      .parseUnsafe("Bundle.entry.resource.name.where(family = \"White\").family")[EitherErr](bundle)
      .toTry
      .get shouldEqual List("White")
  }
  "where works with logical operator or" in {
    parser
      .parseUnsafe("Bundle.entry.resource.name.where(family = \"Whie\" or given = \"Walter\").family")[EitherErr](bundle)
      .toTry
      .get shouldEqual List("White")
  }
  "where works with logical operator and" in {
    parser
      .parseUnsafe("Bundle.entry.resource.name.where(family = \"Whie\" and given = \"Walter\").family")[EitherErr](bundle)
      .toTry
      .get shouldEqual List()
  }
  "where works with logical operators and parens" in {
    parser
      .parseUnsafe("Bundle.entry.resource.name.where((family = \"Whie\") or given = \"Walter\").family")[EitherErr](bundle)
      .toTry
      .get shouldEqual List("White")
  }
  "'pure' functions" - {
    "count()" in {
      parser
        .parseUnsafe("Bundle.entry.resource.count()")[EitherErr](bundle)
        .toTry
        .get shouldEqual List(3)
    }
    val bundle2 = bundle.updateEntry(e => e ++ e)
    "distinct()" in {
      bundle2.entry.size shouldEqual 6
      parser
        .parseUnsafe("Bundle.entry.resource.distinct()")[EitherErr](bundle)
        .toTry
        .get shouldEqual bundle.entry.flatMap(_.resource).toList
      parser
        .parseUnsafe("Bundle.entry.resource")[EitherErr](bundle2)
        .toTry
        .get shouldEqual bundle.entry.flatMap(_.resource).toList ++ bundle.entry.flatMap(_.resource).toList
      parser
        .parseUnsafe("Bundle.entry.resource.distinct()")[EitherErr](bundle2)
        .toTry
        .get shouldEqual bundle.entry.flatMap(_.resource).toList
    }
    "isDistinct()" in {
      parser
        .parseUnsafe("Bundle.entry.resource.isDistinct()")[EitherErr](bundle)
        .toTry
        .get shouldEqual List(true)
      parser
        .parseUnsafe("Bundle.entry.resource.isDistinct()")[EitherErr](bundle2)
        .toTry
        .get shouldEqual List(false)
    }
    "empty()" in {
      parser
        .parseUnsafe("Bundle.entry.resource.empty()")[EitherErr](bundle)
        .toTry
        .get shouldEqual List(false)
      parser
        .parseUnsafe("Bundle.entry.request.empty()")[EitherErr](bundle2)
        .toTry
        .get shouldEqual List(true)
    }
    "allTrue()" in {
      parser
        .parseUnsafe("Bundle.entry.resource.empty().allTrue()")[EitherErr](bundle)
        .toTry
        .get shouldEqual List(false)
      parser
        .parseUnsafe("Bundle.entry.request.empty().allTrue()")[EitherErr](bundle2)
        .toTry
        .get shouldEqual List(true)
    }
    "allFalse()" in {
      parser
        .parseUnsafe("Bundle.entry.resource.empty().allFalse()")[EitherErr](bundle)
        .toTry
        .get shouldEqual List(true)
      parser
        .parseUnsafe("Bundle.entry.request.empty().allFalse()")[EitherErr](bundle2)
        .toTry
        .get shouldEqual List(false)
    }
    "anyTrue()" in {
      parser
        .parseUnsafe("Bundle.entry.resource.empty().anyTrue()")[EitherErr](bundle)
        .toTry
        .get shouldEqual List(false)
      parser
        .parseUnsafe("Bundle.entry.request.empty().anyTrue()")[EitherErr](bundle2)
        .toTry
        .get shouldEqual List(true)
    }
    "anyFalse()" in {
      parser
        .parseUnsafe("Bundle.entry.resource.empty().anyFalse()")[EitherErr](bundle)
        .toTry
        .get shouldEqual List(true)
      parser
        .parseUnsafe("Bundle.entry.request.empty().anyFalse()")[EitherErr](bundle2)
        .toTry
        .get shouldEqual List(false)
    }
    "first()" in {
      parser
        .parseUnsafe("Bundle.entry.resource.first()")[EitherErr](bundle)
        .toTry
        .get shouldEqual List(patient)
    }
    "last()" in {
      parser
        .parseUnsafe("Bundle.entry.resource.last()")[EitherErr](bundle)
        .toTry
        .get shouldEqual List(practitioner)
    }
    "tail()" in {
      parser
        .parseUnsafe("Bundle.entry.resource.tail()")[EitherErr](bundle)
        .toTry
        .get shouldEqual List(observation, practitioner)
    }
  }
  "listy functions" - {
    "access by index" in {
      parser.parseUnsafe("Bundle.entry.resource[1]")[EitherErr](bundle).toTry.get shouldEqual List(observation)
    }
    "skip(n)" in {
      parser.parseUnsafe("Bundle.entry.resource.skip(2)")[EitherErr](bundle).toTry.get shouldEqual List(practitioner)
    }
    "take(n)" in {
      parser.parseUnsafe("Bundle.entry.resource.take(2)")[EitherErr](bundle).toTry.get shouldEqual List(patient, observation)
    }
    "intersect(coll)" in {
      parser.parseUnsafe("Bundle.entry.resource.id.intersect('patient123')")[EitherErr](bundle).toTry.get shouldEqual List(
        "patient123")
    }
    "exclude(coll)" in {
      parser.parseUnsafe("Bundle.entry.resource.id.exclude('patient123')")[EitherErr](bundle).toTry.get shouldEqual List(
        "Practitioner")
    }
    "union(coll)" in {
      parser.parseUnsafe("Bundle.entry.resource.id.union('abd')")[EitherErr](bundle).toTry.get shouldEqual List(
        "patient123",
        "Practitioner",
        "abd")
      parser.parseUnsafe("Bundle.entry.resource.id.union('patient123')")[EitherErr](bundle).toTry.get shouldEqual List(
        "patient123",
        "Practitioner")
    }
    "combine(coll)" in {
      parser.parseUnsafe("Bundle.entry.resource.id.combine('abd')")[EitherErr](bundle).toTry.get shouldEqual List(
        "patient123",
        "Practitioner",
        "abd")
      parser.parseUnsafe("Bundle.entry.resource.id.combine('patient123')")[EitherErr](bundle).toTry.get shouldEqual List(
        "patient123",
        "Practitioner",
        "patient123")
    }
  }

  "string ops" - {
    "startsWith" in {
      parser.parseUnsafe("name.given.startsWith('Walt')")[EitherErr](patient).toTry.get shouldEqual List(true)
      parser.parseUnsafe("name.given.startsWith('alt')")[EitherErr](patient).toTry.get shouldEqual List(false)
    }
    "endsWith" in {
      parser.parseUnsafe("name.given.endsWith('alter')")[EitherErr](patient).toTry.get shouldEqual List(true)
      parser.parseUnsafe("name.given.endsWith('alt')")[EitherErr](patient).toTry.get shouldEqual List(false)
    }
    "contains" in {
      parser.parseUnsafe("name.given.contains('alt')")[EitherErr](patient).toTry.get shouldEqual List(true)
      parser.parseUnsafe("name.given.contains('fault')")[EitherErr](patient).toTry.get shouldEqual List(false)
    }
    "matches" in {
      parser.parseUnsafe("name.given.matches('W.+r')")[EitherErr](patient).toTry.get shouldEqual List(true)
      parser.parseUnsafe("name.given.contains('W.+e')")[EitherErr](patient).toTry.get shouldEqual List(false)
    }
    "inside where" in {
      parser.parseUnsafe("entry.resource.where(id.startsWith('patient'))")[EitherErr](bundle).toTry.get shouldEqual List(patient)
      parser.parseUnsafe("entry.resource.where(id.startsWith('atient'))")[EitherErr](bundle).toTry.get shouldEqual Nil
    }
    "inside exists" in {
      parser.parseUnsafe("entry.resource.exists(id.startsWith('patient'))")[EitherErr](bundle).toTry.get shouldEqual List(true)
      parser.parseUnsafe("entry.resource.exists(id.startsWith('atient'))")[EitherErr](bundle).toTry.get shouldEqual List(false)
    }
    "inside all" in {
      parser.parseUnsafe("$this.exists(id.startsWith('patient'))")[EitherErr](patient).toTry.get shouldEqual List(true)
      parser.parseUnsafe("entry.resource.all(id.startsWith('patient'))")[EitherErr](bundle).toTry.get shouldEqual List(false)
    }
  }

  "logic ops" - {
    "and operation" in {
      parser
        .parseUnsafe("Bundle.entry.resource.empty() and Bundle.aa.empty()")[EitherErr](bundle)
        .toTry
        .get shouldEqual List(false)

      parser
        .parseUnsafe("name.given.startsWith('Walt') and name.given.endsWith('alter') and name.given.contains('alt')")[EitherErr](
          patient)
        .toTry
        .get shouldEqual List(true)
    }

    "or operation" in {
      val bundle2 = bundle.updateEntry(e => e ++ e)
      parser
        .parseUnsafe("Bundle.entry.resource.empty() or Bundle.aa.empty()")[EitherErr](bundle2)
        .toTry
        .get shouldEqual List(true)

      parser
        .parseUnsafe("name.given.startsWith('Wlt') or name.given.endsWith('altr') or name.given.contains('alsst')")[EitherErr](
          patient)
        .toTry
        .get shouldEqual List(false)
    }
    "implies operation" in {
      parser
        .parseUnsafe("name.given.startsWith('Wlt') implies name.given.endsWith('altr')")[EitherErr](patient)
        .toTry
        .get shouldEqual List(true)

      parser
        .parseUnsafe("name.given.endsWith('alter') implies name.given.startsWith('sss')")[EitherErr](patient)
        .toTry
        .get shouldEqual List(false)
    }

    "parens operation" in {
      parser
        .parseUnsafe("name.given.startsWith('Wlt') or (name.given.endsWith('altr') or name.given.contains('alsst'))")[EitherErr](
          patient)
        .toTry
        .get shouldEqual List(false)

      parser
        .parseUnsafe("name.given.startsWith('Wlt') or (name.given.endsWith('alter') and name.given.contains('alt'))")[EitherErr](
          patient)
        .toTry
        .get shouldEqual List(true)

      parser
        .parseUnsafe("name.given.startsWith('Wlt') or (name.given.endsWith('alter') and name.given.contains('alsst'))")[EitherErr](
          patient)
        .toTry
        .get shouldEqual List(false)
    }

  }

  "Operations ops" - {
    "equal with another path" in {
      parser
        .parseUnsafe("name.given != name.family")[EitherErr](patient)
        .toTry
        .get shouldEqual List(true)
    }

    "equal with value" in {
      parser
        .parseUnsafe("name.given = 'Walter'")[EitherErr](patient)
        .toTry
        .get shouldEqual List(true)
    }
  }
  ".where(_ is _)" in {
    parser
      .parseUnsafe("entry.resource.where(extension.value is code)")[EitherErr](bundle)
      .toTry
      .get shouldEqual List(patient)
  }
  ".where(_.is(_))" in {
    parser
      .parseUnsafe("entry.resource.where(extension.value.is(code))")[EitherErr](bundle)
      .toTry
      .get shouldEqual List(patient)
  }
  "_ as _" in {
    parser
      .parseUnsafe("entry.resource.extension.value[0] as code")[EitherErr](bundle)
      .toTry
      .get shouldEqual List(toCode("a patient extension"))
    parser
      .parseUnsafe("entry.resource[0] as Patient")[EitherErr](bundle)
      .toTry
      .get shouldEqual List(patient)
  }
  "_.as(_)" in {
    parser
      .parseUnsafe("entry.resource.extension.value[0].as(code)")[EitherErr](bundle)
      .toTry
      .get shouldEqual List(toCode("a patient extension"))
  }
  val ext_1 = "http://hl7.org/fhir/StructureDefinition/questionnaireresponse-isSubject"
  val ext_2 = "http://hl7.org/fhir/StructureDefinition/questionnaireresponse-isMuppet"
  s"QuestionnaireResponse.item.where(hasExtension('$ext_1')).answer.value.ofType(Reference)" in {
    val item1 = QuestionnaireResponse
      .Item(
        answer =
          LitSeq(QuestionnaireResponse.Item.Answer(value = Some(choice(Reference(reference = Some("YES MATE")))))),
        text = Some("this"),
        extension = LitSeq(Extension(url = ext_1, value = Some(choice(3)))),
        linkId = "lolwut"
      )
    val item2 = QuestionnaireResponse.Item(
      answer =
        LitSeq(QuestionnaireResponse.Item.Answer(value = Some(choice(Reference(reference = Some("NO LADDIE")))))),
      text = Some("not this, though"),
      extension = LitSeq(Extension(url = ext_2, value = Some(choice("foooo")))),
      linkId = "no thanks!"
    )
    val qr = QuestionnaireResponse(
      item = LitSeq(item1, item2),
      status = QUESTIONNAIRE_ANSWERS_STATUS.ENTERED_IN_ERROR
    )
    parser
      .parseUnsafe(s"hasExtension('$ext_1')")[EitherErr](item1)
      .toTry
      .get shouldEqual List(true)
    parser
      .parseUnsafe(s"hasExtension('$ext_1')")[EitherErr](item2)
      .toTry
      .get shouldEqual List(false)
    parser
      .parseUnsafe(
        s"QuestionnaireResponse.item.where(hasExtension('$ext_1')).answer.value.ofType(Reference).reference")[EitherErr](qr)
      .toTry
      .get shouldEqual List(toCode("YES MATE"))
  }
  "Patient.deceased.exists() and Patient.deceased != false" in {
    parser
      .parseUnsafe("Patient.deceased.exists() and Patient.deceased != false")[EitherErr](patient)
      .toTry
      .get shouldEqual List(false)
    val deadPatient: Patient = patient.withDeceased(Some(choice(true)))
    deadPatient.deceased.get.value shouldEqual true
    parser
      .parseUnsafe("Patient.deceased.exists()")[EitherErr](deadPatient)
      .toTry
      .get shouldEqual List(true)
    parser
      .parseUnsafe("Patient.deceased != false")[EitherErr](deadPatient)
      .toTry
      .get shouldEqual List(true)
    parser
      .parseUnsafe("Patient.deceased.exists() and Patient.deceased != false")[EitherErr](deadPatient)
      .toTry
      .get shouldEqual List(true)
  }

  // http://hl7.org/fhirpath/#singleton-evaluation-of-collections
  "Singleton evaluation of collections" - {

    // TODO: fix
    "Single-value collections can be implicitly converted" ignore {
      evalFhirPath("true < 3") shouldEqual List(true)
    }

    "Single-value collections convert to 'true'" in {
      evalFhirPath("'hello' and true") shouldEqual List(true)
    }

    "Empty collections propagate through single-value functions" in {
      evalFhirPath("{} and true") shouldEqual List.empty
    }

    // TODO: fix
    "Error when a value cannot be implicit converted" ignore {
      parser.parseUnsafe("'hello' < 3")[EitherErr](patient) should matchPattern { case Left(_) => }
    }

    // TODO: fix
    "Error when a single-value function is given multiple values" ignore {
      parser.parseUnsafe("('hello' | 'bonjour') and true")[EitherErr](patient) should matchPattern { case Left(_) => }
    }
  }

  // http://hl7.org/fhirpath/#keywords
  "Reserved words cannot be used in paths" in {
    parser.parse("Patient.true") should matchPattern { case Parsed.Failure(_) => }
    parser.parse("Patient.and") should matchPattern { case Parsed.Failure(_) => }
  }

  // http://hl7.org/fhirpath/#literals-2
  "Literals are supported" in {
    evalFhirPath("{}") shouldEqual List.empty
    evalFhirPath("true") shouldEqual List(true)
    evalFhirPath("false") shouldEqual List(false)
    evalFhirPath("7") shouldEqual List(7)
    evalFhirPath("0.5") shouldEqual List(0.5)
    evalFhirPath("@2014-01-25") shouldEqual List(FHIRDate.parse("2014-01-25"))
    evalFhirPath("@T14:30:14.559") shouldEqual List(LocalTime.parse("14:30:14.559"))
    evalFhirPath("@2014-01-25T14:30:14.559") shouldEqual List(
      FHIRDateTime(ZonedDateTime.parse("2014-01-25T14:30:14Z").withNano(559_000_000)))
    evalFhirPath("@2014-01-25T14:30:14Z") shouldEqual List(FHIRDateTime.parse("2014-01-25T14:30:14Z"))
    evalFhirPath("@2014-01-25T14:30:14+03:00") shouldEqual List(FHIRDateTime.parse("2014-01-25T14:30:14+03:00"))
    // TODO: impl this
    // evalFhirPath("4.5 'mg'") shouldEqual List(Quantity(value = Some(4.5), unit = Some("mg"), code = Some("mg")))
  }

  "whitespace is not ignored in tokens" in {
    evalFhirPath("\"   hello\"") shouldEqual List("   hello")
    parser.parse("3 . 1      4") should matchPattern { case Parsed.Failure(_) => }
    parser.parse("h e     l  l o w o r l d") should matchPattern { case Parsed.Failure(_) => }
  }

  "codes are equal to strings" in {
    evalFhirPath("Observation.status = 'final'", observation) shouldEqual List(true)
    evalFhirPath("Observation.status = 'amended'", observation) shouldEqual List(false)
  }

  "can navigate to value[x] fields" in {
    evalFhirPath("Observation.value.unit = 'mm'", observation) shouldEqual List(true)
    evalFhirPath("Observation.valueQuantity.unit = 'mm'", observation) shouldEqual List(true)
  }

  "Comparison operator tests " in {
    evalFhirPath("name.count() > 1") shouldEqual List(false)
    evalFhirPath("name.count() < 1") shouldEqual List(false)  
    evalFhirPath("name.count() = 1") shouldEqual List(true)  
    evalFhirPath("name.count() != 1") shouldEqual List(false) 
    evalFhirPath("name.count() > 0") shouldEqual List(true) 
    evalFhirPath("name.count() < 8") shouldEqual List(true) 
  }

  "Root path behaviour" - {
    val obs = Observation(
      status = OBSERVATION_STATUS.FINAL,
      code = CodeableConcept(coding = LitSeq(Coding(code = Some("abc"))))
    )

    "Root first behaves like a type" in {
      // In `select(code)`, `code` refers to the TYPE "code" (yes there is a type called "code" :( )
      evalFhirPath("code.coding.code.select(code)", obs) shouldEqual obs.code.coding.flatMap(_.code).toList
    }

    "If root doesn't match the type, root behaves like a field" in {
      // In `select(code)`, `code` refers to the FIELD "code" on CodeableConcept
      evalFhirPath("code.coding.select(code)", obs) shouldEqual obs.code.coding.flatMap(_.code).toList
    }

    "If root doesn't match the type or a field, error" in {
      assertThrows[Exception] {
        // In `select(code)`, the context is not of type "code" and has no field called "code", so error
        evalFhirPath("code.select(code)", patient)
      }
    }
  }

  def evalFhirPath(fhirPath: String, resource: Resource = patient): List[Any] = {
    parser.parseUnsafe(fhirPath)[EitherErr](resource).toTry.get
  }
}
