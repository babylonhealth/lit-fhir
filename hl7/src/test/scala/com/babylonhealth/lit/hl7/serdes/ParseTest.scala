package com.babylonhealth.lit.hl7.serdes

import scala.annotation.tailrec

import io.circe.Printer
import io.circe.parser.decode
import io.circe.syntax._
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers
import org.skyscreamer.jsonassert.comparator.{ CustomComparator, JSONComparator }
import org.skyscreamer.jsonassert.{ Customization, JSONAssert, JSONCompareMode }

import com.babylonhealth.lit.core.ChoiceImplicits._
import com.babylonhealth.lit.core.model.{ Quantity, Resource }
import com.babylonhealth.lit.core.serdes.{ objectDecoder, objectEncoder }
import com.babylonhealth.lit.core.{ Choice, UnsignedInt, \/ }
import com.babylonhealth.lit.hl7.BUNDLE_TYPE
import com.babylonhealth.lit.hl7.model.Bundle
import com.babylonhealth.lit.common.FileUtils
import com.babylonhealth.lit.hl7.LoadsOfObservations

class ParseTest extends AnyFreeSpec with Matchers with FileUtils {

  def getCCParams(cc: AnyRef): Map[String, Any] = {
    @tailrec
    def getCCParamsHelper(clazz: Class[_], acc: Map[String, Any] = Map.empty): Map[String, Any] = {
      val fieldsFromThisLevel = clazz.getDeclaredFields.foldLeft(Map.empty[String, Any]) { (a, f) =>
        f.setAccessible(true)
        a + (f.getName -> f.get(cc))
      }
      val parent = clazz.getSuperclass
      val next =
        fieldsFromThisLevel ++ acc // acc comes after fieldsFromThisLevel, so that more specific child types should override more general parent types
      if (parent == classOf[Object]) next else getCCParamsHelper(parent, next)
    }
    getCCParamsHelper(cc.getClass)
  }

  "missing and null fields are None where applicable..." in {
    val x =
      choice[Quantity \/ String \/ Boolean, Quantity](Quantity(unit = Some("10^9/L"), value = Some(0.6)))
    println(x.json.noSpaces)
    x.json.noSpaces.contains("null") shouldEqual false
  }
  "Can build that whole massive bundle with class objects" in {
    val x = slurpRsc("exampleBundle.json")
    val y = decode[Bundle](x)

    val x3: Choice[String \/ Int] = choice(123)
    val entries                   = LoadsOfObservations.observations.map(o => Bundle.Entry(resource = Some(o)))
    val z =
      new Bundle(
        meta = None,
        `type` = BUNDLE_TYPE.COLLECTION,
        total = Some(53.asInstanceOf[UnsignedInt]),
        entry = entries)
    val rs1 = z.entry.map(_.resource.get)
    val rs2 = y.toTry.get.entry.map(_.resource.get)
    def printDiff(x: Resource, y: Resource): Option[String] = {
      val xs         = getCCParams(x).toSeq.sortBy(_._1)
      val ys         = getCCParams(y).toSeq.sortBy(_._1)
      val keySetDiff = ys.map(_._1).toSet diff xs.map(_._1).toSet
      if (keySetDiff.nonEmpty) Some(s"KeyDiff:: ${keySetDiff}")
      else {
        val diff = xs.zip(ys).map { case ((k, v1), (_, v2)) => (v1 == v2, k, v1, v2) }.find(!_._1)
        if (diff.isDefined) Some(s"ValDiff:: ${diff.get._2}, ${diff.get._3}, ${diff.get._4}")
        else None
      }
    }
    val eqs = rs1.zip(rs2).map { case (l, r) => printDiff(l, r) }.collect { case Some(v) => v }
    eqs.zipWithIndex foreach println

    z shouldEqual y.right.get
    val printer = Printer.spaces4.copy(dropNullValues = true)
    val encoded = printer.print(z.asJson)
    // A custom json comparator, since what we produce isn't _quite_ identical to the input
    val comparator: JSONComparator = {
      val dateTimeRegex = """(2019-11-07T17:[0-5][0-9]:[0-5][0-9])(?:\.000)?Z""".r
      new CustomComparator(
        // STRICT_ORDER rather than STRICT here because, for now, we add resourceType to each level of object (including, e.g. Coding objects),
        // and a STRICT json comparison will mean that causes the equality test to fail. It does not appear to be possible to write a Customization
        // for jsonassert that will check that the _only_ additional fields are `resourceType` ones, but as a rule of thumb, providing unexpected
        // extra fields in a json should never break an external API, so this shouldn't matter....
        JSONCompareMode.STRICT_ORDER,
        // the input json has no millis -- we, however, add them when serializing datetime, so we use a custom comparator here to account for that
        new Customization(
          "entry[*].resource.effectiveDateTime",
          (o1: Object, o2: Object) =>
            (o1, o2) match {
              case (s1: String, s2: String) =>
                (s1, s2) match { case (dateTimeRegex(d1), dateTimeRegex(d2)) => d1 == d2; case _ => false }
              case _ => false
            })
      )
    }
    JSONAssert.assertEquals(x, encoded, comparator)
  }
}
