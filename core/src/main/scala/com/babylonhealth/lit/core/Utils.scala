package com.babylonhealth.lit.core

import scala.reflect.{ ClassTag, classTag }
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
    tolerateExtensionErrors: Boolean = Config.tolerateExtensionErrors,
    decodeSpecificExtensions: Boolean = Config.decodeSpecificExtensions
)
case class EncoderParams(
    addMissingMeta: Boolean = true,
    addTopLevelResourceType: Boolean = false,
    stripPhantom: Boolean = true)

trait Utils {
  def companionClassName[T](tag: LTag[T]): String = {
    val repr = tag.tag.repr
    if (repr.contains("|")) tag.tag.longName.replace("package$.", "") // tag is for a type alias defined in core
    else if (repr.contains("::")) {
      // tag is for a nested class type (the .'s in the full path after the top level object need to be replaced with $)
      val arr          = repr.split("::")
      val (stub, full) = (arr.head, arr.last)
      val end          = full.stripPrefix(stub)
      stub + end.replace(".", "$")
    } else repr
  }
  def companionOf[T <: FHIRObject: ClassTag](implicit tag: LTag[T]): CompanionFor[T] =
    Try[CompanionFor[T]](
      Class.forName(classTag[T].runtimeClass.getName + "$").getField("MODULE$").get(null).asInstanceOf[CompanionFor[T]]
    ).fold(e => throw new RuntimeException(s"Could not get companion object for type ${tag.tag.longName}", e), identity)

  def decodeMethodFor[T <: FHIRObject: ClassTag](implicit tag: LTag[T], params: DecoderParams): HCursor => Try[T] =
    companionOf(classTag[T], tag).decoder(params)(_).toTry
}
