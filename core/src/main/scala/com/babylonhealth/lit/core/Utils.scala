package com.babylonhealth.lit.core

import scala.reflect.runtime.universe.ModuleSymbol
import scala.reflect.runtime.{ universe => ru }
import scala.util.Try

import io.circe.HCursor
import izumi.reflect.macrortti.LTag

case class DecoderParams(
    tolerantBundleDecoding: Boolean = Config.tolerantBundleDecoding,
    tolerateProfileErrors: Boolean = Config.tolerateProfileErrors,
    flexibleCardinality: Boolean = Config.flexibleCardinality,
    decodePrimitiveExtensions: Boolean = Config.decodePrimitiveExtensions,
    createPhantomValues: Boolean = Config.createPhantomValues,
    ignoreUnknownFields: Boolean = Config.ignoreUnknownFields,
    logOnBadProfile: Boolean = Config.logOnBadProfile,
    logOnMissingExtension: Boolean = Config.logOnMissingExtension,
    tolerateExtensionErrors: Boolean = Config.tolerateExtensionErrors
)
case class EncoderParams(
    addMissingMeta: Boolean = true,
    addTopLevelResourceType: Boolean = false,
    stripPhantom: Boolean = true)

object Utils {
  val mirror: ru.Mirror = ru.runtimeMirror(getClass.getClassLoader)
}
trait Utils {
  def companionClassName[T](tag: LTag[T]): String = {
    val repr = tag.tag.repr
    if (repr.contains("|")) tag.tag.longName // tag is for a type alias defined in core
    else if (repr.contains("::")) {
      // tag is for a nested class type (the .'s in the full path after the top level object need to be replaced with $)
      val arr          = repr.split("::")
      val (stub, full) = (arr.head, arr.last)
      val end          = full.stripPrefix(stub)
      stub + end.replace(".", "$")
    } else repr
  }
  def companionOf[T <: FHIRObject](implicit tag: LTag[T]): CompanionFor[T] =
    Try[CompanionFor[T]](
      Utils.mirror
        .reflectModule(
          Utils.mirror.classSymbol(Class.forName(companionClassName(tag))).companion.asInstanceOf[ModuleSymbol])
        .instance
        .asInstanceOf[CompanionFor[T]]
    ) getOrElse (throw new RuntimeException(s"Could not get companion object for type ${tag.tag.longName}"))

  def decodeMethodFor[T <: FHIRObject](implicit tag: LTag[T], params: DecoderParams): HCursor => Try[T] =
    companionOf(tag).decoder(params)(_).toTry
}
