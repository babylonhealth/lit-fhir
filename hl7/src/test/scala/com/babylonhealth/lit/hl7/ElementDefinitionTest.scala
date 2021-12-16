package com.babylonhealth.lit.hl7

import io.circe.parser.decode
import io.circe.syntax._
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers
import org.skyscreamer.jsonassert.JSONAssert

import com.babylonhealth.lit.core.ChoiceImplicits._
import com.babylonhealth.lit.core.serdes.{ objectDecoder, objectEncoder }
import com.babylonhealth.lit.core.{ toCode, toUnsignedInt }
import com.babylonhealth.lit.hl7.RESOURCE_SLICING_RULES
import com.babylonhealth.lit.hl7.model.ElementDefinition

class ElementDefinitionTest extends AnyFreeSpec with Matchers {

  private val elementDefinition =
    """{"resourceType": "ElementDefinition", "path": "foo", "slicing": {"rules": "open"}}"""

  // https://www.hl7.org/fhir/elementdefinition-definitions.html#ElementDefinition.slicing.rules
  "ElementDefinition has field slicing.rules" in {
    val rules = decode[ElementDefinition](elementDefinition).toOption
      .flatMap(_.slicing)
      .map(_.rules)

    rules shouldEqual Some(RESOURCE_SLICING_RULES.OPEN)
  }

  "can build an ElementDefinition" in {
    val ed = new ElementDefinition(
      path = "asd",
      defaultValue = Some(choice(toCode("foo"))),
      maxValue = Some(choice(toUnsignedInt(9000))))
    val expected = """{"path":"asd", "defaultValueCode": "foo", "maxValueUnsignedInt": 9000}"""
    val jstr     = ed.asJson.noSpaces
    JSONAssert.assertEquals(expected, jstr, true)
    val deser = decode[ElementDefinition](jstr).fold(throw _, identity)
    deser shouldEqual ed
  }

}
