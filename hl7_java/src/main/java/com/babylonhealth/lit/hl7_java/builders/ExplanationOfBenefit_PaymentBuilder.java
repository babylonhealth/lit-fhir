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

public class ExplanationOfBenefit_PaymentBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<CodeableConcept> _type = Optional.empty();
  private Optional<FHIRDate> date = Optional.empty();
  private Optional<Money> amount = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Money> adjustment = Optional.empty();
  private Optional<Identifier> identifier = Optional.empty();
  private Optional<CodeableConcept> adjustmentReason = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();

  /** Required fields for {@link ExplanationOfBenefit.Payment} */
  public ExplanationOfBenefit_PaymentBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public ExplanationOfBenefit_PaymentBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param _type - The category of claim, e.g. oral, pharmacy, vision, institutional, professional.
   */
  public ExplanationOfBenefit_PaymentBuilder withType(@NonNull CodeableConcept _type) {
    this._type = Optional.of(_type);
    return this;
  }
  /** @param date */
  public ExplanationOfBenefit_PaymentBuilder withDate(@NonNull FHIRDate date) {
    this.date = Optional.of(date);
    return this;
  }
  /** @param amount */
  public ExplanationOfBenefit_PaymentBuilder withAmount(@NonNull Money amount) {
    this.amount = Optional.of(amount);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public ExplanationOfBenefit_PaymentBuilder withExtension(@NonNull Extension... extension) {
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
  public ExplanationOfBenefit_PaymentBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param adjustment */
  public ExplanationOfBenefit_PaymentBuilder withAdjustment(@NonNull Money adjustment) {
    this.adjustment = Optional.of(adjustment);
    return this;
  }
  /** @param identifier - A unique identifier assigned to this explanation of benefit. */
  public ExplanationOfBenefit_PaymentBuilder withIdentifier(@NonNull Identifier identifier) {
    this.identifier = Optional.of(identifier);
    return this;
  }
  /** @param adjustmentReason */
  public ExplanationOfBenefit_PaymentBuilder withAdjustmentReason(
      @NonNull CodeableConcept adjustmentReason) {
    this.adjustmentReason = Optional.of(adjustmentReason);
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
  public ExplanationOfBenefit_PaymentBuilder withModifierExtension(
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
  public ExplanationOfBenefit_PaymentBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }

  public ExplanationOfBenefit.Payment build() {
    return new ExplanationOfBenefit.Payment(
        OptionConverters.toScala(id),
        OptionConverters.toScala(_type),
        OptionConverters.toScala(date),
        OptionConverters.toScala(amount),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(adjustment),
        OptionConverters.toScala(identifier),
        OptionConverters.toScala(adjustmentReason),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
