package com.babylonhealth.lit.fhirpath

import java.time.LocalTime

import cats.instances.option._
import cats.syntax.applicative._
import cats.syntax.applicativeError._
import cats.syntax.flatMap._
import cats.syntax.try_._
import cats.syntax.apply._

import com.babylonhealth.lit.core.{ Choice, EnumBase, FHIRComponentFieldMeta, FHIRDate, FHIRDateTime, FHIRObject }
import com.babylonhealth.lit.core.model.{ Element, Extension, Quantity }
import com.babylonhealth.lit.fhirpath.conversions._
import com.babylonhealth.lit.hl7.model.DomainResource

/** Wraps a fhirpath value, so we don't deal in [[Any]].
  *
  * [[extensions]] are for FHIR values - both primitives and complex types will have their extensions here.
  */
class Value private (val inner: Any, val choiceSuffix: Option[String], val extensions: Option[Seq[Extension]])
    extends PartiallyOrdered[Value] {
  def cast[F[+_]: MErr, T](implicit asValue: AsValue[T]): F[T] = asValue.get(this)

  def fold[T](f: Any => T): T                                      = f(inner)
  def collect[T](f: PartialFunction[Any, T]): Option[T]            = fold(f.lift)
  def tryCollect[T](f: PartialFunction[Any, Option[T]]): Option[T] = collect(f).flatten

  def isFhir: Boolean = extensions.nonEmpty

  def typeName: String = inner.getClass.getSimpleName

  override def toString: String = inner.toString

  override def equals(other: Any): Boolean = {
    val that = other match {
      case v: Value => v
      case _        => return false
    }

    val innerEq = Value.normalize(this, that) match {
      case (l: Quantity, r: Quantity) if l.unit != r.unit => ???
      case (l, r)                                         => l == r
    }
    lazy val extEq = (this.extensions map2 that.extensions)(_ == _) getOrElse true

    innerEq && extEq
  }

  override def hashCode: Int =
    (inner match {
      case i: Int => BigDecimal(i)
      case x      => x
    }).hashCode

  def compareOrError[F[+_]: MErr](that: Value): F[Int] =
    tryCompareTo(that) match {
      case Some(x) => x.pure[F]
      case None    => new Exception(f"Cannot compare $this and $that").raiseError
    }

  override def tryCompareTo[B >: Value: AsPartiallyOrdered](other: B): Option[Int] = {
    val that = other match {
      case v: Value => v
      case _        => return None
    }

    val result = Value.normalize(this, that) match {
      case (l: String, r: String)             => l compareTo r
      case (l: Int, r: Int)                   => l compareTo r
      case (l: BigDecimal, r: BigDecimal)     => l compareTo r
      case (l: Quantity, r: Quantity)         => ???
      case (l: FHIRDate, r: FHIRDate)         => ???
      case (l: FHIRDateTime, r: FHIRDateTime) => ???
      case (l: LocalTime, r: LocalTime)       => ???
      case _                                  => return None
    }

    Some(result)
  }
}

object Value {

  def wrap[T: AsValue](inner: T): Value = implicitly[AsValue[T]].wrap(inner)

  def wrapCollection[T, F[+_]: MErr](inner: T)(implicit toCollection: ToCollection[T, F]): F[List[Value]] =
    toCollection.wrap(inner)

  // Wrap a system primitive without extensions
  def wrapSystem(value: Any) = new Value(value, choiceSuffix = None, extensions = None)

  def wrapFhirObject(value: FHIRObject): Value = {
    val exts = fhirExtensions(value).getOrElse(Seq.empty)
    wrapFhir(value, None, exts)
  }

  // Wrap a child of a FHIR object, extracting the relevant extensions
  def wrapChild(value: Any, parent: FHIRObject, field: FHIRComponentFieldMeta[_]): Value = {
    val (unwrappedChoice, choiceSuffix) = value match {
      case v: Choice[_] => (v.value, Some(v.suffix))
      case v            => (v, None)
    }

    lazy val primExts = parent.primitiveAttributes.get(field).toSeq.flatMap(_.element.extension)
    val exts          = fhirExtensions(unwrappedChoice).getOrElse(primExts)
    wrapFhir(unwrappedChoice, choiceSuffix, exts)
  }

  private def wrapFhir(value: Any, choiceSuffix: Option[String], extensions: Seq[Extension]) =
    new Value(value, choiceSuffix, Some(extensions))

  private def fhirExtensions(value: Any): Option[Seq[Extension]] = {
    value match {
      case dr: DomainResource => Some(dr.extension.toSeq)
      case e: Element         => Some(e.extension.toSeq)
      case _                  => None
    }
  }

  // Perform implicit conversions to make left and right the same type (if possible)
  def normalize(left: Value, right: Value): (Any, Any) = (left.inner, right.inner) match {
    case (l: String, r: EnumBase)       => (l, r.name)
    case (l: EnumBase, r: String)       => (l.name, r)
    case (l: Int, r: BigDecimal)        => (BigDecimal(l), r)
    case (l: BigDecimal, r: Int)        => (l, BigDecimal(r))
    case (l: Quantity, r: Int)          => (l, unitQuantity(r))
    case (l: Int, r: Quantity)          => (unitQuantity(l), r)
    case (l: FHIRDate, r: FHIRDateTime) => ???
    case (l: FHIRDateTime, r: FHIRDate) => ???
    case (l, r)                         => (l, r)
  }
}
