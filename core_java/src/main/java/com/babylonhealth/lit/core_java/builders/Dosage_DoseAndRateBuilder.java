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

public class Dosage_DoseAndRateBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<CodeableConcept> _type = Optional.empty();
  private Optional<Choice<$bslash$div<Quantity, Range>>> dose = Optional.empty();
  private Optional<Choice<$bslash$div<$bslash$div<Quantity, Range>, Ratio>>> rate =
      Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();

  /** Required fields for {@link Dosage.DoseAndRate} */
  public Dosage_DoseAndRateBuilder() {}

  /**
   * @param id - Unique id for the element within a resource (for internal references). This may be
   *     any string value that does not contain spaces.
   */
  public Dosage_DoseAndRateBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param _type */
  public Dosage_DoseAndRateBuilder withType(@NonNull CodeableConcept _type) {
    this._type = Optional.of(_type);
    return this;
  }
  /** @param dose Field is a 'choice' field. Type should be one of Quantity, Range. */
  public <T> Dosage_DoseAndRateBuilder withDose(@NonNull T dose) {
    var guessedSuffix =
        autoSuffix(dose.getClass().getSimpleName(), Dosage.DoseAndRate$.MODULE$.dose());
    return withDose(guessedSuffix, dose);
  }

  /**
   * Alternative to the 'main' withDose method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param dose - The value to be passed to the builder
   */
  public <T> Dosage_DoseAndRateBuilder withDose(String suffix, @NonNull T dose) {
    guard(dose.getClass().getSimpleName(), suffix, Dosage.DoseAndRate$.MODULE$.dose());
    this.dose =
        Optional.of(
            (Choice) Choice$.MODULE$.fromSuffix(suffix, dose, Dosage.DoseAndRate$.MODULE$.dose()));
    return this;
  }
  /** @param rate Field is a 'choice' field. Type should be one of Quantity, Range, Ratio. */
  public <T> Dosage_DoseAndRateBuilder withRate(@NonNull T rate) {
    var guessedSuffix =
        autoSuffix(rate.getClass().getSimpleName(), Dosage.DoseAndRate$.MODULE$.rate());
    return withRate(guessedSuffix, rate);
  }

  /**
   * Alternative to the 'main' withRate method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param rate - The value to be passed to the builder
   */
  public <T> Dosage_DoseAndRateBuilder withRate(String suffix, @NonNull T rate) {
    guard(rate.getClass().getSimpleName(), suffix, Dosage.DoseAndRate$.MODULE$.rate());
    this.rate =
        Optional.of(
            (Choice) Choice$.MODULE$.fromSuffix(suffix, rate, Dosage.DoseAndRate$.MODULE$.rate()));
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the element. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public Dosage_DoseAndRateBuilder withExtension(@NonNull Extension... extension) {
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
  public Dosage_DoseAndRateBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }

  public Dosage.DoseAndRate build() {
    return new Dosage.DoseAndRate(
        OptionConverters.toScala(id),
        OptionConverters.toScala(_type),
        OptionConverters.toScala(dose),
        OptionConverters.toScala(rate),
        extension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
