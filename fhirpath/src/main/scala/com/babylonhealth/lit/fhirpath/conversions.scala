package com.babylonhealth.lit.fhirpath

import java.time.{ LocalTime, ZoneOffset }

import cats.instances.list._
import cats.syntax.applicative._
import cats.syntax.applicativeError._
import cats.syntax.flatMap._
import cats.syntax.functor._
import cats.syntax.option._
import cats.syntax.traverse._

import scala.reflect.ClassTag

import com.babylonhealth.lit.core.{ FHIRDate, FHIRDateTime, FHIRObject }
import com.babylonhealth.lit.core.model.Quantity
import com.babylonhealth.lit.fhirpath.model.Expr

/** Implicit magic that lets you write neat fhirpath function definitions, by providing ways to convert to and from
  * [[Value]]s, [[List]]s and [[Expr]]s.
  */
object conversions {

  /** Converts between [[T]] and [[Value]] - implemented for types like [[String]], [[FHIRObject]] and [[Value]] */
  trait AsValue[T] {
    def wrap(inner: T): Value
    def get[F[+_]: MErr](value: Value): F[T]
  }

  /** Converts from [[T]] to List[Value] */
  abstract class ToCollection[T, F[+_]: MErr] {
    def wrap(inner: T): F[List[Value]]
  }

  /** Converts between List[Value] and [[T]] */
  abstract class AsCollection[T, F[+_]: MErr] extends ToCollection[T, F] {
    def get(list: List[Value]): F[Option[T]]
  }

  /** Converts from a fhirpath expression into [[T]], to support higher-order fhirpath functions.
    * e.g. [[impls.functions.where]] takes a predicate - we use [[predFromExpr]]`: FromExpr[T => F[Boolean], F]` to create it.
    */
  trait FromExpr[T, F[+_]] {
    def get(expr: Expr, input: List[Value]): F[Option[T]]
  }

  def converter[T: ClassTag](impConvert: PartialFunction[Any, T] = PartialFunction.empty): AsValue[T] =
    new AsValue[T] {
      def wrap(inner: T): Value = Value.wrapSystem(inner)
      def get[F[+_]: MErr](value: Value): F[T] =
        value fold {
          case x: T => x.pure[F]
          case y =>
            impConvert.lift(y) match {
              case Some(value) => value.pure[F]
              case None        => new RuntimeException(f"Expected a $typeName but got: $value").raiseError
            }
        }
      private def typeName = implicitly[ClassTag[T]].toString
    }

  implicit val asBool: AsValue[Boolean] = converter { case _ => true }
  implicit val asInt: AsValue[Int]      = converter()
  implicit val asDecimal: AsValue[BigDecimal] =
    converter { case x: Integer =>
      BigDecimal(x)
    }
  implicit val asQuantity: AsValue[Quantity] =
    converter {
      case i: Int        => Quantity(value = Some(BigDecimal(i)), unit = Some("1"))
      case d: BigDecimal => Quantity(value = Some(d), unit = Some("1"))
    }
  implicit val asString: AsValue[String] = converter()
  implicit val asDate: AsValue[FHIRDate] = converter()
  implicit val asDateTime: AsValue[FHIRDateTime] =
    converter { case d: FHIRDate =>
      FHIRDateTime(d.date.atTime(0, 0).atZone(ZoneOffset.UTC), d.specificity)
    }
  implicit val asTime: AsValue[LocalTime]                          = converter()
  implicit def asFhirObject[T <: FHIRObject: ClassTag]: AsValue[T] = converter()

  implicit def collectionFromExpr[T, F[+_]: MErr: FhirPathFuncs](implicit
      asCollection: AsCollection[T, F]): FromExpr[T, F] =
    (expr, input) => expr(input) >>= asCollection.get

  implicit def exprIsExpr[F[+_]: MErr]: FromExpr[Expr, F] = (expr, _) => expr.some.pure[F]

  implicit def valueIsValue[F[+_]: MErr]: AsValue[Value] =
    new AsValue[Value] {
      override def wrap(inner: Value): Value                = inner
      override def get[F[+_]: MErr](value: Value): F[Value] = value.pure[F]
    }

  implicit def singleValueIsCollection[T: AsValue, F[+_]: MErr]: AsCollection[T, F] =
    new AsCollection[T, F] {
      override def wrap(inner: T): F[List[Value]] = List(Value.wrap(inner)).pure[F]
      override def get(list: List[Value]): F[Option[T]] =
        list match {
          case List(x) => x.cast[F, T].map(_.some)
          case List()  => None.pure[F]
          case _       => new RuntimeException(f"Expected single value or empty collection, but got $list").raiseError
        }
    }

  implicit def collectionIsCollection[T, F[+_]: MErr](implicit asValue: AsValue[T]): AsCollection[List[T], F] =
    new AsCollection[List[T], F] {
      override def wrap(inner: List[T]): F[List[Value]]       = inner.map(Value.wrap[T]).pure[F]
      override def get(list: List[Value]): F[Option[List[T]]] = list.traverse(asValue.get[F]).map(_.some)
    }

  implicit def optionAsCollection[T: AsValue, F[+_]: MErr](implicit
      asColl: AsCollection[T, F]): AsCollection[Option[T], F] =
    new AsCollection[Option[T], F] {
      override def wrap(inner: Option[T]): F[List[Value]]       = inner.map(Value.wrap[T]).toList.pure[F]
      override def get(list: List[Value]): F[Option[Option[T]]] = asColl.get(list).map(Some(_))
    }

  implicit def effectToCollection[T, F[+_]: MErr](implicit pureToColl: ToCollection[T, F]): ToCollection[F[T], F] =
    new ToCollection[F[T], F] {
      override def wrap(inner: F[T]): F[List[Value]] = inner >>= pureToColl.wrap
    }

  implicit def funcFromExpr[T, U: AsValue, F[+_]: MErr: FhirPathFuncs](implicit
      toCollection: ToCollection[T, F],
      toOutput: AsValue[U]): FromExpr[T => F[List[U]], F] =
    (expr, _) => {
      val f = (x: T) =>
        for {
          input  <- toCollection.wrap(x)
          result <- expr(input)
          out    <- result.traverse(toOutput.get[F])
        } yield out
      f.some.pure[F]
    }

  implicit def predFromExpr[T, F[+_]: MErr: FhirPathFuncs](implicit
      toCollection: ToCollection[T, F],
      toBool: AsCollection[Boolean, F]): FromExpr[T => F[Boolean], F] =
    (expr, _) => {
      val f = (x: T) =>
        for {
          input  <- toCollection.wrap(x)
          result <- expr(input)
          bool   <- toBool.get(result)
        } yield bool.getOrElse(false)
      f.some.pure[F]
    }
}
