package com.babylonhealth.lit.core

import io.circe.{ Decoder, Json }
import izumi.reflect.{ Tag, TagK, TagKK }
import izumi.reflect.macrortti.{ LTag, LightTypeTag }

import com.babylonhealth.lit.core.model.{ suffixDecoderTypeTagMap, typeSuffixMap }

object TagSummoners {
  def lTagOf[T: LTag]: LTag[T]       = implicitly[LTag[T]]
  def lTypeOf[T: LTag]: LightTypeTag = lTagOf[T].tag
}
import TagSummoners._

object \/ {
  def \::/[L, R](implicit lt: LTag[L], rt: LTag[R]): LTag[L \/ R] =
    new LTag[L \/ R](Tag.appliedTag(TagKK[\/], List(lt.tag, rt.tag)).tag)

  def typetagFromType[T](tpe: LightTypeTag): LTag[T] = new LTag[T](tpe)

  val unappliedLTag = TagKK[\/].tag.withoutArgs

  def str[U: LTag]: String = {
    if (lTypeOf[U].withoutArgs =:= unappliedLTag) {
      val (t1, t2) = getUnionParams[U]
      s"${str(LTag(t1))} \\/ ${str(LTag(t2))}"
    } else lTypeOf[U].shortName
  }

  // Seemingly can't enforce that U <: _ \/ _ -- basically IDK how to cast a type on callsite -- how would I say the 'asSubtypeOf' bit of
  // ```
  //  if (lTypeOf[Cast] <:< unappliedLTag) {
  //    val (t1, t2) = getUnionParams[Cast.asSubtypeOf[_ \/ _]]
  // ```
  // ?
  def getUnionParams[U: LTag]: (LightTypeTag, LightTypeTag) =
    lTypeOf[U].typeArgs.take(2) match {
      case x if x.length == 2 => (x(0), x(1))
    }
  // how would we allow this syntax: if `Foo :\/ Boolean`  ?
  def canBe[Cast: LTag, Castee: LTag]: Boolean = {
    if (lTypeOf[Cast].withoutArgs =:= unappliedLTag) {
      val (t1, t2) = getUnionParams[Cast]
      canBe(typetagFromType(t1), lTagOf[Castee]) || canBe(typetagFromType(t2), lTagOf[Castee])
    } else lTypeOf[Cast] <:< lTypeOf[Castee]
  }

  def lTypeTagsOf[U <: _ \/ _](implicit tt: LTag[U]): (LTag[_], LTag[_]) = {
    val (lhst, _) = getUnionParams[U]
    assert(
      lhst.withoutArgs =:= unappliedLTag,
      s"Cannot destructure this union any further -- ${tt} doesn't have a union LHS")
    val (t1, t2) = getUnionParams(typetagFromType(lhst))
    (typetagFromType(t1), typetagFromType(t2))
  }

  def jsonBuilder[To](suffix: String, from: Json)(implicit tt: LTag[To]): To = {
    val decoderAndTag = suffixDecoderTypeTagMap(suffix)
    builder(
      from
        .as[decoderAndTag.Type](decoderAndTag.decoder.asInstanceOf[Decoder[decoderAndTag.Type]])
        .fold(throw _, identity))(tt, decoderAndTag.typeTag.asInstanceOf[LTag[decoderAndTag.Type]])
  }

  def builder[To, From](from: From)(implicit tt: LTag[To], ft: LTag[From]): To = {
    if (tt.tag =:= ft.tag) from.asInstanceOf[To]
    else if (tt.tag.withoutArgs =:= unappliedLTag) {
      val (t1, t2) = getUnionParams(tt)
      if (t2 =:= ft.tag) RHS(from)(typetagFromType(t1), typetagFromType(t2)).asInstanceOf[To]
      else LHS(builder(from)(typetagFromType(t1), ft))(typetagFromType(t1), typetagFromType(t2)).asInstanceOf[To]
    } else throw new RuntimeException(s"Cannot ascribe type ${str[To]} to type ${from.getClass}")
  }

  @deprecated("I think this is probably slow AF because of the 'canBe' check")
  def build[L, R, S](t: S)(implicit lt: LTag[L], rt: LTag[R], st: LTag[S]): L \/ R = {
    if (st.tag =:= lt.tag) LHS[L, R](t.asInstanceOf[L])
    else if (st.tag =:= rt.tag) RHS[L, R](t.asInstanceOf[R])
    else if (lt.tag.withoutArgs =:= unappliedLTag) {
      val uTpe     = \::/[L, R]
      val (t1, t2) = lTypeTagsOf(uTpe)
      if (canBe(uTpe, st))
        LHS[L, R](build(t)(t1.asInstanceOf[LTag[L]], t2.asInstanceOf[LTag[R]], lTagOf[S]).asInstanceOf[L])
      else throw new RuntimeException(s"Cannot ascribe type ${str[L \/ R](uTpe)} to type ${t.getClass} ()")
    } else
      throw new RuntimeException(s"Cannot ascribe type ${str[L \/ R](\::/[L, R])} to type ${t.getClass}:" +
        s"  ( ${lt.tag} ) is not a union type, and does not match the runtime object's class ( ${t.getClass} ) - " +
        s"  RHS ( ${rt.tag} ) was not considered as union type because of the LHS aggregation of X \\/ Y \\/ Z chains")
  }

  def lTypeSubsumesR[L <: _ \/ _: LTag, R <: _ \/ _: LTag]: Boolean = {
    val (t1, t2) = getUnionParams[R]
    (if (t1.withoutArgs =:= unappliedLTag) lTypeSubsumesR(lTagOf[L], \/.typetagFromType(t1))
     else lTypeSubsumesRIndividual(lTagOf[L], \/.typetagFromType(t1))) &&
    (if (t2.withoutArgs =:= unappliedLTag) lTypeSubsumesR(lTagOf[L], \/.typetagFromType(t2))
     else lTypeSubsumesRIndividual(lTagOf[L], \/.typetagFromType(t2)))
  }

  def lTypeSubsumesRAll[L <: _ \/ _, R](rtype: LightTypeTag)(implicit lTag: LTag[L]): Boolean =
    if (rtype.withoutArgs =:= unappliedLTag) lTypeSubsumesR(lTag, typetagFromType(rtype))
    else lTypeSubsumesRIndividual(lTag, typetagFromType(rtype))

  def lTypeSubsumesRIndividual[L <: _ \/ _: LTag, R: LTag]: Boolean = \/.canBe(lTagOf[L], lTagOf[R])
  def validSuffixes[T: LTag]: Set[String] =
    lTypeOf[T] match {
      case t if t.withoutArgs =:= unappliedLTag =>
        val (t1, t2) = getUnionParams(lTagOf[T])
        validSuffixes(typetagFromType(t1)) ++ validSuffixes(typetagFromType(t2))
      case t => typeSuffixMap(t).toSet
    }
}

import com.babylonhealth.lit.core.\/.\::/

/** Tends to accumulate on the left when used as Foo \/ Bar \/ Baz, so you'd have a LHS(LHS(Foo)) etc.
  *
  * Operations on this class tend to be pretty slow because of all the <:< stuff, so avoid reification, and instead use
  * this just for Choice[_] type parameters
  */
sealed abstract class \/[L, R](implicit val ltt: LTag[L], val rtt: LTag[R]) {
  type Left  = L
  type Right = R
  def value: Any
  final def valueIs[T: LTag]: Boolean =
    this match {
      case RHS(r) if lTypeOf[R].withoutArgs =:= \/.unappliedLTag => r.asInstanceOf[_ \/ _].valueIs[T]
      case LHS(l) if lTypeOf[L].withoutArgs =:= \/.unappliedLTag => l.asInstanceOf[_ \/ _].valueIs[T]
      case RHS(_) if lTypeOf[R] <:< lTypeOf[T]                   => true
      case LHS(_) if lTypeOf[L] <:< lTypeOf[T]                   => true
      case _                                                     => false
    }
  def valueAs[T: LTag]: Option[T] =
    this match {
      case RHS(r) if lTypeOf[R].withoutArgs =:= \/.unappliedLTag => r.asInstanceOf[_ \/ _].valueAs[T]
      case LHS(l) if lTypeOf[L].withoutArgs =:= \/.unappliedLTag => l.asInstanceOf[_ \/ _].valueAs[T]
      case RHS(t) if lTypeOf[R] <:< lTypeOf[T]                   => Some(t.asInstanceOf[T])
      case LHS(t) if lTypeOf[L] <:< lTypeOf[T]                   => Some(t.asInstanceOf[T])
      case _                                                     => None
    }
  //  def valueCanBe[T: LTag]: Boolean = \/.canBe[L \/ R, T] // TODO: Does this work now?
  // Todo: Tests and a good alias
  def isSubUnionOf[U2 <: _ \/ _: LTag]: Boolean = \/.lTypeSubsumesR[L \/ R, U2](\::/[L, R], implicitly)
  def isSubUnionOfIndividual[U2: LTag]: Boolean = \/.lTypeSubsumesRIndividual[L \/ R, U2](\::/[L, R], implicitly)

}

case class LHS[L: LTag, R: LTag](l: L) extends \/[L, R] {
  def value: Any =
    l match {
      case x: \/[_, _] => x.value
      case x           => x
    }
}

case class RHS[L: LTag, R: LTag](r: R) extends \/[L, R] {
  def value: Any = r
}
