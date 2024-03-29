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
import scala.math.BigDecimal;

public interface RiskEvidenceSynthesis_RiskEstimateBuilder {
  public RiskEvidenceSynthesis.RiskEstimate build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements RiskEvidenceSynthesis_RiskEstimateBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> _type = Optional.empty();
    private Optional<BigDecimal> value = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Optional<CodeableConcept> unitOfMeasure = Optional.empty();
    private Optional<Integer> numeratorCount = Optional.empty();
    private Optional<Integer> denominatorCount = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<RiskEvidenceSynthesis$RiskEstimate$PrecisionEstimate> precisionEstimate =
        Collections.emptyList();

    /** Required fields for {@link RiskEvidenceSynthesis.RiskEstimate} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public RiskEvidenceSynthesis_RiskEstimateBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param _type */
    public RiskEvidenceSynthesis_RiskEstimateBuilder.Impl withType(@NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public RiskEvidenceSynthesis_RiskEstimateBuilder.Impl withType(
        @NonNull CodeableConceptBuilder _type) {
      this._type = Optional.of(_type.build());
      return this;
    }
    /** @param value */
    public RiskEvidenceSynthesis_RiskEstimateBuilder.Impl withValue(@NonNull BigDecimal value) {
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
    public RiskEvidenceSynthesis_RiskEstimateBuilder.Impl withExtension(
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
    public RiskEvidenceSynthesis_RiskEstimateBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public RiskEvidenceSynthesis_RiskEstimateBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param description - A free text natural language description of the risk evidence synthesis
     *     from a consumer's perspective.
     */
    public RiskEvidenceSynthesis_RiskEstimateBuilder.Impl withDescription(
        @NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /** @param unitOfMeasure */
    public RiskEvidenceSynthesis_RiskEstimateBuilder.Impl withUnitOfMeasure(
        @NonNull CodeableConcept unitOfMeasure) {
      this.unitOfMeasure = Optional.of(unitOfMeasure);
      return this;
    }

    public RiskEvidenceSynthesis_RiskEstimateBuilder.Impl withUnitOfMeasure(
        @NonNull CodeableConceptBuilder unitOfMeasure) {
      this.unitOfMeasure = Optional.of(unitOfMeasure.build());
      return this;
    }
    /** @param numeratorCount */
    public RiskEvidenceSynthesis_RiskEstimateBuilder.Impl withNumeratorCount(
        @NonNull Integer numeratorCount) {
      this.numeratorCount = Optional.of(numeratorCount);
      return this;
    }
    /** @param denominatorCount */
    public RiskEvidenceSynthesis_RiskEstimateBuilder.Impl withDenominatorCount(
        @NonNull Integer denominatorCount) {
      this.denominatorCount = Optional.of(denominatorCount);
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
    public RiskEvidenceSynthesis_RiskEstimateBuilder.Impl withModifierExtension(
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
    public RiskEvidenceSynthesis_RiskEstimateBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public RiskEvidenceSynthesis_RiskEstimateBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param precisionEstimate */
    public RiskEvidenceSynthesis_RiskEstimateBuilder.Impl withPrecisionEstimate(
        @NonNull RiskEvidenceSynthesis$RiskEstimate$PrecisionEstimate... precisionEstimate) {
      this.precisionEstimate = Arrays.asList(precisionEstimate);
      return this;
    }
    /** @param precisionEstimate */
    public RiskEvidenceSynthesis_RiskEstimateBuilder.Impl withPrecisionEstimate(
        @NonNull
            Collection<RiskEvidenceSynthesis$RiskEstimate$PrecisionEstimate> precisionEstimate) {
      this.precisionEstimate = Collections.unmodifiableCollection(precisionEstimate);
      return this;
    }

    public RiskEvidenceSynthesis_RiskEstimateBuilder.Impl withPrecisionEstimate(
        @NonNull RiskEvidenceSynthesis_RiskEstimate_PrecisionEstimateBuilder... precisionEstimate) {
      this.precisionEstimate =
          Arrays.stream(precisionEstimate).map(e -> e.build()).collect(toList());
      return this;
    }

    public RiskEvidenceSynthesis.RiskEstimate build() {
      return new RiskEvidenceSynthesis.RiskEstimate(
          OptionConverters.toScala(id),
          OptionConverters.toScala(_type),
          OptionConverters.toScala(value),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          OptionConverters.toScala(unitOfMeasure),
          OptionConverters.toScala(numeratorCount.map(x -> (Object) x)),
          OptionConverters.toScala(denominatorCount.map(x -> (Object) x)),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          precisionEstimate.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
