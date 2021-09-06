package com.babylonhealth.lit.uscore_java;

import java.util.List;

import com.babylonhealth.lit.core.EncoderParams;
import com.babylonhealth.lit.core.FhirDecodeError;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.HumanNameBuilder;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.core_java.builders.IdentifierBuilder;
import com.babylonhealth.lit.hl7_java.builders.PatientBuilder;
import com.babylonhealth.lit.hl7_java.codes.AdministrativeGender;
import com.babylonhealth.lit.uscore.model.Us_core_patient;
import com.babylonhealth.lit.uscore_java.builders.Us_core_patientBuilder;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LitUtilsTest {

  @Test
  void testSimpleDecode() {
    var patient =
        LitUtils.decode(
            Patient.class,
            "{\"resourceType\": \"Patient\", \"identifier\": [{\"system\":\"https://fhir.bbl.health/sid/babylon-patient-uuid\", \"value\":\"${patientUuid}\"}]}");
    assertEquals(
        PatientBuilder.init()
            .withIdentifier(
                IdentifierBuilder.init()
                    .withSystem("https://fhir.bbl.health/sid/babylon-patient-uuid")
                    .withValue("${patientUuid}"))
            .build(),
        patient);
  }

  @Test
  void testSimpleDecodeToProfile() {
    var patient =
        LitUtils.decode(
            Us_core_patient.class,
            "{\"resourceType\": \"Patient\", \"gender\": \"other\", \"name\":[{\"given\":[\"The\"], \"family\":\"Doctor\"}], \"identifier\": [{\"system\":\"tardis://\", \"value\":\"213\"}]}");
    assertEquals(
        Us_core_patientBuilder.builder(
                AdministrativeGender.OTHER,
                List.of(HumanNameBuilder.init().withGiven("The").withFamily("Doctor")),
                List.of(IdentifierBuilder.init().withSystem("tardis://").withValue("213")))
            .withoutMeta()
            .build(),
        patient);
  }

  @Test
  void decodeErrorShouldIncludePathToIssue() {
    String message = "";
    try {
      LitUtils.decode(
          Patient.class, "{\"resourceType\": \"Patient\", \"name\": [{\"given\": \"Bruno\"}]}");
    } catch (FhirDecodeError e) {
      message = e.getMessage();
    }

    assertTrue(message.contains("name[0].given"), message + " should contain path 'name[0].given'");
  }

  @Test
  void decodeErrorShouldIncludeDescriptionOfIssue() {
    String message = "";
    try {
      LitUtils.decode(
          Patient.class, "{\"resourceType\": \"Patient\", \"name\": [{\"given\": \"Bruno\"}]}");
    } catch (FhirDecodeError e) {
      message = e.getMessage();
    }

    assertTrue(
        message.toLowerCase().contains("expected"), message + " should contain 'expected array'");
    assertTrue(
        message.toLowerCase().contains("array"), message + " should contain 'expected array'");
  }

  @Test
  void decodeAnElementIfItHasAResourceType() throws Exception {
    String body =
        "{\n \"resourceType\":\"Meta\","
            + "          \"profile\" : [\n"
            + "            \"https://fhir.bbl.health/StructureDefinition/BblBloodWhiteCellCountLevel\"\n"
            + "          ],\n"
            + "\"tag\": [{ \"system\":\"fooooo\"}]        }";
    var encoderParams = new EncoderParams(true, true, true);
    Element element = LitUtils.decode(Element.class, body);
    var encoded = LitUtils.encode(element, encoderParams);
    JSONAssert.assertEquals(body, encoded, true);
  }
}
