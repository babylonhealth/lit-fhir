package com.babylonhealth.lit.hl7

import scala.util.Try

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

import com.babylonhealth.lit.core._

class SubtypeConversionTest extends AnyFreeSpec with Matchers {
  "basic" - {
    "implicit conversion convert without explicit cast" in {
      val positiveInt: PositiveInt = 420
      val code: Code               = ".asd."
      val pi: Int                  = 69
      val pi2: PositiveInt         = pi
      val c: String                = ".asd."
      val c2: Code                 = c
    }
    "PositiveInt is inclusive of 1" in {
      val positiveInt: PositiveInt = 1
    }
    "PositiveInt is exclusive of 0" in {
      val positiveInt = Try(0: PositiveInt)
      positiveInt.isFailure shouldEqual true
      positiveInt.failed.get.getMessage shouldEqual "assertion failed: `PositiveInt`s must be >= 1"
    }
    "UnsignedInt is inclusive of 0" in {
      val unsignedInt: UnsignedInt = 0
    }
  }
  "int subtypes" - {
    "performs validation for PositiveInt" in {
      val x = Try(-1: PositiveInt)
      x.isFailure shouldEqual true
      x.failed.get.getMessage shouldEqual "assertion failed: `PositiveInt`s must be >= 1"
    }
    "performs validation for UnsignedInt" in {
      val x = Try(-1: UnsignedInt)
      x.isFailure shouldEqual true
      x.failed.get.getMessage shouldEqual "assertion failed: `UnsignedInt`s must be >= 0"
    }

  }

}
