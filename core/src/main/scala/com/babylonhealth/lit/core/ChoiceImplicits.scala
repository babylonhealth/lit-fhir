package com.babylonhealth.lit.core

import scala.annotation.implicitNotFound

import enumeratum.EnumEntry
import izumi.reflect.macrortti.LTag

import com.babylonhealth.lit.core.model.typeSuffixMap

abstract class UnionWitness[U, T] private[core] (implicit ut: LTag[U], val tt: LTag[T]) {
  def buildTo(t: T): U
  val suffix: String
}
// This is dumb, but cycling between UnionWitness and UnionWitnessShim prevents the scala compiler from throwing a 'Diverging implicit expansion' error
abstract class UnionWitnessShim[U: LTag, T: LTag] {
  def buildTo(t: T): U
  val suffix: String
}

object ChoiceImplicits {

  /** This construction appears to be more powerful than an implicit macro construction, since it successfully infers an
    * appropriate implicit for the `value = value.map(choice(_))` case, whereas experimenting with implicit
    * macros left an unexpanded `U` type available to the macro (where the LHS value: Option[U] and the RHS value: Option[T])
    * and consequently the type checking cannot occur... This might well be a solvable issue, but I didn't get there...
    */
  implicit def mkUnionWitnessBase[U](implicit tt: LTag[U]): UnionWitness[U, U] =
    new UnionWitness {
      override def buildTo(t: U): U = t
      override val suffix: String   = typeSuffixMap(tt.tag).get
    }

  implicit def mkUnionWitnessL[L: LTag, R: LTag, T: LTag](implicit
      lwitness: UnionWitness[L, T]): UnionWitnessShim[L \/ R, T] =
    new UnionWitnessShim[L \/ R, T]()(\::/[L, R], implicitly[LTag[T]]) {
      override def buildTo(t: T): L \/ R = LHS[L, R](lwitness.buildTo(t))
      override val suffix: String        = lwitness.suffix
    }
  implicit def mkUnionWitnessR[L: LTag, R: LTag, T: LTag](implicit
      rwitness: UnionWitness[R, T]): UnionWitnessShim[L \/ R, T] =
    new UnionWitnessShim[L \/ R, T]()(\::/[L, R], implicitly[LTag[T]]) {
      override def buildTo(t: T): L \/ R = RHS[L, R](rwitness.buildTo(t))
      override val suffix: String        = rwitness.suffix
    }
  implicit def mkUnionWitnessFromShim[L: LTag, R: LTag, T: LTag](implicit
      shim: UnionWitnessShim[L \/ R, T]): UnionWitness[L \/ R, T] =
    new UnionWitness[L \/ R, T]()(\::/[L, R], implicitly[LTag[T]]) {
      override def buildTo(t: T): L \/ R = shim.buildTo(t)
      override val suffix: String        = shim.suffix
    }
  // This method requires explicit type parameters for some reason. It has proven unable to infer them, and IDK why... For this reason, it is not used in the autogenerated class deserialization code.
  def buildTypeSafeUnion[U <: _ \/ _: LTag, S: LTag](t: S)(implicit witness: UnionWitness[U, S]): U =
    witness.buildTo(t)

  def choice[U <: _ \/ _: LTag, S: LTag](t: S)(implicit
  @implicitNotFound("Cannot prove that ${S} is a viable type for union ${U}") witness: UnionWitness[U, S]): Choice[U] =
    Choice.fromValAndSuffix[U, S](t, witness.suffix)

  // Use case for this constructor is specifically extensions which limit their value range to a single enum
  def choice[U <: _ \/ _: LTag, S <: EnumEntry: LTag](t: S)(implicit
      @implicitNotFound("No Code or ${S} option for union ${U}") witness: UnionWitness[U, Code]): Choice[U] =
    Choice.fromValAndSuffix[U, Code](t.entryName, "Code")

  implicit class WrapperRef[U, T](val ref: Choice[U]) {
    // like strictValueAs, but we can only call it when it's provable that Sub is a component of the union T
    def as[Sub](implicit
        tt: LTag[Sub],
        @implicitNotFound("Cannot prove that ${Sub} is a viable type for union ${T}") witness: UnionWitness[
          U,
          Sub]): Option[Sub] = {
      if (ref.elTT.tag =:= tt.tag) Some(ref.value.asInstanceOf[Sub])
      else None
    }
  }
}
