package com.babylonhealth.lit.uscore

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class TestTest extends AnyFreeSpec with Matchers {
  "foo" in {
    com.babylonhealth.lit.uscore.Module.lookup.values
      .filter(c => c.parentType ne c.baseType)
      .foreach(c => println(s"uscore: ${c}"))
    println("***")
    com.babylonhealth.lit.usbase.Module.lookup.values
      .filter(c => c.parentType ne c.baseType)
      .foreach(c => println(s"usbase: ${c}"))
  }
}
