package com.babylonhealth.lit.usbase_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface SubstanceAmount_ReferenceRangeBuilder {
  public SubstanceAmount.ReferenceRange build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements SubstanceAmount_ReferenceRangeBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Quantity> lowLimit = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Quantity> highLimit = Optional.empty();

    /** Required fields for {@link SubstanceAmount.ReferenceRange} */
    public Impl() {}

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public SubstanceAmount_ReferenceRangeBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param lowLimit */
    public SubstanceAmount_ReferenceRangeBuilder.Impl withLowLimit(@NonNull Quantity lowLimit) {
      this.lowLimit = Optional.of(lowLimit);
      return this;
    }

    public SubstanceAmount_ReferenceRangeBuilder.Impl withLowLimit(
        @NonNull QuantityBuilder lowLimit) {
      this.lowLimit = Optional.of(lowLimit.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public SubstanceAmount_ReferenceRangeBuilder.Impl withExtension(
        @NonNull Extension... extension) {
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
    public SubstanceAmount_ReferenceRangeBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public SubstanceAmount_ReferenceRangeBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param highLimit */
    public SubstanceAmount_ReferenceRangeBuilder.Impl withHighLimit(@NonNull Quantity highLimit) {
      this.highLimit = Optional.of(highLimit);
      return this;
    }

    public SubstanceAmount_ReferenceRangeBuilder.Impl withHighLimit(
        @NonNull QuantityBuilder highLimit) {
      this.highLimit = Optional.of(highLimit.build());
      return this;
    }

    public SubstanceAmount.ReferenceRange build() {
      return new SubstanceAmount.ReferenceRange(
          OptionConverters.toScala(id),
          OptionConverters.toScala(lowLimit),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(highLimit),
          LitUtils.emptyMetaElMap());
    }
  }
}
