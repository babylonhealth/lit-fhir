package com.babylonhealth.lit.hl7.serdes

import java.time.{ LocalDate, ZoneOffset, ZonedDateTime }

import io.circe.Decoder
import io.circe.parser.decode
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

import com.babylonhealth.lit.core.BaseFieldDecoders._
import com.babylonhealth.lit.core.serdes.serializeField
import com.babylonhealth.lit.core.{ FHIRDate, FHIRDateTime, FHIRDateTimeSpecificity }

class DateTimeSerdeTest extends AnyFreeSpec with Matchers {
  val yearStr                        = "2019"
  val yearMonthStr                   = "2019-07"
  val dateStr                        = "2019-07-19"
  val timeStr                        = "2019-07-19T19:37:42.007Z"
  val timeZonedPlusStr               = "2019-07-19T19:37:42.006+04:00"
  val timeZonedMinusStr              = "2019-07-19T19:37:42.007-09:00"
  val timeMicrosStr                  = "2019-07-19T19:37:42.007006Z"
  def strWrapped(s: String): String  = s""""$s""""
  def read[T: Decoder](s: String): T = decode[T](s).fold(throw _, identity)
  def checkIdempotency[T: Decoder](in: String, expected: T): Unit = {
    val decoded = read[T](strWrapped(in))
    decoded shouldEqual expected
    val encoded = serializeField(decoded).noSpaces
    encoded shouldEqual strWrapped(in)
    val reDecoded = read[T](encoded)
    reDecoded shouldEqual decoded
    val reEncoded = serializeField(reDecoded).noSpaces
    reEncoded shouldEqual encoded
  }
  "date repr" - {
    "handles year-only string" in {
      checkIdempotency(yearStr, FHIRDate(LocalDate.of(2019, 1, 1), FHIRDateTimeSpecificity.Year))
    }
    "handles year-month string" in {
      checkIdempotency(yearMonthStr, FHIRDate(LocalDate.of(2019, 7, 1), FHIRDateTimeSpecificity.Month))
    }
    "handles year-month-day string" in {
      checkIdempotency(dateStr, FHIRDate(LocalDate.of(2019, 7, 19), FHIRDateTimeSpecificity.Day))
    }
  }
  "datetime repr" - {
    "handles year-only string" in {
      checkIdempotency(
        yearStr,
        FHIRDateTime(ZonedDateTime.of(2019, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC), FHIRDateTimeSpecificity.Year))
    }
    "handles year-month string" in {
      checkIdempotency(
        yearMonthStr,
        FHIRDateTime(ZonedDateTime.of(2019, 7, 1, 0, 0, 0, 0, ZoneOffset.UTC), FHIRDateTimeSpecificity.Month))
    }
    "handles year-month-day string" in {
      checkIdempotency(
        dateStr,
        FHIRDateTime(ZonedDateTime.of(2019, 7, 19, 0, 0, 0, 0, ZoneOffset.UTC), FHIRDateTimeSpecificity.Day))
    }
    "handles time string" in {
      checkIdempotency(
        timeStr,
        FHIRDateTime(ZonedDateTime.of(2019, 7, 19, 19, 37, 42, 7 * 1000000, ZoneOffset.UTC), FHIRDateTimeSpecificity.Time))
    }
    "handles timezone string (1)" in {
      checkIdempotency(
        timeZonedPlusStr,
        FHIRDateTime(ZonedDateTime.of(2019, 7, 19, 19, 37, 42, 6 * 1000000, ZoneOffset.ofHours(4)), FHIRDateTimeSpecificity.Time))
    }
    "handles timezone string (2)" in {
      checkIdempotency(
        timeZonedMinusStr,
        FHIRDateTime(
          ZonedDateTime.of(2019, 7, 19, 19, 37, 42, 7 * 1000000, ZoneOffset.ofHours(-9)),
          FHIRDateTimeSpecificity.Time))
    }
    "handles micros time string" in {
      checkIdempotency(
        timeMicrosStr,
        FHIRDateTime(ZonedDateTime.of(2019, 7, 19, 19, 37, 42, 7006 * 1000, ZoneOffset.UTC), FHIRDateTimeSpecificity.Micros))
    }
  }
}
