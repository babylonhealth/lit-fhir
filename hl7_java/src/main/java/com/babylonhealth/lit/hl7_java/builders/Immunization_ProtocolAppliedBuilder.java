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

public class Immunization_ProtocolAppliedBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<String> series = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Reference> authority = Optional.empty();
  private Collection<CodeableConcept> targetDisease = Collections.emptyList();
  private Choice doseNumber;
  private Optional<Choice> seriesDoses = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();

  /**
   * Required fields for {@link Immunization.ProtocolApplied}
   *
   * @param doseNumber Field is a 'choice' field. Type should be one of Integer, String.
   */
  public Immunization_ProtocolAppliedBuilder(@NonNull Object doseNumber) {
    this.doseNumber =
        (Choice)
            Choice$.MODULE$.fromSuffix(
                autoSuffix(
                    doseNumber.getClass().getSimpleName(),
                    Immunization.ProtocolApplied$.MODULE$.doseNumber()),
                doseNumber,
                Immunization.ProtocolApplied$.MODULE$.doseNumber());
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public Immunization_ProtocolAppliedBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param series */
  public Immunization_ProtocolAppliedBuilder withSeries(@NonNull String series) {
    this.series = Optional.of(series);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public Immunization_ProtocolAppliedBuilder withExtension(@NonNull Extension... extension) {
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
  public Immunization_ProtocolAppliedBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param authority */
  public Immunization_ProtocolAppliedBuilder withAuthority(@NonNull Reference authority) {
    this.authority = Optional.of(authority);
    return this;
  }
  /** @param targetDisease */
  public Immunization_ProtocolAppliedBuilder withTargetDisease(
      @NonNull CodeableConcept... targetDisease) {
    this.targetDisease = Arrays.asList(targetDisease);
    return this;
  }
  /** @param targetDisease */
  public Immunization_ProtocolAppliedBuilder withTargetDisease(
      @NonNull Collection<CodeableConcept> targetDisease) {
    this.targetDisease = Collections.unmodifiableCollection(targetDisease);
    return this;
  }
  /** @param seriesDoses Field is a 'choice' field. Type should be one of Integer, String. */
  public <T> Immunization_ProtocolAppliedBuilder withSeriesDoses(@NonNull T seriesDoses) {
    var guessedSuffix =
        autoSuffix(
            seriesDoses.getClass().getSimpleName(),
            Immunization.ProtocolApplied$.MODULE$.seriesDoses());
    return withSeriesDoses(guessedSuffix, seriesDoses);
  }

  /**
   * Alternative to the 'main' withSeriesDoses method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param seriesDoses - The value to be passed to the builder
   */
  public <T> Immunization_ProtocolAppliedBuilder withSeriesDoses(
      String suffix, @NonNull T seriesDoses) {
    guard(
        seriesDoses.getClass().getSimpleName(),
        suffix,
        Immunization.ProtocolApplied$.MODULE$.seriesDoses());
    this.seriesDoses =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix, seriesDoses, Immunization.ProtocolApplied$.MODULE$.seriesDoses()));
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
  public Immunization_ProtocolAppliedBuilder withModifierExtension(
      @NonNull Extension... modifierExtension) {
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
  public Immunization_ProtocolAppliedBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }

  public Immunization.ProtocolApplied build() {
    return new Immunization.ProtocolApplied(
        OptionConverters.toScala(id),
        OptionConverters.toScala(series),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(authority),
        targetDisease.stream().collect(new LitSeqJCollector<>()),
        (Choice) doseNumber,
        (Option) OptionConverters.toScala(seriesDoses),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
