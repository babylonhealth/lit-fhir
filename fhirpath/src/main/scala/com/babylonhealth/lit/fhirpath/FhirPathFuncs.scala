package com.babylonhealth.lit.fhirpath

import cats.data.OptionT
import cats.syntax.functor._
import cats.syntax.applicative._
import cats.syntax.applicativeError._
import cats.syntax.flatMap._

import scala.collection.mutable
import scala.util.Try

import com.babylonhealth.lit.fhirpath.conversions.{ AsCollection, FromExpr, ToCollection }
import com.babylonhealth.lit.fhirpath.model.{ Expr, This }

/**
  * For defining FHIR path functions. Extend this trait and define them with [[FuncName.:=]].
  * Then you can look them up with [[lookupFunction]].
  */
abstract class FhirPathFuncs[F[+_]: MErr] extends Builtins[F] {

  // Note: numArgs does not count the input, e.g. `Patient.name.first()` takes 0 arguments.
  case class FhirPathFunc(name: String, numArgs: Int)(f: (List[Value], Seq[Expr]) => F[List[Value]]) {
    def apply(input: List[Value])(args: Seq[Expr]): F[List[Value]] = f(input, args)
  }

  // Terrifying mutability here - but once `funcMap` is evaluated, `funcList` is set to None and will blow up if you
  // register new functions.
  private var funcList: Option[mutable.Buffer[FhirPathFunc]] = Some(mutable.Buffer.empty)
  private lazy val funcMap: Map[(String, Int), FhirPathFunc] = {
    val list = funcList.get
    funcList = None
    list.map(f => (f.name, f.numArgs) -> f).toMap
  }

  // trust me
  implicit val me: FhirPathFuncs[F] = this

  def lookupFunction(name: String, numArgs: Int): F[FhirPathFunc] =
    funcMap.get((name, numArgs)) match {
      case Some(value) => value.pure[F]
      case None =>
        val candidates = funcMap.values.filter(_.name == name)
        val msg = if (candidates.isEmpty) {
          f"No function `$name` exists"
        } else {
          val validArgs = candidates.map(_.numArgs).mkString(",")
          f"Function `$name` takes $validArgs argument(s), not $numArgs"
        }
        new Exception(msg).raiseError
    }

  implicit class FuncName(name: String) {
    def :=[A, T](func: A => T)(implicit fa: AsCollection[A, F], t: ToCollection[T, F]): Unit = {
      funcList.get += FhirPathFunc(name, 0) { case (input, Seq()) =>
        lift1[A, T](func)(input)
      }
    }

    def :=[A, B, T](func: (A, B) => T)(implicit fa: FromExpr[A, F], fb: FromExpr[B, F], t: ToCollection[T, F]): Unit = {
      funcList.get += FhirPathFunc(name, 1) { case (input, Seq(b)) =>
        lift2[A, B, T](func)(input)(This, b)
      }
    }

    def :=[A, B, C, T](func: (A, B, C) => T)(implicit
        fa: FromExpr[A, F],
        fb: FromExpr[B, F],
        fc: FromExpr[C, F],
        t: ToCollection[T, F]): Unit = {
      funcList.get += FhirPathFunc(name, 2) { case (input, Seq(b, c)) =>
        lift3[A, B, C, T](func)(input)(This, b, c)
      }
    }

    def :=[A, B, C, D, T](func: (A, B, C, D) => T)(implicit
        fa: FromExpr[A, F],
        fb: FromExpr[B, F],
        fc: FromExpr[C, F],
        fd: FromExpr[D, F],
        t: ToCollection[T, F]): Unit = {
      funcList.get += FhirPathFunc(name, 3) { case (input, Seq(b, c, d)) =>
        lift4[A, B, C, D, T](func)(input)(This, b, c, d)
      }
    }
  }

  // These methods "lift" normal functions into ones that operate on fhirpath expressions, e.g.
  // f: (A, B) => T
  // lift2(f): List[Value] => (Expr, Expr) => F[List[Value]]

  // Lift a unary function
  def lift1[A, T](f: A => T)(
      input: List[Value])(implicit a: AsCollection[A, F], t: ToCollection[T, F]): F[List[Value]] = {
    val result = for {
      a      <- OptionT(a.get(input))
      result <- wrapResult(f(a))
    } yield result

    result.value.map(_.toList.flatten)
  }

  // Lift a binary function
  def lift2[A, B, T](f: (A, B) => T)(input: List[Value])(exprA: Expr, exprB: Expr)(implicit
      a: FromExpr[A, F],
      b: FromExpr[B, F],
      t: ToCollection[T, F]): F[List[Value]] = {
    val result = for {
      a      <- evalArg[A](exprA, input)
      b      <- evalArg[B](exprB, input)
      result <- wrapResult(f(a, b))
    } yield result

    result.value.map(_.toList.flatten)
  }

  // Lift a ternary function
  def lift3[A, B, C, T](f: (A, B, C) => T)(input: List[Value])(exprA: Expr, exprB: Expr, exprC: Expr)(implicit
      a: FromExpr[A, F],
      b: FromExpr[B, F],
      c: FromExpr[C, F],
      t: ToCollection[T, F]): F[List[Value]] = {
    val result = for {
      a      <- evalArg[A](exprA, input)
      b      <- evalArg[B](exprB, input)
      c      <- evalArg[C](exprC, input)
      result <- wrapResult(f(a, b, c))
    } yield result

    result.value.map(_.toList.flatten)
  }

  // Lift a quaternary function
  def lift4[A, B, C, D, T](f: (A, B, C, D) => T)(
      input: List[Value])(exprA: Expr, exprB: Expr, exprC: Expr, exprD: Expr)(implicit
      a: FromExpr[A, F],
      b: FromExpr[B, F],
      c: FromExpr[C, F],
      d: FromExpr[D, F],
      t: ToCollection[T, F]): F[List[Value]] = {
    val result = for {
      a      <- evalArg[A](exprA, input)
      b      <- evalArg[B](exprB, input)
      c      <- evalArg[C](exprC, input)
      d      <- evalArg[D](exprD, input)
      result <- wrapResult(f(a, b, c, d))
    } yield result

    result.value.map(_.toList.flatten)
  }

  private def wrapResult[T](result: => T)(implicit t: ToCollection[T, F]): OptionT[F, List[Value]] = OptionT.liftF {
    val output = Try(result).fold(
      {
        case e: Exception => e.raiseError
        case e            => throw e
      },
      x => x.pure[F]
    )
    output >>= Value.wrapCollection[T, F]
  }

  private def evalArg[T](expr: Expr, input: List[Value])(implicit fromExpr: FromExpr[T, F]): OptionT[F, T] =
    OptionT(fromExpr.get(expr, input))
}

object FhirPathFuncs {
  implicit def defaultFuncs[F[+_]: MErr: FHIRReadClient]: FhirPathFuncs[F] = new DefaultFuncs()
}
