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
import com.babylonhealth.lit.hl7.FM_STATUS;
import com.babylonhealth.lit.hl7.ELIGIBILITYREQUEST_PURPOSE;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class CoverageEligibilityRequestBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private FM_STATUS status;
  private Collection<ELIGIBILITYREQUEST_PURPOSE> purpose;
  private Reference patient;
  private FHIRDateTime created;
  private Optional<Reference> enterer = Optional.empty();
  private Reference insurer;
  private Optional<LANGUAGES> language = Optional.empty();
  private Optional<CodeableConcept> priority = Optional.empty();
  private Optional<Reference> provider = Optional.empty();
  private Optional<Reference> facility = Optional.empty();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Optional<Choice<$bslash$div<FHIRDate, Period>>> serviced = Optional.empty();
  private Optional<String> implicitRules = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<CoverageEligibilityRequest.Insurance> insurance = Collections.emptyList();
  private Collection<CoverageEligibilityRequest.SupportingInfo> supportingInfo =
      Collections.emptyList();
  private Collection<CoverageEligibilityRequest.Item> item = Collections.emptyList();

  /**
   * Required fields for {@link CoverageEligibilityRequest}
   *
   * @param status - The status of the resource instance.
   * @param purpose - Code to specify whether requesting: prior authorization requirements for some
   *     service categories or billing codes; benefits for coverages specified or discovered;
   *     discovery and return of coverages for the patient; and/or validation that the specified
   *     coverage is in-force at the date/period specified or 'now' if not specified.
   * @param patient - The party who is the beneficiary of the supplied coverage and for whom
   *     eligibility is sought.
   * @param created - The date when this resource was created.
   * @param insurer - The Insurer who issued the coverage in question and is the recipient of the
   *     request.
   */
  public CoverageEligibilityRequestBuilder(
      FM_STATUS status,
      Collection<ELIGIBILITYREQUEST_PURPOSE> purpose,
      Reference patient,
      FHIRDateTime created,
      Reference insurer) {
    this.status = status;
    this.purpose = purpose;
    this.patient = patient;
    this.created = created;
    this.insurer = insurer;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public CoverageEligibilityRequestBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public CoverageEligibilityRequestBuilder withMeta(@NonNull Meta meta) {
    this.meta = Optional.of(meta);
    return this;
  }
  /**
   * @param text - A human-readable narrative that contains a summary of the resource and can be
   *     used to represent the content of the resource to a human. The narrative need not encode all
   *     the structured data, but is required to contain sufficient detail to make it "clinically
   *     safe" for a human to just read the narrative. Resource definitions may define what content
   *     should be represented in the narrative to ensure clinical safety.
   */
  public CoverageEligibilityRequestBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /** @param enterer - Person who created the request. */
  public CoverageEligibilityRequestBuilder withEnterer(@NonNull Reference enterer) {
    this.enterer = Optional.of(enterer);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public CoverageEligibilityRequestBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /** @param priority - When the requestor expects the processor to complete processing. */
  public CoverageEligibilityRequestBuilder withPriority(@NonNull CodeableConcept priority) {
    this.priority = Optional.of(priority);
    return this;
  }
  /** @param provider - The provider which is responsible for the request. */
  public CoverageEligibilityRequestBuilder withProvider(@NonNull Reference provider) {
    this.provider = Optional.of(provider);
    return this;
  }
  /** @param facility - Facility where the services are intended to be provided. */
  public CoverageEligibilityRequestBuilder withFacility(@NonNull Reference facility) {
    this.facility = Optional.of(facility);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public CoverageEligibilityRequestBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public CoverageEligibilityRequestBuilder withContained(@NonNull Collection<Resource> contained) {
    this.contained = Collections.unmodifiableCollection(contained);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public CoverageEligibilityRequestBuilder withExtension(@NonNull Extension... extension) {
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
  public CoverageEligibilityRequestBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param identifier - A unique identifier assigned to this coverage eligiblity request. */
  public CoverageEligibilityRequestBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /** @param identifier - A unique identifier assigned to this coverage eligiblity request. */
  public CoverageEligibilityRequestBuilder withIdentifier(
      @NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /**
   * @param serviced - The date or dates when the enclosed suite of services were performed or
   *     completed. Field is a 'choice' field. Type should be one of FHIRDate, Period.
   */
  public <T> CoverageEligibilityRequestBuilder withServiced(@NonNull T serviced) {
    var guessedSuffix =
        autoSuffix(
            serviced.getClass().getSimpleName(), CoverageEligibilityRequest$.MODULE$.serviced());
    return withServiced(guessedSuffix, serviced);
  }

  /**
   * Alternative to the 'main' withServiced method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param serviced - The value to be passed to the builder
   */
  public <T> CoverageEligibilityRequestBuilder withServiced(String suffix, @NonNull T serviced) {
    guard(
        serviced.getClass().getSimpleName(),
        suffix,
        CoverageEligibilityRequest$.MODULE$.serviced());
    this.serviced =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix, serviced, CoverageEligibilityRequest$.MODULE$.serviced()));
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public CoverageEligibilityRequestBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
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
  public CoverageEligibilityRequestBuilder withModifierExtension(
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
  public CoverageEligibilityRequestBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param insurance - Financial instruments for reimbursement for the health care products and
   *     services.
   */
  public CoverageEligibilityRequestBuilder withInsurance(
      @NonNull CoverageEligibilityRequest.Insurance... insurance) {
    this.insurance = Arrays.asList(insurance);
    return this;
  }
  /**
   * @param insurance - Financial instruments for reimbursement for the health care products and
   *     services.
   */
  public CoverageEligibilityRequestBuilder withInsurance(
      @NonNull Collection<CoverageEligibilityRequest.Insurance> insurance) {
    this.insurance = Collections.unmodifiableCollection(insurance);
    return this;
  }
  /**
   * @param supportingInfo - Additional information codes regarding exceptions, special
   *     considerations, the condition, situation, prior or concurrent issues.
   */
  public CoverageEligibilityRequestBuilder withSupportingInfo(
      @NonNull CoverageEligibilityRequest.SupportingInfo... supportingInfo) {
    this.supportingInfo = Arrays.asList(supportingInfo);
    return this;
  }
  /**
   * @param supportingInfo - Additional information codes regarding exceptions, special
   *     considerations, the condition, situation, prior or concurrent issues.
   */
  public CoverageEligibilityRequestBuilder withSupportingInfo(
      @NonNull Collection<CoverageEligibilityRequest.SupportingInfo> supportingInfo) {
    this.supportingInfo = Collections.unmodifiableCollection(supportingInfo);
    return this;
  }
  /**
   * @param item - Service categories or billable services for which benefit details and/or an
   *     authorization prior to service delivery may be required by the payor.
   */
  public CoverageEligibilityRequestBuilder withItem(
      @NonNull CoverageEligibilityRequest.Item... item) {
    this.item = Arrays.asList(item);
    return this;
  }
  /**
   * @param item - Service categories or billable services for which benefit details and/or an
   *     authorization prior to service delivery may be required by the payor.
   */
  public CoverageEligibilityRequestBuilder withItem(
      @NonNull Collection<CoverageEligibilityRequest.Item> item) {
    this.item = Collections.unmodifiableCollection(item);
    return this;
  }

  public CoverageEligibilityRequestBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public CoverageEligibilityRequest build() {
    return new CoverageEligibilityRequest(
        OptionConverters.toScala(id),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        status,
        purpose.stream().collect(new NonEmptyLitSeqJCollector<>()),
        patient,
        created,
        OptionConverters.toScala(enterer),
        insurer,
        OptionConverters.toScala(language),
        OptionConverters.toScala(priority),
        OptionConverters.toScala(provider),
        OptionConverters.toScala(facility),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        identifier.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(serviced),
        OptionConverters.toScala(implicitRules),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        insurance.stream().collect(new LitSeqJCollector<>()),
        supportingInfo.stream().collect(new LitSeqJCollector<>()),
        item.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
