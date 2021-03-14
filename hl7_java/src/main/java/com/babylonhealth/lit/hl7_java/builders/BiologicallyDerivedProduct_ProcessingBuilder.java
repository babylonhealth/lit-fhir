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

public class BiologicallyDerivedProduct_ProcessingBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Choice<$bslash$div<FHIRDateTime, Period>>> time = Optional.empty();
  private Optional<Reference> additive = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<CodeableConcept> procedure = Optional.empty();
  private Optional<String> description = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();

  /** Required fields for {@link BiologicallyDerivedProduct.Processing} */
  public BiologicallyDerivedProduct_ProcessingBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public BiologicallyDerivedProduct_ProcessingBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param time Field is a 'choice' field. Type should be one of FHIRDateTime, Period. */
  public <T> BiologicallyDerivedProduct_ProcessingBuilder withTime(@NonNull T time) {
    var guessedSuffix =
        autoSuffix(
            time.getClass().getSimpleName(), BiologicallyDerivedProduct.Processing$.MODULE$.time());
    return withTime(guessedSuffix, time);
  }

  /**
   * Alternative to the 'main' withTime method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param time - The value to be passed to the builder
   */
  public <T> BiologicallyDerivedProduct_ProcessingBuilder withTime(String suffix, @NonNull T time) {
    guard(
        time.getClass().getSimpleName(),
        suffix,
        BiologicallyDerivedProduct.Processing$.MODULE$.time());
    this.time =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix, time, BiologicallyDerivedProduct.Processing$.MODULE$.time()));
    return this;
  }
  /** @param additive */
  public BiologicallyDerivedProduct_ProcessingBuilder withAdditive(@NonNull Reference additive) {
    this.additive = Optional.of(additive);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public BiologicallyDerivedProduct_ProcessingBuilder withExtension(
      @NonNull Extension... extension) {
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
  public BiologicallyDerivedProduct_ProcessingBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param procedure */
  public BiologicallyDerivedProduct_ProcessingBuilder withProcedure(
      @NonNull CodeableConcept procedure) {
    this.procedure = Optional.of(procedure);
    return this;
  }
  /** @param description */
  public BiologicallyDerivedProduct_ProcessingBuilder withDescription(@NonNull String description) {
    this.description = Optional.of(description);
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
  public BiologicallyDerivedProduct_ProcessingBuilder withModifierExtension(
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
  public BiologicallyDerivedProduct_ProcessingBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }

  public BiologicallyDerivedProduct.Processing build() {
    return new BiologicallyDerivedProduct.Processing(
        OptionConverters.toScala(id),
        OptionConverters.toScala(time),
        OptionConverters.toScala(additive),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(procedure),
        OptionConverters.toScala(description),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}