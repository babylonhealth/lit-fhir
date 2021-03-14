package com.babylonhealth.lit

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class Foo(val x: String) {
  def myX      = "123"
  def bar: Foo = new Foo(x + x)
}
class Foo2(override val x: String) extends Foo(x) {
  override def myX       = "321"
  def superX             = super.myX
  override def bar: Foo2 = new Foo2(x)
}
class Foo3(y: String) extends Foo2(y) {
  override def bar: Foo3 = new Foo3(y + "!")
}

class FunctionTest extends AnyFreeSpec with Matchers {
  trait TypeClass[+T]
  trait NoTypeClass[+T] extends TypeClass[T]
  object TypeClassWitnesses {
    implicit object StringWitness extends TypeClass[String]
    implicit object IntWitness    extends TypeClass[Int]
    object NoWitness              extends NoTypeClass[Nothing]
    implicit def toWitness[T]: TypeClass[T] = NoWitness
  }
  import TypeClassWitnesses._
  "branch on implicit availability" in {
    def hasWitness[T: TypeClass](t: T): Boolean = implicitly[TypeClass[T]] match {
      case NoWitness => false
      case _         => true
    }
    hasWitness("a") shouldEqual true
    hasWitness(0) shouldEqual true
    hasWitness(0.4) shouldEqual false
  }

  "class things" in {
    val x  = "X.."
    val f1 = new Foo(x)
    val f2 = new Foo2(x)
    val f3 = new Foo3(x)
    f1.bar.x shouldEqual (x + x)
    f2.bar.x shouldEqual x
    f3.bar.x shouldEqual s"$x!"
    f1.myX shouldEqual "123"
    f2.myX shouldEqual "321"
    f3.myX shouldEqual "321"
    f2.superX shouldEqual "123"
  }
}
