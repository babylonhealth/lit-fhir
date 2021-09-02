package com.babylonhealth.lit.uscore_java.examples;

import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.FHIRDateTimeSpecificity;
import com.babylonhealth.lit.core.model.Resource;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.CodeableConceptBuilder;
import com.babylonhealth.lit.core_java.builders.CodingBuilder;
import com.babylonhealth.lit.core_java.builders.QuantityBuilder;
import com.babylonhealth.lit.core_java.builders.ReferenceBuilder;
import com.babylonhealth.lit.hl7_java.codes.ObservationStatus;
import com.babylonhealth.lit.uscore.model.Us_core_pulse_oximetry;
import com.babylonhealth.lit.uscore.model.Us_core_pulse_oximetry$;
import com.babylonhealth.lit.uscore_java.builders.Us_core_pulse_oximetryBuilder;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import scala.math.BigDecimal;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Pulse_oximetryExampleTest {

  private FHIRDateTime time =
      new FHIRDateTime(
          ZonedDateTime.now(ZoneOffset.ofHours(5)).truncatedTo(ChronoUnit.MILLIS),
          LitUtils.DateTimeSpecificity.Time);

  Us_core_pulse_oximetry example =
      new Us_core_pulse_oximetryBuilder(
              ObservationStatus.FINAL,
              new ReferenceBuilder().withReference("Patient/1234567890").build(),
              List.of(
                  new CodeableConceptBuilder()
                      .withCoding(
                          new CodingBuilder()
                              .withSystem(
                                  "http://terminology.hl7.org/CodeSystem/observation-category")
                              .withCode("vital-signs")
                              .build())
                      .build()),
              time,
              new CodeableConceptBuilder()
                  .withCoding(
                      new CodingBuilder().withSystem("http://loinc.org").withCode("2708-6").build(),
                      new CodingBuilder()
                          .withSystem("http://loinc.org")
                          .withCode("59408-5")
                          .build())
                  .build())
          .withValue(
              new QuantityBuilder()
                  .withSystem("http://unitsofmeasure.org")
                  .withValue(BigDecimal.valueOf(94.3))
                  .withCode("%")
                  .withUnit("%")
                  .build())
          .build();

  String jsonStr =
      "{\"resourceType\":\"Observation\","
          + String.format(
              "\"meta\":{\"profile\":[\"%s\"]},",
              Us_core_pulse_oximetry$.MODULE$.profileUrl().get())
          + "\"code\":{\"coding\":[{\"system\":\"http://loinc.org\",\"code\":\"2708-6\"},{\"system\":\"http://loinc.org\",\"code\":\"59408-5\"}]},"
          + "\"status\":\"final\","
          + "\"subject\":{\"reference\":\"Patient/1234567890\"},"
          + "\"category\":[{\"coding\":[{\"system\":\"http://terminology.hl7.org/CodeSystem/observation-category\",\"code\":\"vital-signs\"}]}],"
          + String.format("\"effectiveDateTime\":\"%s\",", time.fmt())
          + "\"valueQuantity\":{\"system\":\"http://unitsofmeasure.org\",\"code\":\"%\",\"unit\":\"%\",\"value\":94.3}}";

  @Test
  public void testEncodes() throws Exception {
    String exampleAsJson = LitUtils.encode(example);
    JSONAssert.assertEquals(jsonStr, exampleAsJson, true);
  }

  @Test
  public void testDecodes() {
    Resource jsonAsResource = LitUtils.decodeResource(jsonStr);
    assertEquals(example, jsonAsResource);
  }
}
