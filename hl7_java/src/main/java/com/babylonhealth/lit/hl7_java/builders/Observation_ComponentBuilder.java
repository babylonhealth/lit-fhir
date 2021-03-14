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

public class Observation_ComponentBuilder {
  private Optional<String> id = Optional.empty();
  private CodeableConcept code;
  private Optional<Choice> value = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<CodeableConcept> interpretation = Collections.emptyList();
  private Collection<Observation.ReferenceRange> referenceRange = Collections.emptyList();
  private Optional<CodeableConcept> dataAbsentReason = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();

  /**
   * Required fields for {@link Observation.Component}
   *
   * @param code - Describes what was observed. Sometimes this is called the observation "name".
   */
  public Observation_ComponentBuilder(CodeableConcept code) {
    this.code = code;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public Observation_ComponentBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param value - The information determined as a result of making the observation, if the
   *     information has a simple value. Field is a 'choice' field. Type should be one of Boolean,
   *     CodeableConcept, FHIRDateTime, Integer, LocalTime, Period, Quantity, Range, Ratio,
   *     SampledData, String.
   */
  public <T> Observation_ComponentBuilder withValue(@NonNull T value) {
    var guessedSuffix =
        autoSuffix(value.getClass().getSimpleName(), Observation.Component$.MODULE$.value());
    return withValue(guessedSuffix, value);
  }

  /**
   * Alternative to the 'main' withValue method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param value - The value to be passed to the builder
   */
  public <T> Observation_ComponentBuilder withValue(String suffix, @NonNull T value) {
    guard(value.getClass().getSimpleName(), suffix, Observation.Component$.MODULE$.value());
    this.value =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(suffix, value, Observation.Component$.MODULE$.value()));
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public Observation_ComponentBuilder withExtension(@NonNull Extension... extension) {
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
  public Observation_ComponentBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param interpretation - A categorical assessment of an observation value. For example, high,
   *     low, normal.
   */
  public Observation_ComponentBuilder withInterpretation(
      @NonNull CodeableConcept... interpretation) {
    this.interpretation = Arrays.asList(interpretation);
    return this;
  }
  /**
   * @param interpretation - A categorical assessment of an observation value. For example, high,
   *     low, normal.
   */
  public Observation_ComponentBuilder withInterpretation(
      @NonNull Collection<CodeableConcept> interpretation) {
    this.interpretation = Collections.unmodifiableCollection(interpretation);
    return this;
  }
  /**
   * @param referenceRange - Guidance on how to interpret the value by comparison to a normal or
   *     recommended range. Multiple reference ranges are interpreted as an "OR". In other words, to
   *     represent two distinct target populations, two `referenceRange` elements would be used.
   */
  public Observation_ComponentBuilder withReferenceRange(
      @NonNull Observation.ReferenceRange... referenceRange) {
    this.referenceRange = Arrays.asList(referenceRange);
    return this;
  }
  /**
   * @param referenceRange - Guidance on how to interpret the value by comparison to a normal or
   *     recommended range. Multiple reference ranges are interpreted as an "OR". In other words, to
   *     represent two distinct target populations, two `referenceRange` elements would be used.
   */
  public Observation_ComponentBuilder withReferenceRange(
      @NonNull Collection<Observation.ReferenceRange> referenceRange) {
    this.referenceRange = Collections.unmodifiableCollection(referenceRange);
    return this;
  }
  /**
   * @param dataAbsentReason - Provides a reason why the expected value in the element
   *     Observation.value[x] is missing.
   */
  public Observation_ComponentBuilder withDataAbsentReason(
      @NonNull CodeableConcept dataAbsentReason) {
    this.dataAbsentReason = Optional.of(dataAbsentReason);
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
  public Observation_ComponentBuilder withModifierExtension(
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
  public Observation_ComponentBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }

  public Observation.Component build() {
    return new Observation.Component(
        OptionConverters.toScala(id),
        code,
        (Option) OptionConverters.toScala(value),
        extension.stream().collect(new LitSeqJCollector<>()),
        interpretation.stream().collect(new LitSeqJCollector<>()),
        referenceRange.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(dataAbsentReason),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}