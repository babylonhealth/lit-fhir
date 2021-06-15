package com.babylonhealth.lit.core

import scala.annotation.implicitNotFound

import izumi.reflect.macrortti.LTag

import com.babylonhealth.lit.core.model.typeSuffixMap

abstract class UnionWitness[U, T] private[core] (implicit ut: LTag[U], val tt: LTag[T]) {
  def buildTo(t: T): U
  val suffix: String
}

object ChoiceImplicits {

  implicit def mkUnionWitness[U, T <: U](implicit tut: LTag[U], ttt: LTag[T]): UnionWitness[U, T] =
    new UnionWitness {
      override def buildTo(t: T): U = t //.asInstanceOf[U]
      override val suffix: String   = \/.typeSuffixMap2(ttt.tag.ref).get
    }

  def buildTypeSafeUnion[U: LTag, S: LTag](t: S)(implicit witness: S <:< U): U = t

  def choice[U: LTag, S: LTag](t: S)(implicit
  @implicitNotFound("Cannot prove that ${S} is a viable type for union ${U}") witness: UnionWitness[U, S]): Choice[U] =
    Choice.fromValAndSuffix[U, S](t, witness.suffix)

  // Use case for this constructor is specifically extensions which limit their value range to a single enum
  def choice[U: LTag, S <: EnumBase: LTag](t: S)(implicit
      @implicitNotFound("No Code or ${S} option for union ${U}") witness: UnionWitness[U, Code]): Choice[U] =
    Choice.fromValAndSuffix[U, Code](t.name, "Code")

  implicit class WrapperRef[U, T](val ref: Choice[U]) {
    // like strictValueAs, but we can only call it when it's provable that Sub is a component of the union T
    def as[Sub](implicit
        tt: LTag[Sub],
        @implicitNotFound("Cannot prove that ${Sub} is a viable type for union ${T}")
        witness: UnionWitness[U, Sub]): Option[Sub] = {
      if (ref.elTT.tag =:= tt.tag) Some(ref.value.asInstanceOf[Sub])
      else None
    }
  }
}
