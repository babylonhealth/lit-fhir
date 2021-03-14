package com.babylonhealth.lit.core_java.builders;

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
import com.babylonhealth.lit.core_java.builders.*;

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class DataRequirement_DateFilterBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<String> path = Optional.empty();
  private Optional<Choice<$bslash$div<$bslash$div<Duration, FHIRDateTime>, Period>>> value =
      Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<String> searchParam = Optional.empty();

  /** Required fields for {@link DataRequirement.DateFilter} */
  public DataRequirement_DateFilterBuilder() {}

  /**
   * @param id - Unique id for the element within a resource (for internal references). This may be
   *     any string value that does not contain spaces.
   */
  public DataRequirement_DateFilterBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param path */
  public DataRequirement_DateFilterBuilder withPath(@NonNull String path) {
    this.path = Optional.of(path);
    return this;
  }
  /**
   * @param value Field is a 'choice' field. Type should be one of Duration, FHIRDateTime, Period.
   */
  public <T> DataRequirement_DateFilterBuilder withValue(@NonNull T value) {
    var guessedSuffix =
        autoSuffix(value.getClass().getSimpleName(), DataRequirement.DateFilter$.MODULE$.value());
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
  public <T> DataRequirement_DateFilterBuilder withValue(String suffix, @NonNull T value) {
    guard(value.getClass().getSimpleName(), suffix, DataRequirement.DateFilter$.MODULE$.value());
    this.value =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix, value, DataRequirement.DateFilter$.MODULE$.value()));
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the element. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public DataRequirement_DateFilterBuilder withExtension(@NonNull Extension... extension) {
    this.extension = Arrays.asList(extension);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the element. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public DataRequirement_DateFilterBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param searchParam */
  public DataRequirement_DateFilterBuilder withSearchParam(@NonNull String searchParam) {
    this.searchParam = Optional.of(searchParam);
    return this;
  }

  public DataRequirement.DateFilter build() {
    return new DataRequirement.DateFilter(
        OptionConverters.toScala(id),
        OptionConverters.toScala(path),
        OptionConverters.toScala(value),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(searchParam),
        LitUtils.emptyMetaElMap());
  }
}