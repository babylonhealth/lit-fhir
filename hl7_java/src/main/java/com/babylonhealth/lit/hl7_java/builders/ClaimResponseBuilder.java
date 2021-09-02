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
import com.babylonhealth.lit.hl7.CLAIM_USE;
import com.babylonhealth.lit.hl7.FM_STATUS;
import com.babylonhealth.lit.hl7.REMITTANCE_OUTCOME;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class ClaimResponseBuilder {
  private Optional<String> id = Optional.empty();
  private CLAIM_USE use;
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private CodeableConcept _type;
  private Optional<Attachment> form = Optional.empty();
  private FM_STATUS status;
  private Optional<CodeableConcept> subType = Optional.empty();
  private Reference patient;
  private FHIRDateTime created;
  private Reference insurer;
  private Optional<Reference> request = Optional.empty();
  private REMITTANCE_OUTCOME outcome;
  private Optional<LANGUAGES> language = Optional.empty();
  private Optional<CodeableConcept> formCode = Optional.empty();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Reference> requestor = Optional.empty();
  private Optional<CodeableConcept> payeeType = Optional.empty();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Optional<String> preAuthRef = Optional.empty();
  private Optional<String> disposition = Optional.empty();
  private Collection<ClaimResponse$Item$Adjudication> adjudication = Collections.emptyList();
  private Optional<CodeableConcept> fundsReserve = Optional.empty();
  private Optional<String> implicitRules = Optional.empty();
  private Optional<Period> preAuthPeriod = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<Reference> communicationRequest = Collections.emptyList();
  private Collection<ClaimResponse.Total> total = Collections.emptyList();
  private Collection<ClaimResponse.Error> error = Collections.emptyList();
  private Optional<ClaimResponse.Payment> payment = Optional.empty();
  private Collection<ClaimResponse.ProcessNote> processNote = Collections.emptyList();
  private Collection<ClaimResponse.Insurance> insurance = Collections.emptyList();
  private Collection<ClaimResponse.Item> item = Collections.emptyList();
  private Collection<ClaimResponse.AddItem> addItem = Collections.emptyList();

  /**
   * Required fields for {@link ClaimResponse}
   *
   * @param use - A code to indicate whether the nature of the request is: to request adjudication
   *     of products and services previously rendered; or requesting authorization and adjudication
   *     for provision in the future; or requesting the non-binding adjudication of the listed
   *     products and services which could be provided in the future.
   * @param _type - A finer grained suite of claim type codes which may convey additional
   *     information such as Inpatient vs Outpatient and/or a specialty service.
   * @param status - The status of the resource instance.
   * @param patient - The party to whom the professional services and/or products have been supplied
   *     or are being considered and for whom actual for facast reimbursement is sought.
   * @param created - The date this resource was created.
   * @param insurer - The party responsible for authorization, adjudication and reimbursement.
   * @param outcome - The outcome of the claim, predetermination, or preauthorization processing.
   */
  public ClaimResponseBuilder(
      CLAIM_USE use,
      CodeableConcept _type,
      FM_STATUS status,
      Reference patient,
      FHIRDateTime created,
      Reference insurer,
      REMITTANCE_OUTCOME outcome) {
    this.use = use;
    this._type = _type;
    this.status = status;
    this.patient = patient;
    this.created = created;
    this.insurer = insurer;
    this.outcome = outcome;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public ClaimResponseBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public ClaimResponseBuilder withMeta(@NonNull Meta meta) {
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
  public ClaimResponseBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param form - The actual form, by reference or inclusion, for printing the content or an EOB.
   */
  public ClaimResponseBuilder withForm(@NonNull Attachment form) {
    this.form = Optional.of(form);
    return this;
  }
  /**
   * @param subType - A finer grained suite of claim type codes which may convey additional
   *     information such as Inpatient vs Outpatient and/or a specialty service.
   */
  public ClaimResponseBuilder withSubType(@NonNull CodeableConcept subType) {
    this.subType = Optional.of(subType);
    return this;
  }
  /** @param request - Original request resource reference. */
  public ClaimResponseBuilder withRequest(@NonNull Reference request) {
    this.request = Optional.of(request);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public ClaimResponseBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /** @param formCode - A code for the form to be used for printing the content. */
  public ClaimResponseBuilder withFormCode(@NonNull CodeableConcept formCode) {
    this.formCode = Optional.of(formCode);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public ClaimResponseBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public ClaimResponseBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public ClaimResponseBuilder withExtension(@NonNull Extension... extension) {
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
  public ClaimResponseBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param requestor - The provider which is responsible for the claim, predetermination or
   *     preauthorization.
   */
  public ClaimResponseBuilder withRequestor(@NonNull Reference requestor) {
    this.requestor = Optional.of(requestor);
    return this;
  }
  /** @param payeeType - Type of Party to be reimbursed: subscriber, provider, other. */
  public ClaimResponseBuilder withPayeeType(@NonNull CodeableConcept payeeType) {
    this.payeeType = Optional.of(payeeType);
    return this;
  }
  /** @param identifier - A unique identifier assigned to this claim response. */
  public ClaimResponseBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /** @param identifier - A unique identifier assigned to this claim response. */
  public ClaimResponseBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /**
   * @param preAuthRef - Reference from the Insurer which is used in later communications which
   *     refers to this adjudication.
   */
  public ClaimResponseBuilder withPreAuthRef(@NonNull String preAuthRef) {
    this.preAuthRef = Optional.of(preAuthRef);
    return this;
  }
  /** @param disposition - A human readable description of the status of the adjudication. */
  public ClaimResponseBuilder withDisposition(@NonNull String disposition) {
    this.disposition = Optional.of(disposition);
    return this;
  }
  /**
   * @param adjudication - The adjudication results which are presented at the header level rather
   *     than at the line-item or add-item levels.
   */
  public ClaimResponseBuilder withAdjudication(
      @NonNull ClaimResponse$Item$Adjudication... adjudication) {
    this.adjudication = Arrays.asList(adjudication);
    return this;
  }
  /**
   * @param adjudication - The adjudication results which are presented at the header level rather
   *     than at the line-item or add-item levels.
   */
  public ClaimResponseBuilder withAdjudication(
      @NonNull Collection<ClaimResponse$Item$Adjudication> adjudication) {
    this.adjudication = Collections.unmodifiableCollection(adjudication);
    return this;
  }
  /**
   * @param fundsReserve - A code, used only on a response to a preauthorization, to indicate
   *     whether the benefits payable have been reserved and for whom.
   */
  public ClaimResponseBuilder withFundsReserve(@NonNull CodeableConcept fundsReserve) {
    this.fundsReserve = Optional.of(fundsReserve);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public ClaimResponseBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /** @param preAuthPeriod - The time frame during which this authorization is effective. */
  public ClaimResponseBuilder withPreAuthPeriod(@NonNull Period preAuthPeriod) {
    this.preAuthPeriod = Optional.of(preAuthPeriod);
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
  public ClaimResponseBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public ClaimResponseBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param communicationRequest - Request for additional supporting or authorizing information. */
  public ClaimResponseBuilder withCommunicationRequest(@NonNull Reference... communicationRequest) {
    this.communicationRequest = Arrays.asList(communicationRequest);
    return this;
  }
  /** @param communicationRequest - Request for additional supporting or authorizing information. */
  public ClaimResponseBuilder withCommunicationRequest(
      @NonNull Collection<Reference> communicationRequest) {
    this.communicationRequest = Collections.unmodifiableCollection(communicationRequest);
    return this;
  }
  /** @param total - Categorized monetary totals for the adjudication. */
  public ClaimResponseBuilder withTotal(@NonNull ClaimResponse.Total... total) {
    this.total = Arrays.asList(total);
    return this;
  }
  /** @param total - Categorized monetary totals for the adjudication. */
  public ClaimResponseBuilder withTotal(@NonNull Collection<ClaimResponse.Total> total) {
    this.total = Collections.unmodifiableCollection(total);
    return this;
  }
  /** @param error - Errors encountered during the processing of the adjudication. */
  public ClaimResponseBuilder withError(@NonNull ClaimResponse.Error... error) {
    this.error = Arrays.asList(error);
    return this;
  }
  /** @param error - Errors encountered during the processing of the adjudication. */
  public ClaimResponseBuilder withError(@NonNull Collection<ClaimResponse.Error> error) {
    this.error = Collections.unmodifiableCollection(error);
    return this;
  }
  /** @param payment - Payment details for the adjudication of the claim. */
  public ClaimResponseBuilder withPayment(@NonNull ClaimResponse.Payment payment) {
    this.payment = Optional.of(payment);
    return this;
  }
  /**
   * @param processNote - A note that describes or explains adjudication results in a human readable
   *     form.
   */
  public ClaimResponseBuilder withProcessNote(@NonNull ClaimResponse.ProcessNote... processNote) {
    this.processNote = Arrays.asList(processNote);
    return this;
  }
  /**
   * @param processNote - A note that describes or explains adjudication results in a human readable
   *     form.
   */
  public ClaimResponseBuilder withProcessNote(
      @NonNull Collection<ClaimResponse.ProcessNote> processNote) {
    this.processNote = Collections.unmodifiableCollection(processNote);
    return this;
  }
  /**
   * @param insurance - Financial instruments for reimbursement for the health care products and
   *     services specified on the claim.
   */
  public ClaimResponseBuilder withInsurance(@NonNull ClaimResponse.Insurance... insurance) {
    this.insurance = Arrays.asList(insurance);
    return this;
  }
  /**
   * @param insurance - Financial instruments for reimbursement for the health care products and
   *     services specified on the claim.
   */
  public ClaimResponseBuilder withInsurance(
      @NonNull Collection<ClaimResponse.Insurance> insurance) {
    this.insurance = Collections.unmodifiableCollection(insurance);
    return this;
  }
  /**
   * @param item - A claim line. Either a simple (a product or service) or a 'group' of details
   *     which can also be a simple items or groups of sub-details.
   */
  public ClaimResponseBuilder withItem(@NonNull ClaimResponse.Item... item) {
    this.item = Arrays.asList(item);
    return this;
  }
  /**
   * @param item - A claim line. Either a simple (a product or service) or a 'group' of details
   *     which can also be a simple items or groups of sub-details.
   */
  public ClaimResponseBuilder withItem(@NonNull Collection<ClaimResponse.Item> item) {
    this.item = Collections.unmodifiableCollection(item);
    return this;
  }
  /**
   * @param addItem - The first-tier service adjudications for payor added product or service lines.
   */
  public ClaimResponseBuilder withAddItem(@NonNull ClaimResponse.AddItem... addItem) {
    this.addItem = Arrays.asList(addItem);
    return this;
  }
  /**
   * @param addItem - The first-tier service adjudications for payor added product or service lines.
   */
  public ClaimResponseBuilder withAddItem(@NonNull Collection<ClaimResponse.AddItem> addItem) {
    this.addItem = Collections.unmodifiableCollection(addItem);
    return this;
  }

  public ClaimResponseBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public ClaimResponse build() {
    return new ClaimResponse(
        (Option) OptionConverters.toScala(id),
        use,
        (Option) OptionConverters.toScala(meta),
        (Option) OptionConverters.toScala(text),
        _type,
        (Option) OptionConverters.toScala(form),
        status,
        (Option) OptionConverters.toScala(subType),
        patient,
        created,
        insurer,
        (Option) OptionConverters.toScala(request),
        outcome,
        (Option) OptionConverters.toScala(language),
        (Option) OptionConverters.toScala(formCode),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(requestor),
        (Option) OptionConverters.toScala(payeeType),
        identifier.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(preAuthRef),
        (Option) OptionConverters.toScala(disposition),
        adjudication.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(fundsReserve),
        (Option) OptionConverters.toScala(implicitRules),
        (Option) OptionConverters.toScala(preAuthPeriod),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        communicationRequest.stream().collect(new LitSeqJCollector<>()),
        total.stream().collect(new LitSeqJCollector<>()),
        error.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(payment),
        processNote.stream().collect(new LitSeqJCollector<>()),
        insurance.stream().collect(new LitSeqJCollector<>()),
        item.stream().collect(new LitSeqJCollector<>()),
        addItem.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
