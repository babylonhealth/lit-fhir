package com.babylonhealth.lit.core
import enumeratum.{ Circe, Enum, EnumEntry }
import io.circe.{ Decoder, DecodingFailure, Encoder, HCursor }

import com.babylonhealth.lit.core.EnumBase

trait EnumeratumBase extends EnumEntry with EnumBase { def name: String = entryName }

trait FhirEnum[A <: EnumEntry] extends Enum[A] {
  def reference: String
}

trait FhirCirceEnum[A <: EnumEntry] { this: FhirEnum[A] =>

  implicit val encoder: Encoder[A] = Circe.encoder(this)

  implicit val decoder: Decoder[A] = (c: HCursor) =>
    implicitly[Decoder[String]].apply(c).flatMap { s =>
      withNameOption(s).toRight {
        val options = if (values.size <= 10) {
          s" Valid values are: '${values.map(_.entryName).mkString(", ")}'."
        } else {
          ""
        }
        DecodingFailure(s"'$s' is not in $reference.$options", c.history)
      }
    }
}

trait EnumWithFallback[A <: EnumEntry] { this: Enum[A] =>
  def fallback: String => A
  implicit val decoder: Decoder[A] = Decoder.decodeString.emap { s =>
    val maybeMember = withNameOption(s)
    maybeMember match {
      case Some(member) => Right(member)
      case _            => Right(fallback(s))
    }
  }
  implicit val encoder: Encoder[A] = Encoder.encodeString.contramap(_.entryName)
}
