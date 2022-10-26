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

public interface MedicinalProductIngredient_SpecifiedSubstance_StrengthBuilder {
  public MedicinalProductIngredient$SpecifiedSubstance$Strength build();

  public static Impl init(Ratio presentation) {
    return new Impl(presentation);
  }

  public static Impl builder(RatioBuilder presentation) {
    return new Impl(presentation.build());
  }

  public class Impl implements MedicinalProductIngredient_SpecifiedSubstance_StrengthBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<CodeableConcept> country = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Ratio presentation;
    private Optional<Ratio> concentration = Optional.empty();
    private Optional<String> measurementPoint = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<Ratio> presentationLowLimit = Optional.empty();
    private Optional<Ratio> concentrationLowLimit = Optional.empty();
    private Collection<MedicinalProductIngredient$SpecifiedSubstance$Strength$ReferenceStrength>
        referenceStrength = Collections.emptyList();

    /**
     * Required fields for {@link MedicinalProductIngredient$SpecifiedSubstance$Strength}
     *
     * @param presentation
     */
    public Impl(Ratio presentation) {
      this.presentation = presentation;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MedicinalProductIngredient_SpecifiedSubstance_StrengthBuilder.Impl withId(
        @NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param country */
    public MedicinalProductIngredient_SpecifiedSubstance_StrengthBuilder.Impl withCountry(
        @NonNull CodeableConcept... country) {
      this.country = Arrays.asList(country);
      return this;
    }
    /** @param country */
    public MedicinalProductIngredient_SpecifiedSubstance_StrengthBuilder.Impl withCountry(
        @NonNull Collection<CodeableConcept> country) {
      this.country = Collections.unmodifiableCollection(country);
      return this;
    }

    public MedicinalProductIngredient_SpecifiedSubstance_StrengthBuilder.Impl withCountry(
        @NonNull CodeableConceptBuilder... country) {
      this.country = Arrays.stream(country).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public MedicinalProductIngredient_SpecifiedSubstance_StrengthBuilder.Impl withExtension(
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
    public MedicinalProductIngredient_SpecifiedSubstance_StrengthBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public MedicinalProductIngredient_SpecifiedSubstance_StrengthBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param concentration */
    public MedicinalProductIngredient_SpecifiedSubstance_StrengthBuilder.Impl withConcentration(
        @NonNull Ratio concentration) {
      this.concentration = Optional.of(concentration);
      return this;
    }

    public MedicinalProductIngredient_SpecifiedSubstance_StrengthBuilder.Impl withConcentration(
        @NonNull RatioBuilder concentration) {
      this.concentration = Optional.of(concentration.build());
      return this;
    }
    /** @param measurementPoint */
    public MedicinalProductIngredient_SpecifiedSubstance_StrengthBuilder.Impl withMeasurementPoint(
        @NonNull String measurementPoint) {
      this.measurementPoint = Optional.of(measurementPoint);
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
    public MedicinalProductIngredient_SpecifiedSubstance_StrengthBuilder.Impl withModifierExtension(
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
    public MedicinalProductIngredient_SpecifiedSubstance_StrengthBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public MedicinalProductIngredient_SpecifiedSubstance_StrengthBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param presentationLowLimit */
    public MedicinalProductIngredient_SpecifiedSubstance_StrengthBuilder.Impl
        withPresentationLowLimit(@NonNull Ratio presentationLowLimit) {
      this.presentationLowLimit = Optional.of(presentationLowLimit);
      return this;
    }

    public MedicinalProductIngredient_SpecifiedSubstance_StrengthBuilder.Impl
        withPresentationLowLimit(@NonNull RatioBuilder presentationLowLimit) {
      this.presentationLowLimit = Optional.of(presentationLowLimit.build());
      return this;
    }
    /** @param concentrationLowLimit */
    public MedicinalProductIngredient_SpecifiedSubstance_StrengthBuilder.Impl
        withConcentrationLowLimit(@NonNull Ratio concentrationLowLimit) {
      this.concentrationLowLimit = Optional.of(concentrationLowLimit);
      return this;
    }

    public MedicinalProductIngredient_SpecifiedSubstance_StrengthBuilder.Impl
        withConcentrationLowLimit(@NonNull RatioBuilder concentrationLowLimit) {
      this.concentrationLowLimit = Optional.of(concentrationLowLimit.build());
      return this;
    }
    /** @param referenceStrength */
    public MedicinalProductIngredient_SpecifiedSubstance_StrengthBuilder.Impl withReferenceStrength(
        @NonNull
            MedicinalProductIngredient$SpecifiedSubstance$Strength$ReferenceStrength...
                referenceStrength) {
      this.referenceStrength = Arrays.asList(referenceStrength);
      return this;
    }
    /** @param referenceStrength */
    public MedicinalProductIngredient_SpecifiedSubstance_StrengthBuilder.Impl withReferenceStrength(
        @NonNull
            Collection<MedicinalProductIngredient$SpecifiedSubstance$Strength$ReferenceStrength>
                referenceStrength) {
      this.referenceStrength = Collections.unmodifiableCollection(referenceStrength);
      return this;
    }

    public MedicinalProductIngredient_SpecifiedSubstance_StrengthBuilder.Impl withReferenceStrength(
        @NonNull
            MedicinalProductIngredient_SpecifiedSubstance_Strength_ReferenceStrengthBuilder...
                referenceStrength) {
      this.referenceStrength =
          Arrays.stream(referenceStrength).map(e -> e.build()).collect(toList());
      return this;
    }

    public MedicinalProductIngredient$SpecifiedSubstance$Strength build() {
      return new MedicinalProductIngredient$SpecifiedSubstance$Strength(
          OptionConverters.toScala(id),
          country.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          presentation,
          OptionConverters.toScala(concentration),
          OptionConverters.toScala(measurementPoint),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(presentationLowLimit),
          OptionConverters.toScala(concentrationLowLimit),
          referenceStrength.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
