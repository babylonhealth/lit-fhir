package com.babylonhealth.lit.core

import scala.annotation.implicitNotFound

import izumi.reflect.macrortti.{ LTag, LTT }

import com.babylonhealth.lit.core.model.typeSuffixMap

object ChoiceImplicits {

  def buildTypeSafeUnion[U: LTag, S: LTag](t: S)(implicit witness: S <:< U): U = t

  def choice[U: LTag, S <: U: LTag](t: S)(implicit ttt: LTag[S]): Choice[U] =
    Choice.fromValAndSuffix[U, S](t, \/.typeSuffixMap2(ttt.tag.ref).get)

  // Use case for this constructor is specifically extensions which limit their value range to a single enum
  def choiceFromEnum[U >: Code: LTag, S <: EnumBase: LTag](t: S): Choice[U] =
    Choice.fromValAndSuffix[U, Code](t.name, "Code")

  extension [T <: Choice[_]](ref: T) {
    def as[Sub <: ref.Union](implicit tt: LTag[Sub]): Option[Sub] = {
      if (ref.elTT.tag =:= tt.tag) Some(ref.value.asInstanceOf[Sub])
      else None
    }
  }
}
