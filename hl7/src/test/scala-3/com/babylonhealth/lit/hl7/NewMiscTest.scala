package com.babylonhealth.lit.hl7

import scala.util.Try

import com.babylonhealth.lit.core.{ Choice, LHS, RHS, \/ }
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

import com.babylonhealth.lit.core._
import com.babylonhealth.lit.core.ChoiceImplicits._

class OldMiscTest extends AnyFreeSpec with Matchers {

  "union methods" - {
    "can make a binary union" in {
      val x: String | Boolean = "lol"
      x should matchPattern { case "lol": String => }
      val y: String | Boolean = false
      y should matchPattern { case false: Boolean => }
    }
    "can make a trinary union" in {
      val x: String | Boolean | Int = "lol"
      x should matchPattern { case LHS(LHS("lol")) => }
      val y: String | Boolean | Int = false
      y should matchPattern { case false : Boolean => }
      val z: String | Boolean | Int =  123
      z should matchPattern { case 123: Int => }
    }
    "can make a binary union (in Ref)" in {
      //      def x                         = Ref.apply _
      val x: Choice[String | Boolean] = choice("lol")
      x.toUnion should matchPattern { case LHS("lol") => }
      val y: Choice[String | Boolean] = choice(false)
      y.toUnion should matchPattern { case RHS(false) => }
    }
    "can make a trinary union (in Ref)" in {
      val x: Choice[String \/ Boolean \/ Int] = choice("lol")
      x.toUnion should matchPattern { case LHS(LHS("lol")) => }
      val y: Choice[String \/ Boolean \/ Int] = choice(false)
      y.toUnion should matchPattern { case LHS(RHS(false)) => }
      val z: Choice[String \/ Boolean \/ Int] = choice(123)
      z.toUnion should matchPattern { case RHS(123) => }
    }
    "can make type inference for a binary union field" in {
      val x = TestUnionWrapper1(choice("lol"))
      x should matchPattern { case TestUnionWrapper1(Choice("String", "lol")) => }
      val y = TestUnionWrapper1(choice(false))
      y should matchPattern { case TestUnionWrapper1(Choice("Boolean", false)) =>
      }
    }
    "can make type inference for a trinary union field" in {
      val x = TestUnionWrapper2(choice("lol"))
      x should matchPattern { case TestUnionWrapper2(Choice("String", "lol")) => }
      val y = TestUnionWrapper2(choice(false))
      y should matchPattern { case TestUnionWrapper2(Choice("Boolean", false)) =>
      }
      val z = TestUnionWrapper2(choice(123))
      z should matchPattern { case TestUnionWrapper2(Choice("Integer", 123)) =>
      }
    }
    "Ref.fromVal throws if type is unascribable" in {
      val x = Try(TestUnionWrapper2(Choice fromVal 0.3))
      x.isFailure shouldEqual true
      val throwable = x.failed.get
      throwable.isInstanceOf[RuntimeException] shouldEqual true
      throwable.getMessage shouldEqual "Cannot ascribe type String \\/ Boolean \\/ Int to type LTag(Double)"
    }
    "choice won't even compile if type is unascribable" in {
      assertTypeError("TestUnionWrapper2(choice(0.3))")
    }
  }
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
