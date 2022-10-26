package com.babylonhealth.lit.core_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface RangeBuilder extends ElementBuilder {
  public Range build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements RangeBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Quantity> low = Optional.empty();
    private Optional<Quantity> high = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();

    /** Required fields for {@link Range} */
    public Impl() {}

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public RangeBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param low - The low limit. The boundary is inclusive. */
    public RangeBuilder.Impl withLow(@NonNull Quantity low) {
      this.low = Optional.of(low);
      return this;
    }

    public RangeBuilder.Impl withLow(@NonNull QuantityBuilder low) {
      this.low = Optional.of(low.build());
      return this;
    }
    /** @param high - The high limit. The boundary is inclusive. */
    public RangeBuilder.Impl withHigh(@NonNull Quantity high) {
      this.high = Optional.of(high);
      return this;
    }

    public RangeBuilder.Impl withHigh(@NonNull QuantityBuilder high) {
      this.high = Optional.of(high.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public RangeBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public RangeBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public RangeBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }

    public Range build() {
      return new Range(
          OptionConverters.toScala(id),
          OptionConverters.toScala(low),
          OptionConverters.toScala(high),
          extension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
