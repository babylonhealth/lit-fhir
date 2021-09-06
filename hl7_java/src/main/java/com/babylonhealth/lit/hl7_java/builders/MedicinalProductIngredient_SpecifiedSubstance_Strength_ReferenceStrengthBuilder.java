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

public interface MedicinalProductIngredient_SpecifiedSubstance_Strength_ReferenceStrengthBuilder {
  public MedicinalProductIngredient$SpecifiedSubstance$Strength$ReferenceStrength build();

  public static Impl init(Ratio strength) {
    return new Impl(strength);
  }

  public static Impl builder(RatioBuilder strength) {
    return new Impl(strength.build());
  }

  public class Impl
      implements MedicinalProductIngredient_SpecifiedSubstance_Strength_ReferenceStrengthBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<CodeableConcept> country = Collections.emptyList();
    private Ratio strength;
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<CodeableConcept> substance = Optional.empty();
    private Optional<Ratio> strengthLowLimit = Optional.empty();
    private Optional<String> measurementPoint = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link
     * MedicinalProductIngredient$SpecifiedSubstance$Strength$ReferenceStrength}
     *
     * @param strength
     */
    public Impl(Ratio strength) {
      this.strength = strength;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public MedicinalProductIngredient_SpecifiedSubstance_Strength_ReferenceStrengthBuilder.Impl
        withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param country */
    public MedicinalProductIngredient_SpecifiedSubstance_Strength_ReferenceStrengthBuilder.Impl
        withCountry(@NonNull CodeableConcept... country) {
      this.country = Arrays.asList(country);
      return this;
    }
    /** @param country */
    public MedicinalProductIngredient_SpecifiedSubstance_Strength_ReferenceStrengthBuilder.Impl
        withCountry(@NonNull Collection<CodeableConcept> country) {
      this.country = Collections.unmodifiableCollection(country);
      return this;
    }

    public MedicinalProductIngredient_SpecifiedSubstance_Strength_ReferenceStrengthBuilder.Impl
        withCountry(@NonNull CodeableConceptBuilder... country) {
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
    public MedicinalProductIngredient_SpecifiedSubstance_Strength_ReferenceStrengthBuilder.Impl
        withExtension(@NonNull Extension... extension) {
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
    public MedicinalProductIngredient_SpecifiedSubstance_Strength_ReferenceStrengthBuilder.Impl
        withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public MedicinalProductIngredient_SpecifiedSubstance_Strength_ReferenceStrengthBuilder.Impl
        withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param substance - The ingredient substance. */
    public MedicinalProductIngredient_SpecifiedSubstance_Strength_ReferenceStrengthBuilder.Impl
        withSubstance(@NonNull CodeableConcept substance) {
      this.substance = Optional.of(substance);
      return this;
    }

    public MedicinalProductIngredient_SpecifiedSubstance_Strength_ReferenceStrengthBuilder.Impl
        withSubstance(@NonNull CodeableConceptBuilder substance) {
      this.substance = Optional.of(substance.build());
      return this;
    }
    /** @param strengthLowLimit */
    public MedicinalProductIngredient_SpecifiedSubstance_Strength_ReferenceStrengthBuilder.Impl
        withStrengthLowLimit(@NonNull Ratio strengthLowLimit) {
      this.strengthLowLimit = Optional.of(strengthLowLimit);
      return this;
    }

    public MedicinalProductIngredient_SpecifiedSubstance_Strength_ReferenceStrengthBuilder.Impl
        withStrengthLowLimit(@NonNull RatioBuilder strengthLowLimit) {
      this.strengthLowLimit = Optional.of(strengthLowLimit.build());
      return this;
    }
    /** @param measurementPoint */
    public MedicinalProductIngredient_SpecifiedSubstance_Strength_ReferenceStrengthBuilder.Impl
        withMeasurementPoint(@NonNull String measurementPoint) {
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
    public MedicinalProductIngredient_SpecifiedSubstance_Strength_ReferenceStrengthBuilder.Impl
        withModifierExtension(@NonNull Extension... modifierExtension) {
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
    public MedicinalProductIngredient_SpecifiedSubstance_Strength_ReferenceStrengthBuilder.Impl
        withModifierExtension(@NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public MedicinalProductIngredient_SpecifiedSubstance_Strength_ReferenceStrengthBuilder.Impl
        withModifierExtension(@NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public MedicinalProductIngredient$SpecifiedSubstance$Strength$ReferenceStrength build() {
      return new MedicinalProductIngredient$SpecifiedSubstance$Strength$ReferenceStrength(
          OptionConverters.toScala(id),
          country.stream().collect(new LitSeqJCollector<>()),
          strength,
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(substance),
          OptionConverters.toScala(strengthLowLimit),
          OptionConverters.toScala(measurementPoint),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
