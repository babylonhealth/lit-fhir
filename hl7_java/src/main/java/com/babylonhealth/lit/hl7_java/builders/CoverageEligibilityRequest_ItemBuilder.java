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

public class CoverageEligibilityRequest_ItemBuilder {
  private Optional<String> id = Optional.empty();
  private Collection<Reference> detail = Collections.emptyList();
  private Optional<CodeableConcept> category = Optional.empty();
  private Collection<CodeableConcept> modifier = Collections.emptyList();
  private Optional<Reference> provider = Optional.empty();
  private Optional<Quantity> quantity = Optional.empty();
  private Optional<Reference> facility = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Money> unitPrice = Optional.empty();
  private Optional<CodeableConcept> productOrService = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<Integer> supportingInfoSequence = Collections.emptyList();
  private Collection<CoverageEligibilityRequest$Item$Diagnosis> diagnosis = Collections.emptyList();

  /** Required fields for {@link CoverageEligibilityRequest.Item} */
  public CoverageEligibilityRequest_ItemBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public CoverageEligibilityRequest_ItemBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param detail */
  public CoverageEligibilityRequest_ItemBuilder withDetail(@NonNull Reference... detail) {
    this.detail = Arrays.asList(detail);
    return this;
  }
  /** @param detail */
  public CoverageEligibilityRequest_ItemBuilder withDetail(@NonNull Collection<Reference> detail) {
    this.detail = Collections.unmodifiableCollection(detail);
    return this;
  }
  /** @param category */
  public CoverageEligibilityRequest_ItemBuilder withCategory(@NonNull CodeableConcept category) {
    this.category = Optional.of(category);
    return this;
  }
  /** @param modifier */
  public CoverageEligibilityRequest_ItemBuilder withModifier(@NonNull CodeableConcept... modifier) {
    this.modifier = Arrays.asList(modifier);
    return this;
  }
  /** @param modifier */
  public CoverageEligibilityRequest_ItemBuilder withModifier(
      @NonNull Collection<CodeableConcept> modifier) {
    this.modifier = Collections.unmodifiableCollection(modifier);
    return this;
  }
  /** @param provider - The provider which is responsible for the request. */
  public CoverageEligibilityRequest_ItemBuilder withProvider(@NonNull Reference provider) {
    this.provider = Optional.of(provider);
    return this;
  }
  /** @param quantity */
  public CoverageEligibilityRequest_ItemBuilder withQuantity(@NonNull Quantity quantity) {
    this.quantity = Optional.of(quantity);
    return this;
  }
  /** @param facility - Facility where the services are intended to be provided. */
  public CoverageEligibilityRequest_ItemBuilder withFacility(@NonNull Reference facility) {
    this.facility = Optional.of(facility);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public CoverageEligibilityRequest_ItemBuilder withExtension(@NonNull Extension... extension) {
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
  public CoverageEligibilityRequest_ItemBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param unitPrice */
  public CoverageEligibilityRequest_ItemBuilder withUnitPrice(@NonNull Money unitPrice) {
    this.unitPrice = Optional.of(unitPrice);
    return this;
  }
  /** @param productOrService */
  public CoverageEligibilityRequest_ItemBuilder withProductOrService(
      @NonNull CodeableConcept productOrService) {
    this.productOrService = Optional.of(productOrService);
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
  public CoverageEligibilityRequest_ItemBuilder withModifierExtension(
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
  public CoverageEligibilityRequest_ItemBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param supportingInfoSequence */
  public CoverageEligibilityRequest_ItemBuilder withSupportingInfoSequence(
      @NonNull Integer... supportingInfoSequence) {
    this.supportingInfoSequence = Arrays.asList(supportingInfoSequence);
    return this;
  }
  /** @param supportingInfoSequence */
  public CoverageEligibilityRequest_ItemBuilder withSupportingInfoSequence(
      @NonNull Collection<Integer> supportingInfoSequence) {
    this.supportingInfoSequence = Collections.unmodifiableCollection(supportingInfoSequence);
    return this;
  }
  /** @param diagnosis */
  public CoverageEligibilityRequest_ItemBuilder withDiagnosis(
      @NonNull CoverageEligibilityRequest$Item$Diagnosis... diagnosis) {
    this.diagnosis = Arrays.asList(diagnosis);
    return this;
  }
  /** @param diagnosis */
  public CoverageEligibilityRequest_ItemBuilder withDiagnosis(
      @NonNull Collection<CoverageEligibilityRequest$Item$Diagnosis> diagnosis) {
    this.diagnosis = Collections.unmodifiableCollection(diagnosis);
    return this;
  }

  public CoverageEligibilityRequest.Item build() {
    return new CoverageEligibilityRequest.Item(
        OptionConverters.toScala(id),
        detail.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(category),
        modifier.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(provider),
        OptionConverters.toScala(quantity),
        OptionConverters.toScala(facility),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(unitPrice),
        OptionConverters.toScala(productOrService),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        supportingInfoSequence.stream()
            .map(x -> (Object) x)
            .collect(Collectors.toList())
            .stream()
            .collect(new LitSeqJCollector<>()),
        diagnosis.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
