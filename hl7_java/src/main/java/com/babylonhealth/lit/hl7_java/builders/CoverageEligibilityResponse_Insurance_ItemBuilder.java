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
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class CoverageEligibilityResponse_Insurance_ItemBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<String> name = Optional.empty();
  private Optional<CodeableConcept> unit = Optional.empty();
  private Optional<CodeableConcept> term = Optional.empty();
  private Optional<CodeableConcept> network = Optional.empty();
  private Optional<CodeableConcept> category = Optional.empty();
  private Collection<CodeableConcept> modifier = Collections.emptyList();
  private Optional<Reference> provider = Optional.empty();
  private Optional<Boolean> excluded = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<String> description = Optional.empty();
  private Optional<CodeableConcept> productOrService = Optional.empty();
  private Optional<String> authorizationUrl = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<Boolean> authorizationRequired = Optional.empty();
  private Collection<CodeableConcept> authorizationSupporting = Collections.emptyList();
  private Collection<CoverageEligibilityResponse$Insurance$Item$Benefit> benefit =
      Collections.emptyList();

  /** Required fields for {@link CoverageEligibilityResponse$Insurance$Item} */
  public CoverageEligibilityResponse_Insurance_ItemBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public CoverageEligibilityResponse_Insurance_ItemBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param name */
  public CoverageEligibilityResponse_Insurance_ItemBuilder withName(@NonNull String name) {
    this.name = Optional.of(name);
    return this;
  }
  /** @param unit */
  public CoverageEligibilityResponse_Insurance_ItemBuilder withUnit(@NonNull CodeableConcept unit) {
    this.unit = Optional.of(unit);
    return this;
  }
  /** @param term */
  public CoverageEligibilityResponse_Insurance_ItemBuilder withTerm(@NonNull CodeableConcept term) {
    this.term = Optional.of(term);
    return this;
  }
  /** @param network */
  public CoverageEligibilityResponse_Insurance_ItemBuilder withNetwork(
      @NonNull CodeableConcept network) {
    this.network = Optional.of(network);
    return this;
  }
  /** @param category */
  public CoverageEligibilityResponse_Insurance_ItemBuilder withCategory(
      @NonNull CodeableConcept category) {
    this.category = Optional.of(category);
    return this;
  }
  /** @param modifier */
  public CoverageEligibilityResponse_Insurance_ItemBuilder withModifier(
      @NonNull CodeableConcept... modifier) {
    this.modifier = Arrays.asList(modifier);
    return this;
  }
  /** @param modifier */
  public CoverageEligibilityResponse_Insurance_ItemBuilder withModifier(
      @NonNull Collection<CodeableConcept> modifier) {
    this.modifier = Collections.unmodifiableCollection(modifier);
    return this;
  }
  /** @param provider */
  public CoverageEligibilityResponse_Insurance_ItemBuilder withProvider(
      @NonNull Reference provider) {
    this.provider = Optional.of(provider);
    return this;
  }
  /** @param excluded */
  public CoverageEligibilityResponse_Insurance_ItemBuilder withExcluded(@NonNull Boolean excluded) {
    this.excluded = Optional.of(excluded);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public CoverageEligibilityResponse_Insurance_ItemBuilder withExtension(
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
  public CoverageEligibilityResponse_Insurance_ItemBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param description */
  public CoverageEligibilityResponse_Insurance_ItemBuilder withDescription(
      @NonNull String description) {
    this.description = Optional.of(description);
    return this;
  }
  /** @param productOrService */
  public CoverageEligibilityResponse_Insurance_ItemBuilder withProductOrService(
      @NonNull CodeableConcept productOrService) {
    this.productOrService = Optional.of(productOrService);
    return this;
  }
  /** @param authorizationUrl */
  public CoverageEligibilityResponse_Insurance_ItemBuilder withAuthorizationUrl(
      @NonNull String authorizationUrl) {
    this.authorizationUrl = Optional.of(authorizationUrl);
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
  public CoverageEligibilityResponse_Insurance_ItemBuilder withModifierExtension(
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
  public CoverageEligibilityResponse_Insurance_ItemBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param authorizationRequired */
  public CoverageEligibilityResponse_Insurance_ItemBuilder withAuthorizationRequired(
      @NonNull Boolean authorizationRequired) {
    this.authorizationRequired = Optional.of(authorizationRequired);
    return this;
  }
  /** @param authorizationSupporting */
  public CoverageEligibilityResponse_Insurance_ItemBuilder withAuthorizationSupporting(
      @NonNull CodeableConcept... authorizationSupporting) {
    this.authorizationSupporting = Arrays.asList(authorizationSupporting);
    return this;
  }
  /** @param authorizationSupporting */
  public CoverageEligibilityResponse_Insurance_ItemBuilder withAuthorizationSupporting(
      @NonNull Collection<CodeableConcept> authorizationSupporting) {
    this.authorizationSupporting = Collections.unmodifiableCollection(authorizationSupporting);
    return this;
  }
  /** @param benefit */
  public CoverageEligibilityResponse_Insurance_ItemBuilder withBenefit(
      @NonNull CoverageEligibilityResponse$Insurance$Item$Benefit... benefit) {
    this.benefit = Arrays.asList(benefit);
    return this;
  }
  /** @param benefit */
  public CoverageEligibilityResponse_Insurance_ItemBuilder withBenefit(
      @NonNull Collection<CoverageEligibilityResponse$Insurance$Item$Benefit> benefit) {
    this.benefit = Collections.unmodifiableCollection(benefit);
    return this;
  }

  public CoverageEligibilityResponse$Insurance$Item build() {
    return new CoverageEligibilityResponse$Insurance$Item(
        (Option) OptionConverters.toScala(id),
        (Option) OptionConverters.toScala(name),
        (Option) OptionConverters.toScala(unit),
        (Option) OptionConverters.toScala(term),
        (Option) OptionConverters.toScala(network),
        (Option) OptionConverters.toScala(category),
        modifier.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(provider),
        (Option) OptionConverters.toScala(excluded.map(x -> (Object) x)),
        extension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(description),
        (Option) OptionConverters.toScala(productOrService),
        (Option) OptionConverters.toScala(authorizationUrl),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(authorizationRequired.map(x -> (Object) x)),
        authorizationSupporting.stream().collect(new LitSeqJCollector<>()),
        benefit.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
