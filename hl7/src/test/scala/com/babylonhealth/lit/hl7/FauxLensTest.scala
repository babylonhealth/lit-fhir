package com.babylonhealth.lit.hl7

import java.time.ZonedDateTime

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

import com.babylonhealth.lit.core.PseudoLenses._
import com.babylonhealth.lit.core._
import com.babylonhealth.lit.core.model._
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
  "updateAll works for NonEmptyLitSeq" in {
    val now = ZonedDateTime.now()
    val signature =
      Signature(who = Reference(reference = Some("one")), `type` = LitSeq(Coding(id = Some("id"))), when = now)
    val expected =
      Signature(who = Reference(reference = Some("one")), `type` = LitSeq(Coding(id = Some("another id"))), when = now)
    val modified = signature.updateNonEmpty(_.`type`)(_.updateIfExists(_.id) {
      case "id" => "another id"
      case x    => x
    })
    modified shouldEqual expected
  }

  "update or default" ignore {
    /*
  bundle.updateMetaOrDefault(Meta(), _.updateTagOrDefault(Seq(), _ :+ newTag))
     */
  }

}
