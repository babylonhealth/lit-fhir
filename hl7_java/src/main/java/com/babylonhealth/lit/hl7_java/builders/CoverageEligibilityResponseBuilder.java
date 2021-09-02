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
import com.babylonhealth.lit.hl7.FM_STATUS;
import com.babylonhealth.lit.hl7.ELIGIBILITYRESPONSE_PURPOSE;
import com.babylonhealth.lit.hl7.REMITTANCE_OUTCOME;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class CoverageEligibilityResponseBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private Optional<CodeableConcept> form = Optional.empty();
  private FM_STATUS status;
  private Collection<ELIGIBILITYRESPONSE_PURPOSE> purpose;
  private Reference patient;
  private FHIRDateTime created;
  private Reference request;
  private REMITTANCE_OUTCOME outcome;
  private Reference insurer;
  private Optional<LANGUAGES> language = Optional.empty();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Reference> requestor = Optional.empty();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Optional<String> preAuthRef = Optional.empty();
  private Optional<Choice_0503196159> serviced = Optional.empty();
  private Optional<String> disposition = Optional.empty();
  private Optional<String> implicitRules = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<CoverageEligibilityResponse.Error> error = Collections.emptyList();
  private Collection<CoverageEligibilityResponse.Insurance> insurance = Collections.emptyList();

  /**
   * Required fields for {@link CoverageEligibilityResponse}
   *
   * @param status - The status of the resource instance.
   * @param purpose - Code to specify whether requesting: prior authorization requirements for some
   *     service categories or billing codes; benefits for coverages specified or discovered;
   *     discovery and return of coverages for the patient; and/or validation that the specified
   *     coverage is in-force at the date/period specified or 'now' if not specified.
   * @param patient - The party who is the beneficiary of the supplied coverage and for whom
   *     eligibility is sought.
   * @param created - The date this resource was created.
   * @param request - Reference to the original request resource.
   * @param outcome - The outcome of the request processing.
   * @param insurer - The Insurer who issued the coverage in question and is the author of the
   *     response.
   */
  public CoverageEligibilityResponseBuilder(
      FM_STATUS status,
      Collection<ELIGIBILITYRESPONSE_PURPOSE> purpose,
      Reference patient,
      FHIRDateTime created,
      Reference request,
      REMITTANCE_OUTCOME outcome,
      Reference insurer) {
    this.status = status;
    this.purpose = purpose;
    this.patient = patient;
    this.created = created;
    this.request = request;
    this.outcome = outcome;
    this.insurer = insurer;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public CoverageEligibilityResponseBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public CoverageEligibilityResponseBuilder withMeta(@NonNull Meta meta) {
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
  public CoverageEligibilityResponseBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /** @param form - A code for the form to be used for printing the content. */
  public CoverageEligibilityResponseBuilder withForm(@NonNull CodeableConcept form) {
    this.form = Optional.of(form);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public CoverageEligibilityResponseBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public CoverageEligibilityResponseBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public CoverageEligibilityResponseBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public CoverageEligibilityResponseBuilder withExtension(@NonNull Extension... extension) {
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
  public CoverageEligibilityResponseBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param requestor - The provider which is responsible for the request. */
  public CoverageEligibilityResponseBuilder withRequestor(@NonNull Reference requestor) {
    this.requestor = Optional.of(requestor);
    return this;
  }
  /** @param identifier - A unique identifier assigned to this coverage eligiblity request. */
  public CoverageEligibilityResponseBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /** @param identifier - A unique identifier assigned to this coverage eligiblity request. */
  public CoverageEligibilityResponseBuilder withIdentifier(
      @NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /**
   * @param preAuthRef - A reference from the Insurer to which these services pertain to be used on
   *     further communication and as proof that the request occurred.
   */
  public CoverageEligibilityResponseBuilder withPreAuthRef(@NonNull String preAuthRef) {
    this.preAuthRef = Optional.of(preAuthRef);
    return this;
  }
  /**
   * @param serviced - The date or dates when the enclosed suite of services were performed or
   *     completed. Field is a 'choice' field. Type should be one of FHIRDate, Period.
   */
  public CoverageEligibilityResponseBuilder withServiced(@NonNull Choice_0503196159 serviced) {
    this.serviced = Optional.of(serviced);
    return this;
  }
  /** @param disposition - A human readable description of the status of the adjudication. */
  public CoverageEligibilityResponseBuilder withDisposition(@NonNull String disposition) {
    this.disposition = Optional.of(disposition);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public CoverageEligibilityResponseBuilder withImplicitRules(@NonNull String implicitRules) {
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
  public CoverageEligibilityResponseBuilder withModifierExtension(
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
  public CoverageEligibilityResponseBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param error - Errors encountered during the processing of the request. */
  public CoverageEligibilityResponseBuilder withError(
      @NonNull CoverageEligibilityResponse.Error... error) {
    this.error = Arrays.asList(error);
    return this;
  }
  /** @param error - Errors encountered during the processing of the request. */
  public CoverageEligibilityResponseBuilder withError(
      @NonNull Collection<CoverageEligibilityResponse.Error> error) {
    this.error = Collections.unmodifiableCollection(error);
    return this;
  }
  /**
   * @param insurance - Financial instruments for reimbursement for the health care products and
   *     services.
   */
  public CoverageEligibilityResponseBuilder withInsurance(
      @NonNull CoverageEligibilityResponse.Insurance... insurance) {
    this.insurance = Arrays.asList(insurance);
    return this;
  }
  /**
   * @param insurance - Financial instruments for reimbursement for the health care products and
   *     services.
   */
  public CoverageEligibilityResponseBuilder withInsurance(
      @NonNull Collection<CoverageEligibilityResponse.Insurance> insurance) {
    this.insurance = Collections.unmodifiableCollection(insurance);
    return this;
  }

  public CoverageEligibilityResponseBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public CoverageEligibilityResponse build() {
    return new CoverageEligibilityResponse(
        (Option) OptionConverters.toScala(id),
        (Option) OptionConverters.toScala(meta),
        (Option) OptionConverters.toScala(text),
        (Option) OptionConverters.toScala(form),
        status,
        purpose.stream().collect(new NonEmptyLitSeqJCollector<>()),
        patient,
        created,
        request,
        outcome,
        insurer,
        (Option) OptionConverters.toScala(language),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(requestor),
        identifier.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(preAuthRef),
        (Option) OptionConverters.toScala(serviced),
        (Option) OptionConverters.toScala(disposition),
        (Option) OptionConverters.toScala(implicitRules),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        error.stream().collect(new LitSeqJCollector<>()),
        insurance.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
