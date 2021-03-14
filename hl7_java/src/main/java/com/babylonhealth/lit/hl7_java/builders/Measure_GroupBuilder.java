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

public class Measure_GroupBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<CodeableConcept> code = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<String> description = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<Measure$Group$Population> population = Collections.emptyList();
  private Collection<Measure$Group$Stratifier> stratifier = Collections.emptyList();

  /** Required fields for {@link Measure.Group} */
  public Measure_GroupBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public Measure_GroupBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param code */
  public Measure_GroupBuilder withCode(@NonNull CodeableConcept code) {
    this.code = Optional.of(code);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public Measure_GroupBuilder withExtension(@NonNull Extension... extension) {
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
  public Measure_GroupBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param description - A free text natural language description of the measure from a consumer's
   *     perspective.
   */
  public Measure_GroupBuilder withDescription(@NonNull String description) {
    this.description = Optional.of(description);
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
  public Measure_GroupBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public Measure_GroupBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param population */
  public Measure_GroupBuilder withPopulation(@NonNull Measure$Group$Population... population) {
    this.population = Arrays.asList(population);
    return this;
  }
  /** @param population */
  public Measure_GroupBuilder withPopulation(
      @NonNull Collection<Measure$Group$Population> population) {
    this.population = Collections.unmodifiableCollection(population);
    return this;
  }
  /** @param stratifier */
  public Measure_GroupBuilder withStratifier(@NonNull Measure$Group$Stratifier... stratifier) {
    this.stratifier = Arrays.asList(stratifier);
    return this;
  }
  /** @param stratifier */
  public Measure_GroupBuilder withStratifier(
      @NonNull Collection<Measure$Group$Stratifier> stratifier) {
    this.stratifier = Collections.unmodifiableCollection(stratifier);
    return this;
  }

  public Measure.Group build() {
    return new Measure.Group(
        OptionConverters.toScala(id),
        OptionConverters.toScala(code),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(description),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        population.stream().collect(new LitSeqJCollector<>()),
        stratifier.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
