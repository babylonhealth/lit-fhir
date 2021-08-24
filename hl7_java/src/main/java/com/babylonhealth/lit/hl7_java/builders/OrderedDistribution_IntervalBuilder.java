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

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface OrderedDistribution_IntervalBuilder {
  public OrderedDistribution.Interval build();

  public static Impl init(Integer rankOrder) {
    return new Impl(rankOrder);
  }

  public static Impl builder(Integer rankOrder) {
    return new Impl(rankOrder);
  }

  public class Impl implements OrderedDistribution_IntervalBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Integer rankOrder;
    private Collection<Statistic> intervalStatistic = Collections.emptyList();

    /**
     * Required fields for {@link OrderedDistribution.Interval}
     *
     * @param rankOrder
     */
    public Impl(Integer rankOrder) {
      this.rankOrder = rankOrder;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public OrderedDistribution_IntervalBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public OrderedDistribution_IntervalBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public OrderedDistribution_IntervalBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public OrderedDistribution_IntervalBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param intervalStatistic */
    public OrderedDistribution_IntervalBuilder.Impl withIntervalStatistic(
        @NonNull Statistic... intervalStatistic) {
      this.intervalStatistic = Arrays.asList(intervalStatistic);
      return this;
    }
    /** @param intervalStatistic */
    public OrderedDistribution_IntervalBuilder.Impl withIntervalStatistic(
        @NonNull Collection<Statistic> intervalStatistic) {
      this.intervalStatistic = Collections.unmodifiableCollection(intervalStatistic);
      return this;
    }

    public OrderedDistribution_IntervalBuilder.Impl withIntervalStatistic(
        @NonNull StatisticBuilder... intervalStatistic) {
      this.intervalStatistic =
          Arrays.stream(intervalStatistic).map(e -> e.build()).collect(toList());
      return this;
    }

    public OrderedDistribution.Interval build() {
      return new OrderedDistribution.Interval(
          OptionConverters.toScala(id),
          extension.stream().collect(new LitSeqJCollector<>()),
          rankOrder,
          intervalStatistic.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
