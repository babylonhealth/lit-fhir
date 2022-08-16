package com.babylonhealth.lit.core

import java.time.{ LocalDate, ZoneOffset, ZonedDateTime }
import java.util.Base64

import scala.util.{ Failure, Success, Try }

import io.circe.syntax._
import io.circe.{ Decoder, DecodingFailure, Encoder, HCursor, Json }

import com.babylonhealth.lit.core.FHIRDateTimeSpecificity.Micros

object BaseFieldDecoders extends BaseFieldDecoders
trait BaseFieldDecoders extends Utils {
  def tryDecode[T](fn: => T, c: HCursor): Either[DecodingFailure, T] =
    Try(fn).toEither.left.map(t => DecodingFailure.fromThrowable(t, c.history))

  implicit val unsignedIntDecoder: Decoder[UnsignedInt] =
    Decoder.instance[UnsignedInt](c => c.as[Int].flatMap(i => tryDecode(toUnsignedInt(i), c)))
  implicit val unsignedIntEncoder: Encoder[UnsignedInt] = Encoder.instance[UnsignedInt](Json fromInt _)
  implicit val positiveIntDecoder: Decoder[PositiveInt] =
    Decoder.instance[PositiveInt](c => c.as[Int].flatMap(i => tryDecode(toPositiveInt(i), c)))
  implicit val positiveIntEncoder: Encoder[PositiveInt] = Encoder.instance[PositiveInt](Json fromInt _)
  implicit val canonicalDecoder: Decoder[Canonical] =
    Decoder.instance[Canonical](c => c.as[String].flatMap(s => tryDecode(toCanonical(s), c)))
  implicit val canonicalEncoder: Encoder[Canonical] = Encoder.instance[Canonical](Json fromString _)
  implicit val codeDecoder: Decoder[Code] =
    Decoder.instance[Code](c => c.as[String].flatMap(s => tryDecode(toCode(s), c)))
  implicit val codeEncoder: Encoder[Code] = Encoder.instance[Code](Json fromString _)
  implicit val idDecoder: Decoder[Id] =
    Decoder.instance[Id](c => c.as[String].flatMap(s => tryDecode(toId(s), c)))
  implicit val idEncoder: Encoder[Id] = Encoder.instance[Id](Json fromString _)
  implicit val markdownDecoder: Decoder[Markdown] =
    Decoder.instance[Markdown](c => c.as[String].flatMap(s => tryDecode(toMarkdown(s), c)))
  implicit val markdownEncoder: Encoder[Markdown] = Encoder.instance[Markdown](Json fromString _)
  implicit val oidDecoder: Decoder[OID] =
    Decoder.instance[OID](c => c.as[String].flatMap(s => tryDecode(toOID(s), c)))
  implicit val oidEncoder: Encoder[OID] = Encoder.instance[OID](Json fromString _)
  implicit val urlDecoder: Decoder[UrlStr] =
    Decoder.instance[UrlStr](c => c.as[String].flatMap(s => tryDecode(toUrlStr(s), c)))
  implicit val urlEncoder: Encoder[UrlStr] = Encoder.instance[UrlStr](Json fromString _)
  implicit val uriDecoder: Decoder[UriStr] =
    Decoder.instance[UriStr](c => c.as[String].flatMap(s => tryDecode(toUri(s), c)))
  implicit val uriEncoder: Encoder[UriStr] = Encoder.instance[UriStr](Json fromString _)
  implicit val xhtmlDecoder: Decoder[XHTML] =
    Decoder.instance[XHTML](c => c.as[String].flatMap(s => tryDecode(toXHTML(s), c)))
  implicit val xhtmlEncoder: Encoder[XHTML] = Encoder.instance[XHTML](Json fromString _)

  implicit def encodeEither[A, B](implicit encoderA: Encoder[A], encoderB: Encoder[B]): Encoder[Either[A, B]] = {
    _.fold(_.asJson, _.asJson)
  }

  implicit def decodeEither[A, B](implicit decoderA: Decoder[A], decoderB: Decoder[B]): Decoder[Either[A, B]] =
    Decoder.instanceTry { (c: HCursor) =>
      c.as[A] match {
        case Right(a) => Success(Left(a))
        case Left(err) =>
          c.as[B]
            .fold(
              { o =>
                err.addSuppressed(o); Failure(err)
              },
              s => Success(Right(s))
            ) // the RHS is generally the 'fallback', so an error decoding the LHS will be the 'suppressed' one by default
      }
    }

  implicit def decodeNonEmptyLitSeq[T](implicit decoder: Decoder[LitSeq[T]]): Decoder[NonEmptyLitSeq[T]] =
    decoder.emapTry(l => Try(l.asNonEmpty)) // todo: small perf gains available here

  implicit def decodeLitSeq[T](implicit decoder: Decoder[T]): Decoder[LitSeq[T]] =
    Decoder.instance {
      _.as[Seq[T]].left
        .map(e => if (e.message == "C[A]") e.withMessage("Expected an array") else e) // wtf circe?
        .map(_.to(LitSeq))
    }

  implicit def encodeLitSeq[T](implicit encoder: Encoder[T]): Encoder[LitSeq[T]] =
    Encoder.instance(l => Json.arr(l.map(_.asJson).toSeq: _*))

  val yearsOnly          = "(\\d{4})".r
  val yearsAndMonths     = "(\\d{4})-(\\d{2})".r
  val yearsMonthsAndDays = "(\\d{4})-(\\d{2})-(\\d{2})".r

  implicit val decodeFHIRDate: Decoder[FHIRDate] =
    Decoder.decodeString.emapTry {
      case yearsOnly(y)         => Try(FHIRDate(LocalDate.of(y.toInt, 1, 1), FHIRDateTimeSpecificity.Year))
      case yearsAndMonths(y, m) => Try(FHIRDate(LocalDate.of(y.toInt, m.toInt, 1), FHIRDateTimeSpecificity.Month))
      case s                    => Try(FHIRDate(LocalDate.parse(s), FHIRDateTimeSpecificity.Day))
    }
  implicit val encoderFHIRDate: Encoder[FHIRDate] = Encoder.encodeString.contramap(_.fmt)

  implicit val decodeFHIRDateTime: Decoder[FHIRDateTime] =
    Decoder.decodeString.emapTry {
      case yearsOnly(y) =>
        Try(FHIRDateTime(ZonedDateTime.of(y.toInt, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC), FHIRDateTimeSpecificity.Year))
      case yearsAndMonths(y, m) =>
        Try(FHIRDateTime(ZonedDateTime.of(y.toInt, m.toInt, 1, 0, 0, 0, 0, ZoneOffset.UTC), FHIRDateTimeSpecificity.Month))
      case yearsMonthsAndDays(y, m, d) =>
        Try(FHIRDateTime(ZonedDateTime.of(y.toInt, m.toInt, d.toInt, 0, 0, 0, 0, ZoneOffset.UTC), FHIRDateTimeSpecificity.Day))
      case x =>
        Try {
          val time        = ZonedDateTime.parse(x)
          val specificity = if (time.getNano % 1000000 == 0) FHIRDateTimeSpecificity.Time else FHIRDateTimeSpecificity.Micros
          FHIRDateTime(time, specificity)
        }
    }
  implicit val encoderFHIRDateTime: Encoder[FHIRDateTime] = Encoder.encodeString.contramap(_.fmt)

  // Don't be fooled. This actually represents a FHIR Instant, _not_ DateTime.
  implicit val decodeZonedDateTime: Decoder[ZonedDateTime] = Decoder.decodeString.emapTry { x =>
    Try(ZonedDateTime.parse(x))
  }
  implicit val encodeZonedDateTime: Encoder[ZonedDateTime] = Encoder.encodeString.contramap(Micros.dtFormatter.format)

  implicit val base64BinaryDecoder: Decoder[Base64Binary] =
    Decoder.decodeString.emapTry(s => Try(Base64.getDecoder.decode(s)).map(_.asInstanceOf[Base64Binary]))
  implicit val base64BinaryEncoder: Encoder[Base64Binary] =
    Encoder.instance[Base64Binary](a => Json fromString Base64.getEncoder.encodeToString(a))
}
