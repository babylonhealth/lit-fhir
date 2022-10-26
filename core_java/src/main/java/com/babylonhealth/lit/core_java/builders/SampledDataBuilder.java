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

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface SampledDataBuilder extends ElementBuilder {
  public SampledData build();

  public static Impl init(Quantity origin, BigDecimal period, Integer dimensions) {
    return new Impl(origin, period, dimensions);
  }

  public static Impl builder(QuantityBuilder origin, BigDecimal period, Integer dimensions) {
    return new Impl(origin.build(), period, dimensions);
  }

  public class Impl implements SampledDataBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> data = Optional.empty();
    private Quantity origin;
    private BigDecimal period;
    private Optional<BigDecimal> factor = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<BigDecimal> lowerLimit = Optional.empty();
    private Optional<BigDecimal> upperLimit = Optional.empty();
    private Integer dimensions;

    /**
     * Required fields for {@link SampledData}
     *
     * @param origin - The base quantity that a measured value of zero represents. In addition, this
     *     provides the units of the entire measurement series.
     * @param period - The length of time between sampling times, measured in milliseconds.
     * @param dimensions - The number of sample points at each time point. If this value is greater
     *     than one, then the dimensions will be interlaced - all the sample points for a point in
     *     time will be recorded at once.
     */
    public Impl(Quantity origin, BigDecimal period, Integer dimensions) {
      this.origin = origin;
      this.period = period;
      this.dimensions = dimensions;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public SampledDataBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param data - A series of data points which are decimal values separated by a single space
     *     (character u20). The special values "E" (error), "L" (below detection limit) and "U"
     *     (above detection limit) can also be used in place of a decimal value.
     */
    public SampledDataBuilder.Impl withData(@NonNull String data) {
      this.data = Optional.of(data);
      return this;
    }
    /**
     * @param factor - A correction factor that is applied to the sampled data points before they
     *     are added to the origin.
     */
    public SampledDataBuilder.Impl withFactor(@NonNull BigDecimal factor) {
      this.factor = Optional.of(factor);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public SampledDataBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public SampledDataBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public SampledDataBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param lowerLimit - The lower limit of detection of the measured points. This is needed if
     *     any of the data points have the value "L" (lower than detection limit).
     */
    public SampledDataBuilder.Impl withLowerLimit(@NonNull BigDecimal lowerLimit) {
      this.lowerLimit = Optional.of(lowerLimit);
      return this;
    }
    /**
     * @param upperLimit - The upper limit of detection of the measured points. This is needed if
     *     any of the data points have the value "U" (higher than detection limit).
     */
    public SampledDataBuilder.Impl withUpperLimit(@NonNull BigDecimal upperLimit) {
      this.upperLimit = Optional.of(upperLimit);
      return this;
    }

    public SampledData build() {
      return new SampledData(
          OptionConverters.toScala(id),
          OptionConverters.toScala(data),
          origin,
          period,
          OptionConverters.toScala(factor),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(lowerLimit),
          OptionConverters.toScala(upperLimit),
          dimensions,
          LitUtils.emptyMetaElMap());
    }
  }
}
