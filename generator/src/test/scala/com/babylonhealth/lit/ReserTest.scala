package com.babylonhealth.lit

import java.io.File
import java.nio.charset.StandardCharsets
import java.nio.file.Files

import io.circe.parser.parse
import io.circe.syntax._
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers
import org.skyscreamer.jsonassert.comparator.{ CustomComparator, JSONComparator }
import org.skyscreamer.jsonassert.{ Customization, JSONAssert, JSONCompareMode, ValueMatcher }

import com.babylonhealth.lit.core.serdes.{ objectDecoder, objectEncoder }
import com.babylonhealth.lit.hl7.model.StructureDefinition

class ReserTest extends AnyFreeSpec with Matchers {
  "Decode all the `StructureDefinition`s" in {
    val files = new File("./generator/src/main/resources/resourceModel").listFiles.filter(_.getName.endsWith(".json"))
    // A custom json comparator, since what we produce isn't _quite_ identical to the input
    val comparator: JSONComparator = {
      val dateTimeRegex = """([0-9]{4}-[0-9]{2}-[0-9]{2}T[0-9]{2}:[0-9]{2}:[0-9]{2})(?:\.000)?(.+)""".r
      def compareDates: ValueMatcher[AnyRef] =
        (o1: Object, o2: Object) =>
          (o1, o2) match {
            case (s1: String, s2: String) =>
              (s1, s2) match {
                case (dateTimeRegex(d1, z1), dateTimeRegex(d2, z2)) => d1 == d2 && z1 == z2; case _ => false
              }
            case _ => false
          }

      new CustomComparator(
        JSONCompareMode.STRICT,
        // the input json has no millis -- we, however, add them when serializing datetime, so we use a custom comparator here to account for that
        new Customization("date", compareDates),
        new Customization("differential.element[*].example[*].valueDateTime", compareDates),
        new Customization("snapshot.element[*].example[*].valueDateTime", compareDates)
      )
    }
    def checkFile(f: File) = {
      val str       = Files.lines(f.toPath, StandardCharsets.UTF_8).toArray.mkString("\n")
      val parsed    = parse(str).fold(throw _, identity)
      val tryDecode = parsed.as[StructureDefinition]
      tryDecode.isRight shouldEqual true
      val decoded   = tryDecode.right.get
      val reencoded = decoded.asJson.noSpaces
      JSONAssert.assertEquals(str, reencoded, comparator)
    }
    files foreach checkFile
  }
}
