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

public interface RatioBuilder extends ElementBuilder {
  public Ratio build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements RatioBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Quantity> numerator = Optional.empty();
    private Optional<Quantity> denominator = Optional.empty();

    /** Required fields for {@link Ratio} */
    public Impl() {}

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public RatioBuilder.Impl withId(@NonNull String id) {
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
    public RatioBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public RatioBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public RatioBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param numerator - The value of the numerator. */
    public RatioBuilder.Impl withNumerator(@NonNull Quantity numerator) {
      this.numerator = Optional.of(numerator);
      return this;
    }

    public RatioBuilder.Impl withNumerator(@NonNull QuantityBuilder numerator) {
      this.numerator = Optional.of(numerator.build());
      return this;
    }
    /** @param denominator - The value of the denominator. */
    public RatioBuilder.Impl withDenominator(@NonNull Quantity denominator) {
      this.denominator = Optional.of(denominator);
      return this;
    }

    public RatioBuilder.Impl withDenominator(@NonNull QuantityBuilder denominator) {
      this.denominator = Optional.of(denominator.build());
      return this;
    }

    public Ratio build() {
      return new Ratio(
          OptionConverters.toScala(id),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(numerator),
          OptionConverters.toScala(denominator),
          LitUtils.emptyMetaElMap());
    }
  }
}
