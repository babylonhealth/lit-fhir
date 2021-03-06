//package com.babylonhealth.lit.core
//
//import java.time.ZonedDateTime
//import java.util.Date
//
//import scala.collection.mutable
//import scala.reflect.runtime.universe.typeTag
//import scala.util.Try
//
//import io.circe.HCursor
//
////import io.circe.generic.auto._
//import io.circe.Json
//import io.circe.parser.{decode, parse}
//import io.circe.syntax._
//import org.scalatest.{AnyFreeSpec, Matchers}
//import org.skyscreamer.jsonassert.JSONAssert
//import shapeless.test.illTyped
//
//import com.babylonhealth.lit.core.model._
//import com.babylonhealth.lit.core.ChoiceImplicits._
//
//case class TestUnionWrapper1(field: Choice[String \/ Boolean]) extends FHIRObject {
//  def companion             = TestUnionWrapper1.asInstanceOf[CompanionFor[this.type]]
//  def thisClassName: String = "TestUnionWrapper1"
//  def thisTypeName: String  = "TestUnionWrapper1"
//}
//
//case class TestUnionWrapper2(field: Choice[String \/ Boolean \/ Int]) extends FHIRObject {
//  def companion             = TestUnionWrapper2.asInstanceOf[CompanionFor[this.type]]
//  def thisClassName: String = "TestUnionWrapper2"
//  def thisTypeName: String  = "TestUnionWrapper2"
//}
//
//case class TestUnionWrapper3(field: Choice[String \/ Boolean \/ Int], fieldCode: Code) extends FHIRObject {
//  def companion             = TestUnionWrapper3.asInstanceOf[CompanionFor[this.type]]
//  def thisClassName: String = "TestUnionWrapper3"
//  def thisTypeName: String  = "TestUnionWrapper3"
//}
//
//object TestUnionWrapper1 extends CompanionFor[TestUnionWrapper1] {
//  val baseType         = TestUnionWrapper1
//  val thisName: String = "TestUnionWrapper1"
//  val field: FHIRComponentFieldMeta[Choice[String \/ Boolean]] =
//    FHIRComponentFieldMeta("field", lTagOf[Choice[String \/ Boolean]], true, lTagOf[Choice[String \/ Boolean]])
//  val fieldsMeta = Seq(field)
//  override def fields(t: TestUnionWrapper1): Seq[FHIRComponentField[_]] =
//    Seq(FHIRComponentField(field, t.field))
//  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[TestUnionWrapper1] = Try(
//    TestUnionWrapper1(cursor.decodeRef("field"))
//  )
//}
//
//object TestUnionWrapper2 extends CompanionFor[TestUnionWrapper2] {
//  val baseType         = TestUnionWrapper2
//  val thisName: String = "TestUnionWrapper2"
//  val field: FHIRComponentFieldMeta[Choice[String \/ Boolean \/ Int]] =
//    FHIRComponentFieldMeta(
//      "field",
//      lTagOf[Choice[String \/ Boolean \/ Int]],
//      true,
//      lTagOf[Choice[String \/ Boolean \/ Int]])
//  val fieldsMeta = Seq(field)
//  override def fields(t: TestUnionWrapper2): Seq[FHIRComponentField[_]] =
//    Seq(FHIRComponentField(field, t.field))
//  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[TestUnionWrapper2] = Try(
//    TestUnionWrapper2(cursor.decodeRef("field"))
//  )
//}
//
//object TestUnionWrapper3 extends CompanionFor[TestUnionWrapper3] {
//  val baseType         = TestUnionWrapper3
//  val thisName: String = "TestUnionWrapper3"
//  val field: FHIRComponentFieldMeta[Choice[String \/ Boolean \/ Int]] =
//    FHIRComponentFieldMeta(
//      "field",
//      lTagOf[Choice[String \/ Boolean \/ Int]],
//      true,
//      lTagOf[Choice[String \/ Boolean \/ Int]])
//  val fieldCode: FHIRComponentFieldMeta[Code] = FHIRComponentFieldMeta("fieldCode", lTagOf[Code], false, lTagOf[Code])
//  val fieldsMeta                              = Seq(field, fieldCode)
//  override def fields(t: TestUnionWrapper3): Seq[FHIRComponentField[_]] =
//    Seq(
//      FHIRComponentField(field, t.field),
//      FHIRComponentField(fieldCode, t.fieldCode)
//    )
//  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[TestUnionWrapper3] = Try(
//    TestUnionWrapper3(
//      cursor.decodeRef("field"),
//      cursor.decodeAs[Code]("fieldCode", None)
//    )
//  )
//}
//
//class TestFooTest extends AnyFreeSpec with Matchers with BaseFieldDecoders {
//  implicit def _fromSeq[T](seq: Seq[T]): LitSeq[T] = new LitSeq[T](seq)
//  val expectedAccountJson =
//    """{"id":"a", "resourceType": "Account", "name":"ok", "status":"entered-in-error"}"""
////  implicit val accEncoder
//
//  "union methods" - {
//    "can make a binary union" in {
//      val x: String \/ Boolean = \/ build "lol"
//      x should matchPattern { case LHS("lol") => }
//      val y: String \/ Boolean = \/ build false
//      y should matchPattern { case RHS(false) => }
//    }
//    "can make a trinary union" in {
//      val x: String \/ Boolean \/ Int = \/ build "lol"
//      x should matchPattern { case LHS(LHS("lol")) => }
//      val y: String \/ Boolean \/ Int = \/ build false
//      y should matchPattern { case LHS(RHS(false)) => }
//      val z: String \/ Boolean \/ Int = \/ build 123
//      z should matchPattern { case RHS(123) => }
//    }
//    "can make a binary union (in Ref)" in {
////      def x                         = Ref.apply _
//      val x: Choice[String \/ Boolean] = choice("lol")
//      x.toUnion should matchPattern { case LHS("lol") => }
//      val y: Choice[String \/ Boolean] = choice(false)
//      y.toUnion should matchPattern { case RHS(false) => }
//    }
//    "can make a trinary union (in Ref)" in {
//      val x: Choice[String \/ Boolean \/ Int] = choice("lol")
//      x.toUnion should matchPattern { case LHS(LHS("lol")) => }
//      val y: Choice[String \/ Boolean \/ Int] = choice(false)
//      y.toUnion should matchPattern { case LHS(RHS(false)) => }
//      val z: Choice[String \/ Boolean \/ Int] = choice(123)
//      z.toUnion should matchPattern { case RHS(123) => }
//    }
//    "can make type inference for a binary union field" in {
//      val x = TestUnionWrapper1(choice("lol"))
//      x should matchPattern { case TestUnionWrapper1(Choice("String", "lol")) => }
//      val y = TestUnionWrapper1(choice(false))
//      y should matchPattern {
//        case TestUnionWrapper1(Choice("Boolean", false)) =>
//      }
//    }
//    "can make type inference for a trinary union field" in {
//      val x = TestUnionWrapper2(choice("lol"))
//      x should matchPattern { case TestUnionWrapper2(Choice("String", "lol")) => }
//      val y = TestUnionWrapper2(choice(false))
//      y should matchPattern {
//        case TestUnionWrapper2(Choice("Boolean", false)) =>
//      }
//      val z = TestUnionWrapper2(choice(123))
//      z should matchPattern {
//        case TestUnionWrapper2(Choice("Integer", 123)) =>
//      }
//    }
//    "Ref.fromVal throws if type is unascribable" in {
//      val x = Try(TestUnionWrapper2(Choice fromVal 0.3))
//      x.isFailure shouldEqual true
//      val throwable = x.failed.get
//      throwable.isInstanceOf[RuntimeException] shouldEqual true
//      throwable.getMessage shouldEqual "Cannot ascribe type TypeTag[String \\/ Boolean \\/ Int] to type TypeTag[Double]"
//    }
//    "choice won't even compile if type is unascribable" in {
//      illTyped(
//        "TestUnionWrapper2(choice(0.3))",
//        "Cannot prove that Double is a viable type for union String \\\\/ Boolean \\\\/ Int")
//    }
//  }
//
//  "serde" - {
//    val x: Account = Account(
//      id = Some("a"),
//      name = Some("ok"),
//      status = ACCOUNT_STATUS.ENTERED_IN_ERROR
//    )
//    "json serialization" in {
//      val jstr = x.asJson.noSpaces
//      JSONAssert.assertEquals(expectedAccountJson, jstr, true)
//    }
//    "union field [de]serialization" - {
//      "serialization (1)" in {
//        val str         = TestUnionWrapper1(choice("entered-in-error"))
//        val strJson     = str.asJson.noSpaces
//        val expectedStr = """{"fieldString":"entered-in-error"}"""
//        JSONAssert.assertEquals(expectedStr, strJson, true)
//      }
//      "serialization (2)" in {
//        val bool        = TestUnionWrapper1(choice(false))
//        val boolJson    = bool.asJson.noSpaces
//        val expectedStr = """{"fieldBoolean":false}"""
//        JSONAssert.assertEquals(expectedStr, boolJson, true)
//      }
//      "deserialization (1)" in {
//        val str     = TestUnionWrapper1(choice("lol"))
//        val strJson = str.asJson.noSpaces
//        val deser   = decode[TestUnionWrapper1](strJson)
//        deser.isRight shouldEqual true
//        println("`" + deser.right.get.field.value + "`", deser.right.get.field.value.getClass)
//        println("`" + str.field.value + "`", str.field.value.getClass)
//        deser.right.get shouldEqual str
//      }
//      "deserialization (2)" in {
//        val bool     = TestUnionWrapper1(choice(false))
//        val boolJson = bool.asJson.noSpaces
//        val deser    = decode[TestUnionWrapper1](boolJson)
//        deser.isRight shouldEqual true
//        deser.right.get shouldEqual bool
//      }
//    }
//    "json deserialization, and equality" in {
//      val s = mutable.Set[Account]()
//      s.add(x)
//      s.size shouldEqual 1
//      s.add(x)
//      s.size shouldEqual 1
//      val jstr = x.asJson.noSpaces
//      JSONAssert.assertEquals(jstr, expectedAccountJson, true)
//      val deser = parse(jstr).flatMap(_.as[Account])
//      deser.left.foreach(e => println("ballz A)", e))
//      deser.isRight shouldEqual true
//      deser.right.get shouldEqual x
//      s.add(deser.right.get)
//      s.size shouldEqual 1
//      val reser = deser.right.get.asJson.noSpaces
//      JSONAssert.assertEquals(jstr, reser, true)
//    }
//    "json deserialization, and equality x2" in {
//      val s = mutable.Set[FHIRObject]()
//      s.add(x)
//      s.size shouldEqual 1
//      s.add(x)
//      s.size shouldEqual 1
//      val jstr = x.asJson.noSpaces
//      JSONAssert.assertEquals(jstr, expectedAccountJson, true)
//      val deser = parse(jstr).flatMap(_.as[Account])
//      deser.left.foreach(e => println("ballz B)", e))
//      deser.isRight shouldEqual true
//      deser.right.get shouldEqual x
//      s.add(deser.right.get)
//      s.size shouldEqual 1
//      val reser = deser.right.get.asJson.noSpaces
//      JSONAssert.assertEquals(jstr, reser, true)
//    }
//  }
//
//  "serde for the \\/ union types" - {
//    val time = FHIRDateTime(ZonedDateTime.now())
//    val tStr = time.fmt
//
//    "Annotation with authorString field" in {
//      val y1 = Annotation(
//        Some("hi, I'm an ID"),
//        Some(time),
//        "asd".asInstanceOf[Markdown],
//        LitSeq.empty,
//        Some(choice("author!")))
//      val jstr = y1.asJson.noSpaces
//      println(jstr)
//      val expected =
//        s"""{"id":"hi, I'm an ID", "time":"$tStr", "text": "asd", "authorString":"author!"}"""
//      println(expected)
//      JSONAssert.assertEquals(expected, jstr, false)
//    }
//
//    "Annotation with authorReference field" in {
//      val y2 =
//        Annotation(
//          Some("hi, I'm an ID"),
//          Some(time),
//          "asd".asInstanceOf[Markdown],
//          LitSeq.empty,
//          Some(choice(new Reference())))
//      val jstr = y2.asJson.noSpaces
//      println(jstr)
//      val expected =
//        s"""{"id":"hi, I'm an ID", "time":"$tStr", "text": "asd", "authorReference":{}}}"""
//      println(expected)
//      JSONAssert.assertEquals(expected, jstr, false)
//    }
//  }
//
//  "equality test" in {
//    val x1 = Duration(Some("1"), None, None, None, None, LitSeq.empty, None)
//    val x2 = Quantity(Some("1"), None, None, None, None, LitSeq.empty, None)
//    val x3 = Quantity(Some("1"), None, None, None, None, LitSeq.empty, None)
//    x1 == x1 shouldEqual true
//    x2 == x2 shouldEqual true
//    x3 == x3 shouldEqual true
//    x1.equals(x2) shouldEqual false
//    x2.equals(x1) shouldEqual false
//    x2.equals(x3) shouldEqual true
//    x1 == x2 shouldEqual false
//    x2 == x1 shouldEqual false
//    x2 == x3 shouldEqual true
//  }
//
//  "println" in {
//    val x = com.babylonhealth.lit.generated.autogen.localClasses.take(5)
//    println(x.mkString("[", ";;", "]"))
//  }
//  "println x2" in {
//    import scala.reflect.runtime.universe.typeOf
//    println("-->>>", typeOf[\/[_, _]].erasure)
//    val x = typeOf[String \/ Int \/ Double]
//    println("-->>>", x, x.erasure, x.erasure =:= typeOf[\/[_, _]].erasure)
//    type Y = (String \/ Int \/ Double)
//    val y = typeOf[Y#Left]
//    println("-->>>", y, y.erasure, y.erasure =:= typeOf[\/[_, _]].erasure)
//  }
//
////    type SubOfString <: String
//  // x2
//  type StrBool = String \/ Boolean
//  type StrInt  = String \/ Int
//  type IntBool = Int \/ Boolean
//  // x3
//  type StrBoolInt = String \/ Boolean \/ Int
//  type StrIntBool = String \/ Int \/ Boolean
//  type BoolIntStr = Boolean \/ Int \/ String
//  "Further union tests" - {
//    "union subsets (1x3)" in {
//      \/.canBe(lTagOf[String \/ Boolean \/ Int], lTagOf[String]) shouldEqual true
//      \/.canBe(lTagOf[StrBoolInt], lTagOf[String]) shouldEqual true
//      \/.canBe(lTagOf[StrBoolInt], lTagOf[Boolean]) shouldEqual true
//      \/.canBe(lTagOf[StrBoolInt], lTagOf[Int]) shouldEqual true
//      \/.canBe(lTagOf[StrBoolInt], lTagOf[Double]) shouldEqual false
//      \/.canBe(lTagOf[StrBoolInt], lTagOf[Date]) shouldEqual false
//      \/.canBe[String \/ Boolean \/ Int, String] shouldEqual true
//      \/.canBe[StrBoolInt, String] shouldEqual true
//      \/.canBe[StrBoolInt, Boolean] shouldEqual true
//      \/.canBe[StrBoolInt, Int] shouldEqual true
//      \/.canBe[StrBoolInt, Double] shouldEqual false
//      \/.canBe[StrBoolInt, Date] shouldEqual false
//      //      \/.lTypeSubsumesRIndividual(lTagOf[StrBoolInt], lTagOf[SubOfString]) shouldEqual false
//    }
//    "union subsets (2x3)" in {
//      \/.lTypeSubsumesR(lTagOf[StrBoolInt], lTagOf[StrBool]) shouldEqual true
//      \/.lTypeSubsumesR(lTagOf[StrBoolInt], lTagOf[StrInt]) shouldEqual true
//      \/.lTypeSubsumesR(lTagOf[StrBoolInt], lTagOf[IntBool]) shouldEqual true
//      \/.lTypeSubsumesR(lTagOf[StrBool], lTagOf[StrBoolInt]) shouldEqual false
//      \/.lTypeSubsumesR(lTagOf[StrInt], lTagOf[StrBoolInt]) shouldEqual false
//      \/.lTypeSubsumesR(lTagOf[IntBool], lTagOf[StrBoolInt]) shouldEqual false
//    }
//    "union subsets (3x3)" in {
//      \/.lTypeSubsumesR(lTagOf[StrBoolInt], lTagOf[StrIntBool]) shouldEqual true
//      \/.lTypeSubsumesR(lTagOf[StrBoolInt], lTagOf[StrIntBool]) shouldEqual true
//      \/.lTypeSubsumesR(lTagOf[BoolIntStr], lTagOf[StrIntBool]) shouldEqual true
//      \/.lTypeSubsumesR(lTagOf[StrBoolInt], lTagOf[StrBoolInt]) shouldEqual true
//      \/.lTypeSubsumesR(lTagOf[StrBoolInt], lTagOf[StrBoolInt]) shouldEqual true
//      \/.lTypeSubsumesR(lTagOf[BoolIntStr], lTagOf[StrBoolInt]) shouldEqual true
//      \/.lTypeSubsumesR(lTagOf[StrBoolInt], lTagOf[BoolIntStr]) shouldEqual true
//      \/.lTypeSubsumesR(lTagOf[StrBoolInt], lTagOf[BoolIntStr]) shouldEqual true
//      \/.lTypeSubsumesR(lTagOf[BoolIntStr], lTagOf[BoolIntStr]) shouldEqual true
//    }
//  }
//
//  "Choice[\"ProductShelfLife\"] serde" in {
//    val choice = Choice["ProductShelfLife"]("", Json.fromString("asd"))
//    val x      = DeviceDefinition(shelfLifeStorage = Seq(choice))
////    val ser = x.asJson.noSpaces
////    val expectedJson =
////      """{"resourceType":"DeviceDefinition","shelfLifeStorage":["asd"]}"""
////    JSONAssert.assertEquals(expectedJson, ser, true)
////    val deser = parse(ser).flatMap(_.as[DeviceDefinition])
////    deser.isRight shouldEqual true
////    deser.right.get shouldEqual x
////    val reser = deser.right.get.asJson.noSpaces
////    JSONAssert.assertEquals(ser, reser, true)
//  }
//
//  "Nested aliases compile" in {
//    type Foo = Bundle.Entry.Request
//    val z    = Bundle.Entry.Request(url = "http://example.com", method = HTTP_VERB.GET)
//    val zd   = Bundle.Entry.Request.decoder(DecoderParams())
//    val jstr = z.asJson.noSpaces
//    val e    = zd.decodeJson(parse(jstr).toTry.get).toTry.get
//    e shouldEqual z
//  }
//
//  "can handle suffixes not being unique" in {
//    val foo      = TestUnionWrapper3(choice(420), "lol")
//    val fooStr   = foo.asJson.noSpaces
//    val expected = """{"fieldCode":"lol","fieldInteger":420}"""
//    JSONAssert.assertEquals(expected, fooStr, true)
//    println(fooStr)
//    val foo2 = decode[TestUnionWrapper3](fooStr)
//    foo2.isRight shouldEqual true
//    foo2.right.get shouldEqual foo
//  }
//  "Throws if conflicts are found for suffixes" in {
//    val bad  = """{"fieldCode":"lol","fieldString":"lol","fieldInteger":420}"""
//    val foo2 = decode[TestUnionWrapper3](bad)
//    foo2.isLeft shouldEqual true
//    foo2.left.get.getMessage should matchPattern {
//      case x: String
//          if x.startsWith(
//            "More than one field matching field[x] was found. Fields were: [fieldString, fieldInteger]") =>
//      case x: String
//          if x.startsWith(
//            "More than one field matching field[x] was found. Fields were: [fieldInteger, fieldString]") =>
//    }
//  }
//}
