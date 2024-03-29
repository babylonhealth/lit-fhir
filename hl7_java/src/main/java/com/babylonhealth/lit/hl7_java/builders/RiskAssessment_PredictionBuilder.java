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
import scala.Option;
import scala.jdk.javaapi.OptionConverters;
import scala.math.BigDecimal;

public interface RiskAssessment_PredictionBuilder {
  public RiskAssessment.Prediction build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public static ChoicePeriodOrRange when(Period p) {
    return new ChoicePeriodOrRange(p);
  }

  public static ChoicePeriodOrRange when(Range r) {
    return new ChoicePeriodOrRange(r);
  }

  public static ChoiceDecimalOrRange probability(BigDecimal b) {
    return new ChoiceDecimalOrRange(b);
  }

  public static ChoiceDecimalOrRange probability(Range r) {
    return new ChoiceDecimalOrRange(r);
  }

  public class Impl implements RiskAssessment_PredictionBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> outcome = Optional.empty();
    private Optional<ChoicePeriodOrRange> when = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> rationale = Optional.empty();
    private Optional<BigDecimal> relativeRisk = Optional.empty();
    private Optional<ChoiceDecimalOrRange> probability = Optional.empty();
    private Optional<CodeableConcept> qualitativeRisk = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /** Required fields for {@link RiskAssessment.Prediction} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public RiskAssessment_PredictionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param outcome */
    public RiskAssessment_PredictionBuilder.Impl withOutcome(@NonNull CodeableConcept outcome) {
      this.outcome = Optional.of(outcome);
      return this;
    }

    public RiskAssessment_PredictionBuilder.Impl withOutcome(
        @NonNull CodeableConceptBuilder outcome) {
      this.outcome = Optional.of(outcome.build());
      return this;
    }
    /**
     * @param when Field is a 'choice' field. Type should be one of Period, Range. To pass the value
     *     in, wrap with one of the RiskAssessment_PredictionBuilder.when static methods
     */
    public RiskAssessment_PredictionBuilder.Impl withWhen(@NonNull ChoicePeriodOrRange when) {
      this.when = Optional.of(when);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public RiskAssessment_PredictionBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public RiskAssessment_PredictionBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public RiskAssessment_PredictionBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param rationale */
    public RiskAssessment_PredictionBuilder.Impl withRationale(@NonNull String rationale) {
      this.rationale = Optional.of(rationale);
      return this;
    }
    /** @param relativeRisk */
    public RiskAssessment_PredictionBuilder.Impl withRelativeRisk(
        @NonNull BigDecimal relativeRisk) {
      this.relativeRisk = Optional.of(relativeRisk);
      return this;
    }
    /**
     * @param probability Field is a 'choice' field. Type should be one of BigDecimal, Range. To
     *     pass the value in, wrap with one of the RiskAssessment_PredictionBuilder.probability
     *     static methods
     */
    public RiskAssessment_PredictionBuilder.Impl withProbability(
        @NonNull ChoiceDecimalOrRange probability) {
      this.probability = Optional.of(probability);
      return this;
    }
    /** @param qualitativeRisk */
    public RiskAssessment_PredictionBuilder.Impl withQualitativeRisk(
        @NonNull CodeableConcept qualitativeRisk) {
      this.qualitativeRisk = Optional.of(qualitativeRisk);
      return this;
    }

    public RiskAssessment_PredictionBuilder.Impl withQualitativeRisk(
        @NonNull CodeableConceptBuilder qualitativeRisk) {
      this.qualitativeRisk = Optional.of(qualitativeRisk.build());
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
    public RiskAssessment_PredictionBuilder.Impl withModifierExtension(
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
    public RiskAssessment_PredictionBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public RiskAssessment_PredictionBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public RiskAssessment.Prediction build() {
      return new RiskAssessment.Prediction(
          OptionConverters.toScala(id),
          OptionConverters.toScala(outcome),
          (Option) OptionConverters.toScala(when),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(rationale),
          OptionConverters.toScala(relativeRisk),
          (Option) OptionConverters.toScala(probability),
          OptionConverters.toScala(qualitativeRisk),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
