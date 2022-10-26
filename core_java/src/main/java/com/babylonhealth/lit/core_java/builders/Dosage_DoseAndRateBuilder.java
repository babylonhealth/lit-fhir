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
import scala.Option;
import scala.jdk.javaapi.OptionConverters;

public interface Dosage_DoseAndRateBuilder {
  public Dosage.DoseAndRate build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public static ChoiceQuantityOrRange dose(Quantity q) {
    return new ChoiceQuantityOrRange(q);
  }

  public static ChoiceQuantityOrRange dose(Range r) {
    return new ChoiceQuantityOrRange(r);
  }

  public static ChoiceQuantityOrRangeOrRatio rate(Quantity q) {
    return new ChoiceQuantityOrRangeOrRatio(q);
  }

  public static ChoiceQuantityOrRangeOrRatio rate(Range r) {
    return new ChoiceQuantityOrRangeOrRatio(r);
  }

  public static ChoiceQuantityOrRangeOrRatio rate(Ratio r) {
    return new ChoiceQuantityOrRangeOrRatio(r);
  }

  public class Impl implements Dosage_DoseAndRateBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> _type = Optional.empty();
    private Optional<ChoiceQuantityOrRange> dose = Optional.empty();
    private Optional<ChoiceQuantityOrRangeOrRatio> rate = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();

    /** Required fields for {@link Dosage.DoseAndRate} */
    public Impl() {}

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Dosage_DoseAndRateBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param _type */
    public Dosage_DoseAndRateBuilder.Impl withType(@NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public Dosage_DoseAndRateBuilder.Impl withType(@NonNull CodeableConceptBuilder _type) {
      this._type = Optional.of(_type.build());
      return this;
    }
    /**
     * @param dose Field is a 'choice' field. Type should be one of Quantity, Range. To pass the
     *     value in, wrap with one of the Dosage_DoseAndRateBuilder.dose static methods
     */
    public Dosage_DoseAndRateBuilder.Impl withDose(@NonNull ChoiceQuantityOrRange dose) {
      this.dose = Optional.of(dose);
      return this;
    }
    /**
     * @param rate Field is a 'choice' field. Type should be one of Quantity, Range, Ratio. To pass
     *     the value in, wrap with one of the Dosage_DoseAndRateBuilder.rate static methods
     */
    public Dosage_DoseAndRateBuilder.Impl withRate(@NonNull ChoiceQuantityOrRangeOrRatio rate) {
      this.rate = Optional.of(rate);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public Dosage_DoseAndRateBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Dosage_DoseAndRateBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Dosage_DoseAndRateBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }

    public Dosage.DoseAndRate build() {
      return new Dosage.DoseAndRate(
          OptionConverters.toScala(id),
          OptionConverters.toScala(_type),
          (Option) OptionConverters.toScala(dose),
          (Option) OptionConverters.toScala(rate),
          extension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
