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

public class Parameters_ParameterBuilder {
  private Optional<String> id = Optional.empty();
  private String name;
  private Collection<Parameters.Parameter> part = Collections.emptyList();
  private Optional<Choice_1349125893> value = Optional.empty();
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
  public Parameters_ParameterBuilder withValue(@NonNull Choice_1349125893 value) {
    this.value = Optional.of(value);
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
        (Option) OptionConverters.toScala(id),
        name,
        part.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(value),
        (Option) OptionConverters.toScala(resource),
        extension.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
