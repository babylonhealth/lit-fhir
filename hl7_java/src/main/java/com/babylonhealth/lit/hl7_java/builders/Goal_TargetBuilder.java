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

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class Goal_TargetBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Choice<$bslash$div<Duration, FHIRDate>>> due = Optional.empty();
  private Optional<CodeableConcept> measure = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Choice> detail = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();

  /** Required fields for {@link Goal.Target} */
  public Goal_TargetBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public Goal_TargetBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param due Field is a 'choice' field. Type should be one of Duration, FHIRDate. */
  public <T> Goal_TargetBuilder withDue(@NonNull T due) {
    var guessedSuffix = autoSuffix(due.getClass().getSimpleName(), Goal.Target$.MODULE$.due());
    return withDue(guessedSuffix, due);
  }

  /**
   * Alternative to the 'main' withDue method. This will be marginally faster than the other method,
   * but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param due - The value to be passed to the builder
   */
  public <T> Goal_TargetBuilder withDue(String suffix, @NonNull T due) {
    guard(due.getClass().getSimpleName(), suffix, Goal.Target$.MODULE$.due());
    this.due =
        Optional.of((Choice) Choice$.MODULE$.fromSuffix(suffix, due, Goal.Target$.MODULE$.due()));
    return this;
  }
  /** @param measure */
  public Goal_TargetBuilder withMeasure(@NonNull CodeableConcept measure) {
    this.measure = Optional.of(measure);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public Goal_TargetBuilder withExtension(@NonNull Extension... extension) {
    this.extension = Arrays.asList(extension);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public Goal_TargetBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param detail Field is a 'choice' field. Type should be one of Boolean, CodeableConcept,
   *     Integer, Quantity, Range, Ratio, String.
   */
  public <T> Goal_TargetBuilder withDetail(@NonNull T detail) {
    var guessedSuffix =
        autoSuffix(detail.getClass().getSimpleName(), Goal.Target$.MODULE$.detail());
    return withDetail(guessedSuffix, detail);
  }

  /**
   * Alternative to the 'main' withDetail method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param detail - The value to be passed to the builder
   */
  public <T> Goal_TargetBuilder withDetail(String suffix, @NonNull T detail) {
    guard(detail.getClass().getSimpleName(), suffix, Goal.Target$.MODULE$.detail());
    this.detail =
        Optional.of(
            (Choice) Choice$.MODULE$.fromSuffix(suffix, detail, Goal.Target$.MODULE$.detail()));
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the resource and that modifies the understanding of the element
   *     that contains it and/or the understanding of the containing element's descendants. Usually
   *     modifier elements provide negation or qualification. To make the use of extensions safe and
   *     manageable, there is a strict set of governance applied to the definition and use of
   *     extensions. Though any implementer is allowed to define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public Goal_TargetBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
    this.modifierExtension = Arrays.asList(modifierExtension);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the resource and that modifies the understanding of the element
   *     that contains it and/or the understanding of the containing element's descendants. Usually
   *     modifier elements provide negation or qualification. To make the use of extensions safe and
   *     manageable, there is a strict set of governance applied to the definition and use of
   *     extensions. Though any implementer is allowed to define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public Goal_TargetBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }

  public Goal.Target build() {
    return new Goal.Target(
        OptionConverters.toScala(id),
        OptionConverters.toScala(due),
        OptionConverters.toScala(measure),
        extension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(detail),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}