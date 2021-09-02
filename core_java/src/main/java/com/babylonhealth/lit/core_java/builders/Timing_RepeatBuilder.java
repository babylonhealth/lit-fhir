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
import com.babylonhealth.lit.core.EVENT_TIMING;
import com.babylonhealth.lit.core.DAYS_OF_WEEK;
import com.babylonhealth.lit.core.UNITS_OF_TIME;
import com.babylonhealth.lit.core.UNITS_OF_TIME;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class Timing_RepeatBuilder {
  private Optional<String> id = Optional.empty();
  private Collection<EVENT_TIMING> when = Collections.emptyList();
  private Optional<Integer> count = Optional.empty();
  private Optional<BigDecimal> period = Optional.empty();
  private Optional<Integer> offset = Optional.empty();
  private Optional<Integer> countMax = Optional.empty();
  private Optional<BigDecimal> duration = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Choice_0731860109> bounds = Optional.empty();
  private Optional<Integer> frequency = Optional.empty();
  private Optional<BigDecimal> periodMax = Optional.empty();
  private Collection<DAYS_OF_WEEK> dayOfWeek = Collections.emptyList();
  private Collection<LocalTime> timeOfDay = Collections.emptyList();
  private Optional<UNITS_OF_TIME> periodUnit = Optional.empty();
  private Optional<BigDecimal> durationMax = Optional.empty();
  private Optional<UNITS_OF_TIME> durationUnit = Optional.empty();
  private Optional<Integer> frequencyMax = Optional.empty();

  /** Required fields for {@link Timing.Repeat} */
  public Timing_RepeatBuilder() {}

  /**
   * @param id - Unique id for the element within a resource (for internal references). This may be
   *     any string value that does not contain spaces.
   */
  public Timing_RepeatBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param when */
  public Timing_RepeatBuilder withWhen(@NonNull EVENT_TIMING... when) {
    this.when = Arrays.asList(when);
    return this;
  }
  /** @param when */
  public Timing_RepeatBuilder withWhen(@NonNull Collection<EVENT_TIMING> when) {
    this.when = Collections.unmodifiableCollection(when);
    return this;
  }
  /** @param count */
  public Timing_RepeatBuilder withCount(@NonNull Integer count) {
    this.count = Optional.of(count);
    return this;
  }
  /** @param period */
  public Timing_RepeatBuilder withPeriod(@NonNull BigDecimal period) {
    this.period = Optional.of(period);
    return this;
  }
  /** @param offset */
  public Timing_RepeatBuilder withOffset(@NonNull Integer offset) {
    this.offset = Optional.of(offset);
    return this;
  }
  /** @param countMax */
  public Timing_RepeatBuilder withCountMax(@NonNull Integer countMax) {
    this.countMax = Optional.of(countMax);
    return this;
  }
  /** @param duration */
  public Timing_RepeatBuilder withDuration(@NonNull BigDecimal duration) {
    this.duration = Optional.of(duration);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the element. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public Timing_RepeatBuilder withExtension(@NonNull Extension... extension) {
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
  public Timing_RepeatBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param bounds Field is a 'choice' field. Type should be one of Duration, Period, Range. */
  public Timing_RepeatBuilder withBounds(@NonNull Choice_0731860109 bounds) {
    this.bounds = Optional.of(bounds);
    return this;
  }
  /** @param frequency */
  public Timing_RepeatBuilder withFrequency(@NonNull Integer frequency) {
    this.frequency = Optional.of(frequency);
    return this;
  }
  /** @param periodMax */
  public Timing_RepeatBuilder withPeriodMax(@NonNull BigDecimal periodMax) {
    this.periodMax = Optional.of(periodMax);
    return this;
  }
  /** @param dayOfWeek */
  public Timing_RepeatBuilder withDayOfWeek(@NonNull DAYS_OF_WEEK... dayOfWeek) {
    this.dayOfWeek = Arrays.asList(dayOfWeek);
    return this;
  }
  /** @param dayOfWeek */
  public Timing_RepeatBuilder withDayOfWeek(@NonNull Collection<DAYS_OF_WEEK> dayOfWeek) {
    this.dayOfWeek = Collections.unmodifiableCollection(dayOfWeek);
    return this;
  }
  /** @param timeOfDay */
  public Timing_RepeatBuilder withTimeOfDay(@NonNull LocalTime... timeOfDay) {
    this.timeOfDay = Arrays.asList(timeOfDay);
    return this;
  }
  /** @param timeOfDay */
  public Timing_RepeatBuilder withTimeOfDay(@NonNull Collection<LocalTime> timeOfDay) {
    this.timeOfDay = Collections.unmodifiableCollection(timeOfDay);
    return this;
  }
  /** @param periodUnit */
  public Timing_RepeatBuilder withPeriodUnit(@NonNull UNITS_OF_TIME periodUnit) {
    this.periodUnit = Optional.of(periodUnit);
    return this;
  }
  /** @param durationMax */
  public Timing_RepeatBuilder withDurationMax(@NonNull BigDecimal durationMax) {
    this.durationMax = Optional.of(durationMax);
    return this;
  }
  /** @param durationUnit */
  public Timing_RepeatBuilder withDurationUnit(@NonNull UNITS_OF_TIME durationUnit) {
    this.durationUnit = Optional.of(durationUnit);
    return this;
  }
  /** @param frequencyMax */
  public Timing_RepeatBuilder withFrequencyMax(@NonNull Integer frequencyMax) {
    this.frequencyMax = Optional.of(frequencyMax);
    return this;
  }

  public Timing.Repeat build() {
    return new Timing.Repeat(
        (Option) OptionConverters.toScala(id),
        when.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(count.map(x -> (Object) x)),
        (Option) OptionConverters.toScala(period),
        (Option) OptionConverters.toScala(offset.map(x -> (Object) x)),
        (Option) OptionConverters.toScala(countMax.map(x -> (Object) x)),
        (Option) OptionConverters.toScala(duration),
        extension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(bounds),
        (Option) OptionConverters.toScala(frequency.map(x -> (Object) x)),
        (Option) OptionConverters.toScala(periodMax),
        dayOfWeek.stream().collect(new LitSeqJCollector<>()),
        timeOfDay.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(periodUnit),
        (Option) OptionConverters.toScala(durationMax),
        (Option) OptionConverters.toScala(durationUnit),
        (Option) OptionConverters.toScala(frequencyMax.map(x -> (Object) x)),
        LitUtils.emptyMetaElMap());
  }
}
