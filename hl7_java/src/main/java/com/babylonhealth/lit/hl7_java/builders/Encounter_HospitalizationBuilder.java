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

public class Encounter_HospitalizationBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Reference> origin = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<CodeableConcept> admitSource = Optional.empty();
  private Optional<CodeableConcept> reAdmission = Optional.empty();
  private Optional<Reference> destination = Optional.empty();
  private Collection<CodeableConcept> dietPreference = Collections.emptyList();
  private Collection<CodeableConcept> specialCourtesy = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<CodeableConcept> specialArrangement = Collections.emptyList();
  private Optional<CodeableConcept> dischargeDisposition = Optional.empty();
  private Optional<Identifier> preAdmissionIdentifier = Optional.empty();

  /** Required fields for {@link Encounter.Hospitalization} */
  public Encounter_HospitalizationBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public Encounter_HospitalizationBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param origin */
  public Encounter_HospitalizationBuilder withOrigin(@NonNull Reference origin) {
    this.origin = Optional.of(origin);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public Encounter_HospitalizationBuilder withExtension(@NonNull Extension... extension) {
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
  public Encounter_HospitalizationBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param admitSource */
  public Encounter_HospitalizationBuilder withAdmitSource(@NonNull CodeableConcept admitSource) {
    this.admitSource = Optional.of(admitSource);
    return this;
  }
  /** @param reAdmission */
  public Encounter_HospitalizationBuilder withReAdmission(@NonNull CodeableConcept reAdmission) {
    this.reAdmission = Optional.of(reAdmission);
    return this;
  }
  /** @param destination */
  public Encounter_HospitalizationBuilder withDestination(@NonNull Reference destination) {
    this.destination = Optional.of(destination);
    return this;
  }
  /** @param dietPreference */
  public Encounter_HospitalizationBuilder withDietPreference(
      @NonNull CodeableConcept... dietPreference) {
    this.dietPreference = Arrays.asList(dietPreference);
    return this;
  }
  /** @param dietPreference */
  public Encounter_HospitalizationBuilder withDietPreference(
      @NonNull Collection<CodeableConcept> dietPreference) {
    this.dietPreference = Collections.unmodifiableCollection(dietPreference);
    return this;
  }
  /** @param specialCourtesy */
  public Encounter_HospitalizationBuilder withSpecialCourtesy(
      @NonNull CodeableConcept... specialCourtesy) {
    this.specialCourtesy = Arrays.asList(specialCourtesy);
    return this;
  }
  /** @param specialCourtesy */
  public Encounter_HospitalizationBuilder withSpecialCourtesy(
      @NonNull Collection<CodeableConcept> specialCourtesy) {
    this.specialCourtesy = Collections.unmodifiableCollection(specialCourtesy);
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
  public Encounter_HospitalizationBuilder withModifierExtension(
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
  public Encounter_HospitalizationBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param specialArrangement */
  public Encounter_HospitalizationBuilder withSpecialArrangement(
      @NonNull CodeableConcept... specialArrangement) {
    this.specialArrangement = Arrays.asList(specialArrangement);
    return this;
  }
  /** @param specialArrangement */
  public Encounter_HospitalizationBuilder withSpecialArrangement(
      @NonNull Collection<CodeableConcept> specialArrangement) {
    this.specialArrangement = Collections.unmodifiableCollection(specialArrangement);
    return this;
  }
  /** @param dischargeDisposition */
  public Encounter_HospitalizationBuilder withDischargeDisposition(
      @NonNull CodeableConcept dischargeDisposition) {
    this.dischargeDisposition = Optional.of(dischargeDisposition);
    return this;
  }
  /** @param preAdmissionIdentifier */
  public Encounter_HospitalizationBuilder withPreAdmissionIdentifier(
      @NonNull Identifier preAdmissionIdentifier) {
    this.preAdmissionIdentifier = Optional.of(preAdmissionIdentifier);
    return this;
  }

  public Encounter.Hospitalization build() {
    return new Encounter.Hospitalization(
        OptionConverters.toScala(id),
        OptionConverters.toScala(origin),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(admitSource),
        OptionConverters.toScala(reAdmission),
        OptionConverters.toScala(destination),
        dietPreference.stream().collect(new LitSeqJCollector<>()),
        specialCourtesy.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        specialArrangement.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(dischargeDisposition),
        OptionConverters.toScala(preAdmissionIdentifier),
        LitUtils.emptyMetaElMap());
  }
}
