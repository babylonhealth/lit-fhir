package com.babylonhealth.lit.core

import scala.reflect.ClassTag
import scala.util.{ Success, Try }

import io.circe.{ Decoder, DecodingFailure, Encoder, HCursor, Json }

import com.babylonhealth.lit.core.model.Coding

trait ToCodingAble extends EnumBase {
  def name: String
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(name), display = display))
}

trait EType[A <: ToCodingAble](val reference: String) {
  def values: Array[A]
  def withName: String => A        = namesToValuesMap.apply
  implicit val encoder: Encoder[A] = Encoder.instance[A](Json fromString _.name)
  implicit val decoder: Decoder[A] =
    Decoder.instance[A](c =>
      c.as[String]
        .flatMap(s =>
          Try(withName(s)).toEither.left.map { _ =>
            val options =
              if (values.size <= 10) s" Valid values are: '${values.map(_.name).mkString(", ")}'."
              else ""
            DecodingFailure(s"'$s' is not in $reference.$options", c.history)
          }))

  lazy val namesToValuesMap: Map[String, A] = values.map(v => v.name -> v).toMap
  lazy final val lowerCaseNamesToValuesMap: Map[String, A] =
    namesToValuesMap.map { case (k, v) => k.toLowerCase -> v }
  def withNameInsensitiveOption(name: String): Option[A] =
    lowerCaseNamesToValuesMap.get(name.toLowerCase)

  def withNameInsensitive(name: String): A =
    withNameInsensitiveOption(name).getOrElse {
      val options =
        if (values.size <= 10) s" Valid values are: '${values.map(_.name).mkString(", ")}'."
        else ""
      throw new NoSuchElementException(s"'$name' is not in $reference.$options")
    }
}

trait ETypeWithFallback[A <: ToCodingAble](implicit aClassTag: ClassTag[A]) extends EType[A] {
  def fromOrdinal(i: Int): A
  // This is so, so stupid.. but there isn't any way to override the name of an enum, or to list the unparameterised
  // values if a single parameterised one exists. Anyway, this works as long as 'Other' is the last case.
  override lazy val values: Array[A] =
    (0 to Int.MaxValue - 1).view
      .map(i => Try(fromOrdinal(i)))
      .takeWhile(_.isSuccess)
      .collect { case Success(v) => v }
      .toArray
  def fallback(s: String): A
  override lazy val namesToValuesMap: Map[String, A] = values.map(x => x.name -> x).toMap.withDefault(fallback)

  override def withNameInsensitiveOption(name: String): Option[A] = Some(withName(name))
  override def withNameInsensitive(name: String): A               = withName(name)
}
