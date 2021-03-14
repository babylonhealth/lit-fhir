package com.babylonhealth.lit.fhirpath

import scala.Option.when

import cats.syntax.functor._
import cats.syntax.applicative._
import cats.syntax.applicativeError._
import scala.reflect.{ ClassTag, classTag }

import com.babylonhealth.lit.core.TagSummoners.lTypeOf
import com.babylonhealth.lit.core.model.Quantity
import com.babylonhealth.lit.core.serdes.companionClassName
import com.babylonhealth.lit.core.{ Choice, FHIRObject, \/ }
import com.babylonhealth.lit.fhirpath.model.TypeSpecifier

// "Hard-coded" operators and type functions - these need different parsing to regular functions
abstract class Builtins[F[+_]: MErr] {

  // http://hl7.org/fhirpath/N1/#operations
  def lte(l: Value, r: Value): F[Boolean]                    = (l compareOrError r) map (_ <= 0)
  def lt(l: Value, r: Value): F[Boolean]                     = (l compareOrError r) map (_ < 0)
  def gt(l: Value, r: Value): F[Boolean]                     = (l compareOrError r) map (_ > 0)
  def gte(l: Value, r: Value): F[Boolean]                    = (l compareOrError r) map (_ >= 0)
  def eq(l: List[Value], r: List[Value]): Option[Boolean]    = when(l.nonEmpty && r.nonEmpty)(l == r)
  def equiv(l: List[Value], r: List[Value]): F[List[Value]]  = unsupported
  def neq(l: List[Value], r: List[Value]): Option[Boolean]   = eq(l, r).map(!_)
  def nequiv(l: List[Value], r: List[Value]): F[List[Value]] = unsupported
  def union(l: List[Value], r: List[Value]): List[Value]     = (l ++ r).distinct
  def in(l: Value, collection: List[Value]): Boolean         = collection.contains(l)
  def contains(l: List[Value], value: Value): Boolean        = l.contains(value)
  def and(l: Option[Boolean], r: Option[Boolean]): Option[Boolean] =
    (l, r) match {
      case (Some(true), Some(true)) => Some(true)
      case (Some(false), _)         => Some(false)
      case (_, Some(false))         => Some(false)
      case _                        => None
    }
  def or(l: Option[Boolean], r: Option[Boolean]): Option[Boolean]      = and(l.map(!_), r.map(!_)).map(!_)
  def xor(l: Boolean, r: Boolean): Boolean                             = l ^ r
  def implies(l: Option[Boolean], r: Option[Boolean]): Option[Boolean] = and(l, r.map(!_)).map(!_)
  def stringConcat(l: Option[String], r: Option[String]): String       = l.getOrElse("") ++ r.getOrElse("")
  def add(l: Value, r: Value): Value = Value.normalize(l, r) match {
    case (l: Integer, r: Integer)       => Value.wrap(l + r)
    case (l: BigDecimal, r: BigDecimal) => Value.wrap(l + r)
    case (l: Quantity, r: Quantity)     => ???
    case (l: String, r: String)         => Value.wrap(l ++ r)
    case (l, r)                         => throw new Exception(f"Cannot apply `+` to $l and $r")
  }
  def sub(l: Value, r: Value): Value = Value.normalize(l, r) match {
    case (l: Integer, r: Integer)       => Value.wrap(l - r)
    case (l: BigDecimal, r: BigDecimal) => Value.wrap(l - r)
    case (l: Quantity, r: Quantity)     => ???
    case (l, r)                         => throw new Exception(f"Cannot apply `-` to $l and $r")
  }
  def mult(l: Value, r: Value): Value = Value.normalize(l, r) match {
    case (l: Integer, r: Integer)       => Value.wrap(l * r)
    case (l: BigDecimal, r: BigDecimal) => Value.wrap(l * r)
    case (l: Quantity, r: Quantity)     => ???
    case (l, r)                         => throw new Exception(f"Cannot apply `*` to $l and $r")
  }
  def div(l: Value, r: Value): Option[Value] = Value.normalize(l, r) match {
    case (l: Integer, r: Integer)       => when(r != 0)(Value.wrap(BigDecimal(l) / BigDecimal(r)))
    case (l: BigDecimal, r: BigDecimal) => when(r != BigDecimal(0))(Value.wrap(l / r))
    case (l: Quantity, r: Quantity)     => ???
    case (l, r)                         => throw new Exception(f"Cannot apply `/` to $l and $r")
  }
  def truncDiv(l: Value, r: Value): Option[Value] = Value.normalize(l, r) match {
    case (l: Integer, r: Integer)       => when(r != 0)(Value.wrap(l / r))
    case (l: BigDecimal, r: BigDecimal) => when(r != BigDecimal(0))(Value.wrap(l quot r))
    case (l, r)                         => throw new Exception(f"Cannot apply `div` to $l and $r")
  }
  def mod(l: Value, r: Value): Option[Value] = Value.normalize(l, r) match {
    case (l: Integer, r: Integer)       => when(r != 0)(Value.wrap(l % r))
    case (l: BigDecimal, r: BigDecimal) => when(r != BigDecimal(0))(Value.wrap(l % r))
    case (l, r)                         => throw new Exception(f"Cannot apply `mod` to $l and $r")
  }

  def pos(input: Value): Value =
    input fold {
      case _: Number   => input
      case _: Quantity => input
      case _           => throw new Exception(f"$input isn't a number")
    }
  def neg(input: Value): Value =
    input fold {
      case i: Int        => Value.wrap(-i)
      case b: BigDecimal => Value.wrap(-b)
      case q: Quantity   => Value.wrap(q.updateValueIfExists(-_))
      case _             => throw new Exception(f"$input isn't a number")
    }

  // http://hl7.org/fhirpath/N1/#index-integer-collection
  def index(input: List[Value], index: Int): Option[Value] = input.drop(index).headOption

  // http://hl7.org/fhirpath/N1/#oftypetype-type-specifier-collection
  def ofType(typeSpecifier: TypeSpecifier)(input: List[Value]): List[Value] = input.filter(is(typeSpecifier))

  // http://hl7.org/fhirpath/N1/#types

  def is(typeSpecifier: TypeSpecifier)(input: Value): Boolean = {
    val tt = typeSpecifier.asTypeTag.get
    val asClass: ClassTag[_] = {
      if (tt.tag <:< lTypeOf[FHIRObject])
        ClassTag(Class.forName(companionClassName(tt)))     // fhir objects need funky lookups
      else if (tt.tag <:< lTypeOf[String]) classTag[String] // subtypes don't have corresponding classes, need the UB
      else if (tt.tag <:< lTypeOf[Int]) classTag[Int]
      else if (tt.tag =:= lTypeOf[Array[Byte]])
        classTag[Array[Byte]]                                 // IDK why, but the base64 stuff doesn't seem to work right
      else if (tt.tag =:= lTypeOf[Boolean]) classTag[Boolean] // we want the java boolean, not scala.Boolean
      else ClassTag(Class.forName(tt.tag.longName))
    }

    val model          = typeSpecifier.model
    val typeSpecIsFhir = model.contains("FHIR") || (model.isEmpty && !systemTypes.contains(typeSpecifier.name))

    input.isFhir == typeSpecIsFhir && input.fold {
      case asClass(_) => true
      case _          => false
    } && input.choiceSuffix.forall(_ == typeSpecifier.name.capitalize)
  }

  def as(typeSpecifier: TypeSpecifier)(input: Value): Option[Value] = when(is(typeSpecifier)(input))(input)

  def unsupported: F[List[Value]] = new UnsupportedOperationException("Unsupported function").raiseError

  private val systemTypes = Set("Boolean", "String", "Integer", "Decimal", "Date", "DateTime", "Time")
}
