package com.babylonhealth.lit.fhirpath

import java.time.LocalTime

import cats.instances.list._
import cats.syntax.functor._
import cats.Monad
import cats.Traverse.ops.toAllTraverseOps
import fastparse.Parsed
import org.slf4j.LoggerFactory

import scala.language.experimental.macros
import scala.util.Try
import scala.Option.when
import scala.math.BigDecimal.RoundingMode.{ CEILING, DOWN, FLOOR, HALF_UP }

import com.babylonhealth.lit.core.{ FHIRDate, FHIRDateTime, FHIRObject }
import com.babylonhealth.lit.core.model.{ Quantity, Reference }
import com.babylonhealth.lit.fhirpath.conversions._
import com.babylonhealth.lit.fhirpath.model.{ Expr, This }

class DefaultFuncs[F[+_]: MErr](implicit fhirClient: FHIRReadClient[F]) extends FhirPathFuncs[F] {
  // http://hl7.org/fhirpath/#existence
  "empty" := { input: List[Value] => input.isEmpty }
  "exists" := { input: List[Value] => input.nonEmpty }
  "exists" := { (input: List[Value], criteria: Value => F[Boolean]) => where(input, criteria).map(_.nonEmpty) }
  "all" := { (input: List[Value], criteria: Value => F[Boolean]) => input.traverse(criteria).map(allTrue) }
  "allTrue" := allTrue _
  "anyTrue" := { (input: List[Boolean]) => input.contains(true) }
  "allFalse" := { (input: List[Boolean]) => input.forall(_ == false) }
  "anyFalse" := { (input: List[Boolean]) => input.contains(false) }
  "subsetOf" := subsetOf _
  "supersetOf" := { (input, other) => subsetOf(other, input) }
  "count" := { input: List[Value] => input.length }
  "distinct" := { input: List[Value] => input.distinct }
  "isDistinct" := { input: List[Value] => input.distinct.length == input.length }

  // http://hl7.org/fhirpath/#filtering-and-projection
  "where" := where _
  "select" := { (input: List[Value], projection: Value => F[List[Value]]) => input.flatTraverse(projection) }
  "repeat" := { (input: List[Value], projection: Value => F[List[Value]]) => unsupported }

  // http://hl7.org/fhirpath/#subsetting
  "single" := { input: Value => input }
  "first" := { input: List[Value] => input.headOption }
  "last" := { input: List[Value] => input.lastOption }
  "tail" := { input: List[Value] => input.drop(1) }
  "skip" := { (input: List[Value], num: Int) => input.drop(num) }
  "take" := { (input: List[Value], num: Int) => input.take(num) }
  "intersect" := { (input: List[Value], other: List[Value]) => input intersect other }
  "exclude" := { (input: List[Value], other: List[Value]) => input.filterNot(other.toSet) }

  // http://hl7.org/fhirpath/#combining
  "union" := { (input: List[Value], other: List[Value]) => (input ++ other).distinct }
  "combine" := { (input: List[Value], other: List[Value]) => input concat other }

  // http://hl7.org/fhirpath/#conversion
  "iif" := { (input: List[Value], criterion: List[Value] => F[Boolean], trueResult: Expr, otherwiseResult: Expr) =>
    Monad[F].ifM(criterion(input))(trueResult(input), otherwiseResult(input))
  }
  "toBoolean" := toBoolean _
  "convertsToBoolean" := { toBoolean(_: Value).nonEmpty }
  "toInteger" := toInteger _
  "convertsToInteger" := { toInteger(_: Value).nonEmpty }
  "toDate" := toDate _
  "convertsToDate" := { toDate(_: Value).nonEmpty }
  "toDateTime" := toDateTime _
  "convertsToDateTime" := { toDateTime(_: Value).nonEmpty }
  "toDecimal" := toDecimal _
  "convertsToDecimal" := { toDecimal(_: Value).nonEmpty }
  "toQuantity" := toQuantity _
  "convertsToQuantity" := { toQuantity(_: Value).nonEmpty }
  "toString" := toStringValue _
  "convertsToString" := { toStringValue(_: Value).nonEmpty }
  "toTime" := toTime _
  "convertsToTime" := { toTime(_: Value).nonEmpty }

  // http://hl7.org/fhirpath/#string-manipulation
  "indexOf" := { (input: String, substring: String) => input indexOf substring }
  "substring" := { (input: String, start: Int) => Try(input substring start).toOption }
  "substring" := { (input: String, start: Int, length: Int) =>
    Try(input.substring(start, (start + length) min input.length)).toOption
  }
  "startsWith" := { (input: String, substring: String) => input startsWith substring }
  "endsWith" := { (input: String, substring: String) => input endsWith substring }
  "contains" := { (input: String, substring: String) => input contains substring }
  "upper" := { input: String => input.toUpperCase }
  "lower" := { input: String => input.toLowerCase }
  "replace" := { (input: String, pattern: String, substitution: String) => input.replace(pattern, substitution) }
  "matches" := { (input: String, regex: String) => input matches regex }
  "replaceMatches" := { (input: String, regex: String, substitution: String) =>
    input.replaceAll(regex, substitution)
  }
  "length" := { input: String => input.length }
  "toChars" := { input: String => input.map(_.toString).toList }

  // http://hl7.org/fhirpath/#math
  "abs" := { input: Value => unsupported }
  "ceiling" := { input: BigDecimal => input.setScale(0, CEILING).toInt }
  "exp" := { input: Value => unsupported }
  "floor" := { input: BigDecimal => input.setScale(0, FLOOR).toInt }
  "ln" := { input: Value => unsupported }
  "log" := { (input: Value, base: BigDecimal) => unsupported }
  "power" := { (input: Value, exponent: Value) => unsupported }
  "round" := { input: BigDecimal => input.setScale(0, HALF_UP).toInt }
  "round" := { (input: BigDecimal, precision: Int) => input.setScale(precision, HALF_UP) }
  "sqrt" := { input: Value => unsupported }
  "truncate" := { input: BigDecimal => input.setScale(0, DOWN).toInt }

  // http://hl7.org/fhirpath/#tree-navigation
  "children" := { input: List[FHIRObject] => input.flatMap(_.children()) }
  "descendants" := { input: List[Value] => descendants(input) }

  // http://hl7.org/fhirpath/#utility-functions
  "trace" := { (input: List[Value], name: String) => trace(input, name) }
  "trace" := { (input: List[Value], name: String, projection: Expr) => trace(input, name, projection) }
  "now" := { _: List[Value] => FHIRDateTime.now }
  "timeOfDay" := { _: List[Value] => LocalTime.now }
  "today" := { _: List[Value] => FHIRDate.now }

  // http://hl7.org/fhirpath/#boolean-logic
  "not" := { input: Boolean => !input }

  // http://hl7.org/fhirpath/#aggregates
  "aggregate" := { (input: List[Value], aggregator: Expr) => unsupported }
  "aggregate" := { (input: List[Value], aggregator: Expr, init: Value) => unsupported }

  // http://hl7.org/fhirpath/index.html#types-and-reflection
  "type" := { input: List[Value] => unsupported }

  // https://hl7.org/fhir/fhirpath.html#functions
  "extension" := { (input: List[Value], url: String) => input.flatMap(_.extensions).flatten.filter(_.url == url) }
  "hasValue" := { input: List[Value] => unsupported }
  "getValue" := { input: List[Value] => unsupported }
  "resolve" := { input: List[Value] =>
    input
      .flatMap {
        _.tryCollect {
          case ref: Reference => ref.reference
          case str: String    => Some(str)
        }
      }
      .traverse(fhirClient.read)
  }
  "elementDefinition" := { input: List[Value] => unsupported }
  "slice" := { (input: List[Value], structure: String, name: String) => unsupported }
  "checkModifiers" := { (input: List[Value], modifiers: List[String]) => unsupported }
  "conformsTo" := { (input: List[Value], structure: String) => unsupported }
  "memberOf" := { (input: List[Value], valueset: String) => unsupported }
  "subsumes" := { (input: List[Value], code: Value) => unsupported }
  "subsumedBy" := { (input: List[Value], code: Value) => unsupported }
  "htmlChecks" := { input: List[Value] => unsupported }

  // A mysterious function that only exists on one hl7 profile and has no definition anywhere we can find
  "hasExtension" := { (input: List[Value], url: String) =>
    input.map(_.extensions.toSeq.flatten.exists(_.url == url))
  }

  def where(input: List[Value], criteria: Value => F[Boolean]): F[List[Value]] =
    input flatTraverse { value =>
      criteria(value).map(if (_) List(value) else List.empty)
    }

  def allTrue(input: List[Boolean]): Boolean                    = input.forall(_ == true)
  def subsetOf(input: List[Value], other: List[Value]): Boolean = input.toSet subsetOf other.toSet

  def descendants(input: List[Value]): List[Value] =
    input match {
      case head :: tail =>
        val children = head fold {
          case obj: FHIRObject => obj.children()
          case _               => Nil
        }
        head :: descendants(tail ++ children)
      case Nil => Nil
    }

  private val log = LoggerFactory.getLogger(getClass)

  def trace(input: List[Value], name: String, projection: Expr = This): F[List[Value]] = for {
    projected <- projection(input)
    _ = log.debug(s"$name: $projected")
  } yield input

  // http://hl7.org/fhirpath/#conversion
  def toBoolean(input: Value): Option[Boolean] =
    input tryCollect {
      case true | 1  => Some(true)
      case false | 0 => Some(false)
      case s: String =>
        s.toLowerCase match {
          case "true" | "t" | "yes" | "y" | "1" | "1.0" => Some(true)
          case "false" | "f" | "no" | "n" | "0" | "0.0" => Some(false)
          case _                                        => None
        }
    }
  def toInteger(input: Value): Option[Int] =
    input tryCollect {
      case i: Int    => Some(i)
      case s: String => s.toIntOption
      case false     => Some(0)
      case true      => Some(1)
    }
  def toDate(input: Value): Option[FHIRDate] =
    input tryCollect {
      case d: FHIRDate      => Some(d)
      case dt: FHIRDateTime => Some(dateTimeToDate(dt))
      case s: String        => parse(s, Lexer.partialDate(_))
    }
  def toDateTime(input: Value): Option[FHIRDateTime] =
    input tryCollect {
      case d: FHIRDate      => Some(dateToDateTime(d))
      case dt: FHIRDateTime => Some(dt)
      case s: String        => parse(s, Lexer.partialDateOrDateTime(_))
    }
  def toDecimal(input: Value): Option[BigDecimal] =
    input tryCollect {
      case i: Int        => Some(BigDecimal(i))
      case d: BigDecimal => Some(d)
      case s: String     => Try(BigDecimal(s)).toOption
      case false         => Some(BigDecimal(0d))
      case true          => Some(BigDecimal(1d))
    }
  def toQuantity(input: Value): Option[Quantity] =
    input tryCollect {
      case i: Int        => Some(unitQuantity(BigDecimal(i)))
      case d: BigDecimal => Some(unitQuantity(d))
      case false         => Some(unitQuantity(BigDecimal(0d)))
      case true          => Some(unitQuantity(BigDecimal(1d)))
      case s: String     => parse(s, Parser.quantity(_)) orElse parse(s, Parser.decimalOrInt(_)).map(unitQuantity)
      case q: Quantity   => Some(q)
    }
  def toStringValue(input: Value): Option[String] =
    input collect {
      case s: String       => s
      case i: Int          => i.toString
      case d: BigDecimal   => d.toString
      case b: Boolean      => b.toString
      case t: LocalTime    => t.toString
      case d: FHIRDate     => d.fmt
      case d: FHIRDateTime => d.fmt
      case q: Quantity if q.value.isDefined =>
        s"${q.value.get} '${(q.unit orElse when(q.system.contains("http://unitsofmeasure.org"))(q.code).flatten).getOrElse("")}'"
    }
  def toTime(input: Value): Option[LocalTime] =
    input tryCollect {
      case t: LocalTime => Some(t)
      case s: String    => parse(s, Lexer.partialTime(_))
    }

  private def parse[T](str: String, parser: fastparse.P[_] => fastparse.P[T]): Option[T] =
    fastparse.parse(str, parser) match {
      case Parsed.Success(value, idx) => when(idx == str.length)(value)
      case _: Parsed.Failure          => None
    }
}
