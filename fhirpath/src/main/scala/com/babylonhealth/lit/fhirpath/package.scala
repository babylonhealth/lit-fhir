package com.babylonhealth.lit

import java.time.ZoneOffset

import cats.parse.{ Parser => CatsParser, Parser0 => CatsParser0 }
import cats.parse.Parser.string
import cats.MonadError
import cats.syntax.option._

import com.babylonhealth.lit.core.{ FHIRComponentField, FHIRDate, FHIRDateSpecificity, FHIRDateTime, FHIRObject, LitSeq }
import com.babylonhealth.lit.core.model.{ Quantity, Resource }
import com.babylonhealth.lit.core.FHIRDateTimeSpecificity.Day

package object fhirpath {
  type P[T] = CatsParser[T]
  type P0[T] = CatsParser0[T]
  def P[T](t: => CatsParser[T]): CatsParser[T] = cats.Defer[CatsParser].defer(t)
  implicit class FastPathCompat[A](t: CatsParser0[A]) {

    def ~~>[B](that: P[B]): P[B] =
      CatsParser.product01(t.void, that).map(_._2)
  }
  implicit class FastPathCompat1[A](t: P[A]) {
    def ~~[B](that: CatsParser0[B]): P[(A, B)] =
      CatsParser.product10(t, that)
  }
  implicit class FastPathCompat2(t: String) {
//    def ~~[B](that: P[B]): P[(String, B)] =
//      CatsParser.product01(string(t), that)
    def *>[B](that: P[B]): P[B] = string(t) *> that
  }
  type MErr[F[_]] = MonadError[F, _ >: Exception]

  trait FHIRReadClient[F[_]] {
    def read(url: String): F[Resource]
  }

  def dateToDateTime(date: FHIRDate): FHIRDateTime =
    FHIRDateTime(date.date.atTime(0, 0).atZone(ZoneOffset.UTC), date.specificity)

  def dateTimeToDate(dateTime: FHIRDateTime): FHIRDate =
    FHIRDate(
      dateTime.dateTime.toLocalDate,
      dateTime.specificity match {
        case x: FHIRDateSpecificity => x
        case _                      => Day
      })

  def unitQuantity(value: BigDecimal) = Quantity(value = Some(value), unit = Some("1"))

  implicit class FHIRObjectExt(fhirObj: FHIRObject) {
    def children(predicate: FHIRComponentField[_] => Boolean = _ => true): List[Value] =
      tryChildren(predicate).toList.flatten

    // Returns None if no field matched the predicate
    def tryChildren(predicate: FHIRComponentField[_] => Boolean): Option[List[Value]] = {
      val fields = fhirObj.fields.filter(predicate).toList

      if (fields.nonEmpty) {
        fields.flatMap { field =>
          val values = field.value match {
            case Some(x)       => List(x)
            case ls: LitSeq[_] => ls
            case None          => Nil
            case x             => List(x)
          }

          values.map(Value.wrapChild(_, fhirObj, field.meta))
        }.some
      } else {
        None
      }
    }
  }
}
