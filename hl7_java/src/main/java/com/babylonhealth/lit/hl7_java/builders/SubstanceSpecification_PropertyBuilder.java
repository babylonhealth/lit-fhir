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

public class SubstanceSpecification_PropertyBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<CodeableConcept> code = Optional.empty();
  private Optional<CodeableConcept> category = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Choice<$bslash$div<Quantity, String>>> amount = Optional.empty();
  private Optional<String> parameters = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<Choice<$bslash$div<CodeableConcept, Reference>>> definingSubstance =
      Optional.empty();

  /** Required fields for {@link SubstanceSpecification.Property} */
  public SubstanceSpecification_PropertyBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public SubstanceSpecification_PropertyBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param code - Codes associated with the substance. */
  public SubstanceSpecification_PropertyBuilder withCode(@NonNull CodeableConcept code) {
    this.code = Optional.of(code);
    return this;
  }
  /** @param category */
  public SubstanceSpecification_PropertyBuilder withCategory(@NonNull CodeableConcept category) {
    this.category = Optional.of(category);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public SubstanceSpecification_PropertyBuilder withExtension(@NonNull Extension... extension) {
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
  public SubstanceSpecification_PropertyBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param amount Field is a 'choice' field. Type should be one of Quantity, String. */
  public <T> SubstanceSpecification_PropertyBuilder withAmount(@NonNull T amount) {
    var guessedSuffix =
        autoSuffix(
            amount.getClass().getSimpleName(), SubstanceSpecification.Property$.MODULE$.amount());
    return withAmount(guessedSuffix, amount);
  }

  /**
   * Alternative to the 'main' withAmount method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param amount - The value to be passed to the builder
   */
  public <T> SubstanceSpecification_PropertyBuilder withAmount(String suffix, @NonNull T amount) {
    guard(
        amount.getClass().getSimpleName(),
        suffix,
        SubstanceSpecification.Property$.MODULE$.amount());
    this.amount =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix, amount, SubstanceSpecification.Property$.MODULE$.amount()));
    return this;
  }
  /** @param parameters */
  public SubstanceSpecification_PropertyBuilder withParameters(@NonNull String parameters) {
    this.parameters = Optional.of(parameters);
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
  public SubstanceSpecification_PropertyBuilder withModifierExtension(
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
  public SubstanceSpecification_PropertyBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param definingSubstance Field is a 'choice' field. Type should be one of CodeableConcept,
   *     Reference.
   */
  public <T> SubstanceSpecification_PropertyBuilder withDefiningSubstance(
      @NonNull T definingSubstance) {
    var guessedSuffix =
        autoSuffix(
            definingSubstance.getClass().getSimpleName(),
            SubstanceSpecification.Property$.MODULE$.definingSubstance());
    return withDefiningSubstance(guessedSuffix, definingSubstance);
  }

  /**
   * Alternative to the 'main' withDefiningSubstance method. This will be marginally faster than the
   * other method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param definingSubstance - The value to be passed to the builder
   */
  public <T> SubstanceSpecification_PropertyBuilder withDefiningSubstance(
      String suffix, @NonNull T definingSubstance) {
    guard(
        definingSubstance.getClass().getSimpleName(),
        suffix,
        SubstanceSpecification.Property$.MODULE$.definingSubstance());
    this.definingSubstance =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix,
                    definingSubstance,
                    SubstanceSpecification.Property$.MODULE$.definingSubstance()));
    return this;
  }

  public SubstanceSpecification.Property build() {
    return new SubstanceSpecification.Property(
        OptionConverters.toScala(id),
        OptionConverters.toScala(code),
        OptionConverters.toScala(category),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(amount),
        OptionConverters.toScala(parameters),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(definingSubstance),
        LitUtils.emptyMetaElMap());
  }
}