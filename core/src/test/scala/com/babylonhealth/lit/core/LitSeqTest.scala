package com.babylonhealth.lit.core

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.prop.TableDrivenPropertyChecks

import scala.jdk.javaapi.CollectionConverters.asJava

class LitSeqTest extends AnyFreeSpec with Matchers with TableDrivenPropertyChecks {
  type JList[T] = java.util.List[T]

  "LitSeq for scala" - {
    "can build " in {
      val x: LitSeq[Int] = LitSeq(1, 2, 3)
      println(x)
      val y = x.map(_ * 3)
      println(y)
      y shouldEqual LitSeq(3, 6, 9)
      y should not equal LitSeq(3, 6)
      y should not equal LitSeq(3, 6, 10)
      y should not equal LitSeq(3, 6, 9, 10)
      y.isInstanceOf[LitSeq[_]] shouldEqual true
      println(y.toArray: Array[AnyRef])
      println(x.toSeq)
      println(LitSeq.empty)
      println(Some(1).to(LitSeq))
      println(Seq(1, 2, 3).to(LitSeq))
      LitSeq(LitSeq(9)).flatten
    }
    "bounded" in {
      val ne: NonEmptyLitSeq[Int]   = LitSeq(1)
      val ne2: NonEmptyLitSeq[Int]  = LitSeq(2)
      val _ne3: NonEmptyLitSeq[Int] = LitSeq(2, 3, 4)
      val e                         = LitSeq()
      e.isInstanceOf[NonEmptyLitSeq[_]] shouldEqual false
      ne.map(_ * 4).isInstanceOf[NonEmptyLitSeq[_]] shouldEqual true
      ne.zip(ne2).isInstanceOf[NonEmptyLitSeq[_]] shouldEqual true
    }
  }

  "SeqWithCardinality for java" - {
    def x(xs: Int*) = xs foreach println
    val p           = LitSeq(1, 2, 3)
    x(p.toSeq: _*)
  }

  "cardinality enforcement" in {
    val seq: LitSeq[Int]                 = LitSeq()
    val seq1: NonEmptyLitSeq[Int]        = 1 +: seq
    val seq2: NonEmptyLitSeq[Int]        = seq :+ 2
    val seq3: NonEmptyLitSeq[Int]        = seq ++ seq1
    val seq4: NonEmptyLitSeq[Int]        = seq1 ++ seq
    val seq5: NonEmptyLitSeq[(Int, Int)] = seq1 zip seq2
    val seq6: NonEmptyLitSeq[Int]        = seq1 map (_ * 2)
    val maybeEmpty: LitSeq[Int]          = seq1
    assertTypeError("""val seqN1: NonEmptyLitSeq[Int] = seq ++ maybeEmpty""")
  }

  "LitSeq equality" - {
    val seqs: Seq[Seq[Int]] = Seq(
      Seq(),
      Seq(1),
      Seq(1, 2, 3),
      Seq(3, 2, 1)
    )

    val litSeqs: Seq[LitSeq[Int]] = seqs.map(LitSeq.from(_))
    val jlists: Seq[JList[Int]] = seqs.map(asJava(_))

    val table = Table(
      ("litSeq", "otherSeq"),
      (for {litSeq <- litSeqs; otherSeq <- seqs ++ litSeqs ++ jlists} yield (litSeq, otherSeq)): _*
    )

    "is symmetric" in {
      forAll(table) { (litSeq, otherSeq) =>
        (litSeq == otherSeq) shouldEqual (otherSeq == litSeq)
      }
    }

    "matches hashcode" in {
      forAll(table) { (litSeq, otherSeq) =>
        // Technically this can cause a false negative, but...
        (litSeq == otherSeq) shouldEqual (litSeq.hashCode == otherSeq.hashCode)
      }
    }
  }
}
