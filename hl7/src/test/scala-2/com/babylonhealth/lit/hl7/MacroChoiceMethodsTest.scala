package com.babylonhealth.lit.hl7

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

import com.babylonhealth.lit.core.ChoiceImplicits._
import com.babylonhealth.lit.core.{ Choice, LitSeq, UriStr, \/ }

class MacroChoiceMethodsTest extends AnyFreeSpec with Matchers {

  "choice" - {
    "works on subtypes" in {
      case class F(f: Choice[UriStr \/ String])
      val f_1: F = F(choice("Uri": UriStr))
      val f_2: F = F(choice("String"))
      f_1.f.suffix shouldEqual "Uri"
      f_2.f.suffix shouldEqual "String"
    }

    "works on subtypes with map" in {
      case class F(f: Choice[UriStr \/ String])
      val f_1: Option[F] = Some("Uri": UriStr).map(u => F(choice(u)))
      val f_2: Option[F] = Some("String").map(u => F(choice(u)))
      f_1.get.f.suffix shouldEqual "Uri"
      f_2.get.f.suffix shouldEqual "String"
    }

    "works on subtypes with map x2" in {
      val f_1: LitSeq[Choice[UriStr \/ String]] = LitSeq("Uri": UriStr).map(u => choice(u))
      val f_2: LitSeq[Choice[UriStr \/ String]] = LitSeq("String").map(u => choice(u))
      f_1.head.suffix shouldEqual "Uri"
      f_2.head.suffix shouldEqual "String"
    }

    "works on subtypes with map x3" in {
      val f_1: LitSeq[Choice[UriStr \/ String]] = LitSeq("Uri": UriStr).map(choice(_))
      val f_2: LitSeq[Choice[UriStr \/ String]] = LitSeq("String").map(choice(_))
      f_1.head.suffix shouldEqual "Uri"
      f_2.head.suffix shouldEqual "String"
    }
  }

  "choose" - {
    "works on subtypes" in {
      case class F(f: Choice[UriStr \/ String])
      val f_1: F = F(choose("Uri": UriStr))
      val f_2: F = F(choose("String"))
      f_1.f.suffix shouldEqual "Uri"
      f_2.f.suffix shouldEqual "String"
    }

    "works on subtypes with map" in {
      case class F(f: Choice[UriStr \/ String])
      val f_1: Option[F] = Some("Uri": UriStr).map(u => F(choose(u)))
      val f_2: Option[F] = Some("String").map(u => F(choose(u)))
      f_1.get.f.suffix shouldEqual "Uri"
      f_2.get.f.suffix shouldEqual "String"
    }

    "works on subtypes with map x2" in {
      val f_1: LitSeq[Choice[UriStr \/ String]] = LitSeq("Uri": UriStr).map(u => choose(u))
      val f_2: LitSeq[Choice[UriStr \/ String]] = LitSeq("String").map(u => choose(u))
      f_1.head.suffix shouldEqual "Uri"
      f_2.head.suffix shouldEqual "String"
    }

    "works on subtypes with map x3" in {
      val f_1: LitSeq[Choice[UriStr \/ String]] = LitSeq("Uri": UriStr).map(choose(_))
      val f_2: LitSeq[Choice[UriStr \/ String]] = LitSeq("String").map(choose(_))
      f_1.head.suffix shouldEqual "Uri"
      f_2.head.suffix shouldEqual "String"
    }
  }

  "choiceLTag" - {
    "works on subtypes" in {
      case class F(f: Choice[UriStr \/ String])
      val f_1: F = F(choiceLTag("Uri": UriStr))
      val f_2: F = F(choiceLTag("String"))
      f_1.f.suffix shouldEqual "Uri"
      f_2.f.suffix shouldEqual "String"
    }

    "works on subtypes with map" in {
      case class F(f: Choice[UriStr \/ String])
      val f_1: Option[F] = Some("Uri": UriStr).map(u => F(choiceLTag(u)))
      val f_2: Option[F] = Some("String").map(u => F(choiceLTag(u)))
      f_1.get.f.suffix shouldEqual "Uri"
      f_2.get.f.suffix shouldEqual "String"
    }

    "works on subtypes with map x2" in {
      val f_1: LitSeq[Choice[UriStr \/ String]] = LitSeq("Uri": UriStr).map(u => choiceLTag(u))
      val f_2: LitSeq[Choice[UriStr \/ String]] = LitSeq("String").map(u => choiceLTag(u))
      f_1.head.suffix shouldEqual "Uri"
      f_2.head.suffix shouldEqual "String"
    }

    "works on subtypes with map x3" in {
      val f_1: LitSeq[Choice[UriStr \/ String]] = LitSeq("Uri": UriStr).map(choiceLTag(_))
      val f_2: LitSeq[Choice[UriStr \/ String]] = LitSeq("String").map(choiceLTag(_))
      f_1.head.suffix shouldEqual "Uri"
      f_2.head.suffix shouldEqual "String"
    }
  }

}
