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

public class Specimen_CollectionBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<CodeableConcept> method = Optional.empty();
  private Optional<Duration> duration = Optional.empty();
  private Optional<Quantity> quantity = Optional.empty();
  private Optional<CodeableConcept> bodySite = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Reference> collector = Optional.empty();
  private Optional<Choice<$bslash$div<FHIRDateTime, Period>>> collected = Optional.empty();
  private Optional<Choice<$bslash$div<CodeableConcept, Duration>>> fastingStatus = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();

  /** Required fields for {@link Specimen.Collection} */
  public Specimen_CollectionBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public Specimen_CollectionBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param method */
  public Specimen_CollectionBuilder withMethod(@NonNull CodeableConcept method) {
    this.method = Optional.of(method);
    return this;
  }
  /** @param duration */
  public Specimen_CollectionBuilder withDuration(@NonNull Duration duration) {
    this.duration = Optional.of(duration);
    return this;
  }
  /** @param quantity */
  public Specimen_CollectionBuilder withQuantity(@NonNull Quantity quantity) {
    this.quantity = Optional.of(quantity);
    return this;
  }
  /** @param bodySite */
  public Specimen_CollectionBuilder withBodySite(@NonNull CodeableConcept bodySite) {
    this.bodySite = Optional.of(bodySite);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public Specimen_CollectionBuilder withExtension(@NonNull Extension... extension) {
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
  public Specimen_CollectionBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param collector */
  public Specimen_CollectionBuilder withCollector(@NonNull Reference collector) {
    this.collector = Optional.of(collector);
    return this;
  }
  /** @param collected Field is a 'choice' field. Type should be one of FHIRDateTime, Period. */
  public <T> Specimen_CollectionBuilder withCollected(@NonNull T collected) {
    var guessedSuffix =
        autoSuffix(collected.getClass().getSimpleName(), Specimen.Collection$.MODULE$.collected());
    return withCollected(guessedSuffix, collected);
  }

  /**
   * Alternative to the 'main' withCollected method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param collected - The value to be passed to the builder
   */
  public <T> Specimen_CollectionBuilder withCollected(String suffix, @NonNull T collected) {
    guard(collected.getClass().getSimpleName(), suffix, Specimen.Collection$.MODULE$.collected());
    this.collected =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix, collected, Specimen.Collection$.MODULE$.collected()));
    return this;
  }
  /**
   * @param fastingStatus Field is a 'choice' field. Type should be one of CodeableConcept,
   *     Duration.
   */
  public <T> Specimen_CollectionBuilder withFastingStatus(@NonNull T fastingStatus) {
    var guessedSuffix =
        autoSuffix(
            fastingStatus.getClass().getSimpleName(), Specimen.Collection$.MODULE$.fastingStatus());
    return withFastingStatus(guessedSuffix, fastingStatus);
  }

  /**
   * Alternative to the 'main' withFastingStatus method. This will be marginally faster than the
   * other method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param fastingStatus - The value to be passed to the builder
   */
  public <T> Specimen_CollectionBuilder withFastingStatus(String suffix, @NonNull T fastingStatus) {
    guard(
        fastingStatus.getClass().getSimpleName(),
        suffix,
        Specimen.Collection$.MODULE$.fastingStatus());
    this.fastingStatus =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix, fastingStatus, Specimen.Collection$.MODULE$.fastingStatus()));
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
  public Specimen_CollectionBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public Specimen_CollectionBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }

  public Specimen.Collection build() {
    return new Specimen.Collection(
        OptionConverters.toScala(id),
        OptionConverters.toScala(method),
        OptionConverters.toScala(duration),
        OptionConverters.toScala(quantity),
        OptionConverters.toScala(bodySite),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(collector),
        OptionConverters.toScala(collected),
        OptionConverters.toScala(fastingStatus),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}