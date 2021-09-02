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
import com.babylonhealth.lit.hl7.REMITTANCE_OUTCOME;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class PaymentReconciliationBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private FM_STATUS status;
  private Optional<Period> period = Optional.empty();
  private FHIRDateTime created;
  private Optional<Reference> request = Optional.empty();
  private Optional<REMITTANCE_OUTCOME> outcome = Optional.empty();
  private Optional<LANGUAGES> language = Optional.empty();
  private Optional<CodeableConcept> formCode = Optional.empty();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Reference> requestor = Optional.empty();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Optional<String> disposition = Optional.empty();
  private FHIRDate paymentDate;
  private Optional<String> implicitRules = Optional.empty();
  private Optional<Reference> paymentIssuer = Optional.empty();
  private Money paymentAmount;
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<Identifier> paymentIdentifier = Optional.empty();
  private Collection<PaymentReconciliation.Detail> detail = Collections.emptyList();
  private Collection<PaymentReconciliation.ProcessNote> processNote = Collections.emptyList();

  /**
   * Required fields for {@link PaymentReconciliation}
   *
   * @param status - The status of the resource instance.
   * @param created - The date when the resource was created.
   * @param paymentDate - The date of payment as indicated on the financial instrument.
   * @param paymentAmount - Total payment amount as indicated on the financial instrument.
   */
  public PaymentReconciliationBuilder(
      FM_STATUS status, FHIRDateTime created, FHIRDate paymentDate, Money paymentAmount) {
    this.status = status;
    this.created = created;
    this.paymentDate = paymentDate;
    this.paymentAmount = paymentAmount;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public PaymentReconciliationBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public PaymentReconciliationBuilder withMeta(@NonNull Meta meta) {
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
  public PaymentReconciliationBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param period - The period of time for which payments have been gathered into this bulk payment
   *     for settlement.
   */
  public PaymentReconciliationBuilder withPeriod(@NonNull Period period) {
    this.period = Optional.of(period);
    return this;
  }
  /** @param request - Original request resource reference. */
  public PaymentReconciliationBuilder withRequest(@NonNull Reference request) {
    this.request = Optional.of(request);
    return this;
  }
  /** @param outcome - The outcome of a request for a reconciliation. */
  public PaymentReconciliationBuilder withOutcome(@NonNull REMITTANCE_OUTCOME outcome) {
    this.outcome = Optional.of(outcome);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public PaymentReconciliationBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /** @param formCode - A code for the form to be used for printing the content. */
  public PaymentReconciliationBuilder withFormCode(@NonNull CodeableConcept formCode) {
    this.formCode = Optional.of(formCode);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public PaymentReconciliationBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public PaymentReconciliationBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public PaymentReconciliationBuilder withExtension(@NonNull Extension... extension) {
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
  public PaymentReconciliationBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param requestor - The practitioner who is responsible for the services rendered to the
   *     patient.
   */
  public PaymentReconciliationBuilder withRequestor(@NonNull Reference requestor) {
    this.requestor = Optional.of(requestor);
    return this;
  }
  /** @param identifier - A unique identifier assigned to this payment reconciliation. */
  public PaymentReconciliationBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /** @param identifier - A unique identifier assigned to this payment reconciliation. */
  public PaymentReconciliationBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /**
   * @param disposition - A human readable description of the status of the request for the
   *     reconciliation.
   */
  public PaymentReconciliationBuilder withDisposition(@NonNull String disposition) {
    this.disposition = Optional.of(disposition);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public PaymentReconciliationBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /** @param paymentIssuer - The party who generated the payment. */
  public PaymentReconciliationBuilder withPaymentIssuer(@NonNull Reference paymentIssuer) {
    this.paymentIssuer = Optional.of(paymentIssuer);
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
  public PaymentReconciliationBuilder withModifierExtension(
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
  public PaymentReconciliationBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param paymentIdentifier - Issuer's unique identifier for the payment instrument. */
  public PaymentReconciliationBuilder withPaymentIdentifier(@NonNull Identifier paymentIdentifier) {
    this.paymentIdentifier = Optional.of(paymentIdentifier);
    return this;
  }
  /** @param detail - Distribution of the payment amount for a previously acknowledged payable. */
  public PaymentReconciliationBuilder withDetail(@NonNull PaymentReconciliation.Detail... detail) {
    this.detail = Arrays.asList(detail);
    return this;
  }
  /** @param detail - Distribution of the payment amount for a previously acknowledged payable. */
  public PaymentReconciliationBuilder withDetail(
      @NonNull Collection<PaymentReconciliation.Detail> detail) {
    this.detail = Collections.unmodifiableCollection(detail);
    return this;
  }
  /**
   * @param processNote - A note that describes or explains the processing in a human readable form.
   */
  public PaymentReconciliationBuilder withProcessNote(
      @NonNull PaymentReconciliation.ProcessNote... processNote) {
    this.processNote = Arrays.asList(processNote);
    return this;
  }
  /**
   * @param processNote - A note that describes or explains the processing in a human readable form.
   */
  public PaymentReconciliationBuilder withProcessNote(
      @NonNull Collection<PaymentReconciliation.ProcessNote> processNote) {
    this.processNote = Collections.unmodifiableCollection(processNote);
    return this;
  }

  public PaymentReconciliationBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public PaymentReconciliation build() {
    return new PaymentReconciliation(
        (Option) OptionConverters.toScala(id),
        (Option) OptionConverters.toScala(meta),
        (Option) OptionConverters.toScala(text),
        status,
        (Option) OptionConverters.toScala(period),
        created,
        (Option) OptionConverters.toScala(request),
        (Option) OptionConverters.toScala(outcome),
        (Option) OptionConverters.toScala(language),
        (Option) OptionConverters.toScala(formCode),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(requestor),
        identifier.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(disposition),
        paymentDate,
        (Option) OptionConverters.toScala(implicitRules),
        (Option) OptionConverters.toScala(paymentIssuer),
        paymentAmount,
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(paymentIdentifier),
        detail.stream().collect(new LitSeqJCollector<>()),
        processNote.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
