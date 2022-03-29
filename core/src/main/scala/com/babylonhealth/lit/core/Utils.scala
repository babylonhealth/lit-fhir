package com.babylonhealth.lit.core

import java.io.FileWriter

import scala.concurrent.blocking
import scala.jdk.CollectionConverters._
import scala.reflect.{ ClassTag, classTag }
import scala.util.Try

import io.circe.HCursor
import io.github.classgraph.{ ClassGraph, ClassInfo, ScanResult }
import izumi.reflect.macrortti.LTag

import com.babylonhealth.lit.common.FileUtils
import com.babylonhealth.lit.core.model.{ extractModuleFromNames, extractModuleFromPath }

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
case class EncoderParams(addMissingMeta: Boolean = true, addTopLevelResourceType: Boolean = false, stripPhantom: Boolean = true)

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
  }.replace("$$", "$")
  def companionOf[T <: FHIRObject: ClassTag](implicit tag: LTag[T]): CompanionFor[T] =
    Try[CompanionFor[T]](
      Class.forName(classTag[T].runtimeClass.getName + "$").getField("MODULE$").get(null).asInstanceOf[CompanionFor[T]]
    ).fold(e => throw new RuntimeException(s"Could not get companion object for type ${tag.tag.longName}", e), identity)

  def decodeMethodFor[T <: FHIRObject: ClassTag](implicit tag: LTag[T], params: DecoderParams): HCursor => Try[T] =
    companionOf(classTag[T], tag).decoder(params)(_).toTry
}

object Reflection extends FileUtils {
  private def runtimeInfo: Seq[ClassInfo] = {
    var scanResult: ScanResult = null
    try {
      scanResult = new ClassGraph().acceptPackages(Config.generatedNamespaces: _*).scan()
      scanResult
        .getSubclasses("com.babylonhealth.lit.core.ModuleDict")
        .asScala
        .toSeq
    } finally {
      if (scanResult != null) scanResult.close()
    }
  }
  private def runtimeScan: Seq[ModuleDict]            = extractModuleFromPath(runtimeInfo)
  private def loadScan(path: String): Seq[ModuleDict] = extractModuleFromNames(slurpRsc(path).linesIterator.map(_.trim).toSeq)
  private def classgraphScan: Seq[ModuleDict] = Config.buildTimeClassgraphLocation match {
    case Some(path) =>
      Try(loadScan(path)).fold({ t =>
        println("Failed to load cached classgraph. Falling back to runtime reflection: " + t.getMessage)
        t.printStackTrace()
        runtimeScan
      }, identity)
    case None => runtimeScan
  }
  def persistBuildtimeGraph(resourcePrefix: String): Unit = Config.buildTimeClassgraphLocation match {
    case None => throw new IllegalStateException("Can't persist a buildtime graph without specifying location")
    case Some(path) =>
      def write(location: String, contents: String): Unit = {
        val fw = new FileWriter(location)
        try fw.write(contents)
        finally fw.close()
      }
      write(s"$resourcePrefix/$path", runtimeInfo.map(_.getName).mkString("\n"))
  }

  lazy val urlLookup: Map[String, CompanionFor[_ <: FHIRObject]] = blocking {
    println("Initialising lookups")
    val startTime                             = System.currentTimeMillis
    var lookups: Map[String, CompanionFor[_]] = null
    val modules                               = classgraphScan
    lookups = modules.flatMap(_.lookup).toMap
    if (lookups == null || lookups.size < 35) { // 35 classes inherit from FHIRObject just in core alone...
      println("FATAL ERROR: Unable to instantiate companionLookup map")
      sys.exit(5)
    }
    println(s"Successfully created ${lookups.size} lookup mappings in ${System.currentTimeMillis - startTime}ms")
    lookups
  }
}
