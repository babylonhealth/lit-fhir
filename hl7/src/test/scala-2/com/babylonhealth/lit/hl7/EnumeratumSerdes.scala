package com.babylonhealth.lit.hl7

import com.babylonhealth.lit.core.EXPRESSION_LANGUAGE
import com.babylonhealth.lit.core.model.Expression
import com.babylonhealth.lit.core.serdes._
import io.circe.parser.decode
import io.circe.syntax._
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class EnumeratumSerdes extends AnyFreeSpec with Matchers {
  "foo" in {
    val x = new Expression(language = EXPRESSION_LANGUAGE.CQL, name = Some("WTF"))
    val s = x.asJson.spaces2SortKeys
    s shouldEqual
    """{
      |  "language" : "text/cql",
      |  "name" : "WTF"
      |}""".stripMargin
    val y = decode[Expression](s)
    y.right.get shouldEqual x
  }
  "bar" in {
    val x = new Expression(language = EXPRESSION_LANGUAGE.Other_("WATTTT"), name = Some("WTF"))
    val s = x.asJson.spaces2SortKeys
    s shouldEqual
    """{
      |  "language" : "WATTTT",
      |  "name" : "WTF"
      |}""".stripMargin
    val y = decode[Expression](s)
    y.right.get shouldEqual x
  }

}
