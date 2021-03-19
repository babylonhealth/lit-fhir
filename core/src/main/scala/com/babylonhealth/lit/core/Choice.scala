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

  @deprecated("Will be removed by 1.0.0")
  def fromValNoTypecheck[T, O](o: O)(implicit tt: LTag[T], ot: LTag[O]): Choice[T] = {
    Choice[T](typeSuffixMap(ot.tag).get, o)(tt)
  }

  def fromValAndSuffix[T, O](o: O, suffix: String)(implicit tt: LTag[T]): Choice[T] = {
    Choice[T](suffix, o)(tt)
  }

  @deprecated("Will be removed by 1.0.0")
  def fromVal[T, O: Encoder](o: O)(implicit tt: LTag[T], ot: LTag[O]): Choice[T] = {
    if (\/.canBe(tt, ot)) Choice[T](typeSuffixMap(ot.tag).get, o)(tt)
    else throw new RuntimeException(s"Cannot ascribe type ${\/.str[T](tt)} to type $ot")
  }

  def fromSuffix[V, U](suffix: String, value: V, meta: FHIRComponentFieldMeta[_]): Choice[U] =
    Choice[U](suffix, value)(meta.unwrappedTT.asInstanceOf[LTag[U]])
}

final class ChoiceFold[T: LTag, To: LTag, Built: LTag] private[core] (
    choice: Choice[T],
    fns: Map[String, Function[_, To]]) {
  def and[Next: LTag](x: Next => To)(implicit w: UnionWitness[T, Next]): ChoiceFold[T, To, Built \/ Next] =
    new ChoiceFold[T, To, Built \/ Next](choice, fns + (w.suffix -> x))(
      implicitly[LTag[T]],
      implicitly[LTag[To]],
      \::/[Built, Next])
  def run(implicit w: T =:= Built): To = fns(choice.suffix).asInstanceOf[Any => Any](choice.value).asInstanceOf[To]
}

final class ChoiceMap[T: LTag] private[core] (
    choice: Choice[T],
    partials: Map[String, (String, LTag[_], Function[_, _])]) {
  def orElse[From, To](fn: From => To)(implicit
      @implicitNotFound("Cannot prove that ${X} ('from' type) is a viable type for union ${T}")
      fromWitness: UnionWitness[T, From],
      @implicitNotFound("Cannot prove that ${X} ('to' type) is a viable type for union ${T}")
      toWitness: UnionWitness[T, To]
  ): ChoiceMap[T] = new ChoiceMap(choice, partials + (fromWitness.suffix -> (toWitness.suffix, toWitness.tt, fn)))
  def run: Choice[T] =
    partials.get(choice.suffix).map { case (newSuffix, _, fn) =>
      Choice(newSuffix, fn.asInstanceOf[Any => Any](choice.value))(choice.tt) //.asInstanceOf[Ref[T, _]]
    } getOrElse choice
}

case class Choice[T](suffix: String, value: Any)(implicit val tt: LTag[T]) {
  type Union = T

  def fold[Init: LTag, To: LTag](fn: Init => To)(implicit
      @implicitNotFound("Cannot prove that ${X} ('from' type) is a viable type for union ${T}")
      fromWitness: UnionWitness[T, Init]): ChoiceFold[T, To, Init] =
    new ChoiceFold[T, To, Init](this, Map(fromWitness.suffix -> fn))

  // Modify the held value, returning a type that can also be held in the union type
  def mapValue[From, To](fn: From => To)(implicit
      @implicitNotFound("Cannot prove that ${X} ('from' type) is a viable type for union ${T}")
      fromWitness: UnionWitness[T, From],
      @implicitNotFound("Cannot prove that ${X} ('to' type) is a viable type for union ${T}")
      toWitness: UnionWitness[T, To]
  ): ChoiceMap[T] = new ChoiceMap(this, Map(fromWitness.suffix -> (toWitness.suffix, toWitness.tt, fn)))

  lazy val d @ DecoderAndTag(_, elTT) =
    model.suffixDecoderTypeTagMap.getOrElse(suffix, DecoderAndTag[Json](_ => implicitly, LTag[Json]))
  def json(implicit encoderParams: EncoderParams = EncoderParams()): Json = serdes.serializeField(value)
  def toSuperRefSafe[Sup <: _ \/ _](implicit supT: LTag[Sup]): Choice[Sup] =
    if (\/.lTypeSubsumesRAll(tt.tag)(supT)) Choice[Sup](suffix, value) else throw new RuntimeException("Bad cast")

  def toSubRef[Sub <: _ \/ _](implicit subT: LTag[Sub]): Choice[Sub] = Choice[Sub](suffix, value)
  def toSubRefNonUnion[Sub](implicit subT: LTag[Sub]): Sub =
    if (subT.tag =:= elTT.tag) value.asInstanceOf[Sub]
    else throw new RuntimeException(s"requested value type ${subT.tag} didn't match choice type ${elTT.tag}")

  def toSuperRef[Sup <: _ \/ _](implicit supT: LTag[Sup]): Choice[Sup] = Choice[Sup](suffix, value)

  @deprecated("You don't want to instantiate the choice to a 'union' type, it's inefficient")
  def toUnion: T = \/.builder(value.asInstanceOf[d.Type])(tt, elTT.asInstanceOf[LTag[d.Type]])

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
