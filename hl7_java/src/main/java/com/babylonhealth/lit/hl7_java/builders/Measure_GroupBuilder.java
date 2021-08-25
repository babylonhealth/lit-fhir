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
import com.babylonhealth.lit.core.ALL_TYPES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface Measure_GroupBuilder {
  public Measure.Group build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements Measure_GroupBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> code = Optional.empty();
    private Collection<CodeableConcept> _type = Collections.emptyList();
    private Optional<ALL_TYPES> basis = Optional.empty();
    private Optional<CodeableConcept> scoring = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Optional<CodeableConcept> scoringUnit = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<CodeableConcept> improvementNotation = Optional.empty();
    private Collection<Measure$Group$Population> population = Collections.emptyList();
    private Collection<Measure$Group$Stratifier> stratifier = Collections.emptyList();

    /** Required fields for {@link Measure.Group} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Measure_GroupBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param code */
    public Measure_GroupBuilder.Impl withCode(@NonNull CodeableConcept code) {
      this.code = Optional.of(code);
      return this;
    }

    public Measure_GroupBuilder.Impl withCode(@NonNull CodeableConceptBuilder code) {
      this.code = Optional.of(code.build());
      return this;
    }
    /**
     * @param _type - Indicates whether the measure is used to examine a process, an outcome over
     *     time, a patient-reported outcome, or a structure measure such as utilization.
     */
    public Measure_GroupBuilder.Impl withType(@NonNull CodeableConcept... _type) {
      this._type = Arrays.asList(_type);
      return this;
    }
    /**
     * @param _type - Indicates whether the measure is used to examine a process, an outcome over
     *     time, a patient-reported outcome, or a structure measure such as utilization.
     */
    public Measure_GroupBuilder.Impl withType(@NonNull Collection<CodeableConcept> _type) {
      this._type = Collections.unmodifiableCollection(_type);
      return this;
    }

    public Measure_GroupBuilder.Impl withType(@NonNull CodeableConceptBuilder... _type) {
      this._type = Arrays.stream(_type).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param basis - The population basis specifies the type of elements in the population. For a
     *     subject-based measure, this is boolean (because the subject and the population basis are
     *     the same, and the population criteria define yes/no values for each individual in the
     *     population). For measures that have a population basis that is different than the
     *     subject, this element specifies the type of the population basis. For example, an
     *     encounter-based measure has a subject of Patient and a population basis of Encounter, and
     *     the population criteria all return lists of Encounters.
     */
    public Measure_GroupBuilder.Impl withBasis(@NonNull ALL_TYPES basis) {
      this.basis = Optional.of(basis);
      return this;
    }
    /**
     * @param scoring - Indicates how the calculation is performed for the measure, including
     *     proportion, ratio, continuous-variable, and cohort. The value set is extensible, allowing
     *     additional measure scoring types to be represented.
     */
    public Measure_GroupBuilder.Impl withScoring(@NonNull CodeableConcept scoring) {
      this.scoring = Optional.of(scoring);
      return this;
    }

    public Measure_GroupBuilder.Impl withScoring(@NonNull CodeableConceptBuilder scoring) {
      this.scoring = Optional.of(scoring.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public Measure_GroupBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Measure_GroupBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Measure_GroupBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param description - A free text natural language description of the measure from a
     *     consumer's perspective.
     */
    public Measure_GroupBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /**
     * @param scoringUnit - Defines the expected units of measure for the measure score. This
     *     element SHOULD be specified as a UCUM unit.
     */
    public Measure_GroupBuilder.Impl withScoringUnit(@NonNull CodeableConcept scoringUnit) {
      this.scoringUnit = Optional.of(scoringUnit);
      return this;
    }

    public Measure_GroupBuilder.Impl withScoringUnit(@NonNull CodeableConceptBuilder scoringUnit) {
      this.scoringUnit = Optional.of(scoringUnit.build());
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
    public Measure_GroupBuilder.Impl withModifierExtension(
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
    public Measure_GroupBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Measure_GroupBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param improvementNotation - Information on whether an increase or decrease in score is the
     *     preferred result (e.g., a higher score indicates better quality OR a lower score
     *     indicates better quality OR quality is within a range).
     */
    public Measure_GroupBuilder.Impl withImprovementNotation(
        @NonNull CodeableConcept improvementNotation) {
      this.improvementNotation = Optional.of(improvementNotation);
      return this;
    }

    public Measure_GroupBuilder.Impl withImprovementNotation(
        @NonNull CodeableConceptBuilder improvementNotation) {
      this.improvementNotation = Optional.of(improvementNotation.build());
      return this;
    }
    /** @param population */
    public Measure_GroupBuilder.Impl withPopulation(
        @NonNull Measure$Group$Population... population) {
      this.population = Arrays.asList(population);
      return this;
    }
    /** @param population */
    public Measure_GroupBuilder.Impl withPopulation(
        @NonNull Collection<Measure$Group$Population> population) {
      this.population = Collections.unmodifiableCollection(population);
      return this;
    }

    public Measure_GroupBuilder.Impl withPopulation(
        @NonNull Measure_Group_PopulationBuilder... population) {
      this.population = Arrays.stream(population).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param stratifier */
    public Measure_GroupBuilder.Impl withStratifier(
        @NonNull Measure$Group$Stratifier... stratifier) {
      this.stratifier = Arrays.asList(stratifier);
      return this;
    }
    /** @param stratifier */
    public Measure_GroupBuilder.Impl withStratifier(
        @NonNull Collection<Measure$Group$Stratifier> stratifier) {
      this.stratifier = Collections.unmodifiableCollection(stratifier);
      return this;
    }

    public Measure_GroupBuilder.Impl withStratifier(
        @NonNull Measure_Group_StratifierBuilder... stratifier) {
      this.stratifier = Arrays.stream(stratifier).map(e -> e.build()).collect(toList());
      return this;
    }

    public Measure.Group build() {
      return new Measure.Group(
          OptionConverters.toScala(id),
          OptionConverters.toScala(code),
          _type.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(basis),
          OptionConverters.toScala(scoring),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          OptionConverters.toScala(scoringUnit),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(improvementNotation),
          population.stream().collect(new LitSeqJCollector<>()),
          stratifier.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
