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
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class NutritionOrder_OralDietBuilder {
  private Optional<String> id = Optional.empty();
  private Collection<CodeableConcept> _type = Collections.emptyList();
  private Collection<Timing> schedule = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<String> instruction = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<CodeableConcept> fluidConsistencyType = Collections.emptyList();
  private Collection<NutritionOrder$OralDiet$Texture> texture = Collections.emptyList();
  private Collection<NutritionOrder$OralDiet$Nutrient> nutrient = Collections.emptyList();

  /** Required fields for {@link NutritionOrder.OralDiet} */
  public NutritionOrder_OralDietBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public NutritionOrder_OralDietBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param _type */
  public NutritionOrder_OralDietBuilder withType(@NonNull CodeableConcept... _type) {
    this._type = Arrays.asList(_type);
    return this;
  }
  /** @param _type */
  public NutritionOrder_OralDietBuilder withType(@NonNull Collection<CodeableConcept> _type) {
    this._type = Collections.unmodifiableCollection(_type);
    return this;
  }
  /** @param schedule */
  public NutritionOrder_OralDietBuilder withSchedule(@NonNull Timing... schedule) {
    this.schedule = Arrays.asList(schedule);
    return this;
  }
  /** @param schedule */
  public NutritionOrder_OralDietBuilder withSchedule(@NonNull Collection<Timing> schedule) {
    this.schedule = Collections.unmodifiableCollection(schedule);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public NutritionOrder_OralDietBuilder withExtension(@NonNull Extension... extension) {
    this.extension = Arrays.asList(extension);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public NutritionOrder_OralDietBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param instruction */
  public NutritionOrder_OralDietBuilder withInstruction(@NonNull String instruction) {
    this.instruction = Optional.of(instruction);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the resource and that modifies the understanding of the element
   *     that contains it and/or the understanding of the containing element's descendants. Usually
   *     modifier elements provide negation or qualification. To make the use of extensions safe and
   *     manageable, there is a strict set of governance applied to the definition and use of
   *     extensions. Though any implementer is allowed to define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public NutritionOrder_OralDietBuilder withModifierExtension(
      @NonNull Extension... modifierExtension) {
    this.modifierExtension = Arrays.asList(modifierExtension);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the resource and that modifies the understanding of the element
   *     that contains it and/or the understanding of the containing element's descendants. Usually
   *     modifier elements provide negation or qualification. To make the use of extensions safe and
   *     manageable, there is a strict set of governance applied to the definition and use of
   *     extensions. Though any implementer is allowed to define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public NutritionOrder_OralDietBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param fluidConsistencyType */
  public NutritionOrder_OralDietBuilder withFluidConsistencyType(
      @NonNull CodeableConcept... fluidConsistencyType) {
    this.fluidConsistencyType = Arrays.asList(fluidConsistencyType);
    return this;
  }
  /** @param fluidConsistencyType */
  public NutritionOrder_OralDietBuilder withFluidConsistencyType(
      @NonNull Collection<CodeableConcept> fluidConsistencyType) {
    this.fluidConsistencyType = Collections.unmodifiableCollection(fluidConsistencyType);
    return this;
  }
  /** @param texture */
  public NutritionOrder_OralDietBuilder withTexture(
      @NonNull NutritionOrder$OralDiet$Texture... texture) {
    this.texture = Arrays.asList(texture);
    return this;
  }
  /** @param texture */
  public NutritionOrder_OralDietBuilder withTexture(
      @NonNull Collection<NutritionOrder$OralDiet$Texture> texture) {
    this.texture = Collections.unmodifiableCollection(texture);
    return this;
  }
  /** @param nutrient */
  public NutritionOrder_OralDietBuilder withNutrient(
      @NonNull NutritionOrder$OralDiet$Nutrient... nutrient) {
    this.nutrient = Arrays.asList(nutrient);
    return this;
  }
  /** @param nutrient */
  public NutritionOrder_OralDietBuilder withNutrient(
      @NonNull Collection<NutritionOrder$OralDiet$Nutrient> nutrient) {
    this.nutrient = Collections.unmodifiableCollection(nutrient);
    return this;
  }

  public NutritionOrder.OralDiet build() {
    return new NutritionOrder.OralDiet(
        OptionConverters.toScala(id),
        _type.stream().collect(new LitSeqJCollector<>()),
        schedule.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(instruction),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        fluidConsistencyType.stream().collect(new LitSeqJCollector<>()),
        texture.stream().collect(new LitSeqJCollector<>()),
        nutrient.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
