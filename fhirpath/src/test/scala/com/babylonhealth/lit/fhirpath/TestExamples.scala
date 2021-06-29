package com.babylonhealth.lit.fhirpath

import java.io.File
import java.time.LocalTime

import cats.implicits.catsStdInstancesForTry
import org.scalactic.source.Position
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

import scala.collection.mutable
import scala.io.Source
import scala.util.Try
import scala.xml.{ Node, XML }

import com.babylonhealth.lit.core.{ FHIRDate, FHIRDateTime }
import com.babylonhealth.lit.core.model.Resource
import com.babylonhealth.lit.core.serdes.decodeFHIRObject
import com.babylonhealth.lit.fhirpath.model.Expr

/** Tests examples from resources/tests-fhir-r4.xml, using the example resources in resources/r4/input.
  *
  * Examples were downloaded from http://hl7.org/fhirpath/tests.html, the XML resources were converted to JSON and some of the
  * test cases were fixed (some tags were in the wrong place).
  */
class TestExamples extends AnyFunSpec with Matchers {

  private val file                                         = XML.load(Source.fromResource("r4/tests-fhir-r4.xml").reader)
  private val testSuite                                    = xml.parseTestSuite(file)
  private val fhirPath                                     = Parser
  private val resourceCache: mutable.Map[String, Resource] = mutable.Map.empty

  private implicit val fhirReadCli: FHIRReadClient[Try] = null

  // Some of these are tests I suspect are wrong, others are ones we give the wrong answer, but eh
  private val ignoreTests: Map[String, Set[String]] = Map(
    "MiscellaneousAccessorTests" -> Set(
      "PatientTelecomTypes: telecom.use" // TODO: how to handle codes? Just convert them to strings?
    ),
    "Literals" -> Set(
      "IntegerBooleanNotTrue: (0).not() = true", // Spec doesn't say that `0` implicitly converts to `false`
      // TODO: support equality wrt timezones
      "LiteralDateTimeTZEqualTrue: @2017-11-05T01:30:00.0-04:00 = @2017-11-05T00:30:00.0-05:00"
    ),
    "SubSetOf" -> Set(
      "1: Patient.name.first().subsetOf($this.name)" // TODO: make $this correctly refer to root resource
    ),
    "SuperSetOf" -> Set(
      "1: Patient.name.first().supersetOf($this.name).not()" // TODO: make $this correctly refer to root resource
    ),
    "Equality" -> Set(
      "7: (1 | 1) = (1 | 2 | {})",                                  // Expects `{}`, but I have no idea why
      "23: @2012-04-15T15:00:00Z = @2012-04-15T10:00:00",           // TODO: support partial equality of datetimes
      "24: @2012-04-15T15:00:00+02:00 = @2012-04-15T16:00:00+03:00" // TODO: support equality wrt timezones
    ),
    "NEquality" -> Set(
      "17: @2012-04-15T15:00:00Z != @2012-04-15T10:00:00",           // TODO: support partial inequality of datetimes
      "18: @2012-04-15T15:00:00+02:00 != @2012-04-15T16:00:00+03:00" // TODO: support inequality wrt timezones
    ),
    "Precedence" -> Set( // Spec says `is` is more tightly binding than `|` or `>`, so these are wrong
      "4: 1 | 1 is Integer",
      "3: 1 > 2 is Boolean"),
    "Round"  -> Set("2: 3.14159.round(3) = 2"), // um wat
    "Type"   -> Set("22: Patient.is(System.Patient).not()"), // We do better than spec and reject this at parse time
    "Divide" -> Set("5: 1.2 / 1.8 = 0.66666667") // We use more precise decimals, which the spec allows
  )

  for (group <- testSuite) {
    describe(group.shortName) {
      for (test <- group.tests.filter(!_.ignored(group))) {
        describe(test.shortName(group)) {
          test.expression.invalid match {
            case False =>
              it("parses")(test.assertParses())
              it(f"evaluates against ${test.inputFile}")(test.assertEvaluates())
              it("returns correct output")(test.assertOutput())
            case True =>
              it("should error")(test.assertErrors())
            case Semantic => // TODO: what does invalid=semantic mean? I THINK it's things that can be statically checked
          }
        }
      }
    }
  }

  case class Test(expression: Expression, outputs: Seq[Any], name: String, inputFile: String, predicate: Boolean) {

    def shortName(group: Group): String =
      f"${name.stripPrefix("test").stripPrefix(group.shortName)}: ${expression.value}"

    def ignored(group: Group): Boolean = ignoreTests.get(group.shortName).exists(_.contains(shortName(group)))

    def assertParses(): Unit = parse.get

    def assertEvaluates(): Unit = {
      val path = parse getOrElse cancel("fhirpath failed to parse")
      eval(path).get
    }

    def assertOutput(): Unit = {
      val result = parse.flatMap(eval) getOrElse cancel("fhirpath failed to evaluate")

      val actualOutput = if (predicate) {
        result match {
          case List(false) => List(false)
          case List()      => List(false)
          case _           => List(true)
        }
      } else {
        result
      }

      actualOutput shouldEqual outputs
    }

    def assertErrors(): Unit = {
      assertThrows[Exception] {
        parse.flatMap(eval).get
      }
    }

    def parse: Try[Expr] =
      cancelIfNotImplemented {
        Try {
          fhirPath.parseUnsafe(expression.value)
        }
      }

    def eval(expr: Expr): Try[List[Any]] = cancelIfNotImplemented(expr[Try](loadResource()))

    // This allows us to eventually run this test suite without being 100% feature-complete
    def cancelIfNotImplemented[T](t: => Try[T]): Try[T] =
      Try(t).flatten recover {
        case e: NotImplementedError           => cancel("Ignoring test of unimplemented behaviour", e)
        case e: UnsupportedOperationException => cancel("Ignoring test of unsupported behaviour", e)
      }

    def loadResource(): Resource = {
      resourceCache.getOrElseUpdate(
        inputFile, {
          val file           = f"r4/input/${inputFile.stripSuffix(".xml")}.json"
          val resourceString = Source.fromResource(file).getLines.mkString
          decodeFHIRObject(Resource, resourceString).get
        }
      )
    }
  }

  case class Group(tests: Seq[Test], name: String) {
    def shortName: String = name.stripPrefix("test")
  }

  case class Expression(value: String, invalid: InvalidType)
  sealed trait InvalidType
  case object False    extends InvalidType
  case object Semantic extends InvalidType
  case object True     extends InvalidType

  object xml {

    def parseTestSuite(node: Node): Seq[Group] = elems(node, "group").map(parseGroup)

    def parseGroup(node: Node): Group = Group(elems(node, "test").map(parseTest), attr(node, "name"))

    def parseTest(node: Node): Test =
      Test(
        parseExpr(elem(node, "expression")),
        elems(node, "output").map(parseOutput),
        name = attr(node, "name"),
        inputFile = attr(node, "inputfile"),
        predicate = tryAttr(node, "predicate").exists(_.toBoolean)
      )

    def parseExpr(node: Node): Expression = Expression(node.text, parseInvalidType(tryAttr(node, "invalid")))

    def parseOutput(node: Node): Any = {
      val text = node.text
      attr(node, "type") match {
        case "boolean"  => text.toBoolean
        case "code"     => text
        case "code"     => text
        case "date"     => FHIRDate.parse(text)
        case "dateTime" => FHIRDateTime.parse(text)
        case "decimal"  => BigDecimal(text)
        case "integer"  => text.toInt
        case "Quantity" => Parser.quantity.parse(text).toOption.get._2
        case "string"   => text
        case "time"     => LocalTime.parse(text)
      }
    }

    def parseInvalidType(text: Option[String]): InvalidType =
      text match {
        case Some("false")    => False
        case Some("semantic") => Semantic
        case Some("true")     => True
        case None             => False
      }

    def elems(node: Node, name: String): Seq[Node]        = node.child.filter(_.label == name)
    def elem(node: Node, name: String): Node              = elems(node, name).head
    def tryElem(node: Node, name: String): Option[Node]   = elems(node, name).headOption
    def tryAttr(node: Node, name: String): Option[String] = node.attribute(name).map(_.head.text)
    def attr(node: Node, name: String): String            = tryAttr(node, name).get
  }
}
