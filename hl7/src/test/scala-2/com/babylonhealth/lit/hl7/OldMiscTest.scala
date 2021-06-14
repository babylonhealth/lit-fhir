package com.babylonhealth.lit.hl7

import com.babylonhealth.lit.core.\/
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class OldMiscTest extends AnyFreeSpec with Matchers {

  "println x2" in {
    import scala.reflect.runtime.universe.typeOf
    println("-->>>", typeOf[\/[_, _]].erasure)
    val x = typeOf[String \/ Int \/ Double]
    println("-->>>", x, x.erasure, x.erasure =:= typeOf[\/[_, _]].erasure)
    type Y = (String \/ Int \/ Double)
    val y = typeOf[Y#Left]
    println("-->>>", y, y.erasure, y.erasure =:= typeOf[\/[_, _]].erasure)
  }

}
