package com.babylonhealth.lit.core

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

import com.babylonhealth.lit.core.ChoiceImplicits._
import com.babylonhealth.lit.core.{ Code, toCode }
import com.babylonhealth.lit.core.model.Extension

class ChoiceTest extends AnyFreeSpec with Matchers {
  "can extract the value from a choice if it matches" in {
    val code: Extension.ValueChoice = choice("code": Code)
    val extractedCode = code.as[Code]
    extractedCode shouldEqual Some("code": Code)
    val string: Extension.ValueChoice = choice("string")
    val extractedString = string.as[String]
    extractedString shouldEqual Some("string")
  }
  "doesn't extract the value from a choice if doesn't match" in {
    val code: Extension.ValueChoice = choice("code": Code)
    val unextractedCode = code.as[String]
    unextractedCode shouldEqual None
    val string: Extension.ValueChoice = choice("string")
    val unextractedString = string.as[Code]
    unextractedString shouldEqual None
  }
}
