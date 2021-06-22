package com.babylonhealth.lit.core

import scala.annotation.implicitNotFound

import io.circe.{ Decoder, Encoder, Json }
import izumi.reflect.macrortti.LTag

import com.babylonhealth.lit.core.model.typeSuffixMap

object Choice {
  implicit def encoder[T <: Choice[_]]: Encoder[T] = Encoder.instance(_.json)
  implicit def decoder[T <: String: LTag: ValueOf]: Decoder[Choice[T]] =
    Decoder.instance {
      Decoder.decodeJson(_).map(json => Choice[T]("", json))
    }
  def decoder[T: LTag](suffix: String)(implicit params: DecoderParams): Decoder[Choice[T]] =
    Decoder.instance { cursor =>
      model
        .suffixDecoderTypeTagMap(suffix)
        .decoder(params)
        .decodeJson(cursor.value)
        .map(v => Choice(suffix, v)(LTag[T]))
    }
  def decoder[T: LTag](prefix: String, path: String)(implicit params: DecoderParams): Decoder[Choice[T]] =
    decoder[T](path.drop(prefix.size))

  def fromValAndSuffix[T, O <: T](o: O, suffix: String)(implicit tt: LTag[T]): Choice[T] = {
    Choice[T](suffix, o)(tt)
  }

  def fromSuffix[U, V <: U](suffix: String, value: V, meta: FHIRComponentFieldMeta[_]): Choice[U] =
    Choice[U](suffix, value)(meta.unwrappedTT.asInstanceOf[LTag[U]])
}

object As {
  implicit def asAs[T: LTag](t: T): As[T] = new As[T](t)
}
case class As[T](t: T)(implicit val tag: LTag[T]) {
  val suffix: String = \/.typeSuffixMap2(tag.tag.ref).get
}
case class Choice[T](suffix: String, value: Any)(implicit val tt: LTag[T]) {
  type Union = T

  def mapValue(fn: PartialFunction[T, As[_ <: T]]): Choice[T] =
    fn.andThen { case newValue: As[_] => Choice[T](newValue.suffix, newValue.t) }.applyOrElse(value.asInstanceOf[T], _ => this)

  def fold[To](fn: T => To): To = fn(value.asInstanceOf[T])

  val d @ DecoderAndTag(_, elTT) =
    model.suffixDecoderTypeTagMap.getOrElse(suffix, DecoderAndTag[Json](_ => implicitly, LTag[Json]))
  def json(implicit encoderParams: EncoderParams = EncoderParams()): Json = serdes.serializeField(value)
  def toSuperRefSafe[Sup >: T](implicit supT: LTag[Sup]): Choice[Sup]     = Choice[Sup](suffix, value)
  // asInstanceOf is so we throw when bad
  def toSubRef[Sub <: T](implicit subT: LTag[Sub]): Choice[Sub] = Choice[Sub](suffix, value.asInstanceOf[Sub])
  def toSubRefNonUnion[Sub](implicit subT: LTag[Sub]): Sub =
    if (subT.tag =:= elTT.tag) value.asInstanceOf[Sub]
    else throw new RuntimeException(s"requested value type ${subT.tag} didn't match choice type ${elTT.tag}")

  def toSuperRef[Sup >: T](implicit supT: LTag[Sup]): Choice[Sup] = Choice[Sup](suffix, value)

  override def toString: String = s"Choice[${\/.str[T]}](${suffix}, ${value})"

  override def equals(obj: Any): Boolean =
    obj match {
      case ref: Choice[_] => suffix == ref.suffix && value.equals(ref.value) // && tt =:= ref.tt
      case _              => false
    }

  override def hashCode(): Int = suffix.## * 31 + value.hashCode() * 47

  // kinda a java-ish API
  def valueToClass[Sub](klass: Class[Sub]): Option[Sub] =
    if (klass.isInstance(value)) Some(value.asInstanceOf[Sub]) else None
  // scala API
  def strictValueAs[Sub](implicit tt: LTag[Sub]): Option[Sub] = {
    if (elTT.tag =:= tt.tag) Some(value.asInstanceOf[Sub])
    else None
  }
}
