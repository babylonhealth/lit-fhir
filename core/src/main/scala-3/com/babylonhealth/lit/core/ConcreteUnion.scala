package com.babylonhealth.lit.core

import io.circe.{ Decoder, Json }
import izumi.reflect.{ Tag, TagK, TagKK }
import izumi.reflect.macrortti.{ LTag, LTT, LightTypeTag, LightTypeTagRef }

import com.babylonhealth.lit.core.model.suffixTypeMap

object TagSummoners {
  def lTagOf[T: LTag]: LTag[T]       = implicitly[LTag[T]]
  def lTypeOf[T: LTag]: LightTypeTag = lTagOf[T].tag
}
import TagSummoners._

object \/ {
  def typetagFromType[T](tpe: LightTypeTag): LTag[T] = new LTag[T](tpe)

  val typeSuffixMap2: LightTypeTagRef => Option[String] = {
    val map = suffixTypeMap.map{ case (suff, tpe) => tpe.ref -> suff }
    map.get(_)
  }

  def str[U: LTag]: String =
    LTT[U].ref match {
      case LightTypeTagRef.UnionReference(refs) => refs.map(_.shortName).mkString(" \\/ ")
      case ref                                  => ref.shortName
    }

  def validSuffixes[U: LTag]: Set[String] =
    LTT[U].ref match {
      case LightTypeTagRef.UnionReference(refs) => refs.map(typeSuffixMap2).flatten.toSet
      case ref                                  => typeSuffixMap2(ref).toSet
    }
}
