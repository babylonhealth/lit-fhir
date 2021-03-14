package com.babylonhealth.lit.fhirpath

import fastparse.Parsed
import org.scalactic.source
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

import scala.util.Try

import com.babylonhealth.lit.fhirpath.model._
import com.babylonhealth.lit.fhirpath.conversions._
import com.babylonhealth.lit.fhirpath.genScala._
import com.babylonhealth.lit.hl7.model.{ DeviceRequest, Patient }

class FHIRPathParserTest extends AnyFreeSpec with Matchers {
  type EitherErr[+T] = Either[Exception, T]
  val cli: FHIRReadClient[EitherErr] = { case _ =>
    Left(new RuntimeException("no client"))
  }
  val parser = Parser

  def root(name: String) = RootPath(TypeSpecifier("FHIR", name))

  def literal[T: AsValue](x: T): SingleValue = SingleValue(Value.wrap(x))

  "Base case works" in {
    val p1 = Parser.parse("Patient.name.given")
    p1.isSuccess shouldEqual true
    val Parsed.Success(value, successIndex) = p1
    value shouldEqual root("Patient")("name")("given")
  }
  "Base case returns error if initial element name is bad" in {
    val p1 = parser.parse("Pateint.name.given")
    p1.isSuccess shouldEqual false
    val Parsed.Failure(label, index, e) = p1
//    println("Parsed.Failure", label, index, e)
//    label shouldEqual "IDK"
  }
  "ofType works" in {
    val p1 = parser.parse("Bundle.entry.resource.ofType(Observation)")
    p1.isSuccess shouldEqual true
    val Parsed.Success(value, successIndex) = p1
    value shouldEqual root("Bundle")("entry")("resource").invoke(OfType(TypeSpecifier("FHIR", "Observation")))
  }
  "$this case works" in {
    val p1 = parser.parse("$this.name.given")
    p1.isSuccess shouldEqual true
    val Parsed.Success(value, successIndex) = p1
    value shouldEqual This("name")("given")
  }
  "omg works w/ syntax" in {
    import parser._
    val p1 = fhir"Patient.name.given"
    p1 shouldEqual root("Patient")("name")("given")
  }
  "resolve might work" in {
    val p1 = parser.parse("Bundle.entry.resource.subject.resolve().name.given")
    p1.isSuccess shouldEqual true
    val Parsed.Success(value, successIndex) = p1
    value shouldEqual root("Bundle")("entry")("resource")("subject").invoke(Func("resolve"))("name")("given")
  }
  "where works" in {
    val p1 = parser.parse("Bundle.entry.resource.where(meta.profile = \"blah\").code.coding")
    p1.isSuccess shouldEqual true
    val Parsed.Success(value, successIndex) = p1
    value shouldEqual root("Bundle")("entry")("resource").invoke(
      Func("where", Seq(BinaryOperation(FieldAccess("meta")("profile"), Eq, literal("blah"))))
    )("code")("coding")
  }
  "where works without a chained inner path" in {
    val p1 = parser.parse("Bundle.entry.resource.meta.where(profile = \"blah\").profile")
    p1.isSuccess shouldEqual true
    val Parsed.Success(value, successIndex) = p1
    value shouldEqual root("Bundle")("entry")("resource")("meta")
      .invoke(Func("where", Seq(BinaryOperation(FieldAccess("profile"), Eq, literal("blah")))))("profile")
  }

  "parses a 'startsWith'" in {
    val p1 = parser.parse("name.given.startsWith('Walt')")
    p1.isSuccess shouldEqual true
    val Parsed.Success(value, successIndex) = p1
    value shouldEqual FieldAccess("name")("given").invoke(Func("startsWith", Seq(literal("Walt"))))
  }

  "parses a 'startsWith' inside a 'where'" in {
    val p1 = parser.parse("Bundle.entry.resource.where(id.startsWith('patient') = true)")
    p1.isSuccess shouldEqual true
    val Parsed.Success(value, successIndex) = p1
    value shouldEqual root("Bundle")("entry")("resource").invoke(
      Func(
        "where",
        Seq(BinaryOperation(FieldAccess("id").invoke(Func("startsWith", Seq(literal("patient")))), Eq, literal(true)))
      )
    )
  }

  "parses a 'startsWith' inside a 'where' without op" in {
    val p1 = parser.parse("Bundle.entry.resource.where(id.startsWith('patient'))")
    p1.isSuccess shouldEqual true
    val Parsed.Success(value, successIndex) = p1
    value shouldEqual root("Bundle")("entry")("resource").invoke(
      Func("where", Seq(FieldAccess("id").invoke(Func("startsWith", Seq(literal("patient"))))))
    )
  }

  "Logic functions in parsing" in {
    val p1 = parser.parse("Patient.what or Patient.what and Patient.hi")
    p1.isSuccess shouldEqual true
    val Parsed.Success(value, _) = p1
    value shouldEqual BinaryOperation(
      root("Patient")("what"),
      Or,
      BinaryOperation(root("Patient")("what"), And, root("Patient")("hi"))
    )

    val p2 = parser.parse("Patient.what implies Patient.bs")
    p2.isSuccess shouldEqual true
    val Parsed.Success(value2, _) = p2
    value2 shouldEqual BinaryOperation(root("Patient")("what"), Implies, root("Patient")("bs"))
  }

  "Logic functions with parens" in {
    val p1 = parser.parse("Patient.what or (Patient.what and Patient.hi)")
    p1.isSuccess shouldEqual true
    val Parsed.Success(value, _) = p1
    value shouldEqual BinaryOperation(
      root("Patient")("what"),
      Or,
      BinaryOperation(root("Patient")("what"), And, root("Patient")("hi"))
    )
  }

  "Operations on equalty" in {
    val p0 = parser.parse("Patient.name = Patient.hi")
    p0.isSuccess shouldEqual true
    val Parsed.Success(value, _) = p0
    value shouldEqual BinaryOperation(root("Patient")("name"), Eq, root("Patient")("hi"))
    val p1 = parser.parse("Patient.name = Patient.gender")
    p1.isSuccess shouldEqual true
    val p2 = parser.parse("Patient.name is Patient")
    p2.isSuccess shouldEqual true
    val pclass                    = classOf[Patient]
    val Parsed.Success(value2, _) = p2
    value2 shouldEqual TypeOperation(root("Patient")("name"), Is, TypeSpecifier("FHIR", "Patient"))

    val p3 = parser.parse("Patient.name != 1")
    p3.isSuccess shouldEqual true
    val Parsed.Success(value3, _) = p3
    value3 shouldEqual BinaryOperation(root("Patient")("name"), Neq, literal(1))
  }

  "where works with operator logic" in {
    val p1 = parser.parse("Bundle.entry.resource.where(meta.profile = \"blah\" or meta.profile = \"biu\")")
    p1.isSuccess shouldEqual true
    val Parsed.Success(value, _) = p1
    value shouldEqual root("Bundle")("entry")("resource").invoke(Func(
      "where",
      Seq(
        BinaryOperation(
          BinaryOperation(FieldAccess("meta")("profile"), Eq, literal("blah")),
          Or,
          BinaryOperation(FieldAccess("meta")("profile"), Eq, literal("biu")))
      )
    ))
  }

  "Tree navigations" in {
    val p1 = parser.parse("Patient.children()")
    p1.isSuccess shouldEqual true
    val Parsed.Success(value, _) = p1
    value shouldEqual root("Patient").invoke(Func("children"))
  }

  "error messages" - {
    "exist" in {
      val tryParse = Try {
        parser.parseUnsafe("this.$%^.isInvalid")
      }

      val error = tryParse.toEither.left.get

      error.getMessage shouldNot be("")
    }

    "should indicate where they failed" in {
      val tryParse = Try {
        parser.parseUnsafe("theFirstBitWhichIsFine.$%^.theEnd")
      }

      val error = tryParse.toEither.left.get

      error.getMessage should include("$%^")
      error.getMessage shouldNot include("theFirstBitWhichIsFine")
    }
  }
  import fastparse._
  "entry.resource.where(extension.value is code)" - {
    "Code" in {
      val res = parse("code", Parser.fhirType(_))
      res should matchPattern { case Parsed.Success(_, _) =>
      }
    }
  }
  "Account.subject.where(resolve() is Patient)" - {
    "resolve()" in {
      val res = parse("resolve()", Parser.functionCall(_))
      res should matchPattern { case Parsed.Success(_, _) =>
      }
    }
    "resolve() is Patient" in {
      val res = parse("resolve() is Patient", Parser.typeExpr(_))
      res should matchPattern { case Parsed.Success(_, _) =>
      }
    }
    "where(resolve() is Patient)" in {
      val res = parse("where(resolve() is Patient)", Parser.functionCall(_))
      res match {
        case Parsed.Failure(label, index, extra) => println("oh. No. ...", label, extra.trace().longAggregateMsg)
        case _                                   =>
      }
      res should matchPattern { case Parsed.Success(_, _) =>
      }
    }
    "Account.subject.where(resolve() is Patient)" in {
      val res = parse("Account.subject.where(resolve() is Patient)", parser.top(_))
      res should matchPattern { case Parsed.Success(_, _) =>
      }
    }
  }
  "Account.subject.where(resolve() as Patient)" - {
    "resolve() as Patient" in {
      val res = parse("resolve() as Patient", Parser.typeExpr(_), verboseFailures = true)
      res match {
        case v @ Parsed.Success(v1, _) => println(s"!!2 ${v.toString()}")
        case _                         =>
      }
      res should matchPattern { case Parsed.Success(_, _) =>
      }
    }
    "where(resolve() as Patient)" in {
      val res = parse("where(resolve() as Patient)", Parser.functionCall(_), verboseFailures = true)
      res match {
        case Parsed.Failure(label, index, extra) => println("oh. No. ...", label, extra.trace().longAggregateMsg)
        case _                                   =>
      }
      res should matchPattern { case Parsed.Success(_, _) =>
      }
    }
    "Account.subject.where(resolve() as Patient)" in {
      val res = parse("Bundle.entry.resource as Patient", parser.top(_), verboseFailures = true)
      res should matchPattern { case Parsed.Success(_, _) =>
      }
    }
    "entry.resource.extension.value as code" in {
      val res = parse("entry.resource.extension.value as code", parser.top(_), verboseFailures = true)
      res should matchPattern { case Parsed.Success(_, _) =>
      }
    }
  }
  def check[T](expr: String, ps: P[_] => P[T])(implicit pos: source.Position) =
    expr in {
      val res = parse(expr, ps, verboseFailures = true)
      res should matchPattern {
        case Parsed.Success(_, i) if i == expr.trim.length =>
      }
    }
  val ext_1 = "http://hl7.org/fhir/StructureDefinition/questionnaireresponse-isSubject"
  s"QuestionnaireResponse.item.where(hasExtension('$ext_1')).answer.value.ofType(Reference)" - {
    check("value.ofType(Reference)", Parser.term(_))
    check(s"'$ext_1'", Parser.literal(_))
    check("hasExtension('$ext_1')", Parser.functionCall(_))
    check(
      s"QuestionnaireResponse.item.where(hasExtension('$ext_1')).answer.value.ofType(Reference)",
      Parser.expression(_))
  }
  "Patient.deceased.exists() and Patient.deceased != false" - {
    check("Patient.deceased.exists()", parser.top(_))
    check("Patient.deceased != false", parser.top(_))
    check("Patient.deceased.exists() and Patient.deceased != false", parser.top(_))
  }
  "parse Patient.deceased != false correctly" in {
    val res    = parse("Patient.deceased != false", parser.top(_)).get.value
    val pclass = classOf[Patient]
    res shouldEqual BinaryOperation(root("Patient")("deceased"), Neq, literal(false))
  }
  "parse \"Measure.relatedArtifact.where(type='composed-of').resource\"" in {
    val res = parse("Measure.relatedArtifact.where(type='composed-of').resource", parser.top(_))
    res should matchPattern { case Parsed.Success(_, i) =>
    }
    res.get.value shouldEqual root("Measure")("relatedArtifact")
      .invoke(Func("where", Seq(BinaryOperation(FieldAccess("type"), Eq, literal("composed-of")))))("resource")
  }

  "searchParam requirements" - {
    def check[T](expr: String, expect: Expr => Unit)(implicit pos: source.Position): Unit =
      expr in {
        val res = parse(expr, parser.top(_), verboseFailures = true)
        res match {
          case Parsed.Success(v: Expr, i) if i == expr.trim.length => expect(v)
          case Parsed.Success(_, i)                                => fail(s"Expected to parse:\n$expr\nParsed only:\n${expr.take(i)}")
          case Parsed.Failure(f)                                   => fail(s"Parsing failed:\n$f")
        }
      }
    val patientClass = classOf[Patient]
    check(
      "Patient.deceased.exists() and Patient.deceased != false",
      _ shouldEqual BinaryOperation(
        root("Patient")("deceased").invoke(Func("exists")),
        And,
        BinaryOperation(root("Patient")("deceased"), Neq, literal(false))
      )
    )
    check(
      "(Patient.deceased as dateTime)",
      _ shouldEqual TypeOperation(root("Patient")("deceased"), As, TypeSpecifier("FHIR", "dateTime"))
    )
    check(
      "Patient.deceased as dateTime",
      _ shouldEqual TypeOperation(root("Patient")("deceased"), As, TypeSpecifier("FHIR", "dateTime"))
    )
    check(
      "Condition.abatement.as(Age)",
      _ shouldEqual TypeOperation(root("Condition")("abatement"), As, TypeSpecifier("FHIR", "Age"))
    )
    check(
      "(Observation.value as CodeableConcept).text",
      _ shouldEqual TypeOperation(root("Observation")("value"), As, TypeSpecifier("FHIR", "CodeableConcept"))("text")
    )
    check(
      "(ConceptMap.source as canonical)",
      _ shouldEqual TypeOperation(root("ConceptMap")("source"), As, TypeSpecifier("FHIR", "canonical"))
    )
    "do it all" in {
      val expr = "DeviceRequest.code as CodeableConcept"
      parse(expr, parser.top(_), verboseFailures = true) match {
        case Parsed.Success(v: Expr, i) if i == expr.trim.length =>
          v shouldEqual TypeOperation(root("DeviceRequest")("code"), As, TypeSpecifier("FHIR", "CodeableConcept"))
          val x = genScala.gen(v, GenScalaParams(Left(DeviceRequest), ExactlyOne, "obj"))
          x.rootStr shouldEqual "obj.code.as[CodeableConcept]"
          x.baseCardinality shouldEqual Optional
        case Parsed.Success(_, i) => fail(s"Expected to parse:\n$expr\nParsed only:\n${expr.take(i)}")
        case Parsed.Failure(f)    => fail(s"Parsing failed:\n$f")
      }
    }
  }
}
