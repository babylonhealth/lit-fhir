package com.babylonhealth.lit.uscore_java.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.babylonhealth.lit.core.model.Resource;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.CodeableConceptBuilder;
import com.babylonhealth.lit.core_java.builders.CodingBuilder;
import com.babylonhealth.lit.core_java.builders.ReferenceBuilder;
import com.babylonhealth.lit.hl7_java.codes.ObservationStatus;
import com.babylonhealth.lit.uscore.model.Us_core_smokingstatus;
import com.babylonhealth.lit.uscore_java.builders.Us_core_smokingstatusBuilder;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class SmokingstatusExampleTest {

  private ZonedDateTime time =
      ZonedDateTime.now(ZoneOffset.ofHours(5)).truncatedTo(ChronoUnit.MILLIS);

  Us_core_smokingstatus example =
      Us_core_smokingstatusBuilder.builder(
              CodeableConceptBuilder.init()
                  .withCoding(
                      CodingBuilder.init().withSystem("http://loinc.org").withCode("72166-2")),
              ObservationStatus.FINAL,
              time,
              ReferenceBuilder.init().withReference("Patient/1234567890"),
              CodeableConceptBuilder.init()
                  .withCoding(
                      CodingBuilder.init()
                          .withSystem("http://snomed.info/sct")
                          .withCode("266927001")))
          .build();

  String jsonStr =
      "{\"resourceType\":\"Observation\","
          + String.format(
              "\"meta\":{\"profile\":[\"%s\"]},", Us_core_smokingstatus.profileUrl().get())
          + "\"code\":{\"coding\":[{\"system\":\"http://loinc.org\",\"code\":\"72166-2\"}]},"
          + "\"status\":\"final\","
          + String.format(
              "\"issued\":\"%s\",", LitUtils.DateTimeSpecificity.Time.dtFormatter().format(time))
          + "\"subject\":{\"reference\":\"Patient/1234567890\"},"
          + "\"valueCodeableConcept\":{\"coding\":[{\"system\":\"http://snomed.info/sct\",\"code\":\"266927001\"}]}}";

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
