package com.babylonhealth.lit.core

import java.time.{ LocalDate, LocalTime, ZonedDateTime }
import java.util.UUID

import scala.collection.mutable.ArrayBuffer
import scala.concurrent.duration.Duration.Inf
import scala.concurrent.{ Await, Future, blocking }
import scala.jdk.CollectionConverters._
import scala.util.Try

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
  def extractModuleFromPath(classPathResults: Seq[ClassInfo]): Seq[ModuleDict] = classPathResults.map { ci =>
    val c = Class.forName(ci.getName)
    c.getField("MODULE$").get(c).asInstanceOf[ModuleDict]
  }
  lazy val urlLookup: Map[String, CompanionFor[_ <: FHIRObject]] = blocking {
    println("Initialising lookups")
    val startTime                             = System.currentTimeMillis
    var scanResult: ScanResult                = null
    var lookups: Map[String, CompanionFor[_]] = null
    try {
      scanResult = new ClassGraph().whitelistPackages(Config.generatedNamespaces: _*).scan()
      val classPathResults = scanResult
        .getSubclasses("com.babylonhealth.lit.core.ModuleDict")
        .asScala

      val modules = extractModuleFromPath(classPathResults.toSeq).toList

      lookups = modules.flatMap(_.lookup).toMap
    } finally if (scanResult != null) scanResult.close()
    if (lookups == null || lookups.size < 35) { // 35 classes inherit from FHIRObject just in core alone...
      println("FATAL ERROR: Unable to instantiate companionLookup map")
      sys.exit(5)
    }
    println(s"Successfully created ${lookups.size} lookup mappings in ${System.currentTimeMillis - startTime}ms")
    lookups
  }
  lazy val resourceTypeLookup: Map[String, CompanionFor[_ <: FHIRObject]] =
    urlLookup.collect { case (_, obj) if obj eq obj.baseType => obj.thisName -> obj }

  @deprecated("Use urlLookup or resourceTypeLookup")
  lazy val companionLookup: Map[String, CompanionFor[_ <: FHIRObject]] =
    resourceTypeLookup ++ urlLookup

  val suffixDecoderTypeTagMap: Map[String, DecoderAndTag[_]] = Map(
    "Dosage"              -> DecoderAndTag[Dosage](Dosage.decoder(_), lTagOf[Dosage]),
    "Id"                  -> DecoderAndTag[Id](_ => idDecoder, lTagOf[Id]),
    "Period"              -> DecoderAndTag[Period](Period.decoder(_), lTagOf[Period]),
    "Time"                -> DecoderAndTag[LocalTime](_ => Decoder.decodeLocalTime, lTagOf[LocalTime]),
    "Meta"                -> DecoderAndTag[Meta](Meta.decoder(_), lTagOf[Meta]),
    "Markdown"            -> DecoderAndTag[Markdown](_ => markdownDecoder, lTagOf[Markdown]),
    "Distance"            -> DecoderAndTag[Distance](Distance.decoder(_), lTagOf[Distance]),
    "RelatedArtifact"     -> DecoderAndTag[RelatedArtifact](RelatedArtifact.decoder(_), lTagOf[RelatedArtifact]),
    "Code"                -> DecoderAndTag[Code](_ => codeDecoder, lTagOf[Code]),
    "SampledData"         -> DecoderAndTag[SampledData](SampledData.decoder(_), lTagOf[SampledData]),
    "Timing"              -> DecoderAndTag[Timing](Timing.decoder(_), lTagOf[Timing]),
    "Range"               -> DecoderAndTag[Range](Range.decoder(_), lTagOf[Range]),
    "ParameterDefinition" -> DecoderAndTag[ParameterDefinition](ParameterDefinition.decoder(_), lTagOf[ParameterDefinition]),
    "HumanName"           -> DecoderAndTag[HumanName](HumanName.decoder(_), lTagOf[HumanName]),
    "Instant"             -> DecoderAndTag[ZonedDateTime](_ => decodeZonedDateTime, lTagOf[ZonedDateTime]),
    "Age"                 -> DecoderAndTag[Age](Age.decoder(_), lTagOf[Age]),
    "Base64Binary"        -> DecoderAndTag[Base64Binary](_ => base64BinaryDecoder, lTagOf[Base64Binary]),
    "Oid"                 -> DecoderAndTag[OID](_ => oidDecoder, lTagOf[OID]),
    "PositiveInt"         -> DecoderAndTag[PositiveInt](_ => positiveIntDecoder, lTagOf[PositiveInt]),
    "Canonical"           -> DecoderAndTag[Canonical](_ => canonicalDecoder, lTagOf[Canonical]),
    "Contributor"         -> DecoderAndTag[Contributor](Contributor.decoder(_), lTagOf[Contributor]),
    "UnsignedInt"         -> DecoderAndTag[UnsignedInt](_ => unsignedIntDecoder, lTagOf[UnsignedInt]),
    "Money"               -> DecoderAndTag[Money](Money.decoder(_), lTagOf[Money]),
    "Boolean"             -> DecoderAndTag[Boolean](_ => Decoder.decodeBoolean, lTagOf[Boolean]),
    "UsageContext"        -> DecoderAndTag[UsageContext](UsageContext.decoder(_), lTagOf[UsageContext]),
    "Uuid"                -> DecoderAndTag[UUID](_ => Decoder.decodeUUID, lTagOf[UUID]),
    "Expression"          -> DecoderAndTag[Expression](Expression.decoder(_), lTagOf[Expression]),
    "ContactPoint"        -> DecoderAndTag[ContactPoint](ContactPoint.decoder(_), lTagOf[ContactPoint]),
    "Attachment"          -> DecoderAndTag[Attachment](Attachment.decoder(_), lTagOf[Attachment]),
    "Duration"            -> DecoderAndTag[Duration](Duration.decoder(_), lTagOf[Duration]),
    "CodeableConcept"     -> DecoderAndTag[CodeableConcept](CodeableConcept.decoder(_), lTagOf[CodeableConcept]),
    "Address"             -> DecoderAndTag[Address](Address.decoder(_), lTagOf[Address]),
    "String"              -> DecoderAndTag[String](_ => Decoder.decodeString, lTagOf[String]),
    "Count"               -> DecoderAndTag[Count](Count.decoder(_), lTagOf[Count]),
    "Coding"              -> DecoderAndTag[Coding](Coding.decoder(_), lTagOf[Coding]),
    "Ratio"               -> DecoderAndTag[Ratio](Ratio.decoder(_), lTagOf[Ratio]),
    "Identifier"          -> DecoderAndTag[Identifier](Identifier.decoder(_), lTagOf[Identifier]),
    "Url"                 -> DecoderAndTag[UrlStr](_ => urlDecoder, lTagOf[UrlStr]),
    "DateTime"            -> DecoderAndTag[FHIRDateTime](_ => decodeFHIRDateTime, lTagOf[FHIRDateTime]),
    "Uri"                 -> DecoderAndTag[UriStr](_ => uriDecoder, lTagOf[UriStr]),
    "DataRequirement"     -> DecoderAndTag[DataRequirement](DataRequirement.decoder(_), lTagOf[DataRequirement]),
    "Quantity"            -> DecoderAndTag[Quantity](Quantity.decoder(_), lTagOf[Quantity]),
    "TriggerDefinition"   -> DecoderAndTag[TriggerDefinition](TriggerDefinition.decoder(_), lTagOf[TriggerDefinition]),
    "Signature"           -> DecoderAndTag[Signature](Signature.decoder(_), lTagOf[Signature]),
    "Annotation"          -> DecoderAndTag[Annotation](Annotation.decoder(_), lTagOf[Annotation]),
    "Integer"             -> DecoderAndTag[Int](_ => Decoder.decodeInt, lTagOf[Int]),
    "Reference"           -> DecoderAndTag[Reference](Reference.decoder(_), lTagOf[Reference]),
    "ContactDetail"       -> DecoderAndTag[ContactDetail](ContactDetail.decoder(_), lTagOf[ContactDetail]),
    "Date"                -> DecoderAndTag[FHIRDate](_ => decodeFHIRDate, lTagOf[FHIRDate]),
    "Decimal"             -> DecoderAndTag[BigDecimal](_ => Decoder.decodeBigDecimal, lTagOf[BigDecimal]),
    "Integer64"           -> DecoderAndTag[Long](_ => Decoder.decodeLong, lTagOf[Long])
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
    //new {
    //  private val log: Logger = LoggerFactory.getLogger(getClass)
    //  def doLog = {
    //    val suffixes         = suffixTypeMap.values.toSeq
    //    val distinctSuffixes = suffixes.distinct
    //    if (distinctSuffixes.sizeCompare(suffixes) != 0) {
    //      val dups = ArrayBuffer(suffixes: _*)
    //      for (v <- distinctSuffixes) dups.remove(dups.indexOf(v))
    //      log.info(
    //        s"-->>> BAD INIT -- values for suffixTypeMap must be unique. Some clashes are: [${dups.take(5).mkString(", ")}]")
    //    } else log.info("-->>> GOOD INIT -- values for suffixTypeMap are unique ")
    //  }
    //}.doLog
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
  type Union01658422381 = FHIRDate \/ FHIRDateTime \/ Reference \/ Timing
  type UnionAll =
    Address \/ Age \/ Annotation \/ Attachment \/ Base64Binary \/ BigDecimal \/ Boolean \/ Canonical \/ Code \/ CodeableConcept \/ Coding \/ ContactDetail \/ ContactPoint \/ Contributor \/ Count \/ DataRequirement \/ Distance \/ Dosage \/ Duration \/ Expression \/ FHIRDate \/ FHIRDateTime \/ HumanName \/ Id \/ Identifier \/ Int \/ Integer64 \/ LocalTime \/ Markdown \/ Meta \/ Money \/ OID \/ ParameterDefinition \/ Period \/ PositiveInt \/ Quantity \/ Range \/ Ratio \/ Reference \/ RelatedArtifact \/ SampledData \/ Signature \/ String \/ Timing \/ TriggerDefinition \/ UUID \/ UnsignedInt \/ UriStr \/ UrlStr \/ UsageContext \/ ZonedDateTime
  type UnionBooleanOrCodeableConcept   = Boolean \/ CodeableConcept
  type UnionCodeableConceptOrReference = CodeableConcept \/ Reference
  type UnionDurationOrDateTimeOrPeriod = Duration \/ FHIRDateTime \/ Period
  type UnionDurationOrPeriodOrRange    = Duration \/ Period \/ Range
  type UnionQuantityOrRange            = Quantity \/ Range
  type UnionQuantityOrRangeOrRatio     = Quantity \/ Range \/ Ratio
  type UnionReferenceOrString          = Reference \/ String
  type Union_1548929031                = CodeableConcept \/ Quantity \/ Range \/ Reference

  val Union01658422381Tag: LTag[Union01658422381]                               = LTag[Union01658422381]
  val UnionAllTag: LTag[UnionAll]                                               = LTag[UnionAll]
  val UnionBooleanOrCodeableConceptTag: LTag[UnionBooleanOrCodeableConcept]     = LTag[UnionBooleanOrCodeableConcept]
  val UnionCodeableConceptOrReferenceTag: LTag[UnionCodeableConceptOrReference] = LTag[UnionCodeableConceptOrReference]
  val UnionDurationOrDateTimeOrPeriodTag: LTag[UnionDurationOrDateTimeOrPeriod] = LTag[UnionDurationOrDateTimeOrPeriod]
  val UnionDurationOrPeriodOrRangeTag: LTag[UnionDurationOrPeriodOrRange]       = LTag[UnionDurationOrPeriodOrRange]
  val UnionQuantityOrRangeOrRatioTag: LTag[UnionQuantityOrRangeOrRatio]         = LTag[UnionQuantityOrRangeOrRatio]
  val UnionQuantityOrRangeTag: LTag[UnionQuantityOrRange]                       = LTag[UnionQuantityOrRange]
  val UnionReferenceOrStringTag: LTag[UnionReferenceOrString]                   = LTag[UnionReferenceOrString]
  val Union_1548929031Tag: LTag[Union_1548929031]                               = LTag[Union_1548929031]
}

object Module
    extends ModuleDict(
      Map(
        "http://hl7.org/fhir/StructureDefinition/Duration"            -> Duration,
        "http://hl7.org/fhir/StructureDefinition/Age"                 -> Age,
        "http://hl7.org/fhir/StructureDefinition/CodeableConcept"     -> CodeableConcept,
        "http://hl7.org/fhir/StructureDefinition/Annotation"          -> Annotation,
        "http://hl7.org/fhir/StructureDefinition/Element"             -> Element,
        "http://hl7.org/fhir/StructureDefinition/ContactDetail"       -> ContactDetail,
        "http://hl7.org/fhir/StructureDefinition/Reference"           -> Reference,
        "http://hl7.org/fhir/StructureDefinition/Attachment"          -> Attachment,
        "http://hl7.org/fhir/StructureDefinition/Count"               -> Count,
        "http://hl7.org/fhir/StructureDefinition/Base"                -> Base,
        "http://hl7.org/fhir/StructureDefinition/Timing"              -> Timing,
        "http://hl7.org/fhir/StructureDefinition/Expression"          -> Expression,
        "http://hl7.org/fhir/StructureDefinition/Signature"           -> Signature,
        "http://hl7.org/fhir/StructureDefinition/Contributor"         -> Contributor,
        "http://hl7.org/fhir/StructureDefinition/Period"              -> Period,
        "http://hl7.org/fhir/StructureDefinition/Meta"                -> Meta,
        "http://hl7.org/fhir/StructureDefinition/Money"               -> Money,
        "http://hl7.org/fhir/StructureDefinition/Address"             -> Address,
        "http://hl7.org/fhir/StructureDefinition/DataType"            -> DataType,
        "http://hl7.org/fhir/StructureDefinition/HumanName"           -> HumanName,
        "http://hl7.org/fhir/StructureDefinition/BackboneType"        -> BackboneType,
        "http://hl7.org/fhir/StructureDefinition/UsageContext"        -> UsageContext,
        "http://hl7.org/fhir/StructureDefinition/ContactPoint"        -> ContactPoint,
        "http://hl7.org/fhir/StructureDefinition/ParameterDefinition" -> ParameterDefinition,
        "http://hl7.org/fhir/StructureDefinition/Identifier"          -> Identifier,
        "http://hl7.org/fhir/StructureDefinition/BackboneElement"     -> BackboneElement,
        "http://hl7.org/fhir/StructureDefinition/Dosage"              -> Dosage,
        "http://hl7.org/fhir/StructureDefinition/Resource"            -> Resource,
        "http://hl7.org/fhir/StructureDefinition/Extension"           -> Extension,
        "http://hl7.org/fhir/StructureDefinition/Distance"            -> Distance,
        "http://hl7.org/fhir/StructureDefinition/SampledData"         -> SampledData,
        "http://hl7.org/fhir/StructureDefinition/Ratio"               -> Ratio,
        "http://hl7.org/fhir/StructureDefinition/TriggerDefinition"   -> TriggerDefinition,
        "http://hl7.org/fhir/StructureDefinition/Quantity"            -> Quantity,
        "http://hl7.org/fhir/StructureDefinition/DataRequirement"     -> DataRequirement,
        "http://hl7.org/fhir/StructureDefinition/Coding"              -> Coding,
        "http://hl7.org/fhir/StructureDefinition/Range"               -> Range,
        "http://hl7.org/fhir/StructureDefinition/RelatedArtifact"     -> RelatedArtifact
      ))
