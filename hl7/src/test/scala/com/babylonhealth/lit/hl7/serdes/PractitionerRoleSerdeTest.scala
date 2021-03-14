package com.babylonhealth.lit.hl7.serdes

import io.circe.parser.decode
import io.circe.syntax._
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

import com.babylonhealth.lit.core.model.Resource
import com.babylonhealth.lit.core.serdes.{ objectDecoder, objectEncoder }
import com.babylonhealth.lit.hl7.model.PractitionerRole

class PractitionerRoleSerdeTest extends AnyFreeSpec with Matchers {
  "PractitionerRole decodes as Practitioner" in {
    val p   = PractitionerRole()
    val enc = p.asJson.noSpaces
    val dec = decode[Resource](enc).fold(throw _, identity)
    dec shouldEqual p
  }
}
