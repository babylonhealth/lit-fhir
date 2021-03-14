package com.babylonhealth.lit.core

import java.lang.reflect.Constructor
import java.time.format.DateTimeFormatter
import java.time.{ LocalDate, ZonedDateTime }

import izumi.reflect.macrortti.LTag

import com.babylonhealth.lit.core.model._

case class FHIRComponentFieldMeta[T](name: String, tt: LTag[T], isRef: Boolean, unwrappedTT: LTag[_])

case class FHIRComponentField[T](meta: FHIRComponentFieldMeta[T], value: T) {
  def isRef: Boolean = meta.isRef

  def name: String = meta.name
}

object PseudoLenses {

  implicit class RicherFHIRComponent[C <: FHIRObject](c: C) {
    def modifyNestedFieldUnsafe[T](nestingPath: String*)(modify: T => T): C = {
      val h +: t = nestingPath
      c.constructor
        .newInstance(c.fields.map {
          case FHIRComponentField(FHIRComponentFieldMeta(`h`, _, _, _), v: T @unchecked) if t.isEmpty      => modify(v)
          case FHIRComponentField(FHIRComponentFieldMeta(`h`, _, _, _), v @ (None | LitSeq.emptyInstance)) => v
          case FHIRComponentField(FHIRComponentFieldMeta(`h`, _, _, _), vs: LitSeq[_]) =>
            vs.map(_.asInstanceOf[FHIRObject].modifyNestedFieldUnsafe(t: _*)(modify))
          case FHIRComponentField(FHIRComponentFieldMeta(`h`, _, _, _), Some(v)) =>
            Some(v.asInstanceOf[FHIRObject].modifyNestedFieldUnsafe(t: _*)(modify))
          case FHIRComponentField(FHIRComponentFieldMeta(`h`, _, _, _), v) =>
            Some(v.asInstanceOf[FHIRObject].modifyNestedFieldUnsafe(t: _*)(modify))
          case FHIRComponentField(_, v) => v
        } :+ c.primitiveAttributes: _*)
        .asInstanceOf[C]
    }

    def setNestedFieldUnsafe[T](nestingPath: String*)(newVal: T): C =
      modifyNestedFieldUnsafe(nestingPath: _*)({ _: T =>
        newVal
      })
  }
}

trait FHIRComponent extends Utils { _: FHIRObject =>
  def fields: Seq[FHIRComponentField[_]]

  def constructor: Constructor[_] = companion.classConstructor

  // sometimes we want to do ugly things with FHIR (e.g. given an arbitrary resource, extract the `subject` field if it's a `Reference`)
  def getFieldByClass[T](name: String, clazz: Class[T]): LitSeq[T] =
    fields
      .collectFirst { case f if f.meta.name == name => f.value }
      .to(LitSeq)
      .flatMap {
        case s: LitSeq[T @unchecked] =>
          s match {
            case LitSeq.emptyInstance              => s
            case seq if clazz.isInstance(seq.head) => seq
            case _                                 => LitSeq.empty
          }
        case o: Option[_] =>
          o.flatMap {
            case ref: Choice[_]                         => ref.valueToClass(clazz)
            case x: T @unchecked if clazz.isInstance(x) => Some(x)
            case _                                      => None
          }.to(LitSeq)
        case r: Choice[_]                           => r.valueToClass(clazz).to(LitSeq)
        case x: T @unchecked if clazz.isInstance(x) => LitSeq(x)
        case _                                      => LitSeq.empty
      }

  def getFieldByType[T: LTag](name: String): LitSeq[T] =
    fields
      .find(
        _.meta.name == name
      ) // performed first, since at most one field will have the same name, and if the second condition fails, we don't want to continue scanning the fields
      .collect { case f if f.isRef || f.meta.unwrappedTT.tag =:= implicitly[LTag[T]].tag => f.value }
      .to(LitSeq)
      .flatMap {
        case s: LitSeq[T @unchecked] => s // cannot have a LitSeq[Choice[_]] according to current FHIR docs (R4)
        case o: Option[_] => // could be Option[T] or Option[Choice[_]]
          o.flatMap {
            case ref: Choice[_]  => ref.strictValueAs[T]
            case x: T @unchecked => Some(x)
          }.to(LitSeq)
        case r: Choice[_] => r.strictValueAs[T].to(LitSeq)
        case x: T @unchecked =>
          LitSeq(
            x
          ) // x _must_ be a T at this point, because we performed the `f.meta.unwrappedTT.tag =:= typeOf[T]` check
      }
}

case class PrimitiveElementInfo(element: Element, phantom: Boolean = false)

sealed trait FHIRDateTimeSpecificity {
  val dtFormatter: DateTimeFormatter
}

sealed trait FHIRDateSpecificity extends FHIRDateTimeSpecificity

object FHIRDateTimeSpecificity {

  case object Year extends FHIRDateSpecificity {
    override val dtFormatter: DateTimeFormatter = DateTimeFormatter ofPattern "yyyy"
  }

  case object Month extends FHIRDateSpecificity {
    override val dtFormatter: DateTimeFormatter = DateTimeFormatter ofPattern "yyyy-MM"
  }

  case object Day extends FHIRDateSpecificity {
    override val dtFormatter: DateTimeFormatter = DateTimeFormatter ofPattern "yyyy-MM-dd"
  }

  case object Time extends FHIRDateTimeSpecificity {
    override val dtFormatter: DateTimeFormatter = DateTimeFormatter ofPattern "yyyy-MM-dd'T'HH:mm:ss.SSSXXX"
  }

}

/** Wrapper around LocalDate to preserve the level of specificity of a Date field from an external resource
  */
case class FHIRDate(date: LocalDate, specificity: FHIRDateSpecificity = FHIRDateTimeSpecificity.Day) {
  def fmt: String = specificity.dtFormatter.format(date)
}

object FHIRDate {
  def parse(s: String): FHIRDate = FHIRDate(LocalDate.parse(s))
  def now: FHIRDate              = FHIRDate(LocalDate.now())
}

/** Wrapper around ZonedDateTime to preserve the level of specificity of a DateTime field from an external resource
  */
case class FHIRDateTime(dateTime: ZonedDateTime, specificity: FHIRDateTimeSpecificity = FHIRDateTimeSpecificity.Time) {
  def fmt: String = specificity.dtFormatter.format(dateTime)
}

object FHIRDateTime {
  def parse(s: String): FHIRDateTime = FHIRDateTime(ZonedDateTime.parse(s))
  def now: FHIRDateTime              = FHIRDateTime(ZonedDateTime.now())
}
