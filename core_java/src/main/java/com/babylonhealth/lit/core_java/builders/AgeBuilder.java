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
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.core.QUANTITY_COMPARATOR;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class AgeBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<String> unit = Optional.empty();
  private Optional<String> code = Optional.empty();
  private Optional<BigDecimal> value = Optional.empty();
  private Optional<String> system = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<QUANTITY_COMPARATOR> comparator = Optional.empty();

  /** Required fields for {@link Age} */
  public AgeBuilder() {}

  /**
   * @param id - Unique id for the element within a resource (for internal references). This may be
   *     any string value that does not contain spaces.
   */
  public AgeBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param unit - A human-readable form of the unit. */
  public AgeBuilder withUnit(@NonNull String unit) {
    this.unit = Optional.of(unit);
    return this;
  }
  /** @param code - A computer processable form of the unit in some unit representation system. */
  public AgeBuilder withCode(@NonNull String code) {
    this.code = Optional.of(code);
    return this;
  }
  /**
   * @param value - The value of the measured amount. The value includes an implicit precision in
   *     the presentation of the value.
   */
  public AgeBuilder withValue(@NonNull BigDecimal value) {
    this.value = Optional.of(value);
    return this;
  }
  /** @param system - The identification of the system that provides the coded form of the unit. */
  public AgeBuilder withSystem(@NonNull String system) {
    this.system = Optional.of(system);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the element. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public AgeBuilder withExtension(@NonNull Extension... extension) {
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
  public AgeBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param comparator - How the value should be understood and represented - whether the actual
   *     value is greater or less than the stated value due to measurement issues; e.g. if the
   *     comparator is "&lt;" , then the real value is &lt; stated value.
   */
  public AgeBuilder withComparator(@NonNull QUANTITY_COMPARATOR comparator) {
    this.comparator = Optional.of(comparator);
    return this;
  }

  public Age build() {
    return new Age(
        OptionConverters.toScala(id),
        OptionConverters.toScala(unit),
        OptionConverters.toScala(code),
        OptionConverters.toScala(value),
        OptionConverters.toScala(system),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(comparator),
        LitUtils.emptyMetaElMap());
  }
}
