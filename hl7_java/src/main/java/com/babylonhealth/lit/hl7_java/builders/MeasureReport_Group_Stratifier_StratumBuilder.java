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

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface MeasureReport_Group_Stratifier_StratumBuilder {
  public MeasureReport$Group$Stratifier$Stratum build();

  public static Impl init() {
    return new Impl();
  }

  public class Impl implements MeasureReport_Group_Stratifier_StratumBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> value = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Quantity> measureScore = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<MeasureReport$Group$Stratifier$Stratum$Component> component =
        Collections.emptyList();
    private Collection<MeasureReport$Group$Stratifier$Stratum$Population> population =
        Collections.emptyList();

    /** Required fields for {@link MeasureReport$Group$Stratifier$Stratum} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MeasureReport_Group_Stratifier_StratumBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param value */
    public MeasureReport_Group_Stratifier_StratumBuilder.Impl withValue(
        @NonNull CodeableConcept value) {
      this.value = Optional.of(value);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public MeasureReport_Group_Stratifier_StratumBuilder.Impl withExtension(
        @NonNull Extension... extension) {
      this.extension = Arrays.asList(extension);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public MeasureReport_Group_Stratifier_StratumBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }
    /** @param measureScore */
    public MeasureReport_Group_Stratifier_StratumBuilder.Impl withMeasureScore(
        @NonNull Quantity measureScore) {
      this.measureScore = Optional.of(measureScore);
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the resource and that modifies the understanding of the
     *     element that contains it and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer is allowed to define an
     *     extension, there is a set of requirements that SHALL be met as part of the definition of
     *     the extension. Applications processing a resource are required to check for modifier
     *     extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public MeasureReport_Group_Stratifier_StratumBuilder.Impl withModifierExtension(
        @NonNull Extension... modifierExtension) {
      this.modifierExtension = Arrays.asList(modifierExtension);
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the resource and that modifies the understanding of the
     *     element that contains it and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer is allowed to define an
     *     extension, there is a set of requirements that SHALL be met as part of the definition of
     *     the extension. Applications processing a resource are required to check for modifier
     *     extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public MeasureReport_Group_Stratifier_StratumBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }
    /** @param component */
    public MeasureReport_Group_Stratifier_StratumBuilder.Impl withComponent(
        @NonNull MeasureReport$Group$Stratifier$Stratum$Component... component) {
      this.component = Arrays.asList(component);
      return this;
    }
    /** @param component */
    public MeasureReport_Group_Stratifier_StratumBuilder.Impl withComponent(
        @NonNull Collection<MeasureReport$Group$Stratifier$Stratum$Component> component) {
      this.component = Collections.unmodifiableCollection(component);
      return this;
    }
    /** @param population */
    public MeasureReport_Group_Stratifier_StratumBuilder.Impl withPopulation(
        @NonNull MeasureReport$Group$Stratifier$Stratum$Population... population) {
      this.population = Arrays.asList(population);
      return this;
    }
    /** @param population */
    public MeasureReport_Group_Stratifier_StratumBuilder.Impl withPopulation(
        @NonNull Collection<MeasureReport$Group$Stratifier$Stratum$Population> population) {
      this.population = Collections.unmodifiableCollection(population);
      return this;
    }

    public MeasureReport$Group$Stratifier$Stratum build() {
      return new MeasureReport$Group$Stratifier$Stratum(
          OptionConverters.toScala(id),
          OptionConverters.toScala(value),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(measureScore),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          component.stream().collect(new LitSeqJCollector<>()),
          population.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
