package com.babylonhealth.lit.core

import io.circe.{ Decoder, Json }
import izumi.reflect.{ Tag, TagK, TagKK }
import izumi.reflect.macrortti.{ LTag, LTT, LightTypeTag, LightTypeTagRef }

import com.babylonhealth.lit.core.model.{ suffixTypeMap, typeSuffixMap }

object TagSummoners {
  def lTagOf[T: LTag]: LTag[T]       = implicitly[LTag[T]]
  def lTypeOf[T: LTag]: LightTypeTag = lTagOf[T].tag
}
import TagSummoners._

object \/ {
  val typeSuffixMap2: LightTypeTagRef => Option[String] = {
    val map = suffixTypeMap.map { case (suff, tpe) => tpe.ref -> suff }
    map.get(_)
  }

  def str[U](implicit tt: LTag[U]): String =
    tt.tag.ref match {
      case LightTypeTagRef.UnionReference(refs) => refs.map(_.shortName).mkString(" \\/ ")
      case ref                                  => ref.shortName
    }

  def validSuffixes[U](implicit tt: LTag[U]): Set[String] = {
    tt.tag.ref match {
      case LightTypeTagRef.UnionReference(refs) => refs.map(typeSuffixMap2).flatten.toSet
      case ref                                  => typeSuffixMap2(ref).toSet
    }
  }
}
