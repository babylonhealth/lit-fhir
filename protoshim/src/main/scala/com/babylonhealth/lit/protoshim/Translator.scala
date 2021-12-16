package com.babylonhealth.lit.protoshim

import com.google.fhir.r4.core.ContainedResource
import com.google.fhir.shaded.protobuf.{ AbstractMessage, MessageOrBuilder }
import io.circe
import io.circe.parser.decode
import io.circe.syntax._

import com.babylonhealth.lit.core.serdes.{ objectDecoder, objectEncoder }
import com.babylonhealth.lit.core.model.{ Resource => LITResource }

object Translator {
  val parser: com.google.fhir.common.JsonFormat.Parser   = com.google.fhir.common.JsonFormat.getParser
  val printer: com.google.fhir.common.JsonFormat.Printer = com.google.fhir.common.JsonFormat.getPrinter

  def resourceToMessage(obj: LITResource): AbstractMessage = {
    val builder: ContainedResource.Builder = com.google.fhir.r4.core.ContainedResource.newBuilder
    parser.merge(obj.asJson.noSpaces, builder)
    builder.build()
  }

  def resourceFromMessage(proto: MessageOrBuilder): Either[circe.Error, LITResource] = {
    val json = printer.print(proto)
    decode[LITResource](json)
  }

  def resourceToBytes(obj: LITResource): Array[Byte] = {
    val builder: ContainedResource.Builder = com.google.fhir.r4.core.ContainedResource.newBuilder
    parser.merge(obj.asJson.noSpaces, builder)
    builder.build().toByteArray
  }

  def resourceFromBytes(proto: Array[Byte]): Either[circe.Error, LITResource] = {
    val builder: ContainedResource.Builder = com.google.fhir.r4.core.ContainedResource.newBuilder
    val any                                = builder.mergeFrom(proto)
    val json                               = printer.print(any.build())
    decode[LITResource](json)
  }
}
