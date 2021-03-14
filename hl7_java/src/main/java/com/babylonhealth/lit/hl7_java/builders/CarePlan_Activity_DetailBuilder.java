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
import com.babylonhealth.lit.hl7.CARE_PLAN_ACTIVITY_KIND;
import com.babylonhealth.lit.hl7.CARE_PLAN_ACTIVITY_STATUS;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class CarePlan_Activity_DetailBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<CARE_PLAN_ACTIVITY_KIND> kind = Optional.empty();
  private Optional<CodeableConcept> code = Optional.empty();
  private Collection<Reference> goal = Collections.emptyList();
  private CARE_PLAN_ACTIVITY_STATUS status;
  private Optional<Reference> location = Optional.empty();
  private Optional<Quantity> quantity = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<Reference> performer = Collections.emptyList();
  private Collection<CodeableConcept> reasonCode = Collections.emptyList();
  private Optional<Choice<$bslash$div<CodeableConcept, Reference>>> product = Optional.empty();
  private Optional<Quantity> dailyAmount = Optional.empty();
  private Optional<String> description = Optional.empty();
  private Optional<CodeableConcept> statusReason = Optional.empty();
  private Optional<Boolean> doNotPerform = Optional.empty();
  private Optional<Choice<$bslash$div<$bslash$div<Period, String>, Timing>>> scheduled =
      Optional.empty();
  private Collection<String> instantiatesUri = Collections.emptyList();
  private Collection<Reference> reasonReference = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<String> instantiatesCanonical = Collections.emptyList();

  /**
   * Required fields for {@link CarePlan$Activity$Detail}
   *
   * @param status - Indicates whether the plan is currently being acted upon, represents future
   *     intentions or is now a historical record.
   */
  public CarePlan_Activity_DetailBuilder(CARE_PLAN_ACTIVITY_STATUS status) {
    this.status = status;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public CarePlan_Activity_DetailBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param kind */
  public CarePlan_Activity_DetailBuilder withKind(@NonNull CARE_PLAN_ACTIVITY_KIND kind) {
    this.kind = Optional.of(kind);
    return this;
  }
  /** @param code */
  public CarePlan_Activity_DetailBuilder withCode(@NonNull CodeableConcept code) {
    this.code = Optional.of(code);
    return this;
  }
  /** @param goal - Describes the intended objective(s) of carrying out the care plan. */
  public CarePlan_Activity_DetailBuilder withGoal(@NonNull Reference... goal) {
    this.goal = Arrays.asList(goal);
    return this;
  }
  /** @param goal - Describes the intended objective(s) of carrying out the care plan. */
  public CarePlan_Activity_DetailBuilder withGoal(@NonNull Collection<Reference> goal) {
    this.goal = Collections.unmodifiableCollection(goal);
    return this;
  }
  /** @param location */
  public CarePlan_Activity_DetailBuilder withLocation(@NonNull Reference location) {
    this.location = Optional.of(location);
    return this;
  }
  /** @param quantity */
  public CarePlan_Activity_DetailBuilder withQuantity(@NonNull Quantity quantity) {
    this.quantity = Optional.of(quantity);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public CarePlan_Activity_DetailBuilder withExtension(@NonNull Extension... extension) {
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
  public CarePlan_Activity_DetailBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param performer */
  public CarePlan_Activity_DetailBuilder withPerformer(@NonNull Reference... performer) {
    this.performer = Arrays.asList(performer);
    return this;
  }
  /** @param performer */
  public CarePlan_Activity_DetailBuilder withPerformer(@NonNull Collection<Reference> performer) {
    this.performer = Collections.unmodifiableCollection(performer);
    return this;
  }
  /** @param reasonCode */
  public CarePlan_Activity_DetailBuilder withReasonCode(@NonNull CodeableConcept... reasonCode) {
    this.reasonCode = Arrays.asList(reasonCode);
    return this;
  }
  /** @param reasonCode */
  public CarePlan_Activity_DetailBuilder withReasonCode(
      @NonNull Collection<CodeableConcept> reasonCode) {
    this.reasonCode = Collections.unmodifiableCollection(reasonCode);
    return this;
  }
  /** @param product Field is a 'choice' field. Type should be one of CodeableConcept, Reference. */
  public <T> CarePlan_Activity_DetailBuilder withProduct(@NonNull T product) {
    var guessedSuffix =
        autoSuffix(product.getClass().getSimpleName(), CarePlan$Activity$Detail$.MODULE$.product());
    return withProduct(guessedSuffix, product);
  }

  /**
   * Alternative to the 'main' withProduct method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param product - The value to be passed to the builder
   */
  public <T> CarePlan_Activity_DetailBuilder withProduct(String suffix, @NonNull T product) {
    guard(product.getClass().getSimpleName(), suffix, CarePlan$Activity$Detail$.MODULE$.product());
    this.product =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix, product, CarePlan$Activity$Detail$.MODULE$.product()));
    return this;
  }
  /** @param dailyAmount */
  public CarePlan_Activity_DetailBuilder withDailyAmount(@NonNull Quantity dailyAmount) {
    this.dailyAmount = Optional.of(dailyAmount);
    return this;
  }
  /** @param description - A description of the scope and nature of the plan. */
  public CarePlan_Activity_DetailBuilder withDescription(@NonNull String description) {
    this.description = Optional.of(description);
    return this;
  }
  /** @param statusReason */
  public CarePlan_Activity_DetailBuilder withStatusReason(@NonNull CodeableConcept statusReason) {
    this.statusReason = Optional.of(statusReason);
    return this;
  }
  /** @param doNotPerform */
  public CarePlan_Activity_DetailBuilder withDoNotPerform(@NonNull Boolean doNotPerform) {
    this.doNotPerform = Optional.of(doNotPerform);
    return this;
  }
  /** @param scheduled Field is a 'choice' field. Type should be one of Period, String, Timing. */
  public <T> CarePlan_Activity_DetailBuilder withScheduled(@NonNull T scheduled) {
    var guessedSuffix =
        autoSuffix(
            scheduled.getClass().getSimpleName(), CarePlan$Activity$Detail$.MODULE$.scheduled());
    return withScheduled(guessedSuffix, scheduled);
  }

  /**
   * Alternative to the 'main' withScheduled method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param scheduled - The value to be passed to the builder
   */
  public <T> CarePlan_Activity_DetailBuilder withScheduled(String suffix, @NonNull T scheduled) {
    guard(
        scheduled.getClass().getSimpleName(),
        suffix,
        CarePlan$Activity$Detail$.MODULE$.scheduled());
    this.scheduled =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix, scheduled, CarePlan$Activity$Detail$.MODULE$.scheduled()));
    return this;
  }
  /**
   * @param instantiatesUri - The URL pointing to an externally maintained protocol, guideline,
   *     questionnaire or other definition that is adhered to in whole or in part by this CarePlan.
   */
  public CarePlan_Activity_DetailBuilder withInstantiatesUri(@NonNull String... instantiatesUri) {
    this.instantiatesUri = Arrays.asList(instantiatesUri);
    return this;
  }
  /**
   * @param instantiatesUri - The URL pointing to an externally maintained protocol, guideline,
   *     questionnaire or other definition that is adhered to in whole or in part by this CarePlan.
   */
  public CarePlan_Activity_DetailBuilder withInstantiatesUri(
      @NonNull Collection<String> instantiatesUri) {
    this.instantiatesUri = Collections.unmodifiableCollection(instantiatesUri);
    return this;
  }
  /** @param reasonReference */
  public CarePlan_Activity_DetailBuilder withReasonReference(
      @NonNull Reference... reasonReference) {
    this.reasonReference = Arrays.asList(reasonReference);
    return this;
  }
  /** @param reasonReference */
  public CarePlan_Activity_DetailBuilder withReasonReference(
      @NonNull Collection<Reference> reasonReference) {
    this.reasonReference = Collections.unmodifiableCollection(reasonReference);
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
  public CarePlan_Activity_DetailBuilder withModifierExtension(
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
  public CarePlan_Activity_DetailBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param instantiatesCanonical - The URL pointing to a FHIR-defined protocol, guideline,
   *     questionnaire or other definition that is adhered to in whole or in part by this CarePlan.
   */
  public CarePlan_Activity_DetailBuilder withInstantiatesCanonical(
      @NonNull String... instantiatesCanonical) {
    this.instantiatesCanonical = Arrays.asList(instantiatesCanonical);
    return this;
  }
  /**
   * @param instantiatesCanonical - The URL pointing to a FHIR-defined protocol, guideline,
   *     questionnaire or other definition that is adhered to in whole or in part by this CarePlan.
   */
  public CarePlan_Activity_DetailBuilder withInstantiatesCanonical(
      @NonNull Collection<String> instantiatesCanonical) {
    this.instantiatesCanonical = Collections.unmodifiableCollection(instantiatesCanonical);
    return this;
  }

  public CarePlan$Activity$Detail build() {
    return new CarePlan$Activity$Detail(
        OptionConverters.toScala(id),
        OptionConverters.toScala(kind),
        OptionConverters.toScala(code),
        goal.stream().collect(new LitSeqJCollector<>()),
        status,
        OptionConverters.toScala(location),
        OptionConverters.toScala(quantity),
        extension.stream().collect(new LitSeqJCollector<>()),
        performer.stream().collect(new LitSeqJCollector<>()),
        reasonCode.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(product),
        OptionConverters.toScala(dailyAmount),
        OptionConverters.toScala(description),
        OptionConverters.toScala(statusReason),
        OptionConverters.toScala(doNotPerform.map(x -> (Object) x)),
        OptionConverters.toScala(scheduled),
        instantiatesUri.stream().collect(new LitSeqJCollector<>()),
        reasonReference.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        instantiatesCanonical.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
