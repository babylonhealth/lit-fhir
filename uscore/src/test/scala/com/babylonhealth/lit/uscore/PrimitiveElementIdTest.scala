package com.babylonhealth.lit.uscore

import io.circe.syntax._
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

import com.babylonhealth.lit.core.ChoiceImplicits._
import com.babylonhealth.lit.core.FHIRObject.attrMap
import com.babylonhealth.lit.core.model.{ CodeableConcept, Element, Extension, Quantity, Reference }
import com.babylonhealth.lit.core.serdes._
import com.babylonhealth.lit.core.{ FHIRDateTime, LitSeq, PrimitiveElementInfo, UriStr }
import com.babylonhealth.lit.hl7.{ ACCOUNT_STATUS, OBSERVATION_STATUS }
import com.babylonhealth.lit.hl7.model.Account
import com.babylonhealth.lit.hl7.model.Observation.ReferenceRange
import com.babylonhealth.lit.usbase.model.Cholesterol

class PrimitiveElementIdTest extends AnyFreeSpec with Matchers {
  val foo = Account(
    status = ACCOUNT_STATUS.ACTIVE,
    implicitRules = Some("http://fooo.com/bar/baz"),
    primitiveAttributes = attrMap(
      Account.implicitRules -> PrimitiveElementInfo(
        Element(
          extension = LitSeq(Extension(url = "http://fooo.com/version", value = Some(choice("asd123": UriStr)))))),
      Account.status -> PrimitiveElementInfo(Element(id = Some("1234567890")))
    )
  )
  val accountAsJsonString: String =
    """{
      |  "_implicitRules" : {
      |    "extension" : [
      |      {
      |        "url" : "http://fooo.com/version",
      |        "valueUri" : "asd123"
      |      }
      |    ]
      |  },
      |  "_status" : {
      |    "id" : "1234567890"
      |  },
      |  "implicitRules" : "http://fooo.com/bar/baz",
      |  "resourceType" : "Account",
      |  "status" : "active"
      |}""".stripMargin
  "basic serde sanity" in {
    val x = foo.asJson
    x.spaces2SortKeys shouldEqual accountAsJsonString
  }
  "can read id" in {
    foo.primitiveAttributes(Account.status).element.id.get shouldEqual "1234567890"
    foo
      .primitiveAttributes(foo.companion.fieldsMeta.find(_.name == "status").get)
      .element
      .id
      .get shouldEqual "1234567890"
  }
  "can read id with sugar" in {
    foo.ids.get(Account.status).get shouldEqual "1234567890"
    foo.getIds(_.status).get shouldEqual "1234567890"
  }
  "can read extension" in {
    foo.primitiveAttributes(Account.implicitRules).element.extension shouldEqual
    LitSeq(Extension(url = "http://fooo.com/version", value = Some(choice("asd123": UriStr))))

    foo
      .primitiveAttributes(foo.companion.fieldsMeta.find(_.name == "implicitRules").get)
      .element
      .extension shouldEqual LitSeq(Extension(url = "http://fooo.com/version", value = Some(choice("asd123": UriStr))))
  }
  "can read extension with sugar" in {
    foo.extensions.get(Account.implicitRules) shouldEqual
    LitSeq(Extension(url = "http://fooo.com/version", value = Some(choice("asd123": UriStr))))
    foo.getExtensions(_.implicitRules) shouldEqual
    LitSeq(Extension(url = "http://fooo.com/version", value = Some(choice("asd123": UriStr))))
  }
  "can set id" in {
    val bar =
      foo.withPrimitiveAttributes(attrMap(Account.implicitRules -> PrimitiveElementInfo(Element(id = Some("new-id")))))
    bar.primitiveAttributes(Account.implicitRules).element.id.get shouldEqual "new-id"
  }
  "can set id with sugar" in {
    val bar: Account = foo.ids.set(Account.implicitRules)(Some("new-id"))
    bar.ids.get(Account.implicitRules).get shouldEqual "new-id"
    val bar2: Account = foo.setIds(_.implicitRules)(Some("new-id"))
    bar2.getIds(_.implicitRules).get shouldEqual "new-id"
  }
  "can set extension" in {
    val bar =
      foo.withPrimitiveAttributes(
        attrMap(
          Account.status -> PrimitiveElementInfo(Element(extension = LitSeq(
            Extension(url = "http://hi.ho", value = Some(choice(789.987: BigDecimal)))
          )))))

    bar.primitiveAttributes(Account.status).element.extension shouldEqual LitSeq(
      Extension(url = "http://hi.ho", value = Some(choice(789.987: BigDecimal))))
  }

  "can set extension with sugar" in {
    val value1: Extension.ValueChoice = choice(BigDecimal("789.987"))
    val bar: Account = foo.extensions.set(Account.status)(LitSeq(Extension(url = "http://hi.ho", value = Some(value1))))
    bar.extensions.get(Account.status) shouldEqual LitSeq(Extension(url = "http://hi.ho", value = Some(value1)))
    val bar2: Account = foo.setExtensions(_.status)(LitSeq(Extension(url = "http://hi.ho", value = Some(value1))))
    bar2.getExtensions(_.status) shouldEqual LitSeq(Extension(url = "http://hi.ho", value = Some(value1)))
  }

  "can update id" in {
    def updateId: Option[PrimitiveElementInfo] => Option[PrimitiveElementInfo] = {
      case Some(PrimitiveElementInfo(Element(None, extensions), phantom)) =>
        Some(PrimitiveElementInfo(Element(Some("new-id"), extensions), phantom))
      case Some(pei: PrimitiveElementInfo) => Some(pei.copy(element = pei.element.updateIdIfExists(_.reverse)))
      case None                            => Some(PrimitiveElementInfo(Element(id = Some("new-id"))))
    }

    val bar = foo.updatePrimitiveAttributes(
      _.updatedWith(Account.implicitRules)(updateId)
        .updatedWith(Account.status)(updateId))
    bar.primitiveAttributes(Account.status).element.id.get shouldEqual "0987654321"
    bar.primitiveAttributes(Account.implicitRules).element.id.get shouldEqual "new-id"
  }
  "can update id with sugar" in {
    def updateId: Option[String] => Option[String] = {
      case Some(id) => Some(id.reverse)
      case None     => Some("new-id")
    }

    val bar: Account = foo.ids.update(Account.implicitRules)(updateId).ids.update(Account.status)(updateId)
    bar.ids.get(Account.status).get shouldEqual "0987654321"
    bar.ids.get(Account.implicitRules).get shouldEqual "new-id"

    val bar2: Account = foo.updateIds(_.implicitRules)(updateId).updateIds(_.status)(updateId)
    bar2.getIds(_.status).get shouldEqual "0987654321"
    bar2.getIds(_.implicitRules).get shouldEqual "new-id"
  }
  "can update extension" in {
    def updateExtension: Option[PrimitiveElementInfo] => Option[PrimitiveElementInfo] = {
      case None =>
        Some(
          PrimitiveElementInfo(
            Element(
              extension = LitSeq(
                Extension(url = "http://hi.ho", value = Some(choice(123.4: BigDecimal)))
              ))))
      case Some(PrimitiveElementInfo(Element(id, LitSeq.emptyInstance), phantom)) =>
        Some(
          PrimitiveElementInfo(
            Element(
              id,
              LitSeq(
                Extension(url = "http://hi.ho", value = Some(choice(789.987: BigDecimal)))
              )),
            phantom))
      case x => x
    }
    val bar = foo.updatePrimitiveAttributes(
      _.updatedWith(Account.implicitRules)(updateExtension)
        .updatedWith(Account.status)(updateExtension))
    bar.primitiveAttributes(Account.status).element.extension shouldEqual LitSeq(
      Extension(url = "http://hi.ho", value = Some(choice(789.987: BigDecimal))))
    bar.primitiveAttributes(Account.implicitRules).element.extension shouldEqual LitSeq(
      Extension(url = "http://fooo.com/version", value = Some(choice("asd123": UriStr))))
  }
  "can update extension with sugar" in {
    def updateExtension: LitSeq[Extension] => LitSeq[Extension] = {
      case LitSeq.emptyInstance =>
        LitSeq(Extension(url = "http://hi.ho", value = Some(choice(789.987: BigDecimal))))
      case x => x
    }
    val bar: Account =
      foo.extensions.update(Account.implicitRules)(updateExtension).extensions.update(Account.status)(updateExtension)
    bar.extensions.get(Account.status) shouldEqual LitSeq(
      Extension(url = "http://hi.ho", value = Some(choice(789.987: BigDecimal))))
    bar.extensions.get(Account.implicitRules) shouldEqual LitSeq(
      Extension(url = "http://fooo.com/version", value = Some(choice("asd123": UriStr))))
    val bar2: Account =
      foo.updateExtensions(_.implicitRules)(updateExtension).extensions.update(Account.status)(updateExtension)
    bar2.getExtensions(_.status) shouldEqual LitSeq(
      Extension(url = "http://hi.ho", value = Some(choice(789.987: BigDecimal))))
    bar2.getExtensions(_.implicitRules) shouldEqual LitSeq(
      Extension(url = "http://fooo.com/version", value = Some(choice("asd123": UriStr))))
  }

  "doesn't change type" in {
    val foo = Cholesterol(
      status = OBSERVATION_STATUS.UNKNOWN,
      effective = Some(choice(FHIRDateTime.now)),
      value = Some(Quantity()),
      code = CodeableConcept(),
      referenceRange = ReferenceRange(text = Some("a reference range..."))
    )
    val bar = foo.setIds(_.effective)(Some("fooooooo-1"))
    bar.getIds(_.effective) shouldEqual Some("fooooooo-1")
    bar.getClass shouldEqual classOf[Cholesterol]
  }
}
