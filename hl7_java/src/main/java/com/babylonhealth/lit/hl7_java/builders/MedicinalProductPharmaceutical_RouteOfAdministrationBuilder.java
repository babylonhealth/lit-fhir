package com.babylonhealth.lit.hl7_java.builders;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import scala.math.BigDecimal;
import scala.Option;
import scala.collection.immutable.Seq;
import scala.jdk.javaapi.CollectionConverters;
import scala.jdk.javaapi.OptionConverters;

import lombok.NonNull;

import com.babylonhealth.lit.core.FHIRComponentFieldMeta;
import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.FHIRDate;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.LitSeq;
import com.babylonhealth.lit.core.LitSeq$;
import com.babylonhealth.lit.core.NonEmptyLitSeqJCollector;
import com.babylonhealth.lit.core.Choice;
import com.babylonhealth.lit.core.Choice$;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class MedicinalProductPharmaceutical_RouteOfAdministrationBuilder {
  private Optional<String> id = Optional.empty();
  private CodeableConcept code;
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Quantity> firstDose = Optional.empty();
  private Optional<Quantity> maxSingleDose = Optional.empty();
  private Optional<Quantity> maxDosePerDay = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<Duration> maxTreatmentPeriod = Optional.empty();
  private Optional<Ratio> maxDosePerTreatmentPeriod = Optional.empty();
  private Collection<MedicinalProductPharmaceutical$RouteOfAdministration$TargetSpecies>
      targetSpecies = Collections.emptyList();

  /**
   * Required fields for {@link MedicinalProductPharmaceutical.RouteOfAdministration}
   *
   * @param code
   */
  public MedicinalProductPharmaceutical_RouteOfAdministrationBuilder(CodeableConcept code) {
    this.code = code;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public MedicinalProductPharmaceutical_RouteOfAdministrationBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public MedicinalProductPharmaceutical_RouteOfAdministrationBuilder withExtension(
      @NonNull Extension... extension) {
    this.extension = Arrays.asList(extension);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public MedicinalProductPharmaceutical_RouteOfAdministrationBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param firstDose */
  public MedicinalProductPharmaceutical_RouteOfAdministrationBuilder withFirstDose(
      @NonNull Quantity firstDose) {
    this.firstDose = Optional.of(firstDose);
    return this;
  }
  /** @param maxSingleDose */
  public MedicinalProductPharmaceutical_RouteOfAdministrationBuilder withMaxSingleDose(
      @NonNull Quantity maxSingleDose) {
    this.maxSingleDose = Optional.of(maxSingleDose);
    return this;
  }
  /** @param maxDosePerDay */
  public MedicinalProductPharmaceutical_RouteOfAdministrationBuilder withMaxDosePerDay(
      @NonNull Quantity maxDosePerDay) {
    this.maxDosePerDay = Optional.of(maxDosePerDay);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the resource and that modifies the understanding of the element
   *     that contains it and/or the understanding of the containing element's descendants. Usually
   *     modifier elements provide negation or qualification. To make the use of extensions safe and
   *     manageable, there is a strict set of governance applied to the definition and use of
   *     extensions. Though any implementer is allowed to define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public MedicinalProductPharmaceutical_RouteOfAdministrationBuilder withModifierExtension(
      @NonNull Extension... modifierExtension) {
    this.modifierExtension = Arrays.asList(modifierExtension);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the resource and that modifies the understanding of the element
   *     that contains it and/or the understanding of the containing element's descendants. Usually
   *     modifier elements provide negation or qualification. To make the use of extensions safe and
   *     manageable, there is a strict set of governance applied to the definition and use of
   *     extensions. Though any implementer is allowed to define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public MedicinalProductPharmaceutical_RouteOfAdministrationBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param maxTreatmentPeriod */
  public MedicinalProductPharmaceutical_RouteOfAdministrationBuilder withMaxTreatmentPeriod(
      @NonNull Duration maxTreatmentPeriod) {
    this.maxTreatmentPeriod = Optional.of(maxTreatmentPeriod);
    return this;
  }
  /** @param maxDosePerTreatmentPeriod */
  public MedicinalProductPharmaceutical_RouteOfAdministrationBuilder withMaxDosePerTreatmentPeriod(
      @NonNull Ratio maxDosePerTreatmentPeriod) {
    this.maxDosePerTreatmentPeriod = Optional.of(maxDosePerTreatmentPeriod);
    return this;
  }
  /** @param targetSpecies */
  public MedicinalProductPharmaceutical_RouteOfAdministrationBuilder withTargetSpecies(
      @NonNull
          MedicinalProductPharmaceutical$RouteOfAdministration$TargetSpecies... targetSpecies) {
    this.targetSpecies = Arrays.asList(targetSpecies);
    return this;
  }
  /** @param targetSpecies */
  public MedicinalProductPharmaceutical_RouteOfAdministrationBuilder withTargetSpecies(
      @NonNull
          Collection<MedicinalProductPharmaceutical$RouteOfAdministration$TargetSpecies>
              targetSpecies) {
    this.targetSpecies = Collections.unmodifiableCollection(targetSpecies);
    return this;
  }

  public MedicinalProductPharmaceutical.RouteOfAdministration build() {
    return new MedicinalProductPharmaceutical.RouteOfAdministration(
        (Option) OptionConverters.toScala(id),
        code,
        extension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(firstDose),
        (Option) OptionConverters.toScala(maxSingleDose),
        (Option) OptionConverters.toScala(maxDosePerDay),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(maxTreatmentPeriod),
        (Option) OptionConverters.toScala(maxDosePerTreatmentPeriod),
        targetSpecies.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
