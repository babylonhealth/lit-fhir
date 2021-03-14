package com.babylonhealth.lit.hl7

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

import com.babylonhealth.lit.core.model.{
  Age,
  Coding,
  Count,
  Distance,
  Duration,
  Expression,
  Quantity,
  Reference,
  Resource
}
import com.babylonhealth.lit.hl7.model.{ MoneyQuantity, SimpleQuantity }

class Tst extends AnyFreeSpec with Matchers {
  "instantiate" in {
    val x = Seq(
      Age,
      Coding,
      Count,
      Distance,
      Duration,
      Expression,
      Quantity,
      Reference,
      Resource,
      MoneyQuantity,
      SimpleQuantity)
    // this test is only here to ensure that the companion objects can actually be instantiated, since that was a regression at one point...
    // consequently we don't really test anything of note
    x.size shouldEqual 11
  }
}
