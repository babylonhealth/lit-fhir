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

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class ValueSet_Expansion_ParameterBuilder {
  private Optional<String> id = Optional.empty();
  private String name;
  private Optional<Choice> value = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();

  /**
   * Required fields for {@link ValueSet$Expansion$Parameter}
   *
   * @param name - A natural language name identifying the value set. This name should be usable as
   *     an identifier for the module by machine processing applications such as code generation.
   */
  public ValueSet_Expansion_ParameterBuilder(String name) {
    this.name = name;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public ValueSet_Expansion_ParameterBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param value Field is a 'choice' field. Type should be one of BigDecimal, Boolean, String,
   *     FHIRDateTime, Integer.
   */
  public <T> ValueSet_Expansion_ParameterBuilder withValue(@NonNull T value) {
    var guessedSuffix =
        autoSuffix(value.getClass().getSimpleName(), ValueSet$Expansion$Parameter$.MODULE$.value());
    return withValue(guessedSuffix, value);
  }

  /**
   * Alternative to the 'main' withValue method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type. When the parameter is
   * one of String then there are multiple candidate 'types' for the FHIR object, and we are unable
   * to automagically disambiguate
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types. For values of type String, the valid values are Code, String,
   *     Uri.
   * @param value - The value to be passed to the builder
   */
  public <T> ValueSet_Expansion_ParameterBuilder withValue(String suffix, @NonNull T value) {
    guard(value.getClass().getSimpleName(), suffix, ValueSet$Expansion$Parameter$.MODULE$.value());
    this.value =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix, value, ValueSet$Expansion$Parameter$.MODULE$.value()));
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public ValueSet_Expansion_ParameterBuilder withExtension(@NonNull Extension... extension) {
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
  public ValueSet_Expansion_ParameterBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
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
  public ValueSet_Expansion_ParameterBuilder withModifierExtension(
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
  public ValueSet_Expansion_ParameterBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }

  public ValueSet$Expansion$Parameter build() {
    return new ValueSet$Expansion$Parameter(
        OptionConverters.toScala(id),
        name,
        (Option) OptionConverters.toScala(value),
        extension.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}