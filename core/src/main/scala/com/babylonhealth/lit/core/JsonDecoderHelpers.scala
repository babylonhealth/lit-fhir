package com.babylonhealth.lit.core

import scala.reflect.runtime.universe.typeOf
import scala.util.{ Failure, Success, Try }

import io.circe.CursorOp.DeleteGoParent
import io.circe._
import izumi.reflect.macrortti.LTag

import com.babylonhealth.lit.core.TagSummoners.lTypeOf
import com.babylonhealth.lit.core.model._

trait EnumBase { def name: String }

trait JsonDecoderHelpers extends BaseFieldDecoders {

  implicit class RichCursor(cursor: ACursor) {
    def arrayCursors: Option[Iterable[ACursor]] =
      cursor.values.map(_.zipWithIndex.map { case (_, ix) => cursor.downN(ix) })

    def tryCreatePhantomType[T: Decoder: LTag](fieldName: String)(implicit params: DecoderParams): Try[T] = {
      val primitiveElementCompanion =
        cursor
          .downField('_' +: fieldName)
          .success
          .toRight(
            new RuntimeException(
              s"Couldn't find companion _$fieldName field when trying to construct phantom value for $fieldName")
          )
          .toTry
          .flatMap(Element.decodeThis)

      val primitiveElementValue =
        primitiveElementCompanion.flatMap(
          _.extension
            .find(_.url == "http://hl7.org/fhir/StructureDefinition/structuredefinition-json-type")
            .flatMap(_.value)
            .toRight(new RuntimeException(
              s"Couldn't find an appropriate extension when trying to construct phantom value for $fieldName"))
            .toTry)
      // We don't use the strictly type-safe extractor method here, because the only known use case for this has
      // a String field in the extension but expects a Uri field in the value
      primitiveElementValue.flatMap(choice => Try(choice.value.asInstanceOf[T]))
    }

    def createPhantomType[T: Decoder: LTag](fieldName: String)(implicit params: DecoderParams): T =
      tryCreatePhantomType[T](fieldName).fold(throw _, identity)

    def decodeFromListAs[T: Decoder](fieldName: String, default: Option[T])(implicit params: DecoderParams): T = {
      val arrVals = cursor.downField(fieldName).success.flatMap(_.value.asArray)
      if (arrVals.exists(_.sizeCompare(1) > 0))
        throw DecodingFailure(
          s"Too many elements provided for field $fieldName - a maximum of one element is permitted",
          cursor.history)

      def getArray(c: HCursor): ACursor =
        if (params.flexibleCardinality) c.downArray.success.getOrElse(c) else c.downArray

      val decoded = cursor.downField(fieldName).success.map(getArray).map(_.as[T].toTry.get)
      decoded orElse default getOrElse (throw DecodingFailure(
        s"Could not find required field $fieldName",
        cursor.history))
    }

    def decodeAs[T: Decoder: LTag](fieldName: String, default: Option[T])(implicit params: DecoderParams): T = {
      val field = cursor.downField(fieldName)

      field.success.map(_.as[T].toTry) match {
        case None if params.createPhantomValues =>
          default getOrElse tryCreatePhantomType[T](fieldName)
            .fold(
              t =>
                throw DecodingFailure(s"No value found for required field '${fieldName}'", cursor.history).initCause(t),
              identity)
        case None =>
          default getOrElse (throw DecodingFailure(s"Could not find required field $fieldName", cursor.history))
        case Some(f @ Failure(_))
            if params.flexibleCardinality && field.values.isEmpty &&
              lTypeOf[T].withoutArgs <:< lTypeOf[LitSeq[_]].withoutArgs =>
          field.success
            .map(c => c.replace(Json.arr(c.value), c, DeleteGoParent).as[T].toTry)
            .getOrElse(f)
            .fold(throw _, identity)
        case Some(Failure(f)) => throw f
        case Some(Success(s)) => s
      }
    }

    def decodeRef[T: LTag](prefix: String)(implicit params: DecoderParams): Choice[T] =
      decodeOptRef[T](prefix)
        .getOrElse(throw DecodingFailure(s"Could not find instance of non-optional field ${prefix}[x]", cursor.history))

    def decodeOptRef[T: LTag](prefix: String)(implicit params: DecoderParams): Option[Choice[T]] =
      cursor.keys.map(_.filter(_ startsWith prefix)).toSeq.flatten match {
        case x if x.isEmpty => None
        case Seq(k) =>
          val suffix = k.drop(prefix.length)
          val d      = model.suffixDecoderTypeTagMap(suffix)
          val v      = cursor.downField(k).as(d.decoder(params)).fold(throw _, identity)
          Some(Choice(suffix, v))
        case moreThanOne =>
          val validSuffixes = \/.validSuffixes
          val ks            = moreThanOne.filter(k => validSuffixes contains k.drop(prefix.size))
          if (ks.size == 1) {
            val k      = ks.head
            val suffix = k.drop(prefix.length)
            val d      = model.suffixDecoderTypeTagMap(suffix)
            val v      = cursor.downField(k).as(d.decoder(params)).fold(throw _, identity)
            Some(Choice(suffix, v))
          } else if (ks.isEmpty) None
          else
            throw DecodingFailure(
              s"More than one field matching ${prefix}[x] was found. Fields were: ${ks.mkString("[", ", ", "]")}",
              cursor.history)
      }
  }

}
