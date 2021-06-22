package com.babylonhealth.lit.hl7

import java.time.{ LocalTime, ZonedDateTime }

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

import com.babylonhealth.lit.core.ChoiceImplicits._
import com.babylonhealth.lit.core.PseudoLenses._
import com.babylonhealth.lit.core.model._
import com.babylonhealth.lit.core._
import com.babylonhealth.lit.hl7.{ BUNDLE_TYPE, OBSERVATION_STATUS }
import com.babylonhealth.lit.hl7.model._
import izumi.reflect.macrortti.LTag
import org.scalatest.Assertion

class NewFauxLensTest extends AnyFreeSpec with Matchers {
  val subjects: Seq[(Reference, Coding)] = Seq(
    (Reference(id = Some("wut")), Coding(system = Some("foo"), code = Some("bar"))),
    (Reference(id = Some("WUT")), Coding(system = Some("FOO"), code = Some("BAR")))
  )
  val subjects2: Seq[(Reference, Coding)] = Seq(
    (Reference(reference = Some("fooooo/wut")), Coding(system = Some("foo"), code = Some("bar"))),
    (Reference(reference = Some("fooooo/WUT")), Coding(system = Some("FOO"), code = Some("BAR")))
  )
  val subjects3: Seq[(Reference, Coding)] = Seq(
    (Reference(reference = Some("fooooo/bar")), Coding(system = Some("foo"), code = Some("bar"))),
    (Reference(reference = Some("fooooo/bar")), Coding(system = Some("FOO"), code = Some("BAR")))
  )
  def mkBundle(subjects: Seq[(Reference, Coding)]) = {
    val entries = subjects.map { case (subj, coding) =>
      Bundle.Entry(resource = Some(
        Observation(subject = Some(subj), code = CodeableConcept(coding = LitSeq(coding)), status = OBSERVATION_STATUS.UNKNOWN)))
    }
    Bundle(entry = entries to LitSeq, `type` = BUNDLE_TYPE.COLLECTION)
  }
  "Can set a series of nested fields" in {
    val bundle   = mkBundle(subjects)
    val expected = mkBundle(subjects3)
    val modified = bundle.setNestedFieldUnsafe[Option[Reference]]("entry", "resource", "subject")(
      Some(Reference(reference = Some(s"fooooo/bar"))))
    modified shouldEqual expected
  }
  "Can modify a series of nested fields" in {
    val bundle                 = mkBundle(subjects)
    val expected               = mkBundle(subjects2)
    def subjectLens(b: Bundle) = b.modifyNestedFieldUnsafe[Option[Reference]]("entry", "resource", "subject") _
    val modified               = subjectLens(bundle)(p => Some(Reference(reference = Some(s"fooooo/${p.get.id.get}"))))
    modified shouldEqual expected
  }
  "Can modify a series of nested fields in a safe way" in {
    val bundle   = mkBundle(subjects)
    val expected = mkBundle(subjects3)
    val modified = bundle.set(_.entry)(bundle.entry.map(r =>
      r.updateIfExists(_.resource) {
        case o: Observation => o.set(_.subject)(Some(Reference(reference = Some("fooooo/bar"))))
        case x              => x
      }))
    modified shouldEqual expected
  }
  "Can set a field with a keyword name (withType)" in {
    val e                    = ElementDefinition(path = "Observation.value[x]")
    val x: ElementDefinition = e.set(_.`type`)(LitSeq(ElementDefinition.Type(code = "Quantity")))
    x.`type` shouldEqual LitSeq(ElementDefinition.Type(code = "Quantity"))
  }
  "Can modify a field with a keyword name (withType)" in {
    val e                    = ElementDefinition(path = "Observation.value[x]")
    val x: ElementDefinition = e.update(_.`type`)(_ => LitSeq(ElementDefinition.Type(code = "Quantity")))
    x.`type` shouldEqual LitSeq(ElementDefinition.Type(code = "Quantity"))
  }
  "Can modify a field with a keyword name (update)" in {
    val e = ElementDefinition(path = "Observation.value[x]")
    val x: ElementDefinition =
      e.updateFromField(ElementDefinition.`type`)(_ => LitSeq(ElementDefinition.Type(code = "Quantity")))
    x.`type` shouldEqual LitSeq(ElementDefinition.Type(code = "Quantity"))
  }

  "Can modify a field with a keyword name (update sugar)" in {
    val e: ElementDefinition = ElementDefinition(path = "Observation.value[x]")
    val x: ElementDefinition =
      e.update[LitSeq[ElementDefinition.Type]](_.`type`)(_ => LitSeq(ElementDefinition.Type(code = "Quantity")))
    x.`type` shouldEqual LitSeq(ElementDefinition.Type(code = "Quantity"))
  }
  "Can modify a series of nested fields in a reasonably ergonomic and safe way" in {
    val bundle   = mkBundle(subjects)
    val expected = mkBundle(subjects2)
    val modified = bundle.updateAll(_.entry)(_.updateIfExists(_.resource) {
      case o: Observation =>
        o.updateIfExists(_.subject)(s => s.set(_.reference)(Some(s"fooooo/${s.id.get}")).set(_.id)(None))
      case x => x
    })
    modified shouldEqual expected
  }

  "update or default" ignore {
    /*
  bundle.updateMetaOrDefault(Meta(), _.updateTagOrDefault(Seq(), _ :+ newTag))
     */
  }

  "mapValue on a ref" - {
    def genObs(x: Choice[Boolean | Int | Quantity | String]): Observation =
      Observation(code = CodeableConcept(), status = OBSERVATION_STATUS.CANCELLED, value = Some(x.toSuperRef))

    val observation1 = genObs(choice(123))
    val observation2 = genObs(choice(false))
    val observation3 = genObs(choice(Quantity(unit = Some("ms"), value = Some(1.23))))

    val observation1_modified = genObs(choice(172))
    val observation2_modified = genObs(choice(true))
    val observation3_modified = genObs(choice("1.23"))

    "simply" in {
      observation1.updateIfExists(_.value)(_.mapValue { case i: Int => i + 49 }) shouldEqual observation1_modified
    }
    "chained" in {
      val bundle = Bundle(
        `type` = BUNDLE_TYPE.COLLECTION,
        entry = LitSeq(observation1, observation2, observation3).map(o => Bundle.Entry(resource = Some(o))))
      val bundle2 = Bundle(
        `type` = BUNDLE_TYPE.COLLECTION,
        entry =
          LitSeq(observation1_modified, observation2_modified, observation3_modified).map(o => Bundle.Entry(resource = Some(o))))
      val res_bundle = bundle.updateAll(_.entry) {
        _.updateIfExists(_.resource) {
          case resource: Observation =>
            resource.updateIfExists(_.value)(_.mapValue {
              case i: Int      => i + 49
              case b: Boolean  => !b
              case q: Quantity => q.value.getOrElse(0).toString
            })
          case x => x
        }
      }
      res_bundle shouldEqual bundle2
    }

    "typeSafety" in {
      assertTypeError("""observation1.updateIfExists(_.value)(_.mapValue { case d: Double => d + 123 } )""")
    }
  }
  "fold on a ref" - {
    "can do" in {
      def fold(r: Choice[Int | String]): Double = r.fold { case i: Int => i.toDouble; case s: String => s.length.toDouble }
    }
    "can do b" in {
      def fold(r: Choice[Int | String | Double]): Double =
        r.fold { case i: Int => i.toDouble; case s: String => s.length.toDouble; case d: Double => d }
    }
    "can do big" in {
      def fold(
          r: Choice[Boolean | CodeableConcept | Int | LocalTime | Period | Quantity | Range | Ratio | SampledData | String |
            ZonedDateTime]): Double =
        r.fold {
          case _: Boolean         => 0.3
          case _: CodeableConcept => 0.4
          case i: Int             => i.toDouble
          case _: LocalTime       => 0.5
          case _: Period          => 0.6
          case _: Quantity        => 0.6
          case _: Range           => 0.6
          case _: Ratio           => 0.6
          case _: SampledData     => 0.6
          case _: String          => 0.6
          case _: ZonedDateTime   => 0.6
        }
    }
    // TODO: Impl this
    def assertThrowsWarning(s: String): Assertion = fail("unimplemented test")
    "get warnings if partial" ignore {
      assertThrowsWarning("""def fold(r: Choice[Int | String]): Double = r.fold{ case i: Int => i.toDouble }""")
    }
    "get warnings if wrong type" ignore {
      assertDoesNotCompile(
        """def fold(r: Choice[Int | String]): Double = r.fold{ case i: Int => i.toDouble; case a: Array[_] => a.length.toDouble }""")
    }
    "get warnings if too many" ignore {
      assertThrowsWarning(
        """def fold(r: Choice[Int | String]): Double = r.fold{ case i: Int => i.toDouble; case s: String => s.length.toDouble; case s: String => s.length.toDouble}""")
    }
  }
}
