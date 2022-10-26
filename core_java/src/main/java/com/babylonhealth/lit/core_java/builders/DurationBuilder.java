package com.babylonhealth.lit.core_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.QUANTITY_COMPARATOR;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;
import scala.math.BigDecimal;

public interface DurationBuilder extends QuantityBuilder {
  public Duration build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements DurationBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> unit = Optional.empty();
    private Optional<String> code = Optional.empty();
    private Optional<BigDecimal> value = Optional.empty();
    private Optional<String> system = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<QUANTITY_COMPARATOR> comparator = Optional.empty();

    /** Required fields for {@link Duration} */
    public Impl() {}

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public DurationBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param unit - A human-readable form of the unit. */
    public DurationBuilder.Impl withUnit(@NonNull String unit) {
      this.unit = Optional.of(unit);
      return this;
    }
    /** @param code - A computer processable form of the unit in some unit representation system. */
    public DurationBuilder.Impl withCode(@NonNull String code) {
      this.code = Optional.of(code);
      return this;
    }
    /**
     * @param value - The value of the measured amount. The value includes an implicit precision in
     *     the presentation of the value.
     */
    public DurationBuilder.Impl withValue(@NonNull BigDecimal value) {
      this.value = Optional.of(value);
      return this;
    }
    /**
     * @param system - The identification of the system that provides the coded form of the unit.
     */
    public DurationBuilder.Impl withSystem(@NonNull String system) {
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
    public DurationBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public DurationBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public DurationBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param comparator - How the value should be understood and represented - whether the actual
     *     value is greater or less than the stated value due to measurement issues; e.g. if the
     *     comparator is "&lt;" , then the real value is &lt; stated value.
     */
    public DurationBuilder.Impl withComparator(@NonNull QUANTITY_COMPARATOR comparator) {
      this.comparator = Optional.of(comparator);
      return this;
    }

    public Duration build() {
      return new Duration(
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
}
