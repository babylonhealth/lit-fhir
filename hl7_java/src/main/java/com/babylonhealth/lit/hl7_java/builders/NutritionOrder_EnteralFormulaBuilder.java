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

public interface NutritionOrder_EnteralFormulaBuilder {
  public NutritionOrder.EnteralFormula build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements NutritionOrder_EnteralFormulaBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<CodeableConcept> additiveType = Optional.empty();
    private Optional<Quantity> caloricDensity = Optional.empty();
    private Optional<CodeableConcept> baseFormulaType = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<Quantity> maxVolumeToDeliver = Optional.empty();
    private Optional<String> additiveProductName = Optional.empty();
    private Optional<CodeableConcept> routeofAdministration = Optional.empty();
    private Optional<String> baseFormulaProductName = Optional.empty();
    private Optional<String> administrationInstruction = Optional.empty();
    private Collection<NutritionOrder$EnteralFormula$Administration> administration =
        Collections.emptyList();

    /** Required fields for {@link NutritionOrder.EnteralFormula} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public NutritionOrder_EnteralFormulaBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public NutritionOrder_EnteralFormulaBuilder.Impl withExtension(
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
    public NutritionOrder_EnteralFormulaBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public NutritionOrder_EnteralFormulaBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param additiveType */
    public NutritionOrder_EnteralFormulaBuilder.Impl withAdditiveType(
        @NonNull CodeableConcept additiveType) {
      this.additiveType = Optional.of(additiveType);
      return this;
    }

    public NutritionOrder_EnteralFormulaBuilder.Impl withAdditiveType(
        @NonNull CodeableConceptBuilder additiveType) {
      this.additiveType = Optional.of(additiveType.build());
      return this;
    }
    /** @param caloricDensity */
    public NutritionOrder_EnteralFormulaBuilder.Impl withCaloricDensity(
        @NonNull Quantity caloricDensity) {
      this.caloricDensity = Optional.of(caloricDensity);
      return this;
    }

    public NutritionOrder_EnteralFormulaBuilder.Impl withCaloricDensity(
        @NonNull QuantityBuilder caloricDensity) {
      this.caloricDensity = Optional.of(caloricDensity.build());
      return this;
    }
    /** @param baseFormulaType */
    public NutritionOrder_EnteralFormulaBuilder.Impl withBaseFormulaType(
        @NonNull CodeableConcept baseFormulaType) {
      this.baseFormulaType = Optional.of(baseFormulaType);
      return this;
    }

    public NutritionOrder_EnteralFormulaBuilder.Impl withBaseFormulaType(
        @NonNull CodeableConceptBuilder baseFormulaType) {
      this.baseFormulaType = Optional.of(baseFormulaType.build());
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
    public NutritionOrder_EnteralFormulaBuilder.Impl withModifierExtension(
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
    public NutritionOrder_EnteralFormulaBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public NutritionOrder_EnteralFormulaBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param maxVolumeToDeliver */
    public NutritionOrder_EnteralFormulaBuilder.Impl withMaxVolumeToDeliver(
        @NonNull Quantity maxVolumeToDeliver) {
      this.maxVolumeToDeliver = Optional.of(maxVolumeToDeliver);
      return this;
    }

    public NutritionOrder_EnteralFormulaBuilder.Impl withMaxVolumeToDeliver(
        @NonNull QuantityBuilder maxVolumeToDeliver) {
      this.maxVolumeToDeliver = Optional.of(maxVolumeToDeliver.build());
      return this;
    }
    /** @param additiveProductName */
    public NutritionOrder_EnteralFormulaBuilder.Impl withAdditiveProductName(
        @NonNull String additiveProductName) {
      this.additiveProductName = Optional.of(additiveProductName);
      return this;
    }
    /** @param routeofAdministration */
    public NutritionOrder_EnteralFormulaBuilder.Impl withRouteofAdministration(
        @NonNull CodeableConcept routeofAdministration) {
      this.routeofAdministration = Optional.of(routeofAdministration);
      return this;
    }

    public NutritionOrder_EnteralFormulaBuilder.Impl withRouteofAdministration(
        @NonNull CodeableConceptBuilder routeofAdministration) {
      this.routeofAdministration = Optional.of(routeofAdministration.build());
      return this;
    }
    /** @param baseFormulaProductName */
    public NutritionOrder_EnteralFormulaBuilder.Impl withBaseFormulaProductName(
        @NonNull String baseFormulaProductName) {
      this.baseFormulaProductName = Optional.of(baseFormulaProductName);
      return this;
    }
    /** @param administrationInstruction */
    public NutritionOrder_EnteralFormulaBuilder.Impl withAdministrationInstruction(
        @NonNull String administrationInstruction) {
      this.administrationInstruction = Optional.of(administrationInstruction);
      return this;
    }
    /** @param administration */
    public NutritionOrder_EnteralFormulaBuilder.Impl withAdministration(
        @NonNull NutritionOrder$EnteralFormula$Administration... administration) {
      this.administration = Arrays.asList(administration);
      return this;
    }
    /** @param administration */
    public NutritionOrder_EnteralFormulaBuilder.Impl withAdministration(
        @NonNull Collection<NutritionOrder$EnteralFormula$Administration> administration) {
      this.administration = Collections.unmodifiableCollection(administration);
      return this;
    }

    public NutritionOrder_EnteralFormulaBuilder.Impl withAdministration(
        @NonNull NutritionOrder_EnteralFormula_AdministrationBuilder... administration) {
      this.administration = Arrays.stream(administration).map(e -> e.build()).collect(toList());
      return this;
    }

    public NutritionOrder.EnteralFormula build() {
      return new NutritionOrder.EnteralFormula(
          OptionConverters.toScala(id),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(additiveType),
          OptionConverters.toScala(caloricDensity),
          OptionConverters.toScala(baseFormulaType),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(maxVolumeToDeliver),
          OptionConverters.toScala(additiveProductName),
          OptionConverters.toScala(routeofAdministration),
          OptionConverters.toScala(baseFormulaProductName),
          OptionConverters.toScala(administrationInstruction),
          administration.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
