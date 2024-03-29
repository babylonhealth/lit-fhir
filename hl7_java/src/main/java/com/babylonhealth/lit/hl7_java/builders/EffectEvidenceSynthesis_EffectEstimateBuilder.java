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

public interface EffectEvidenceSynthesis_EffectEstimateBuilder {
  public EffectEvidenceSynthesis.EffectEstimate build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements EffectEvidenceSynthesis_EffectEstimateBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> _type = Optional.empty();
    private Optional<BigDecimal> value = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Optional<CodeableConcept> variantState = Optional.empty();
    private Optional<CodeableConcept> unitOfMeasure = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<EffectEvidenceSynthesis$EffectEstimate$PrecisionEstimate> precisionEstimate =
        Collections.emptyList();

    /** Required fields for {@link EffectEvidenceSynthesis.EffectEstimate} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public EffectEvidenceSynthesis_EffectEstimateBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param _type */
    public EffectEvidenceSynthesis_EffectEstimateBuilder.Impl withType(
        @NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public EffectEvidenceSynthesis_EffectEstimateBuilder.Impl withType(
        @NonNull CodeableConceptBuilder _type) {
      this._type = Optional.of(_type.build());
      return this;
    }
    /** @param value */
    public EffectEvidenceSynthesis_EffectEstimateBuilder.Impl withValue(@NonNull BigDecimal value) {
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
    public EffectEvidenceSynthesis_EffectEstimateBuilder.Impl withExtension(
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
    public EffectEvidenceSynthesis_EffectEstimateBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public EffectEvidenceSynthesis_EffectEstimateBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param description - A free text natural language description of the effect evidence
     *     synthesis from a consumer's perspective.
     */
    public EffectEvidenceSynthesis_EffectEstimateBuilder.Impl withDescription(
        @NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /** @param variantState */
    public EffectEvidenceSynthesis_EffectEstimateBuilder.Impl withVariantState(
        @NonNull CodeableConcept variantState) {
      this.variantState = Optional.of(variantState);
      return this;
    }

    public EffectEvidenceSynthesis_EffectEstimateBuilder.Impl withVariantState(
        @NonNull CodeableConceptBuilder variantState) {
      this.variantState = Optional.of(variantState.build());
      return this;
    }
    /** @param unitOfMeasure */
    public EffectEvidenceSynthesis_EffectEstimateBuilder.Impl withUnitOfMeasure(
        @NonNull CodeableConcept unitOfMeasure) {
      this.unitOfMeasure = Optional.of(unitOfMeasure);
      return this;
    }

    public EffectEvidenceSynthesis_EffectEstimateBuilder.Impl withUnitOfMeasure(
        @NonNull CodeableConceptBuilder unitOfMeasure) {
      this.unitOfMeasure = Optional.of(unitOfMeasure.build());
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
    public EffectEvidenceSynthesis_EffectEstimateBuilder.Impl withModifierExtension(
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
    public EffectEvidenceSynthesis_EffectEstimateBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public EffectEvidenceSynthesis_EffectEstimateBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param precisionEstimate */
    public EffectEvidenceSynthesis_EffectEstimateBuilder.Impl withPrecisionEstimate(
        @NonNull EffectEvidenceSynthesis$EffectEstimate$PrecisionEstimate... precisionEstimate) {
      this.precisionEstimate = Arrays.asList(precisionEstimate);
      return this;
    }
    /** @param precisionEstimate */
    public EffectEvidenceSynthesis_EffectEstimateBuilder.Impl withPrecisionEstimate(
        @NonNull
            Collection<EffectEvidenceSynthesis$EffectEstimate$PrecisionEstimate>
                precisionEstimate) {
      this.precisionEstimate = Collections.unmodifiableCollection(precisionEstimate);
      return this;
    }

    public EffectEvidenceSynthesis_EffectEstimateBuilder.Impl withPrecisionEstimate(
        @NonNull
            EffectEvidenceSynthesis_EffectEstimate_PrecisionEstimateBuilder... precisionEstimate) {
      this.precisionEstimate =
          Arrays.stream(precisionEstimate).map(e -> e.build()).collect(toList());
      return this;
    }

    public EffectEvidenceSynthesis.EffectEstimate build() {
      return new EffectEvidenceSynthesis.EffectEstimate(
          OptionConverters.toScala(id),
          OptionConverters.toScala(_type),
          OptionConverters.toScala(value),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          OptionConverters.toScala(variantState),
          OptionConverters.toScala(unitOfMeasure),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          precisionEstimate.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
