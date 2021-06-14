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
  lazy val withName: String => A = values.map(x => x.name -> x).toMap
  implicit val encoder: Encoder[A] = Encoder.instance[A](Json fromString _.name)
  implicit val decoder: Decoder[A] =
    Decoder.instance[A](c => c.as[String].flatMap(s => Try(withName(s)).toEither.left.map { _ =>
      val options =
        if (values.size <= 10) s" Valid values are: '${values.map(_.name).mkString(", ")}'."
        else ""
      DecodingFailure(s"'$s' is not in $reference.$options", c.history)
    }))
}

trait ETypeWithFallback[A <: ToCodingAble: ClassTag](override val reference: String) extends EType[A] {
  def fromOrdinal(i: Int): A
  // This is so, so stupid.. but there isn't any way to override the name of an enum, or to list the unparameterised
  // values if a single parameterised one exists. Anyway, this works as long as 'Other' is the last case.
  override lazy val values: Array[A] =
    (0 to Int.MaxValue-1).view.map(i => Try(fromOrdinal(i))).takeWhile(_.isSuccess).collect{ case Success(v) => v }.toArray
  def fallback(s: String): A
  override lazy val withName: String => A = values.map(x => x.name -> x).toMap.withDefault(fallback)
}
