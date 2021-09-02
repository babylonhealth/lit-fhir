package com.babylonhealth.lit.uscore_java;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.time.Clock;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Scanner;

import com.babylonhealth.lit.core.model.Quantity;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.hl7.model.Account;
import com.babylonhealth.lit.hl7.model.Bundle;
import com.babylonhealth.lit.hl7.model.Observation;
import com.babylonhealth.lit.hl7.model.Patient;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.codes.AdministrativeGender;
import com.babylonhealth.lit.hl7_java.model.Unions;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase_java.builders.BmiBuilder;
import com.babylonhealth.lit.uscore_java.builders.Pediatric_bmi_for_ageBuilder;
import com.babylonhealth.lit.uscore_java.builders.Us_core_organizationBuilder;
import com.babylonhealth.lit.uscore_java.builders.Us_core_patientBuilder;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import scala.Option;
import scala.math.BigDecimal;

import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.uscore.model.*;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.codes.BundleType;
import com.babylonhealth.lit.hl7_java.codes.HttpVerb;
import com.babylonhealth.lit.core_java.codes.Languages;
import com.babylonhealth.lit.hl7_java.codes.ObservationStatus;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class JavaUsageOfLit {
  public static String toString(InputStream is) {
    Scanner s = new Scanner(is).useDelimiter("\\A");
    return s.hasNext() ? s.next() : "";
  }

  public static String slurpRsc(String path) throws URISyntaxException, IOException {
    return toString(Thread.currentThread().getContextClassLoader().getResourceAsStream(path));
  }

  public static String unsafeSlurpRsc(String path) {
    try {
      return slurpRsc(path);
    } catch (Exception e) {
      throw new RuntimeException("Could not read file:" + path, e);
    }
  }

  @Test
  public void testClassConstructionAndToString() {
    var issued = ZonedDateTime.now();
    var effective = new FHIRDateTime(ZonedDateTime.now(), LitUtils.DateTimeSpecificity.Time);
    var paedBMI =
        new Pediatric_bmi_for_ageBuilder(
                new CodeableConceptBuilder().withText("Dummy code").build(),
                ObservationStatus.UNKNOWN,
                new ReferenceBuilder().withReference("Patient/reference-123").build(),
                List.of(new CodeableConceptBuilder().withText("Some dummy concept text").build()),
                new QuantityBuilder().withValue(BigDecimal.valueOf(12.3)).build(),
                new Choice_0934386166(effective))
            .withIssued(issued)
            .withLanguage(Languages.EN_GB)
            .build();

    System.out.println(paedBMI);
    assertEquals(
        String.format(
            "Pediatric_bmi_for_age(meta = Some(Meta(profile = LitSeq(http://hl7.org/fhir/us/core/StructureDefinition/pediatric-bmi-for-age))), code = CodeableConcept(text = Some(Dummy code)), status = UNKNOWN, issued = Some(%s), subject = Reference(reference = Some(Patient/reference-123)), language = Some(EN_GB), category = LitSeq(CodeableConcept(text = Some(Some dummy concept text))), value[x]: com.babylonhealth.lit.core.model.Quantity = Quantity(value = Some(12.3)), effective[x]: DateTime = %s)",
            issued.toString(), effective.toString()),
        paedBMI.toString());
  }

  @Test
  public void testCollections() {
    var issued = ZonedDateTime.now();
    var effective = new FHIRDateTime(ZonedDateTime.now(), LitUtils.DateTimeSpecificity.Time);
    // Check either list syntax produces the same results
    var paedBMI =
        new Pediatric_bmi_for_ageBuilder(
                new CodeableConceptBuilder().withText("Dummy code").build(),
                ObservationStatus.UNKNOWN,
                new ReferenceBuilder().withReference("Patient/reference-123").build(),
                List.of(new CodeableConceptBuilder().withText("Some dummy concept text").build()),
                new QuantityBuilder().withValue(BigDecimal.valueOf(12.3)).build(),
                new Choice_0934386166(effective))
            .withIssued(issued)
            .withLanguage(Languages.EN_GB)
            .withIdentifier(
                List.of(
                    new IdentifierBuilder().withValue("foo 1").build(),
                    new IdentifierBuilder().withValue("foo 2").build()))
            .build();

    var paedBMI2 =
        new Pediatric_bmi_for_ageBuilder(
                new CodeableConceptBuilder().withText("Dummy code").build(),
                ObservationStatus.UNKNOWN,
                new ReferenceBuilder().withReference("Patient/reference-123").build(),
                List.of(new CodeableConceptBuilder().withText("Some dummy concept text").build()),
                new QuantityBuilder().withValue(BigDecimal.valueOf(12.3)).build(),
                new Choice_0934386166(effective))
            .withIssued(issued)
            .withLanguage(Languages.EN_GB)
            .withIdentifier(
                new IdentifierBuilder().withValue("foo 1").build(),
                new IdentifierBuilder().withValue("foo 2").build())
            .build();

    assertEquals(paedBMI.toString(), paedBMI2.toString());
  }

  @Test
  public void testJsonSer() throws Exception {
    var issued = ZonedDateTime.now(ZoneOffset.UTC).truncatedTo(ChronoUnit.MILLIS);
    var effective =
        new FHIRDateTime(
            ZonedDateTime.now(ZoneOffset.UTC).truncatedTo(ChronoUnit.MILLIS),
            LitUtils.DateTimeSpecificity.Time);
    var paedBMI =
        new Pediatric_bmi_for_ageBuilder(
                new CodeableConceptBuilder().withText("Dummy code").build(),
                ObservationStatus.UNKNOWN,
                new ReferenceBuilder().withReference("Patient/reference-123").build(),
                List.of(new CodeableConceptBuilder().withText("A category concept").build()),
                new QuantityBuilder().withValue(BigDecimal.valueOf(12.3)).build(),
                new Choice_0934386166(effective))
            .withIssued(issued)
            .withLanguage(Languages.EN_GB)
            .build();
    var jsony = LitUtils.encode(paedBMI);

    Pediatric_bmi_for_age decoded = LitUtils.decode(Pediatric_bmi_for_age.class, jsony);
    Pediatric_bmi_for_age decoded2 = (Pediatric_bmi_for_age) LitUtils.decodeResource(jsony);
    Pediatric_bmi_for_age decoded3 =
        (Pediatric_bmi_for_age) LitUtils.decode(Pediatric_bmi_for_age.class, jsony);
    Pediatric_bmi_for_age decoded4 = (Pediatric_bmi_for_age) LitUtils.decodeResource(jsony);

    var expected = String.format(unsafeSlurpRsc("PaedBMI.json"), effective.fmt(), issued);
    assertEquals(paedBMI, decoded);
    assertEquals(paedBMI, decoded2);
    assertEquals(paedBMI, decoded3);
    assertEquals(paedBMI, decoded4);
    JSONAssert.assertEquals(expected, jsony, false);
    JSONAssert.assertEquals(expected, jsony, true);
  }

  @Test
  public void testRefs3() throws Exception {
    Patient p = new PatientBuilder().withMultipleBirth(new Choice02065782851(true)).build();
    System.out.println(p);
  }

  @Test
  public void testRefs3_2() throws Exception {
    Patient p = new PatientBuilder().withMultipleBirth(new Choice02065782851(true)).build();
    System.out.println(p);
  }

  // No longer really makes sense
  //  @Test
  //  public void testRefs4() throws Exception {
  //    assertThrows(
  //        RuntimeException.class,
  //        () -> new PatientBuilder().withMultipleBirth("String", true).build());
  //  }

  // TODO: Test 'doesn't compile'
  //  @Test
  //  public void testRefs5() throws Exception {
  //    assertThrows(
  //        RuntimeException.class,
  //        () -> new PatientBuilder().withMultipleBirth(new Choice02065782851("X")).build());
  //  }

  @Test
  public void bundleWithDifferentResourceTypes() throws Exception {
    var effective = new FHIRDateTime(ZonedDateTime.now(), LitUtils.DateTimeSpecificity.Time);
    var babylonOrgEntry =
        new Bundle_EntryBuilder()
            .withFullUrl("urn:uuid:organization")
            .withResource(
                new Us_core_organizationBuilder("Babylon", true)
                    .withType(
                        List.of(
                            new CodeableConceptBuilder()
                                .withCoding(
                                    new CodingBuilder()
                                        .withSystem(
                                            "http://terminology.hl7.org/CodeSystem/organization-type")
                                        .withCode("prov")
                                        .build())
                                .build()))
                    .withIdentifier(
                        new IdentifierBuilder()
                            .withSystem("http://system-reference")
                            .withValue("code-reference")
                            .build())
                    .withLanguage(Languages.EN_GB)
                    .build())
            .withRequest(
                new Bundle_Entry_RequestBuilder("/Organization", HttpVerb.POST)
                    .withIfNoneExist("identifier=http://system-reference|code-reference")
                    .build())
            .build();

    var patient =
        new Bundle_EntryBuilder()
            .withFullUrl("urn:uuid:patient")
            .withResource(
                new Us_core_patientBuilder(
                        AdministrativeGender.OTHER,
                        List.of(
                            new HumanNameBuilder().withGiven("The").withFamily("Doctor").build()),
                        List.of(
                            new IdentifierBuilder()
                                .withSystem("tardis://")
                                .withValue("213")
                                .build()))
                    .withLanguage(Languages.EN_GB)
                    .withManagingOrganization(
                        new ReferenceBuilder().withReference("urn:uuid:organization").build())
                    .build())
            .withRequest(
                new Bundle_Entry_RequestBuilder("/Patient", HttpVerb.POST)
                    .withIfNoneExist(
                        "identifier=https://fhir.bbl.health/sid/babylon-patient-uuid|${patientUuid}")
                    .build())
            .build();

    var observation =
        new Bundle_EntryBuilder()
            .withFullUrl("urn:uuid:observation:bmi")
            .withResource(
                new BmiBuilder(
                        ObservationStatus.FINAL,
                        new ReferenceBuilder().withReference("urn:uuid:patient").build(),
                        List.of(
                            new CodeableConceptBuilder()
                                .withCoding(
                                    new CodingBuilder()
                                        .withSystem("http://terminology.system")
                                        .withCode("Vital signs")
                                        .build())
                                .build()),
                        new QuantityBuilder()
                            .withValue(BigDecimal.valueOf(1.23))
                            .withSystem("http://unitsofmeasure.org")
                            .withCode("${unit}")
                            .build(),
                        new Choice_0934386166(effective),
                        new CodeableConceptBuilder()
                            .withCoding(
                                new CodingBuilder()
                                    .withSystem("http://terminology.system")
                                    .withCode("code-for-bmi")
                                    .withDisplay("BMI")
                                    .build())
                            .build())
                    .withLanguage(Languages.EN_GB)
                    .build())
            .withRequest(new Bundle_Entry_RequestBuilder("/Observation", HttpVerb.POST).build())
            .build();

    var bundle =
        new BundleBuilder(BundleType.TRANSACTION)
            .withEntry(babylonOrgEntry, patient, observation)
            .build();

    var expected = String.format(unsafeSlurpRsc("HeterogeneousBundle.json"), effective.fmt());

    var bigBundleJson = LitUtils.encode(bundle);
    //    System.out.println(serdes$.MODULE$.encodeComponent(bundle).spaces2SortKeys());

    JSONAssert.assertEquals(expected, bigBundleJson, false);
    JSONAssert.assertEquals(expected, bigBundleJson, true);
    Option<FHIRDateTime> effective2 =
        bundle
            .entry()
            .find(e -> e.fullUrl().contains("urn:uuid:observation:bmi"))
            .flatMap(Bundle.Entry::resource)
            .flatMap(r -> r.toClass(Observation.class))
            .flatMap(Observation::effective)
            .flatMap(e -> e.valueToClass(FHIRDateTime.class));

    assertEquals(effective2.get().dateTime().toEpochSecond(), effective.dateTime().toEpochSecond());

    var effective3 =
        bundle
            .entry()
            .find(e -> e.fullUrl().contains("urn:uuid:observation:height"))
            .flatMap(Bundle.Entry::resource)
            .flatMap(r -> r.toClass(Observation.class))
            .flatMap(Observation::effective)
            .flatMap(e -> e.valueToClass(String.class));

    assertEquals(LitUtils.none(), effective3);

    var effective4 =
        bundle
            .entry()
            .find(e -> e.fullUrl().contains("urn:uuid:observation:height"))
            .flatMap(Bundle.Entry::resource)
            .flatMap(r -> r.toClass(Account.class));

    assertEquals(LitUtils.none(), effective4);
  }

  private Pediatric_bmi_for_age buildFromInstants(ZonedDateTime issued, ZonedDateTime effective) {
    return new Pediatric_bmi_for_ageBuilder(
            new CodeableConceptBuilder().withText("Dummy code").build(),
            ObservationStatus.UNKNOWN,
            new ReferenceBuilder().withReference("Patient/reference-123").build(),
            List.of(new CodeableConceptBuilder().withText("Some dummy concept text").build()),
            new QuantityBuilder().withValue(BigDecimal.valueOf(12.3)).build(),
            new Choice_0934386166(new FHIRDateTime(effective, LitUtils.DateTimeSpecificity.Time)))
        .withIssued(issued)
        .build();
  }

  @Test
  public void canUseLenses() {
    var issued = ZonedDateTime.now();
    var issued2 = issued.toInstant().plusMillis(5000).atZone(Clock.systemDefaultZone().getZone());
    var effective = ZonedDateTime.now();
    var bblTestResult = buildFromInstants(issued, effective);
    var bblTestResult2 =
        bblTestResult.updateIssued(
            (Option<ZonedDateTime> o) ->
                o.map(
                    e ->
                        e.toInstant()
                            .plusMillis(5000)
                            .atZone(Clock.systemDefaultZone().getZone())));
    var bblTestResult3 = buildFromInstants(issued2, effective);

    assertEquals(bblTestResult3, bblTestResult2);
  }
}
