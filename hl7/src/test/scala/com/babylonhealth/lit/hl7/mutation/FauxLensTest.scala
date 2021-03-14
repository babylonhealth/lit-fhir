package com.babylonhealth.lit.hl7.mutation

import java.time.{ LocalTime, ZonedDateTime }

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers
import shapeless.test.illTyped

import com.babylonhealth.lit.core.ChoiceImplicits._
import com.babylonhealth.lit.core.PseudoLenses._
import com.babylonhealth.lit.core.model._
import com.babylonhealth.lit.core.{ Choice, LitSeq, \/ }
import com.babylonhealth.lit.hl7.{ BUNDLE_TYPE, OBSERVATION_STATUS }
import com.babylonhealth.lit.hl7.model._

class FauxLensTest extends AnyFreeSpec with Matchers {
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
      Bundle.Entry(
        resource = Some(
          Observation(
            subject = Some(subj),
            code = CodeableConcept(coding = LitSeq(coding)),
            status = OBSERVATION_STATUS.UNKNOWN)))
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
    val modified = bundle.withEntry(bundle.entry.map(r =>
      r.updateResourceIfExists {
        case o: Observation => o.withSubject(Some(Reference(reference = Some("fooooo/bar"))))
        case x              => x
      }))
    modified shouldEqual expected
  }
  "Can set a field with a keyword name (withType)" in {
    val e                    = ElementDefinition(path = "Observation.value[x]")
    val x: ElementDefinition = e.withType(LitSeq(ElementDefinition.Type(code = "Quantity")))
    x.`type` shouldEqual LitSeq(ElementDefinition.Type(code = "Quantity"))
  }
  "Can modify a field with a keyword name (withType)" in {
    val e                    = ElementDefinition(path = "Observation.value[x]")
    val x: ElementDefinition = e.updateType(_ => LitSeq(ElementDefinition.Type(code = "Quantity")))
    x.`type` shouldEqual LitSeq(ElementDefinition.Type(code = "Quantity"))
  }
  "Can modify a series of nested fields in a reasonably ergonomic and safe way" in {
    val bundle   = mkBundle(subjects)
    val expected = mkBundle(subjects2)
    val modified = bundle.updateEntryIfExists(_.updateResourceIfExists {
      case o: Observation => o.updateSubjectIfExists(s => s.withReference(Some(s"fooooo/${s.id.get}")).withId(None))
      case x              => x
    })
    modified shouldEqual expected
  }

  "update or default" ignore {
    /*
  bundle.updateMetaOrDefault(Meta(), _.updateTagOrDefault(Seq(), _ :+ newTag))
     */
  }

  "mapValue on a ref" - {
    def genObs(x: Choice[Boolean \/ Int \/ Quantity \/ String]): Observation =
      Observation(code = CodeableConcept(), status = OBSERVATION_STATUS.CANCELLED, value = Some(x.toSuperRef))
    val observation1 = genObs(choice(123))
    val observation2 = genObs(choice(false))
    val observation3 = genObs(choice(Quantity(unit = Some("ms"), value = Some(1.23))))

    val observation1_modified = genObs(choice(172))
    val observation2_modified = genObs(choice(true))
    val observation3_modified = genObs(choice("1.23"))

    "simply" in {
      observation1.updateValueIfExists(_.mapValue((_: Int) + 49).run) shouldEqual observation1_modified
    }
    "chained" in {
      val bundle = Bundle(
        `type` = BUNDLE_TYPE.COLLECTION,
        entry = LitSeq(observation1, observation2, observation3).map(o => Bundle.Entry(resource = Some(o))))
      val bundle2 = Bundle(
        `type` = BUNDLE_TYPE.COLLECTION,
        entry = LitSeq(observation1_modified, observation2_modified, observation3_modified).map(o =>
          Bundle.Entry(resource = Some(o))))
      val res_bundle = bundle.updateEntryIfExists {
        _.updateResourceIfExists {
          case resource: Observation =>
            resource.updateValueIfExists(
              _.mapValue((_: Int) + 49)
                .orElse((b: Boolean) => !b)
                .orElse((_: Quantity).value.getOrElse(0).toString)
                .run)
          case x => x
        }
      }
      res_bundle shouldEqual bundle2
    }
    "typeSafety" in {
      illTyped("""observation1.updateValueIfExists(_.mapValue((_: Double) + 123).run)""")
    }
  }
  "fold on a ref" - {
    "can do" in {
      def fold(r: Choice[Int \/ String]): Double = r.fold((_: Int).toDouble).and((_: String).length.toDouble).run
    }
    "can do b" in {
      def fold(r: Choice[Int \/ String \/ Double]): Double =
        r.fold((_: Int).toDouble).and((_: String).length.toDouble).and((d: Double) => d).run
    }
    "can do big" in {
      def fold(r: Choice[
        Boolean \/ CodeableConcept \/ Int \/ LocalTime \/ Period \/ Quantity \/ Range \/ Ratio \/ SampledData \/ String \/ ZonedDateTime]): Double =
        r.fold((_: Boolean) => 0.3)
          .and((_: CodeableConcept) => 0.4)
          .and((_: Int).toDouble)
          .and((_: LocalTime) => 0.5)
          .and((_: Period) => 0.6)
          .and((_: Quantity) => 0.6)
          .and((_: Range) => 0.6)
          .and((_: Ratio) => 0.6)
          .and((_: SampledData) => 0.6)
          .and((_: String) => 0.6)
          .and((_: ZonedDateTime) => 0.6)
          .run
    }
    "can't do if partial" in {
      illTyped("""def fold(r: Choice[Int \/ String]): Double = r.fold((_: Int).toDouble).run""")
    }
    "can't do if wrong type" in {
      illTyped(
        """def fold(r: Choice[Int \/ String]): Double = r.fold((_: Int).toDouble).and((_: Array[_]).length.toDouble).run""")
    }
    "can't do if wrong order" in {
      illTyped(
        """def fold(r: Choice[Int \/ String]): Double = r.fold((_: String).length.toDouble).and((_: Int).toDouble).run""")
    }
    "can't do if too many" in {
      illTyped(
        """def fold(r: Choice[Int \/ String]): Double = r.fold((_: Int).toDouble).and((_: String).length.toDouble).and((_: String).length.toDouble).run""")
    }
  }
}
