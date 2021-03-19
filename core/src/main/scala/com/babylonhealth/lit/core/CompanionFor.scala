package com.babylonhealth.lit.core

import java.lang.reflect.Constructor

import scala.annotation.unchecked.uncheckedVariance
import scala.collection.immutable.TreeMap
import scala.reflect.ClassTag
import scala.util.{ Failure, Success, Try }

import io.circe.{ Decoder, DecodingFailure, HCursor }
import izumi.reflect.macrortti.LTag
import org.slf4j.{ Logger, LoggerFactory }

import com.babylonhealth.lit.core.model.{ Element, Resource, companionLookup }

trait OptionSugar {
  implicit class RichT[T](val t: T) {
    def seqIf(fn: T => Boolean): Seq[T] = Seq(t).filter(fn)
  }
  implicit class RichSeqT[T](val s1: Seq[T]) {
    def concatDistinct(s2: Seq[T]): Seq[T] = (s1 ++ s2).distinct
  }
}

abstract class CompanionFor[-T <: FHIRObject: LTag](implicit val thisClassTag: ClassTag[T @uncheckedVariance])
    extends JsonDecoderHelpers
    with OptionSugar {
  type ResourceType >: T <: FHIRObject
  private val log: Logger = LoggerFactory.getLogger(getClass)
  val thisName: String
  val profileUrl: Option[String] = None

  //  private val m = runtimeMirror(getClass.getClassLoader)
  //  lazy val classConstructor: Constructor[_] =
  //    thisClassTag.runtimeClass.getDeclaredConstructor(fieldsMeta.map(f => m.runtimeClass(f.tt.tag.typeSymbol.asClass)): _*)
  val classConstructor: Constructor[T @uncheckedVariance] =
    thisClassTag.runtimeClass.getDeclaredConstructors.head.asInstanceOf[Constructor[T]]

  val thisTypeTag: LTag[T @uncheckedVariance] = LTag[T @uncheckedVariance]
  def isSubTypeOf(other: CompanionFor[_]): Boolean =
    thisName == other.thisName || other.thisClassTag.runtimeClass.isAssignableFrom(thisClassTag.runtimeClass)
  val searchParams: Map[String, T => Seq[Any]] = Map.empty
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[T @uncheckedVariance]

  def decodeAttributes(cursor: HCursor)(implicit
      params: DecoderParams): TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
    if (params.decodePrimitiveExtensions) new TreeMap()(FHIRObject.metaOrdering) ++ (for {
      obj                     <- cursor.value.asObject.toSeq
      (fieldName, fieldValue) <- obj.toIterable if fieldName.head == '_'
      elementValue            <- Element.decodeThis(fieldValue.hcursor).toOption
      fieldMeta               <- fieldsMeta.find(_.name == fieldName.tail)
      phantom = params.createPhantomValues && cursor.downField(fieldName.tail).success.isEmpty
    } yield fieldMeta -> PrimitiveElementInfo(elementValue, phantom))
    else FHIRObject.emptyAtts

  def checkUnknownFields(cursor: HCursor, keys: Set[String], keyPrefixes: Seq[Set[String]])(implicit
      decoderParams: DecoderParams): Try[Unit] =
    if (decoderParams.ignoreUnknownFields) Success()
    else
      cursor.keys.toIterable.flatten.toSet diff keys match {
        case s if s.isEmpty => Success()
        case s              =>
          // Remove at most one field for each choice, so that sending e.g. both effectivePeriod + effectiveDateTime is an error
          keyPrefixes.foldLeft(s)((acc, n) => acc -- acc.find(n)) match {
            case s if s.exists(_.head != '_') =>
              Failure(
                DecodingFailure(
                  s"Failed to decode: ignoreUnknownFields is false, and the following unexpected fields were seen: ${s
                    .mkString("[", ", ", "]")}",
                  cursor.history))
            case s => Success()
          }
      }

  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]

  def cast(t: ResourceType): Try[T @uncheckedVariance] =
    fieldsFromParent(t).map(fs => classConstructor.newInstance(fs.map(_.value) :+ t.primitiveAttributes: _*))

  def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]]

  def fields(t: T): Seq[FHIRComponentField[_]]

  val baseType: CompanionFor[T]

  protected lazy val (refMetas, otherMetas) = fieldsMeta.partition(_.isRef) match {
    case (r, o) => (r.map(m => \/.validSuffixes(m.unwrappedTT).map(m.name + _)), o.map(_.name).toSet)
  }

  private def getTargetByName(target: String): Option[CompanionFor[_]] = companionLookup.get(target)

  // TODO: Consider how we might determine a priority ordering for meta.profile
  private def getTargetType(targets: Seq[String]): Option[CompanionFor[_]] =
    targets.flatMap(companionLookup.get).headOption

  def parameterisedDecode(x: HCursor, params: DecoderParams): Try[T @uncheckedVariance] = {
    def decodeThisAsThis: Try[T @uncheckedVariance] = decodeThis(x)(params)

    def decodeWithResourceType: Try[T @uncheckedVariance] =
      x.downField("resourceType").as[String] match {
        case Right(resourceTypeField) =>
          getTargetByName(resourceTypeField) match {
            case None =>
              Failure(
                DecodingFailure(
                  s"No matching profiles found (resourceType is $resourceTypeField, but no matching class was found)",
                  x.history))
            case Some(companion) =>
              Try {
                if (isSubTypeOf(companion)) {
                  log.debug(s"deserializing as $thisName")
                  decodeThisAsThis
                } else {
                  log.debug(s"deserializing as ${companion.thisName}")
                  companion.decodeThis(x)(params)
                }
              }.flatten
                .recoverWith { err =>
                  val target =
                    if (isSubTypeOf(companion) && companion.thisClassTag != thisClassTag) s" as $thisName" else ""
                  val message = s"Unable to deserialize ${companion.thisName}$target"
                  val newErr = err match {
                    case e: DecodingFailure => e.withMessage(s"$message (${e.message})")
                    case e                  => DecodingFailure(s"$message (${e.getMessage})", x.history).initCause(e)
                  }
                  Failure(newErr)
                }
                .asInstanceOf[Try[T]]
          }
        case Left(_) if thisClassTag.runtimeClass.isAssignableFrom(classOf[Resource]) =>
          Failure(
            DecodingFailure(
              "A resourceType field must be present in order to decode a json object to a FHIR resource",
              x.history))
        case Left(_) => decodeThisAsThis
      }

    x.downField("meta").downField("profile").as[Seq[String]] match {
      case Left(_) | Right(Nil) => decodeWithResourceType
      case Right(profiles) =>
        getTargetType(profiles) match {
          case None =>
            if (params.logOnBadProfile)
              log.warn(
                s"No matching meta.profile found (No classes matched any of ${profiles.mkString("[", ",", "]")}))")
            decodeWithResourceType
          case Some(companion) =>
            // if companion from profile is less specific than this class:
            (if (companion.thisClassTag.runtimeClass.isAssignableFrom(thisClassTag.runtimeClass)) {
               log.debug(s"deserializing as ${companion.thisName}")
               decodeThisAsThis
             } else {
               log.debug(s"deserializing as $thisName")
               companion.decodeThis(x)(params)
             })
              .recoverWith { error =>
                val profs = profiles.mkString("[", ",", "]")
                log.warn(
                  s"meta.profile contains $profs, but this object fails to decode as ${companion.thisName}.",
                  error)
                if (params.tolerateProfileErrors) decodeWithResourceType else Failure(error)
              }
              .asInstanceOf[Try[T]]
        }
    }
  }

  def decoder(implicit params: DecoderParams): Decoder[T @uncheckedVariance] =
    Decoder.instanceTry {
      parameterisedDecode(_, params)
    }
}
