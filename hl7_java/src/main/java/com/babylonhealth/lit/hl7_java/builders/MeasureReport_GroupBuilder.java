package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface MeasureReport_GroupBuilder {
  public MeasureReport.Group build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements MeasureReport_GroupBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> code = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Quantity> measureScore = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<MeasureReport$Group$Population> population = Collections.emptyList();
    private Collection<MeasureReport$Group$Stratifier> stratifier = Collections.emptyList();

    /** Required fields for {@link MeasureReport.Group} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MeasureReport_GroupBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param code */
    public MeasureReport_GroupBuilder.Impl withCode(@NonNull CodeableConcept code) {
      this.code = Optional.of(code);
      return this;
    }

    public MeasureReport_GroupBuilder.Impl withCode(@NonNull CodeableConceptBuilder code) {
      this.code = Optional.of(code.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public MeasureReport_GroupBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public MeasureReport_GroupBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public MeasureReport_GroupBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param measureScore */
    public MeasureReport_GroupBuilder.Impl withMeasureScore(@NonNull Quantity measureScore) {
      this.measureScore = Optional.of(measureScore);
      return this;
    }

    public MeasureReport_GroupBuilder.Impl withMeasureScore(@NonNull QuantityBuilder measureScore) {
      this.measureScore = Optional.of(measureScore.build());
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
    public MeasureReport_GroupBuilder.Impl withModifierExtension(
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
    public MeasureReport_GroupBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public MeasureReport_GroupBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param population */
    public MeasureReport_GroupBuilder.Impl withPopulation(
        @NonNull MeasureReport$Group$Population... population) {
      this.population = Arrays.asList(population);
      return this;
    }
    /** @param population */
    public MeasureReport_GroupBuilder.Impl withPopulation(
        @NonNull Collection<MeasureReport$Group$Population> population) {
      this.population = Collections.unmodifiableCollection(population);
      return this;
    }

    public MeasureReport_GroupBuilder.Impl withPopulation(
        @NonNull MeasureReport_Group_PopulationBuilder... population) {
      this.population = Arrays.stream(population).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param stratifier */
    public MeasureReport_GroupBuilder.Impl withStratifier(
        @NonNull MeasureReport$Group$Stratifier... stratifier) {
      this.stratifier = Arrays.asList(stratifier);
      return this;
    }
    /** @param stratifier */
    public MeasureReport_GroupBuilder.Impl withStratifier(
        @NonNull Collection<MeasureReport$Group$Stratifier> stratifier) {
      this.stratifier = Collections.unmodifiableCollection(stratifier);
      return this;
    }

    public MeasureReport_GroupBuilder.Impl withStratifier(
        @NonNull MeasureReport_Group_StratifierBuilder... stratifier) {
      this.stratifier = Arrays.stream(stratifier).map(e -> e.build()).collect(toList());
      return this;
    }

    public MeasureReport.Group build() {
      return new MeasureReport.Group(
          OptionConverters.toScala(id),
          OptionConverters.toScala(code),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(measureScore),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          population.stream().collect(new LitSeqJCollector<>()),
          stratifier.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
