package com.babylonhealth.lit.bench

object ConstructorTypes extends Enumeration {
  val Lit, LitJ, HAPI, FHIRProto = Value
  type ConstructorTypes = Value
}
import java.time.temporal.ChronoUnit
import java.time.{ZoneId, ZonedDateTime}

import ca.uhn.fhir.context.FhirContext
import com.google.protobuf.Message
import io.circe.syntax._
import com.babylonhealth.lit.core.serdes.{objectDecoder, objectEncoder}
import com.babylonhealth.lit.protoshim.Translator
import com.babylonhealth.lit.protoshim.Translator.parser
import com.babylonhealth.lit.usbase.model.Bmi

import com.google.fhir.r4.core.ContainedResource

object RegressionBenchmarks0 extends RegressionBenchmark with ExampleConstructors {
  val loadCore          = com.babylonhealth.lit.core.Module
  val loadHl7           = com.babylonhealth.lit.hl7.Module
  val loadUsBase        = com.babylonhealth.lit.usbase.Module
  val loadUsCore        = com.babylonhealth.lit.uscore.Module
  val ts: ZonedDateTime = ZonedDateTime.now(ZoneId.of("+01:00")).truncatedTo(ChronoUnit.MILLIS)

  performance of "Bmi object construction" in {
    measure method "lit-scala" in {
      using(singleTest) in (_ => mkBmiLit(ts, 20.5, "dummy-patient-123"))
    }
    //    measure method "lit-java" in {
    //      using(singleTest) in (_ => mkBmiLitJ(ts, 20.5, "dummy-patient-123"))
    //    }
    measure method "hapi" in {
      using(singleTest) in (_ => mkBmiHapi(ts, 20.5, "dummy-patient-123"))
    }
    measure method "FHIRProto" in {
      using(singleTest) in (_ => mkProtoBMI(ts, 20.5, "dummy-patient-123"))
    }
  }

  def index: Int = 0
}

object RegressionBenchmarks_1 extends RegressionBenchmark with ExampleConstructors {
  val ts: ZonedDateTime = ZonedDateTime.now(ZoneId.of("+01:00")).truncatedTo(ChronoUnit.MILLIS)
  val bmiLit            = mkBmiLit(ts, 20.5, "dummy-patient-123")
  val bmiHapi           = mkBmiHapi(ts, 20.5, "dummy-patient-123")
  val bmiFHIRProto      = mkProtoBMI(ts, 20.5, "dummy-patient-123")
  val r4Context         = FhirContext.forR4

  performance of "json round-trip Bmi" in {
    measure method "lit-scala" in {
      using(singleTest) in (_ => io.circe.parser.decode[Bmi](bmiLit.asJson.noSpaces))
    }
    measure method "hapi" in {
      using(singleTest) in (_ =>
        r4Context.newJsonParser().parseResource(r4Context.newJsonParser().encodeResourceToString(bmiHapi)))
    }
    measure method "FHIRProto" in {
      using(singleTest) in { _ =>
        val encoded                  = Translator.printer.print(bmiFHIRProto)
        val builder: ContainedResource.Builder = com.google.fhir.r4.core.ContainedResource.newBuilder
        parser.merge(encoded, builder)
        builder.build()
      }
    }
  }

  def index: Int = -1
}


object RegressionBenchmarks_2 extends RegressionBenchmark with ExampleConstructors {
  val loadCore          = com.babylonhealth.lit.core.Module
  val loadHl7           = com.babylonhealth.lit.hl7.Module
  val loadUsBase        = com.babylonhealth.lit.usbase.Module
  val loadUsCore        = com.babylonhealth.lit.uscore.Module
  val ts: ZonedDateTime = ZonedDateTime.now(ZoneId.of("+01:00")).truncatedTo(ChronoUnit.MILLIS)

  performance of "Bmi.effective[x] construction" in {
    measure method "lit-scala" in {
      using(singleTest) in (_ => mkEffectiveChoiceLit(ts))
    }
    //    measure method "lit-java" in {
    //      using(singleTest) in (_ => mkEffectiveChoiceLitJ(ts))
    //    }
    measure method "hapi" in {
      using(singleTest) in (_ => mkEffectiveChoiceHapi(ts))
    }
    measure method "FHIRProto" in {
      using(singleTest) in (_ => mkEffectiveChoiceProto(ts))
    }
  }

  def index: Int = -2
}

object RegressionBenchmarks_3 extends RegressionBenchmark with ExampleConstructors {
  val loadCore   = com.babylonhealth.lit.core.Module
  val loadHl7    = com.babylonhealth.lit.hl7.Module
  val loadUsBase = com.babylonhealth.lit.usbase.Module
  val loadUsCore = com.babylonhealth.lit.uscore.Module
  val v          = 12.34

  performance of "Quantity construction (naive)" in {
    measure method "lit-scala" in {
      using(singleTest) in (_ => mkEffectiveQuantityLit(v))
    }
    //    measure method "lit-java" in {
    //      using(singleTest) in (_ => mkEffectiveQuantityLitJ(v))
    //    }
    measure method "hapi" in {
      using(singleTest) in (_ => mkEffectiveQuantityHapi(v))
    }
    measure method "FHIRProto" in {
      using(singleTest) in (_ => mkEffectiveQuantityProto(v))
    }
  }

  def index: Int = -3
}

object RegressionBenchmarks_4 extends RegressionBenchmark with ExampleConstructors {
  val loadCore   = com.babylonhealth.lit.core.Module
  val loadHl7    = com.babylonhealth.lit.hl7.Module
  val loadUsBase = com.babylonhealth.lit.usbase.Module
  val loadUsCore = com.babylonhealth.lit.uscore.Module
  val v          = 12.34

  performance of "Bmi.categories construction (uses LitSeq)" in {
    measure method "lit-scala" in {
      using(singleTest) in (_ => mkCategoriesLit)
    }
    //    measure method "lit-java" in {
    //      using(singleTest) in (_ => mkCategoriesLitJ)
    //    }
    measure method "hapi" in {
      using(singleTest) in (_ => mkCategoriesHapi)
    }
    measure method "FHIRProto" in {
      using(singleTest) in (_ => mkCategoriesProto)
    }
  }

  def index: Int = -4
}
