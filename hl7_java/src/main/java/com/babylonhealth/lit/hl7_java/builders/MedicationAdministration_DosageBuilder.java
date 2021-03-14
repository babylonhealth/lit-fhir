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

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class MedicationAdministration_DosageBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<String> text = Optional.empty();
  private Optional<CodeableConcept> site = Optional.empty();
  private Optional<Quantity> dose = Optional.empty();
  private Optional<CodeableConcept> route = Optional.empty();
  private Optional<CodeableConcept> method = Optional.empty();
  private Optional<Choice<$bslash$div<Quantity, Ratio>>> rate = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();

  /** Required fields for {@link MedicationAdministration.Dosage} */
  public MedicationAdministration_DosageBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public MedicationAdministration_DosageBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param text - A human-readable narrative that contains a summary of the resource and can be
   *     used to represent the content of the resource to a human. The narrative need not encode all
   *     the structured data, but is required to contain sufficient detail to make it "clinically
   *     safe" for a human to just read the narrative. Resource definitions may define what content
   *     should be represented in the narrative to ensure clinical safety.
   */
  public MedicationAdministration_DosageBuilder withText(@NonNull String text) {
    this.text = Optional.of(text);
    return this;
  }
  /** @param site */
  public MedicationAdministration_DosageBuilder withSite(@NonNull CodeableConcept site) {
    this.site = Optional.of(site);
    return this;
  }
  /** @param dose */
  public MedicationAdministration_DosageBuilder withDose(@NonNull Quantity dose) {
    this.dose = Optional.of(dose);
    return this;
  }
  /** @param route */
  public MedicationAdministration_DosageBuilder withRoute(@NonNull CodeableConcept route) {
    this.route = Optional.of(route);
    return this;
  }
  /** @param method */
  public MedicationAdministration_DosageBuilder withMethod(@NonNull CodeableConcept method) {
    this.method = Optional.of(method);
    return this;
  }
  /** @param rate Field is a 'choice' field. Type should be one of Quantity, Ratio. */
  public <T> MedicationAdministration_DosageBuilder withRate(@NonNull T rate) {
    var guessedSuffix =
        autoSuffix(
            rate.getClass().getSimpleName(), MedicationAdministration.Dosage$.MODULE$.rate());
    return withRate(guessedSuffix, rate);
  }

  /**
   * Alternative to the 'main' withRate method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param rate - The value to be passed to the builder
   */
  public <T> MedicationAdministration_DosageBuilder withRate(String suffix, @NonNull T rate) {
    guard(rate.getClass().getSimpleName(), suffix, MedicationAdministration.Dosage$.MODULE$.rate());
    this.rate =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix, rate, MedicationAdministration.Dosage$.MODULE$.rate()));
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public MedicationAdministration_DosageBuilder withExtension(@NonNull Extension... extension) {
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
  public MedicationAdministration_DosageBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
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
  public MedicationAdministration_DosageBuilder withModifierExtension(
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
  public MedicationAdministration_DosageBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }

  public MedicationAdministration.Dosage build() {
    return new MedicationAdministration.Dosage(
        OptionConverters.toScala(id),
        OptionConverters.toScala(text),
        OptionConverters.toScala(site),
        OptionConverters.toScala(dose),
        OptionConverters.toScala(route),
        OptionConverters.toScala(method),
        OptionConverters.toScala(rate),
        extension.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}