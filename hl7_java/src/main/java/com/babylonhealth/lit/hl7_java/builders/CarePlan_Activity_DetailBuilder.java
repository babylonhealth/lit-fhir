package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.CARE_PLAN_ACTIVITY_KIND;
import com.babylonhealth.lit.hl7.CARE_PLAN_ACTIVITY_STATUS;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.Option;
import scala.jdk.javaapi.OptionConverters;

public interface CarePlan_Activity_DetailBuilder {
  public CarePlan$Activity$Detail build();

  public static Impl init(CARE_PLAN_ACTIVITY_STATUS status) {
    return new Impl(status);
  }

  public static Impl builder(CARE_PLAN_ACTIVITY_STATUS status) {
    return new Impl(status);
  }

  public static ChoiceCodeableConceptOrReference product(CodeableConcept c) {
    return new ChoiceCodeableConceptOrReference(c);
  }

  public static ChoiceCodeableConceptOrReference product(Reference r) {
    return new ChoiceCodeableConceptOrReference(r);
  }

  public static ChoicePeriodOrStringOrTiming scheduled(Period p) {
    return new ChoicePeriodOrStringOrTiming(p);
  }

  public static ChoicePeriodOrStringOrTiming scheduled(String s) {
    return new ChoicePeriodOrStringOrTiming(s);
  }

  public static ChoicePeriodOrStringOrTiming scheduled(Timing t) {
    return new ChoicePeriodOrStringOrTiming(t);
  }

  public class Impl implements CarePlan_Activity_DetailBuilder {
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
    private Optional<ChoiceCodeableConceptOrReference> product = Optional.empty();
    private Optional<Quantity> dailyAmount = Optional.empty();
    private Optional<String> description = Optional.empty();
    private Optional<CodeableConcept> statusReason = Optional.empty();
    private Optional<Boolean> doNotPerform = Optional.empty();
    private Optional<ChoicePeriodOrStringOrTiming> scheduled = Optional.empty();
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
    public Impl(CARE_PLAN_ACTIVITY_STATUS status) {
      this.status = status;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public CarePlan_Activity_DetailBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param kind */
    public CarePlan_Activity_DetailBuilder.Impl withKind(@NonNull CARE_PLAN_ACTIVITY_KIND kind) {
      this.kind = Optional.of(kind);
      return this;
    }
    /** @param code */
    public CarePlan_Activity_DetailBuilder.Impl withCode(@NonNull CodeableConcept code) {
      this.code = Optional.of(code);
      return this;
    }

    public CarePlan_Activity_DetailBuilder.Impl withCode(@NonNull CodeableConceptBuilder code) {
      this.code = Optional.of(code.build());
      return this;
    }
    /** @param goal - Describes the intended objective(s) of carrying out the care plan. */
    public CarePlan_Activity_DetailBuilder.Impl withGoal(@NonNull Reference... goal) {
      this.goal = Arrays.asList(goal);
      return this;
    }
    /** @param goal - Describes the intended objective(s) of carrying out the care plan. */
    public CarePlan_Activity_DetailBuilder.Impl withGoal(@NonNull Collection<Reference> goal) {
      this.goal = Collections.unmodifiableCollection(goal);
      return this;
    }

    public CarePlan_Activity_DetailBuilder.Impl withGoal(@NonNull ReferenceBuilder... goal) {
      this.goal = Arrays.stream(goal).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param location */
    public CarePlan_Activity_DetailBuilder.Impl withLocation(@NonNull Reference location) {
      this.location = Optional.of(location);
      return this;
    }

    public CarePlan_Activity_DetailBuilder.Impl withLocation(@NonNull ReferenceBuilder location) {
      this.location = Optional.of(location.build());
      return this;
    }
    /** @param quantity */
    public CarePlan_Activity_DetailBuilder.Impl withQuantity(@NonNull Quantity quantity) {
      this.quantity = Optional.of(quantity);
      return this;
    }

    public CarePlan_Activity_DetailBuilder.Impl withQuantity(@NonNull QuantityBuilder quantity) {
      this.quantity = Optional.of(quantity.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public CarePlan_Activity_DetailBuilder.Impl withExtension(@NonNull Extension... extension) {
      this.extension = Arrays.asList(extension);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public CarePlan_Activity_DetailBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public CarePlan_Activity_DetailBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param performer */
    public CarePlan_Activity_DetailBuilder.Impl withPerformer(@NonNull Reference... performer) {
      this.performer = Arrays.asList(performer);
      return this;
    }
    /** @param performer */
    public CarePlan_Activity_DetailBuilder.Impl withPerformer(
        @NonNull Collection<Reference> performer) {
      this.performer = Collections.unmodifiableCollection(performer);
      return this;
    }

    public CarePlan_Activity_DetailBuilder.Impl withPerformer(
        @NonNull ReferenceBuilder... performer) {
      this.performer = Arrays.stream(performer).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param reasonCode */
    public CarePlan_Activity_DetailBuilder.Impl withReasonCode(
        @NonNull CodeableConcept... reasonCode) {
      this.reasonCode = Arrays.asList(reasonCode);
      return this;
    }
    /** @param reasonCode */
    public CarePlan_Activity_DetailBuilder.Impl withReasonCode(
        @NonNull Collection<CodeableConcept> reasonCode) {
      this.reasonCode = Collections.unmodifiableCollection(reasonCode);
      return this;
    }

    public CarePlan_Activity_DetailBuilder.Impl withReasonCode(
        @NonNull CodeableConceptBuilder... reasonCode) {
      this.reasonCode = Arrays.stream(reasonCode).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param product Field is a 'choice' field. Type should be one of CodeableConcept, Reference.
     *     To pass the value in, wrap with one of the CarePlan_Activity_DetailBuilder.product static
     *     methods
     */
    public CarePlan_Activity_DetailBuilder.Impl withProduct(
        @NonNull ChoiceCodeableConceptOrReference product) {
      this.product = Optional.of(product);
      return this;
    }
    /** @param dailyAmount */
    public CarePlan_Activity_DetailBuilder.Impl withDailyAmount(@NonNull Quantity dailyAmount) {
      this.dailyAmount = Optional.of(dailyAmount);
      return this;
    }

    public CarePlan_Activity_DetailBuilder.Impl withDailyAmount(
        @NonNull QuantityBuilder dailyAmount) {
      this.dailyAmount = Optional.of(dailyAmount.build());
      return this;
    }
    /** @param description - A description of the scope and nature of the plan. */
    public CarePlan_Activity_DetailBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /** @param statusReason */
    public CarePlan_Activity_DetailBuilder.Impl withStatusReason(
        @NonNull CodeableConcept statusReason) {
      this.statusReason = Optional.of(statusReason);
      return this;
    }

    public CarePlan_Activity_DetailBuilder.Impl withStatusReason(
        @NonNull CodeableConceptBuilder statusReason) {
      this.statusReason = Optional.of(statusReason.build());
      return this;
    }
    /** @param doNotPerform */
    public CarePlan_Activity_DetailBuilder.Impl withDoNotPerform(@NonNull Boolean doNotPerform) {
      this.doNotPerform = Optional.of(doNotPerform);
      return this;
    }
    /**
     * @param scheduled Field is a 'choice' field. Type should be one of Period, String, Timing. To
     *     pass the value in, wrap with one of the CarePlan_Activity_DetailBuilder.scheduled static
     *     methods
     */
    public CarePlan_Activity_DetailBuilder.Impl withScheduled(
        @NonNull ChoicePeriodOrStringOrTiming scheduled) {
      this.scheduled = Optional.of(scheduled);
      return this;
    }
    /**
     * @param instantiatesUri - The URL pointing to an externally maintained protocol, guideline,
     *     questionnaire or other definition that is adhered to in whole or in part by this
     *     CarePlan.
     */
    public CarePlan_Activity_DetailBuilder.Impl withInstantiatesUri(
        @NonNull String... instantiatesUri) {
      this.instantiatesUri = Arrays.asList(instantiatesUri);
      return this;
    }
    /**
     * @param instantiatesUri - The URL pointing to an externally maintained protocol, guideline,
     *     questionnaire or other definition that is adhered to in whole or in part by this
     *     CarePlan.
     */
    public CarePlan_Activity_DetailBuilder.Impl withInstantiatesUri(
        @NonNull Collection<String> instantiatesUri) {
      this.instantiatesUri = Collections.unmodifiableCollection(instantiatesUri);
      return this;
    }
    /** @param reasonReference */
    public CarePlan_Activity_DetailBuilder.Impl withReasonReference(
        @NonNull Reference... reasonReference) {
      this.reasonReference = Arrays.asList(reasonReference);
      return this;
    }
    /** @param reasonReference */
    public CarePlan_Activity_DetailBuilder.Impl withReasonReference(
        @NonNull Collection<Reference> reasonReference) {
      this.reasonReference = Collections.unmodifiableCollection(reasonReference);
      return this;
    }

    public CarePlan_Activity_DetailBuilder.Impl withReasonReference(
        @NonNull ReferenceBuilder... reasonReference) {
      this.reasonReference = Arrays.stream(reasonReference).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the resource and that modifies the understanding of the
     *     element that contains it and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer is allowed to define an
     *     extension, there is a set of requirements that SHALL be met as part of the definition of
     *     the extension. Applications processing a resource are required to check for modifier
     *     extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public CarePlan_Activity_DetailBuilder.Impl withModifierExtension(
        @NonNull Extension... modifierExtension) {
      this.modifierExtension = Arrays.asList(modifierExtension);
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the resource and that modifies the understanding of the
     *     element that contains it and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer is allowed to define an
     *     extension, there is a set of requirements that SHALL be met as part of the definition of
     *     the extension. Applications processing a resource are required to check for modifier
     *     extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public CarePlan_Activity_DetailBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public CarePlan_Activity_DetailBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param instantiatesCanonical - The URL pointing to a FHIR-defined protocol, guideline,
     *     questionnaire or other definition that is adhered to in whole or in part by this
     *     CarePlan.
     */
    public CarePlan_Activity_DetailBuilder.Impl withInstantiatesCanonical(
        @NonNull String... instantiatesCanonical) {
      this.instantiatesCanonical = Arrays.asList(instantiatesCanonical);
      return this;
    }
    /**
     * @param instantiatesCanonical - The URL pointing to a FHIR-defined protocol, guideline,
     *     questionnaire or other definition that is adhered to in whole or in part by this
     *     CarePlan.
     */
    public CarePlan_Activity_DetailBuilder.Impl withInstantiatesCanonical(
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
          (Option) OptionConverters.toScala(product),
          OptionConverters.toScala(dailyAmount),
          OptionConverters.toScala(description),
          OptionConverters.toScala(statusReason),
          OptionConverters.toScala(doNotPerform.map(x -> (Object) x)),
          (Option) OptionConverters.toScala(scheduled),
          instantiatesUri.stream().collect(new LitSeqJCollector<>()),
          reasonReference.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          instantiatesCanonical.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
