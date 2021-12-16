package com.babylonhealth.lit.core

import java.time.{ LocalTime, ZonedDateTime }
import java.util.{ Base64, UUID }

import scala.reflect.ClassTag
import scala.util.Try

import io.circe.parser.decode
import io.circe.syntax._
import io.circe.{ Decoder, Encoder, Json }
import izumi.reflect.macrortti.LTag
import org.slf4j.{ Logger, LoggerFactory }
import com.babylonhealth.lit.core.model.{ Element, Resource, typeSuffixMap }

object serdes extends Utils {
  private val log: Logger = LoggerFactory.getLogger(getClass)

  def serializeField[T](fieldValue: T)(implicit encoderParams: EncoderParams = EncoderParams()): Json =
    fieldValue match {
      case Some(x)            => serializeField(x)
      case None               => Json.Null
      case s: LitSeq[_]       => Json.arr(s.map(serializeField).toSeq: _*)
      case subObj: FHIRObject => encodeComponent(subObj)
      case r: Choice[_]       => r.json
      case s: String          => Json fromString s // All subtypes of String (e.g. Markdown) should be encoded as String
      case b: BigDecimal      => Json fromBigDecimal b
      case s: Int             => Json fromInt s    // All subtypes of Int (e.g. UnsignedInt) should be encoded as Int
      case b: Boolean         => Json fromBoolean b
      case uuid: UUID         => Json fromString uuid.toString
      case d: ZonedDateTime   => Json fromString FHIRDateTimeSpecificity.Time.dtFormatter.format(d)
      case dt: FHIRDateTime   => Json fromString dt.fmt
      case d: FHIRDate        => Json fromString d.fmt
      case time: LocalTime    => Json fromString time.toString
      case e: EnumBase        => Encoder.encodeString(e.name)
      case bytes: Array[Byte] => Json.fromString(Base64.getEncoder.encodeToString(bytes))
      case j: Json            => j
      // unused?
      case Left(l)  => serializeField(l)
      case Right(l) => serializeField(l)
//      case LHS(l)    => serializeField(l)
//      case RHS(r)    => serializeField(r)
      case s: Double => Json fromDouble s getOrElse Json.Null
      case x =>
        log.error(s"Unmatched case in serializeField (${x.getClass})")
        Json.Null
    }

  private def encodeRefish(name: String, r: Any, t: LTag[_])(implicit encoderParams: EncoderParams): (String, Json) =
    r match {
      case None | Nil            => ""              -> Json.Null
      case Some(x)               => encodeRefish(name, x, t)
      case r @ Choice(suffix, _) => (name + suffix) -> r.json
      case x: LitSeq[_] => // Quite possibly impossible...
        encodeRefish(name, x.head, t) match { case (k, v) => k -> Json.arr(v +: x.tail.map(serializeField).toSeq: _*) }
      case x => // this case implies we're dealing with a subclass that specifies a single type for a reffish field
        log.error("THIS CASE SHOULD BE IMPOSSIBLE")
        val value = typeSuffixMap(t.tag)
          .getOrElse(throw new RuntimeException(s"Could not find the type suffix for ${t.tag} when encoding ${name}[x]"))
        (name + value) -> serializeField(x)
    }

  def encodeComponent[T <: FHIRObject](a: T)(implicit encoderParams: EncoderParams): Json = {
    // set 'addTopLevelResourceType' to false so we don't add resourceType to any nested element fields
    val newParams: EncoderParams =
      if (encoderParams.addTopLevelResourceType) encoderParams.copy(addTopLevelResourceType = false) else encoderParams
    val fields = a.companion.baseType.fields(a)
    val fs: Seq[(String, Json)] = fields.map {
      case FHIRComponentField(meta, _) if encoderParams.stripPhantom && a.primitiveAttributes.get(meta).exists(_.phantom) =>
        "" -> Json.Null
      case FHIRComponentField(FHIRComponentFieldMeta(name, t, true, _), value) =>
        encodeRefish(name, value, t)(newParams)
      case FHIRComponentField(FHIRComponentFieldMeta(name, _, _, _), value) =>
        (name.filterNot(_ == '`'), serializeField(value)(newParams))
    }
    val resourceType: Option[(String, Json)] = a match {
      case resource: Resource => Some("resourceType" -> Json.fromString(resource.thisTypeName))
      case el: Element if encoderParams.addTopLevelResourceType =>
        Some("resourceType" -> Json.fromString(el.thisTypeName))
      case _ => None
    }
    val attributes: Seq[(String, Json)] = a.primitiveAttributes.map { case (k, v) =>
      ('_' +: k.name) -> encodeComponent(v.element)(newParams)
    }.toSeq
    Json.fromFields((resourceType.toSeq ++ fs ++ attributes).filterNot(x => x._2.isNull || x._2.asArray.exists(_.isEmpty)))
  }
  // convenience methods, primarily for calling from Java
  lazy val allGeneratedClasses: Seq[Class[_]] = model.urlLookup.values.map(_.thisClassTag.runtimeClass).toSeq
  lazy val companionClassMap: Map[Class[_], CompanionFor[_]] = allGeneratedClasses map { klass =>
    val companionObj: CompanionFor[_ <: FHIRObject] =
      Class.forName(klass.getName + "$").getField("MODULE$").get(null).asInstanceOf[CompanionFor[_ <: FHIRObject]]
    klass -> companionObj
  } toMap

  def decodeFHIRObject[T <: FHIRObject](companion: CompanionFor[T], jstr: String)(implicit
      params: DecoderParams = DecoderParams()): Try[T] =
    decode[T](jstr)(companion.decoder).left.map(new FhirDecodeError(_)).toTry

  implicit def objectEncoder[T <: FHIRObject](implicit params: EncoderParams = EncoderParams()): Encoder[T] =
    Encoder.instance(encodeComponent)

  implicit def objectDecoder[T <: FHIRObject: LTag: ClassTag](implicit params: DecoderParams = DecoderParams()): Decoder[T] =
    Decoder.instanceTry {
      decodeMethodFor[T]
    }

}
