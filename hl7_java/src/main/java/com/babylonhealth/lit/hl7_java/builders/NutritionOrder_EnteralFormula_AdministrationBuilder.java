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

public interface NutritionOrder_EnteralFormula_AdministrationBuilder {
  public NutritionOrder$EnteralFormula$Administration build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public static ChoiceQuantityOrRatio rate(Quantity q) {
    return new ChoiceQuantityOrRatio(q);
  }

  public static ChoiceQuantityOrRatio rate(Ratio r) {
    return new ChoiceQuantityOrRatio(r);
  }

  public class Impl implements NutritionOrder_EnteralFormula_AdministrationBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<ChoiceQuantityOrRatio> rate = Optional.empty();
    private Optional<Timing> schedule = Optional.empty();
    private Optional<Quantity> quantity = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /** Required fields for {@link NutritionOrder$EnteralFormula$Administration} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public NutritionOrder_EnteralFormula_AdministrationBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param rate Field is a 'choice' field. Type should be one of Quantity, Ratio. To pass the
     *     value in, wrap with one of the NutritionOrder_EnteralFormula_AdministrationBuilder.rate
     *     static methods
     */
    public NutritionOrder_EnteralFormula_AdministrationBuilder.Impl withRate(
        @NonNull ChoiceQuantityOrRatio rate) {
      this.rate = Optional.of(rate);
      return this;
    }
    /** @param schedule */
    public NutritionOrder_EnteralFormula_AdministrationBuilder.Impl withSchedule(
        @NonNull Timing schedule) {
      this.schedule = Optional.of(schedule);
      return this;
    }

    public NutritionOrder_EnteralFormula_AdministrationBuilder.Impl withSchedule(
        @NonNull TimingBuilder schedule) {
      this.schedule = Optional.of(schedule.build());
      return this;
    }
    /** @param quantity */
    public NutritionOrder_EnteralFormula_AdministrationBuilder.Impl withQuantity(
        @NonNull Quantity quantity) {
      this.quantity = Optional.of(quantity);
      return this;
    }

    public NutritionOrder_EnteralFormula_AdministrationBuilder.Impl withQuantity(
        @NonNull QuantityBuilder quantity) {
      this.quantity = Optional.of(quantity.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public NutritionOrder_EnteralFormula_AdministrationBuilder.Impl withExtension(
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
    public NutritionOrder_EnteralFormula_AdministrationBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public NutritionOrder_EnteralFormula_AdministrationBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
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
    public NutritionOrder_EnteralFormula_AdministrationBuilder.Impl withModifierExtension(
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
    public NutritionOrder_EnteralFormula_AdministrationBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public NutritionOrder_EnteralFormula_AdministrationBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public NutritionOrder$EnteralFormula$Administration build() {
      return new NutritionOrder$EnteralFormula$Administration(
          OptionConverters.toScala(id),
          (Option) OptionConverters.toScala(rate),
          OptionConverters.toScala(schedule),
          OptionConverters.toScala(quantity),
          extension.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
