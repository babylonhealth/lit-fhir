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

public interface ObservationDefinition_QuantitativeDetailsBuilder {
  public ObservationDefinition.QuantitativeDetails build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements ObservationDefinition_QuantitativeDetailsBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> unit = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<CodeableConcept> customaryUnit = Optional.empty();
    private Optional<BigDecimal> conversionFactor = Optional.empty();
    private Optional<Integer> decimalPrecision = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /** Required fields for {@link ObservationDefinition.QuantitativeDetails} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ObservationDefinition_QuantitativeDetailsBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param unit */
    public ObservationDefinition_QuantitativeDetailsBuilder.Impl withUnit(
        @NonNull CodeableConcept unit) {
      this.unit = Optional.of(unit);
      return this;
    }

    public ObservationDefinition_QuantitativeDetailsBuilder.Impl withUnit(
        @NonNull CodeableConceptBuilder unit) {
      this.unit = Optional.of(unit.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ObservationDefinition_QuantitativeDetailsBuilder.Impl withExtension(
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
    public ObservationDefinition_QuantitativeDetailsBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ObservationDefinition_QuantitativeDetailsBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param customaryUnit */
    public ObservationDefinition_QuantitativeDetailsBuilder.Impl withCustomaryUnit(
        @NonNull CodeableConcept customaryUnit) {
      this.customaryUnit = Optional.of(customaryUnit);
      return this;
    }

    public ObservationDefinition_QuantitativeDetailsBuilder.Impl withCustomaryUnit(
        @NonNull CodeableConceptBuilder customaryUnit) {
      this.customaryUnit = Optional.of(customaryUnit.build());
      return this;
    }
    /** @param conversionFactor */
    public ObservationDefinition_QuantitativeDetailsBuilder.Impl withConversionFactor(
        @NonNull BigDecimal conversionFactor) {
      this.conversionFactor = Optional.of(conversionFactor);
      return this;
    }
    /** @param decimalPrecision */
    public ObservationDefinition_QuantitativeDetailsBuilder.Impl withDecimalPrecision(
        @NonNull Integer decimalPrecision) {
      this.decimalPrecision = Optional.of(decimalPrecision);
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
    public ObservationDefinition_QuantitativeDetailsBuilder.Impl withModifierExtension(
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
    public ObservationDefinition_QuantitativeDetailsBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ObservationDefinition_QuantitativeDetailsBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public ObservationDefinition.QuantitativeDetails build() {
      return new ObservationDefinition.QuantitativeDetails(
          OptionConverters.toScala(id),
          OptionConverters.toScala(unit),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(customaryUnit),
          OptionConverters.toScala(conversionFactor),
          OptionConverters.toScala(decimalPrecision.map(x -> (Object) x)),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
