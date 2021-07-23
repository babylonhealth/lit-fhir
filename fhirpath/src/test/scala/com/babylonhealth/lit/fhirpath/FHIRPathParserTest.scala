package com.babylonhealth.lit.fhirpath

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

  private def printFailure(p1: Any, prefix: String = ""): Unit =
    p1 match {
      case Parsed.Failure(label, index, e) =>
        println(prefix+"label)" + label)
        println(prefix+"index)" + index)
        println(prefix+"e.failedAtOffset)" + e.failedAtOffset)
        println(prefix+"e.expected)" + e.expected)
      case _ =>
    }
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
    printFailure(p1, "1)")
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
  "entry.resource.where(extension.value is code)" - {
    "Code" in {
      val res = Parser.fhirType.parse("code")
      res should matchPattern { case Right((_, _)) =>
      }
    }
  }
  "Account.subject.where(resolve() is Patient)" - {
    "resolve()" in {
      val res = Parser.functionCall.parse("resolve()")
      res should matchPattern { case Right((_, _)) =>
      }
    }
    "resolve() is Patient" in {
      val res = Parser.typeExpr.parse("resolve() is Patient")
      res should matchPattern { case Right((_, _)) =>
      }
    }
    "where(resolve() is Patient)" in {
      val res = Parser.functionCall.parse("where(resolve() is Patient)")
      res match {
        case Left(err) => println("oh. No. ..." + err.toString)
        case _         =>
      }
      res should matchPattern { case Right((_, _)) =>
      }
    }
    "Account.subject.where(resolve() is Patient)" in {
      val res = parser.top.parse("Account.subject.where(resolve() is Patient)")
      res should matchPattern { case Right((_, _)) =>
      }
    }
  }
  "Account.subject.where(resolve() as Patient)" - {
    "resolve() as Patient" in {
      val res = Parser.typeExpr.parse("resolve() as Patient")
      res match {
        case v @ Right(_) => println(s"!!2 ${v.toString}")
        case _            =>
      }
      res should matchPattern { case Right((_, _)) =>
      }
    }
    "where(resolve() as Patient)" in {
      val res = Parser.functionCall.parse("where(resolve() as Patient)")
      res match {
        case Left(err) => println("oh. No. ..." + err.toString)
        case _         =>
      }
      res should matchPattern { case Right((_, _)) =>
      }
    }
    "Account.subject.where(resolve() as Patient)" in {
      val res = parser.top.parse("Bundle.entry.resource as Patient")
      res should matchPattern { case Right((_, _)) =>
      }
    }
    "entry.resource.extension.value as code" in {
      val res = parser.top.parse("entry.resource.extension.value as code")
      res should matchPattern { case Right((_, _)) =>
      }
    }
  }
  def check[T](expr: String, ps: P0[T])(implicit pos: source.Position) =
    expr in {
      val res = ps.parse(expr)
      res should matchPattern {
        case Right(("", _)) =>
      }
    }
  val ext_1 = "http://hl7.org/fhir/StructureDefinition/questionnaireresponse-isSubject"
  s"QuestionnaireResponse.item.where(hasExtension('$ext_1')).answer.value.ofType(Reference)" - {
    check("value.ofType(Reference)", Parser.term)
    check(s"'$ext_1'", Parser.literal)
    check("hasExtension('$ext_1')", Parser.functionCall)
    check(s"QuestionnaireResponse.item.where(hasExtension('$ext_1')).answer.value.ofType(Reference)", Parser.expression)
  }
  "Patient.deceased.exists() and Patient.deceased != false" - {
    check("Patient.deceased.exists()", parser.top)
    check("Patient.deceased != false", parser.top)
    check("Patient.deceased.exists() and Patient.deceased != false", parser.top)
  }
  "parse Patient.deceased != false correctly" in {
    val res    = parser.top.parse("Patient.deceased != false").toOption.get._2
    val pclass = classOf[Patient]
    res shouldEqual BinaryOperation(root("Patient")("deceased"), Neq, literal(false))
  }
  "parse \"Measure.relatedArtifact.where(type='composed-of').resource\"" in {
    val res = parser.top.parse("Measure.relatedArtifact.where(type='composed-of').resource")
    res should matchPattern { case Right((_, i)) =>
    }
    res.toOption.get._2 shouldEqual root("Measure")("relatedArtifact")
      .invoke(Func("where", Seq(BinaryOperation(FieldAccess("type"), Eq, literal("composed-of")))))("resource")
  }

  "searchParam requirements" - {
    def check[T](expr: String, expect: Expr => Unit)(implicit pos: source.Position): Unit =
      expr in {
        val res = parser.top.parseAll(expr)
        res match {
          case Right(v) => expect(v)
          case Left(e)  => fail(s"Expected to parse:\n$expr\nbut failed with\n$e")
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
      parser.top.parse(expr) match {
        case Right((s, v: Expr)) if s.trim == expr.trim =>
          v shouldEqual TypeOperation(root("DeviceRequest")("code"), As, TypeSpecifier("FHIR", "CodeableConcept"))
          val x = genScala.gen(v, GenScalaParams(Left(DeviceRequest), ExactlyOne, "obj"))
          x.rootStr shouldEqual "obj.code.as[CodeableConcept]"
          x.baseCardinality shouldEqual Optional
        case Right((s, _)) => fail(s"Expected to parse:\n$expr\nParsed only:\n${s}")
        case Left(f)       => fail(s"Parsing failed:\n$f")
      }
    }
  }
}
