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

public class Parameters_ParameterBuilder {
  private Optional<String> id = Optional.empty();
  private String name;
  private Collection<Parameters.Parameter> part = Collections.emptyList();
  private Optional<Choice> value = Optional.empty();
  private Optional<Resource> resource = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();

  /**
   * Required fields for {@link Parameters.Parameter}
   *
   * @param name
   */
  public Parameters_ParameterBuilder(String name) {
    this.name = name;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public Parameters_ParameterBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param part */
  public Parameters_ParameterBuilder withPart(@NonNull Parameters.Parameter... part) {
    this.part = Arrays.asList(part);
    return this;
  }
  /** @param part */
  public Parameters_ParameterBuilder withPart(@NonNull Collection<Parameters.Parameter> part) {
    this.part = Collections.unmodifiableCollection(part);
    return this;
  }
  /**
   * @param value Field is a 'choice' field. Type should be one of Address, Age, Annotation,
   *     Attachment, byte[], BigDecimal, Boolean, String, CodeableConcept, Coding, ContactDetail,
   *     ContactPoint, Contributor, Count, DataRequirement, Distance, Dosage, Duration, Expression,
   *     FHIRDate, FHIRDateTime, HumanName, Identifier, Integer, LocalTime, Meta, Money,
   *     ParameterDefinition, Period, Quantity, Range, Ratio, Reference, RelatedArtifact,
   *     SampledData, Signature, Timing, TriggerDefinition, UUID, UsageContext, ZonedDateTime.
   */
  public <T> Parameters_ParameterBuilder withValue(@NonNull T value) {
    var guessedSuffix =
        autoSuffix(value.getClass().getSimpleName(), Parameters.Parameter$.MODULE$.value());
    return withValue(guessedSuffix, value);
  }

  /**
   * Alternative to the 'main' withValue method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type. When the parameter is
   * one of Integer or String then there are multiple candidate 'types' for the FHIR object, and we
   * are unable to automagically disambiguate
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types. For values of type Integer, the valid values are Integer,
   *     PositiveInt, UnsignedInt. For values of type String, the valid values are Canonical, Code,
   *     Id, Markdown, Oid, String, Uri, Url.
   * @param value - The value to be passed to the builder
   */
  public <T> Parameters_ParameterBuilder withValue(String suffix, @NonNull T value) {
    guard(value.getClass().getSimpleName(), suffix, Parameters.Parameter$.MODULE$.value());
    this.value =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(suffix, value, Parameters.Parameter$.MODULE$.value()));
    return this;
  }
  /** @param resource */
  public Parameters_ParameterBuilder withResource(@NonNull Resource resource) {
    this.resource = Optional.of(resource);
    return this;
  }
  /** @param extension */
  public Parameters_ParameterBuilder withExtension(@NonNull Extension... extension) {
    this.extension = Arrays.asList(extension);
    return this;
  }
  /** @param extension */
  public Parameters_ParameterBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param modifierExtension */
  public Parameters_ParameterBuilder withModifierExtension(
      @NonNull Extension... modifierExtension) {
    this.modifierExtension = Arrays.asList(modifierExtension);
    return this;
  }
  /** @param modifierExtension */
  public Parameters_ParameterBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }

  public Parameters.Parameter build() {
    return new Parameters.Parameter(
        OptionConverters.toScala(id),
        name,
        part.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(value),
        OptionConverters.toScala(resource),
        extension.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
