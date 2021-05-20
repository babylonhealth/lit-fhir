package com.babylonhealth.lit.core

import java.time.{ LocalDate, LocalTime, ZonedDateTime }
import java.util.UUID

import scala.collection.mutable.ArrayBuffer
import scala.concurrent.duration.Duration.Inf
import scala.concurrent.{ Await, Future, blocking }
import scala.jdk.CollectionConverters._
import scala.reflect.runtime.universe.ModuleSymbol
import scala.util.Try
import scala.collection.parallel.CollectionConverters._

import enumeratum.{ CirceEnum, Enum, EnumEntry }
import io.circe.{ Decoder, Encoder }
import io.github.classgraph.{ ClassGraph, ClassInfo, ScanResult }
import izumi.reflect.macrortti.{ LTag, LightTypeTag }
import org.slf4j.{ Logger, LoggerFactory }

import com.babylonhealth.lit.core.BaseFieldDecoders._
import com.babylonhealth.lit.core.TagSummoners.{ lTagOf, lTypeOf }
import com.babylonhealth.lit.core.serdes.objectDecoder
import com.babylonhealth.lit.core.model._

case class DecoderAndTag[T](decoder: DecoderParams => Decoder[T], typeTag: LTag[T]) {
  type Type = T
}

import BaseFieldDecoders._

package object model {
  def extractCompanionsFromPath(classPathResults: Seq[ClassInfo]): Seq[CompanionFor[_ <: FHIRObject]] = {
    import scala.concurrent.ExecutionContext.Implicits.global
    Await
      .result(
        Future.traverse(classPathResults) { c =>
          Future successful {
            val companionObj: CompanionFor[_ <: FHIRObject] = {
              val klass    = Class.forName(c.getName)
              val module   = Utils.mirror.classSymbol(klass).companion.asInstanceOf[ModuleSymbol]
              val instance = Utils.mirror.reflectModule(module).instance.asInstanceOf[CompanionFor[_ <: FHIRObject]]
              instance
            }
            companionObj
          }
        },
        Inf
      )
  }
  lazy val companionLookup: Map[String, CompanionFor[_]] = blocking {
    println("Initialising lookups")
    val startTime                             = System.currentTimeMillis
    var scanResult: ScanResult                = null
    var lookups: Map[String, CompanionFor[_]] = null
    try {
      scanResult = new ClassGraph().whitelistPackages(Config.generatedNamespaces: _*).scan()
      /// For some reason, the classloader gets stuck unless these objects are explicitly instantiated outside of the reflection...
      def classloaderBypass =
        Seq(Age, Coding, Count, Distance, Duration, Expression, Quantity, Reference, Resource)
      val classPathResults = scanResult
        .getSubclasses("com.babylonhealth.lit.core.FHIRObject")
        .filter(!_.getSimpleName.contains('$'))
        .asScala
      val companions = extractCompanionsFromPath(classPathResults.toSeq).toList

      lookups = companions.flatMap {
        case x if x.profileUrl.isEmpty =>
          println(s"FATAL ERROR: Some resource companions are missing the profileUrl field (${x.thisName})");
          sys.exit(5)
        case x if x eq x.baseType => Seq(x.thisName -> x) ++ x.profileUrl.toSeq.map(_ -> x)
        case x                    => x.profileUrl.toSeq.map(_ -> x)
      }.toMap
    } finally if (scanResult != null) scanResult.close()
    if (lookups == null || lookups.size < 35) { // 35 classes inherit from FHIRObject just in core alone...
      println("FATAL ERROR: Unable to instantiate companionLookup map")
      sys.exit(5)
    }
    println(s"Successfully created ${lookups.size} lookup mappings in ${System.currentTimeMillis - startTime}ms")
    lookups
  }

  val suffixDecoderTypeTagMap: Map[String, DecoderAndTag[_]] = Map(
    "Dosage"   -> DecoderAndTag[Dosage[Completed.type]](Dosage.decoder(_), lTagOf[Dosage[Completed.type]]),
    "Id"       -> DecoderAndTag[Id](_ => idDecoder, lTagOf[Id]),
    "Period"   -> DecoderAndTag[Period[Completed.type]](Period.decoder(_), lTagOf[Period[Completed.type]]),
    "Time"     -> DecoderAndTag[LocalTime](_ => Decoder.decodeLocalTime, lTagOf[LocalTime]),
    "Meta"     -> DecoderAndTag[Meta[Completed.type]](Meta.decoder(_), lTagOf[Meta[Completed.type]]),
    "Markdown" -> DecoderAndTag[Markdown](_ => markdownDecoder, lTagOf[Markdown]),
    "Distance" -> DecoderAndTag[Distance[Completed.type]](Distance.decoder(_), lTagOf[Distance[Completed.type]]),
    "RelatedArtifact" -> DecoderAndTag[RelatedArtifact[Completed.type]](
      RelatedArtifact.decoder(_),
      lTagOf[RelatedArtifact[Completed.type]]),
    "Code" -> DecoderAndTag[Code](_ => codeDecoder, lTagOf[Code]),
    "SampledData" -> DecoderAndTag[SampledData[Completed.type]](
      SampledData.decoder(_),
      lTagOf[SampledData[Completed.type]]),
    "Timing" -> DecoderAndTag[Timing[Completed.type]](Timing.decoder(_), lTagOf[Timing[Completed.type]]),
    "Range"  -> DecoderAndTag[Range[Completed.type]](Range.decoder(_), lTagOf[Range[Completed.type]]),
    "ParameterDefinition" -> DecoderAndTag[ParameterDefinition[Completed.type]](
      ParameterDefinition.decoder(_),
      lTagOf[ParameterDefinition[Completed.type]]),
    "HumanName"    -> DecoderAndTag[HumanName[Completed.type]](HumanName.decoder(_), lTagOf[HumanName[Completed.type]]),
    "Instant"      -> DecoderAndTag[ZonedDateTime](_ => decodeZonedDateTime, lTagOf[ZonedDateTime]),
    "Age"          -> DecoderAndTag[Age[Completed.type]](Age.decoder(_), lTagOf[Age[Completed.type]]),
    "Base64Binary" -> DecoderAndTag[Base64Binary](_ => base64BinaryDecoder, lTagOf[Base64Binary]),
    "Oid"          -> DecoderAndTag[OID](_ => oidDecoder, lTagOf[OID]),
    "PositiveInt"  -> DecoderAndTag[PositiveInt](_ => positiveIntDecoder, lTagOf[PositiveInt]),
    "Canonical"    -> DecoderAndTag[Canonical](_ => canonicalDecoder, lTagOf[Canonical]),
    "Contributor" -> DecoderAndTag[Contributor[Completed.type]](
      Contributor.decoder(_),
      lTagOf[Contributor[Completed.type]]),
    "UnsignedInt" -> DecoderAndTag[UnsignedInt](_ => unsignedIntDecoder, lTagOf[UnsignedInt]),
    "Money"       -> DecoderAndTag[Money[Completed.type]](Money.decoder(_), lTagOf[Money[Completed.type]]),
    "Boolean"     -> DecoderAndTag[Boolean](_ => Decoder.decodeBoolean, lTagOf[Boolean]),
    "UsageContext" -> DecoderAndTag[UsageContext[Completed.type]](
      UsageContext.decoder(_),
      lTagOf[UsageContext[Completed.type]]),
    "Uuid" -> DecoderAndTag[UUID](_ => Decoder.decodeUUID, lTagOf[UUID]),
    "Expression" -> DecoderAndTag[Expression[Completed.type]](
      Expression.decoder(_),
      lTagOf[Expression[Completed.type]]),
    "ContactPoint" -> DecoderAndTag[ContactPoint[Completed.type]](
      ContactPoint.decoder(_),
      lTagOf[ContactPoint[Completed.type]]),
    "Attachment" -> DecoderAndTag[Attachment[Completed.type]](
      Attachment.decoder(_),
      lTagOf[Attachment[Completed.type]]),
    "Duration" -> DecoderAndTag[Duration[Completed.type]](Duration.decoder(_), lTagOf[Duration[Completed.type]]),
    "CodeableConcept" -> DecoderAndTag[CodeableConcept[Completed.type]](
      CodeableConcept.decoder(_),
      lTagOf[CodeableConcept[Completed.type]]),
    "Address" -> DecoderAndTag[Address[Completed.type]](Address.decoder(_), lTagOf[Address[Completed.type]]),
    "String"  -> DecoderAndTag[String](_ => Decoder.decodeString, lTagOf[String]),
    "Count"   -> DecoderAndTag[Count[Completed.type]](Count.decoder(_), lTagOf[Count[Completed.type]]),
    "Coding"  -> DecoderAndTag[Coding[Completed.type]](Coding.decoder(_), lTagOf[Coding[Completed.type]]),
    "Ratio"   -> DecoderAndTag[Ratio[Completed.type]](Ratio.decoder(_), lTagOf[Ratio[Completed.type]]),
    "Identifier" -> DecoderAndTag[Identifier[Completed.type]](
      Identifier.decoder(_),
      lTagOf[Identifier[Completed.type]]),
    "Url"      -> DecoderAndTag[UrlStr](_ => urlDecoder, lTagOf[UrlStr]),
    "DateTime" -> DecoderAndTag[FHIRDateTime](_ => decodeFHIRDateTime, lTagOf[FHIRDateTime]),
    "Uri"      -> DecoderAndTag[UriStr](_ => uriDecoder, lTagOf[UriStr]),
    "DataRequirement" -> DecoderAndTag[DataRequirement[Completed.type]](
      DataRequirement.decoder(_),
      lTagOf[DataRequirement[Completed.type]]),
    "Quantity" -> DecoderAndTag[Quantity[Completed.type]](Quantity.decoder(_), lTagOf[Quantity[Completed.type]]),
    "TriggerDefinition" -> DecoderAndTag[TriggerDefinition[Completed.type]](
      TriggerDefinition.decoder(_),
      lTagOf[TriggerDefinition[Completed.type]]),
    "Signature" -> DecoderAndTag[Signature[Completed.type]](Signature.decoder(_), lTagOf[Signature[Completed.type]]),
    "Annotation" -> DecoderAndTag[Annotation[Completed.type]](
      Annotation.decoder(_),
      lTagOf[Annotation[Completed.type]]),
    "Integer"   -> DecoderAndTag[Int](_ => Decoder.decodeInt, lTagOf[Int]),
    "Reference" -> DecoderAndTag[Reference[Completed.type]](Reference.decoder(_), lTagOf[Reference[Completed.type]]),
    "ContactDetail" -> DecoderAndTag[ContactDetail[Completed.type]](
      ContactDetail.decoder(_),
      lTagOf[ContactDetail[Completed.type]]),
    "Date"    -> DecoderAndTag[FHIRDate](_ => decodeFHIRDate, lTagOf[FHIRDate]),
    "Decimal" -> DecoderAndTag[BigDecimal](_ => Decoder.decodeBigDecimal, lTagOf[BigDecimal])
  )

  val suffixTypeMap: Map[String, LightTypeTag] =
    suffixDecoderTypeTagMap.map { case (k, v) =>
      k -> v.typeTag.tag
    } + ("" -> implicitly[LTag["Any"]].tag) // TODO: does this entry still make sense?

  @deprecated("Use companionLookup or something...")
  val localClasses: Seq[LightTypeTag] = companionLookup.toSeq.sortBy(_._1).map(_._2.thisTypeTag.tag)

  val intSubSuffixes: Set[String]    = Set("Integer", "PositiveInt", "UnsignedInt")
  val stringSubSuffixes: Set[String] = Set("String", "Canonical", "Code", "Id", "Markdown", "Oid", "Uri", "Url")
  // cannot actually be a map because Type equality doesn't work 'right' -- need to do the .find(_ =:= ...) pattern...
  // TODO: Is this true? Can we make this more efficient plz?
  @deprecated("REALLY SLOW")
  val typeSuffixMap: LightTypeTag => Option[String] = {
    new {
      private val log: Logger = LoggerFactory.getLogger(getClass)
      def doLog = {
        val suffixes         = suffixTypeMap.values.toSeq
        val distinctSuffixes = suffixes.distinct
        if (distinctSuffixes.sizeCompare(suffixes) != 0) {
          val dups = ArrayBuffer(suffixes: _*)
          for (v <- distinctSuffixes) dups.remove(dups.indexOf(v))
          log.info(
            s"-->>> BAD INIT -- values for suffixTypeMap must be unique. Some clashes are: [${dups.take(5).mkString(", ")}]")
        } else log.info("-->>> GOOD INIT -- values for suffixTypeMap are unique ")
      }
    }.doLog
    // 'assert' does not work in package objects WTF
    //    assert(
    //      suffixTypeMap.values.toSeq.distinct.sizeCompare(suffixTypeMap.values) == 0,
    //      "values for suffixTypeMap must be unique")
    val seq           = suffixTypeMap.toSeq.map { case (s, t) => t -> s }
    val optionErasure = lTypeOf[Option[_]].withoutArgs
    t => {
      val unwrapped = if (t.withoutArgs =:= optionErasure) t.typeArgs.head else t
      seq.find(_._1 =:= unwrapped).map(_._2)
    }
  }
}

object UnionAliases {
  type Union01025009075[T] = CodeableConcept[T] \/ Reference[T]
  type Union01639511888[T] = Quantity[T] \/ Range[T]
  type Union_0119127717[T] = CodeableConcept[T] \/ Quantity[T] \/ Range[T] \/ Reference[T]
  type Union_0575082635[T] = Quantity[T] \/ Range[T] \/ Ratio[T]
  type Union_0731860109[T] = Duration[T] \/ Period[T] \/ Range[T]
  type Union_1051729086[T] = FHIRDate \/ FHIRDateTime \/ Reference[T] \/ Timing[T]
  type Union_1128709984[T] = Reference[T] \/ String
  type Union_1349125893[T] =
    Address[T] \/ Age[T] \/ Annotation[T] \/ Attachment[
      T] \/ Base64Binary \/ BigDecimal \/ Boolean \/ Canonical \/ Code \/ CodeableConcept[T] \/ Coding[
      T] \/ ContactDetail[T] \/ ContactPoint[T] \/ Contributor[T] \/ Count[T] \/ DataRequirement[T] \/ Distance[
      T] \/ Dosage[T] \/ Duration[T] \/ Expression[T] \/ FHIRDate \/ FHIRDateTime \/ HumanName[T] \/ Id \/ Identifier[
      T] \/ Int \/ LocalTime \/ Markdown \/ Meta[T] \/ Money[T] \/ OID \/ ParameterDefinition[T] \/ Period[
      T] \/ PositiveInt \/ Quantity[T] \/ Range[T] \/ Ratio[T] \/ Reference[T] \/ RelatedArtifact[T] \/ SampledData[
      T] \/ Signature[T] \/ String \/ Timing[T] \/ TriggerDefinition[
      T] \/ UUID \/ UnsignedInt \/ UriStr \/ UrlStr \/ UsageContext[T] \/ ZonedDateTime
  type Union_1768247138[T] = Boolean \/ CodeableConcept[T]
  type Union_1947777294[T] = Duration[T] \/ FHIRDateTime \/ Period[T]
}
