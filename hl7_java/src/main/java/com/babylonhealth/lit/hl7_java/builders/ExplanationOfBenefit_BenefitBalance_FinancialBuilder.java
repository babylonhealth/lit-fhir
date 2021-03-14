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

public class ExplanationOfBenefit_BenefitBalance_FinancialBuilder {
  private Optional<String> id = Optional.empty();
  private CodeableConcept _type;
  private Optional<Choice> used = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Choice> allowed = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();

  /**
   * Required fields for {@link ExplanationOfBenefit$BenefitBalance$Financial}
   *
   * @param _type - The category of claim, e.g. oral, pharmacy, vision, institutional, professional.
   */
  public ExplanationOfBenefit_BenefitBalance_FinancialBuilder(CodeableConcept _type) {
    this._type = _type;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public ExplanationOfBenefit_BenefitBalance_FinancialBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param used Field is a 'choice' field. Type should be one of Money, Integer. */
  public <T> ExplanationOfBenefit_BenefitBalance_FinancialBuilder withUsed(@NonNull T used) {
    var guessedSuffix =
        autoSuffix(
            used.getClass().getSimpleName(),
            ExplanationOfBenefit$BenefitBalance$Financial$.MODULE$.used());
    return withUsed(guessedSuffix, used);
  }

  /**
   * Alternative to the 'main' withUsed method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param used - The value to be passed to the builder
   */
  public <T> ExplanationOfBenefit_BenefitBalance_FinancialBuilder withUsed(
      String suffix, @NonNull T used) {
    guard(
        used.getClass().getSimpleName(),
        suffix,
        ExplanationOfBenefit$BenefitBalance$Financial$.MODULE$.used());
    this.used =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix, used, ExplanationOfBenefit$BenefitBalance$Financial$.MODULE$.used()));
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public ExplanationOfBenefit_BenefitBalance_FinancialBuilder withExtension(
      @NonNull Extension... extension) {
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
  public ExplanationOfBenefit_BenefitBalance_FinancialBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param allowed Field is a 'choice' field. Type should be one of Money, String, Integer. */
  public <T> ExplanationOfBenefit_BenefitBalance_FinancialBuilder withAllowed(@NonNull T allowed) {
    var guessedSuffix =
        autoSuffix(
            allowed.getClass().getSimpleName(),
            ExplanationOfBenefit$BenefitBalance$Financial$.MODULE$.allowed());
    return withAllowed(guessedSuffix, allowed);
  }

  /**
   * Alternative to the 'main' withAllowed method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param allowed - The value to be passed to the builder
   */
  public <T> ExplanationOfBenefit_BenefitBalance_FinancialBuilder withAllowed(
      String suffix, @NonNull T allowed) {
    guard(
        allowed.getClass().getSimpleName(),
        suffix,
        ExplanationOfBenefit$BenefitBalance$Financial$.MODULE$.allowed());
    this.allowed =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix,
                    allowed,
                    ExplanationOfBenefit$BenefitBalance$Financial$.MODULE$.allowed()));
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
  public ExplanationOfBenefit_BenefitBalance_FinancialBuilder withModifierExtension(
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
  public ExplanationOfBenefit_BenefitBalance_FinancialBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }

  public ExplanationOfBenefit$BenefitBalance$Financial build() {
    return new ExplanationOfBenefit$BenefitBalance$Financial(
        OptionConverters.toScala(id),
        _type,
        (Option) OptionConverters.toScala(used),
        extension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(allowed),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}