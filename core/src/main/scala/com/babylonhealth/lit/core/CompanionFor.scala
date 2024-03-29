package com.babylonhealth.lit.core

import java.lang.reflect.Constructor

import scala.annotation.unchecked.uncheckedVariance
import scala.collection.immutable.TreeMap
import scala.reflect.ClassTag
import scala.util.{ Failure, Success, Try }

import io.circe.{ Decoder, DecodingFailure, HCursor }
import izumi.reflect.macrortti.LTag
import org.slf4j.{ Logger, LoggerFactory }

import com.babylonhealth.lit.core.model.{ Element, Extension, Resource, resourceTypeLookup, urlLookup }

trait OptionSugar {
  implicit class RichT[T](val t: T) {
    def seqIf(fn: T => Boolean): Seq[T] = Seq(t).filter(fn)
  }
  implicit class RichSeqT[T](val s1: Seq[T]) {
    def concatDistinct(s2: Seq[T]): Seq[T] = (s1 ++ s2).distinct
  }
}

case class ObjectAndCompanion[O <: FHIRObject: LTag: ClassTag, C <: CompanionFor[_]](o: O, c: C) {
  // normal field manipulation
  def update[T](fieldSelection: C => FHIRComponentFieldMeta[T])(fn: T => T): O =
    o.updateFromField[T, O](fieldSelection(c))(fn)
  def set[T](fieldSelection: C => FHIRComponentFieldMeta[T])(value: T): O =
    o.setFromField[T, O](fieldSelection(c))(value)
  def updateIfExists[T](fieldSelection: C => FHIRComponentFieldMeta[Option[T]])(fn: T => T): O =
    o.updateFromField[Option[T], O](fieldSelection(c))(_ map fn)
  def updateAll[T](fieldSelection: C => FHIRComponentFieldMeta[LitSeq[T]])(fn: T => T): O =
    o.updateFromField[LitSeq[T], O](fieldSelection(c))(_ map fn)
  // Dummy implicit is required to stop the types of this function and the preceding from being the same after erasure
  def updateAll[T](fieldSelection: C => FHIRComponentFieldMeta[NonEmptyLitSeq[T]])(fn: T => T)(implicit dummy: DummyImplicit): O =
    o.updateFromField[NonEmptyLitSeq[T], O](fieldSelection(c))(_ map fn)
  // primitive element field manipulation (could/should require that the type param T of the field isn't a FHIRObject...)
  def updateExtensions(field: C => FHIRComponentFieldMeta[_])(update: LitSeq[Extension] => LitSeq[Extension]): O =
    o.extensions.update(field(c))(update)
  def updateIds(field: C => FHIRComponentFieldMeta[_])(update: Option[String] => Option[String]): O =
    o.ids.update(field(c))(update)
  def setExtensions(field: C => FHIRComponentFieldMeta[_])(extension: LitSeq[Extension]): O =
    o.extensions.set(field(c))(extension)
  def setIds(field: C => FHIRComponentFieldMeta[_])(id: Option[String]): O    = o.ids.set(field(c))(id)
  def getExtensions(field: C => FHIRComponentFieldMeta[_]): LitSeq[Extension] = o.extensions.get(field(c))
  def getIds(field: C => FHIRComponentFieldMeta[_]): Option[String]           = o.ids.get(field(c))
}

abstract class CompanionFor[-T <: FHIRObject: LTag: ClassTag] extends JsonDecoderHelpers with OptionSugar {
  type ResourceType >: T <: FHIRObject
  type ParentType >: T <: FHIRObject
  private val log: Logger                          = LoggerFactory.getLogger(getClass)
  val thisClassTag: ClassTag[T @uncheckedVariance] = implicitly[ClassTag[T]]
  val thisName: String
  val profileUrl: Option[String] = None

  def extract[O](fn: this.type => FHIRComponentFieldMeta[O])(t: T): O = {
    val target: FHIRComponentFieldMeta[O] = fn(this)
    // TODO: This would be more efficient if fields returned e.g. an ordered map..
    fields(t).collectFirst { case FHIRComponentField(`target`, value) => value.asInstanceOf[O] }.get
  }

  final private[core] def leastParentWithField(
      f: FHIRComponentFieldMeta[_],
      chain: List[CompanionFor[_ <: ResourceType]] = Nil
  ): CompanionFor[_ <: ResourceType] = {
    if (fieldsMeta.contains(f)) this.asInstanceOf[CompanionFor[_ <: ResourceType]]
    else if (parentType eq this)
      throw new RuntimeException(s"Unable to find field matching $f in ${chain.map(_.thisName).mkString(" <: ")}")
    else
      parentType
        .leastParentWithField(f, chain.asInstanceOf[List[CompanionFor[_ <: parentType.ResourceType]]] :+ this)
        .asInstanceOf[CompanionFor[_ <: ResourceType]]
  }
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
    if (decoderParams.ignoreUnknownFields) Success(())
    else
      cursor.keys.toIterable.flatten.toSet diff (keys + "resourceType") match {
        case s if s.isEmpty => Success(())
        case s              =>
          // Remove at most one field for each choice, so that sending e.g. both effectivePeriod + effectiveDateTime is an error
          keyPrefixes.foldLeft(s)((acc, n) => acc -- acc.find(n)) match {
            case s if s.exists(_.head != '_') =>
              Failure(
                DecodingFailure(
                  s"Failed to decode: ignoreUnknownFields is false, and the following unexpected fields were seen: ${s
                      .mkString("[", ", ", "]")}",
                  cursor.history))
            case s => Success(())
          }
      }

  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]

  def cast(t: ResourceType): Try[T @uncheckedVariance] =
    fieldsFromParent(t).map(fs => classConstructor.newInstance(fs.map(_.value) :+ t.primitiveAttributes: _*))

  def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]]

  def fields(t: T): Seq[FHIRComponentField[_]]

  val parentType: CompanionFor[ParentType]

  val baseType: CompanionFor[T]

  protected lazy val (refMetas, otherMetas) = fieldsMeta.partition(_.isRef) match {
    case (r, o) =>
      (r.map(m => \/.validSuffixes[m.Type](m.unwrappedTT.asInstanceOf[LTag[m.Type]]).map(m.name + _)), o.map(_.name).toSet)
  }

  // TODO: Consider how we might determine a priority ordering for meta.profile
  private def getTargetProfile(targets: Seq[String]): Option[CompanionFor[_]] =
    targets.flatMap(urlLookup.get).headOption
  private def getTargetType(target: String): Option[CompanionFor[_]] =
    resourceTypeLookup.get(target)

  def parameterisedDecode(x: HCursor, params: DecoderParams): Try[T @uncheckedVariance] =
    if (!x.value.isObject) Failure(DecodingFailure(s"Cannot decode a json ${x.value.name} as a FHIR object", x.history))
    else {
      def decodeThisAsThis: Try[T @uncheckedVariance] = decodeThis(x)(params)

      def decodeWithResourceType: Try[T @uncheckedVariance] =
        x.downField("resourceType").as[String] match {
          case Right(resourceTypeField) =>
            getTargetType(resourceTypeField) match {
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
                  .recoverWith { case err: Throwable =>
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
          getTargetProfile(profiles) match {
            case None =>
              if (params.logOnBadProfile)
                log.warn(s"No matching meta.profile found (No classes matched any of ${profiles.mkString("[", ",", "]")}))")
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
              .recoverWith { case error: Throwable =>
                val profs = profiles.mkString("[", ",", "]")
                log.warn(s"meta.profile contains $profs, but this object fails to decode as ${companion.thisName}.", error)
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
