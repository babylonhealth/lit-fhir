package com.babylonhealth.lit.hl7.serdes

import io.circe.parser.decode
import io.circe.syntax._
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

import com.babylonhealth.lit.core.model.Quantity
import com.babylonhealth.lit.core.serdes.{ objectDecoder, objectEncoder }

class BigDecimalSerdeTest extends AnyFreeSpec with Matchers {
  "big decimals" - {
    "serialize and deserialize as expected" in {
      val quantity = Quantity(unit = Some("Hg[mm]"), value = Some(1.23))
      val ser      = quantity.asJson.noSpaces
      val deser    = decode[Quantity](ser)
      deser.isRight shouldEqual true
      deser.right.get shouldEqual quantity
    }
    def hasNPlaces(n: Int, json: String) = {
      if (n == 0) json shouldEqual """{"unit":"Hg[mm]","value":420}"""
      else json shouldEqual s"""{"unit":"Hg[mm]","value":420.${"0" * n}}"""
    }
    def retainsNDecimalPlaces(n: Int) =
      s"retains $n decimal places when specified" in {
        val value: BigDecimal = n match {
          case 0 => BigDecimal("420")
          case i => BigDecimal(s"420.${"0" * i}")
        }
        val quantity = Quantity(unit = Some("Hg[mm]"), value = Some(value))
        val ser      = quantity.asJson.noSpaces
        hasNPlaces(n, ser)
        val deser = decode[Quantity](ser)
        deser.isRight shouldEqual true
        deser.right.get shouldEqual quantity
        val reser = deser.right.get.asJson.noSpaces
        hasNPlaces(n, reser)
      }
    for (i <- 0 to 10) retainsNDecimalPlaces(i)
  }
}
