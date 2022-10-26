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
import com.babylonhealth.lit.hl7.EXPLANATIONOFBENEFIT_STATUS;
import com.babylonhealth.lit.hl7.REMITTANCE_OUTCOME;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface ExplanationOfBenefitBuilder extends DomainResourceBuilder {
  public ExplanationOfBenefit build();

  public static Impl init(
      CLAIM_USE use,
      CodeableConcept _type,
      EXPLANATIONOFBENEFIT_STATUS status,
      Reference patient,
      FHIRDateTime created,
      Reference insurer,
      REMITTANCE_OUTCOME outcome,
      Reference provider,
      Collection<ExplanationOfBenefit.Insurance> insurance) {
    return new Impl(use, _type, status, patient, created, insurer, outcome, provider, insurance);
  }

  public static Impl builder(
      CLAIM_USE use,
      CodeableConceptBuilder _type,
      EXPLANATIONOFBENEFIT_STATUS status,
      ReferenceBuilder patient,
      FHIRDateTime created,
      ReferenceBuilder insurer,
      REMITTANCE_OUTCOME outcome,
      ReferenceBuilder provider,
      Collection<ExplanationOfBenefit_InsuranceBuilder> insurance) {
    return new Impl(
        use,
        _type.build(),
        status,
        patient.build(),
        created,
        insurer.build(),
        outcome,
        provider.build(),
        new LitSeq<>(insurance).map(ExplanationOfBenefit_InsuranceBuilder::build));
  }

  public class Impl implements ExplanationOfBenefitBuilder {
    private Optional<String> id = Optional.empty();
    private CLAIM_USE use;
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private CodeableConcept _type;
    private Optional<Attachment> form = Optional.empty();
    private Optional<Reference> claim = Optional.empty();
    private EXPLANATIONOFBENEFIT_STATUS status;
    private Optional<CodeableConcept> subType = Optional.empty();
    private Reference patient;
    private FHIRDateTime created;
    private Optional<Reference> enterer = Optional.empty();
    private Reference insurer;
    private REMITTANCE_OUTCOME outcome;
    private Optional<LANGUAGES> language = Optional.empty();
    private Reference provider;
    private Optional<CodeableConcept> priority = Optional.empty();
    private Optional<Reference> referral = Optional.empty();
    private Optional<Reference> facility = Optional.empty();
    private Optional<CodeableConcept> formCode = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Collection<String> preAuthRef = Collections.emptyList();
    private Optional<Integer> precedence = Optional.empty();
    private Optional<String> disposition = Optional.empty();
    private Optional<CodeableConcept> fundsReserve = Optional.empty();
    private Optional<Reference> prescription = Optional.empty();
    private Collection<ExplanationOfBenefit$Item$Adjudication> adjudication =
        Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<Reference> claimResponse = Optional.empty();
    private Optional<Period> benefitPeriod = Optional.empty();
    private Optional<Period> billablePeriod = Optional.empty();
    private Collection<Period> preAuthRefPeriod = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<Reference> originalPrescription = Optional.empty();
    private Optional<CodeableConcept> fundsReserveRequested = Optional.empty();
    private Optional<ExplanationOfBenefit.Payee> payee = Optional.empty();
    private Collection<ExplanationOfBenefit.Total> total = Collections.emptyList();
    private Collection<ExplanationOfBenefit.Related> related = Collections.emptyList();
    private Optional<ExplanationOfBenefit.Payment> payment = Optional.empty();
    private Collection<ExplanationOfBenefit.CareTeam> careTeam = Collections.emptyList();
    private Optional<ExplanationOfBenefit.Accident> accident = Optional.empty();
    private Collection<ExplanationOfBenefit.Diagnosis> diagnosis = Collections.emptyList();
    private Collection<ExplanationOfBenefit.Procedure> procedure = Collections.emptyList();
    private Collection<ExplanationOfBenefit.Insurance> insurance;
    private Collection<ExplanationOfBenefit.ProcessNote> processNote = Collections.emptyList();
    private Collection<ExplanationOfBenefit.SupportingInfo> supportingInfo =
        Collections.emptyList();
    private Collection<ExplanationOfBenefit.Item> item = Collections.emptyList();
    private Collection<ExplanationOfBenefit.AddItem> addItem = Collections.emptyList();
    private Collection<ExplanationOfBenefit.BenefitBalance> benefitBalance =
        Collections.emptyList();

    /**
     * Required fields for {@link ExplanationOfBenefit}
     *
     * @param use - A code to indicate whether the nature of the request is: to request adjudication
     *     of products and services previously rendered; or requesting authorization and
     *     adjudication for provision in the future; or requesting the non-binding adjudication of
     *     the listed products and services which could be provided in the future.
     * @param _type - The category of claim, e.g. oral, pharmacy, vision, institutional,
     *     professional.
     * @param status - The status of the resource instance.
     * @param patient - The party to whom the professional services and/or products have been
     *     supplied or are being considered and for whom actual for forecast reimbursement is
     *     sought.
     * @param created - The date this resource was created.
     * @param insurer - The party responsible for authorization, adjudication and reimbursement.
     * @param outcome - The outcome of the claim, predetermination, or preauthorization processing.
     * @param provider - The provider which is responsible for the claim, predetermination or
     *     preauthorization.
     * @param insurance - Financial instruments for reimbursement for the health care products and
     *     services specified on the claim.
     */
    public Impl(
        CLAIM_USE use,
        CodeableConcept _type,
        EXPLANATIONOFBENEFIT_STATUS status,
        Reference patient,
        FHIRDateTime created,
        Reference insurer,
        REMITTANCE_OUTCOME outcome,
        Reference provider,
        Collection<ExplanationOfBenefit.Insurance> insurance) {
      this.use = use;
      this._type = _type;
      this.status = status;
      this.patient = patient;
      this.created = created;
      this.insurer = insurer;
      this.outcome = outcome;
      this.provider = provider;
      this.insurance = insurance;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ExplanationOfBenefitBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public ExplanationOfBenefitBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
      this.meta = Optional.of(meta.build());
      return this;
    }
    /**
     * @param text - A human-readable narrative that contains a summary of the resource and can be
     *     used to represent the content of the resource to a human. The narrative need not encode
     *     all the structured data, but is required to contain sufficient detail to make it
     *     "clinically safe" for a human to just read the narrative. Resource definitions may define
     *     what content should be represented in the narrative to ensure clinical safety.
     */
    public ExplanationOfBenefitBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param form - The actual form, by reference or inclusion, for printing the content or an EOB.
     */
    public ExplanationOfBenefitBuilder.Impl withForm(@NonNull Attachment form) {
      this.form = Optional.of(form);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withForm(@NonNull AttachmentBuilder form) {
      this.form = Optional.of(form.build());
      return this;
    }
    /**
     * @param claim - The business identifier for the instance of the adjudication request: claim
     *     predetermination or preauthorization.
     */
    public ExplanationOfBenefitBuilder.Impl withClaim(@NonNull Reference claim) {
      this.claim = Optional.of(claim);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withClaim(@NonNull ReferenceBuilder claim) {
      this.claim = Optional.of(claim.build());
      return this;
    }
    /**
     * @param subType - A finer grained suite of claim type codes which may convey additional
     *     information such as Inpatient vs Outpatient and/or a specialty service.
     */
    public ExplanationOfBenefitBuilder.Impl withSubType(@NonNull CodeableConcept subType) {
      this.subType = Optional.of(subType);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withSubType(@NonNull CodeableConceptBuilder subType) {
      this.subType = Optional.of(subType.build());
      return this;
    }
    /** @param enterer - Individual who created the claim, predetermination or preauthorization. */
    public ExplanationOfBenefitBuilder.Impl withEnterer(@NonNull Reference enterer) {
      this.enterer = Optional.of(enterer);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withEnterer(@NonNull ReferenceBuilder enterer) {
      this.enterer = Optional.of(enterer.build());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public ExplanationOfBenefitBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param priority - The provider-required urgency of processing the request. Typical values
     *     include: stat, routine deferred.
     */
    public ExplanationOfBenefitBuilder.Impl withPriority(@NonNull CodeableConcept priority) {
      this.priority = Optional.of(priority);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withPriority(@NonNull CodeableConceptBuilder priority) {
      this.priority = Optional.of(priority.build());
      return this;
    }
    /** @param referral - A reference to a referral resource. */
    public ExplanationOfBenefitBuilder.Impl withReferral(@NonNull Reference referral) {
      this.referral = Optional.of(referral);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withReferral(@NonNull ReferenceBuilder referral) {
      this.referral = Optional.of(referral.build());
      return this;
    }
    /** @param facility - Facility where the services were provided. */
    public ExplanationOfBenefitBuilder.Impl withFacility(@NonNull Reference facility) {
      this.facility = Optional.of(facility);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withFacility(@NonNull ReferenceBuilder facility) {
      this.facility = Optional.of(facility.build());
      return this;
    }
    /** @param formCode - A code for the form to be used for printing the content. */
    public ExplanationOfBenefitBuilder.Impl withFormCode(@NonNull CodeableConcept formCode) {
      this.formCode = Optional.of(formCode);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withFormCode(@NonNull CodeableConceptBuilder formCode) {
      this.formCode = Optional.of(formCode.build());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public ExplanationOfBenefitBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public ExplanationOfBenefitBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
      this.contained = Arrays.stream(contained).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ExplanationOfBenefitBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ExplanationOfBenefitBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param identifier - A unique identifier assigned to this explanation of benefit. */
    public ExplanationOfBenefitBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /** @param identifier - A unique identifier assigned to this explanation of benefit. */
    public ExplanationOfBenefitBuilder.Impl withIdentifier(
        @NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withIdentifier(
        @NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param preAuthRef - Reference from the Insurer which is used in later communications which
     *     refers to this adjudication.
     */
    public ExplanationOfBenefitBuilder.Impl withPreAuthRef(@NonNull String... preAuthRef) {
      this.preAuthRef = Arrays.asList(preAuthRef);
      return this;
    }
    /**
     * @param preAuthRef - Reference from the Insurer which is used in later communications which
     *     refers to this adjudication.
     */
    public ExplanationOfBenefitBuilder.Impl withPreAuthRef(@NonNull Collection<String> preAuthRef) {
      this.preAuthRef = Collections.unmodifiableCollection(preAuthRef);
      return this;
    }
    /**
     * @param precedence - This indicates the relative order of a series of EOBs related to
     *     different coverages for the same suite of services.
     */
    public ExplanationOfBenefitBuilder.Impl withPrecedence(@NonNull Integer precedence) {
      this.precedence = Optional.of(precedence);
      return this;
    }
    /** @param disposition - A human readable description of the status of the adjudication. */
    public ExplanationOfBenefitBuilder.Impl withDisposition(@NonNull String disposition) {
      this.disposition = Optional.of(disposition);
      return this;
    }
    /**
     * @param fundsReserve - A code, used only on a response to a preauthorization, to indicate
     *     whether the benefits payable have been reserved and for whom.
     */
    public ExplanationOfBenefitBuilder.Impl withFundsReserve(
        @NonNull CodeableConcept fundsReserve) {
      this.fundsReserve = Optional.of(fundsReserve);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withFundsReserve(
        @NonNull CodeableConceptBuilder fundsReserve) {
      this.fundsReserve = Optional.of(fundsReserve.build());
      return this;
    }
    /**
     * @param prescription - Prescription to support the dispensing of pharmacy, device or vision
     *     products.
     */
    public ExplanationOfBenefitBuilder.Impl withPrescription(@NonNull Reference prescription) {
      this.prescription = Optional.of(prescription);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withPrescription(
        @NonNull ReferenceBuilder prescription) {
      this.prescription = Optional.of(prescription.build());
      return this;
    }
    /**
     * @param adjudication - The adjudication results which are presented at the header level rather
     *     than at the line-item or add-item levels.
     */
    public ExplanationOfBenefitBuilder.Impl withAdjudication(
        @NonNull ExplanationOfBenefit$Item$Adjudication... adjudication) {
      this.adjudication = Arrays.asList(adjudication);
      return this;
    }
    /**
     * @param adjudication - The adjudication results which are presented at the header level rather
     *     than at the line-item or add-item levels.
     */
    public ExplanationOfBenefitBuilder.Impl withAdjudication(
        @NonNull Collection<ExplanationOfBenefit$Item$Adjudication> adjudication) {
      this.adjudication = Collections.unmodifiableCollection(adjudication);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withAdjudication(
        @NonNull ExplanationOfBenefit_Item_AdjudicationBuilder... adjudication) {
      this.adjudication = Arrays.stream(adjudication).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public ExplanationOfBenefitBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param claimResponse - The business identifier for the instance of the adjudication response:
     *     claim, predetermination or preauthorization response.
     */
    public ExplanationOfBenefitBuilder.Impl withClaimResponse(@NonNull Reference claimResponse) {
      this.claimResponse = Optional.of(claimResponse);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withClaimResponse(
        @NonNull ReferenceBuilder claimResponse) {
      this.claimResponse = Optional.of(claimResponse.build());
      return this;
    }
    /** @param benefitPeriod - The term of the benefits documented in this response. */
    public ExplanationOfBenefitBuilder.Impl withBenefitPeriod(@NonNull Period benefitPeriod) {
      this.benefitPeriod = Optional.of(benefitPeriod);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withBenefitPeriod(
        @NonNull PeriodBuilder benefitPeriod) {
      this.benefitPeriod = Optional.of(benefitPeriod.build());
      return this;
    }
    /** @param billablePeriod - The period for which charges are being submitted. */
    public ExplanationOfBenefitBuilder.Impl withBillablePeriod(@NonNull Period billablePeriod) {
      this.billablePeriod = Optional.of(billablePeriod);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withBillablePeriod(
        @NonNull PeriodBuilder billablePeriod) {
      this.billablePeriod = Optional.of(billablePeriod.build());
      return this;
    }
    /**
     * @param preAuthRefPeriod - The timeframe during which the supplied preauthorization reference
     *     may be quoted on claims to obtain the adjudication as provided.
     */
    public ExplanationOfBenefitBuilder.Impl withPreAuthRefPeriod(
        @NonNull Period... preAuthRefPeriod) {
      this.preAuthRefPeriod = Arrays.asList(preAuthRefPeriod);
      return this;
    }
    /**
     * @param preAuthRefPeriod - The timeframe during which the supplied preauthorization reference
     *     may be quoted on claims to obtain the adjudication as provided.
     */
    public ExplanationOfBenefitBuilder.Impl withPreAuthRefPeriod(
        @NonNull Collection<Period> preAuthRefPeriod) {
      this.preAuthRefPeriod = Collections.unmodifiableCollection(preAuthRefPeriod);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withPreAuthRefPeriod(
        @NonNull PeriodBuilder... preAuthRefPeriod) {
      this.preAuthRefPeriod = Arrays.stream(preAuthRefPeriod).map(e -> e.build()).collect(toList());
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
    public ExplanationOfBenefitBuilder.Impl withModifierExtension(
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
    public ExplanationOfBenefitBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param originalPrescription - Original prescription which has been superseded by this
     *     prescription to support the dispensing of pharmacy services, medications or products.
     */
    public ExplanationOfBenefitBuilder.Impl withOriginalPrescription(
        @NonNull Reference originalPrescription) {
      this.originalPrescription = Optional.of(originalPrescription);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withOriginalPrescription(
        @NonNull ReferenceBuilder originalPrescription) {
      this.originalPrescription = Optional.of(originalPrescription.build());
      return this;
    }
    /**
     * @param fundsReserveRequested - A code to indicate whether and for whom funds are to be
     *     reserved for future claims.
     */
    public ExplanationOfBenefitBuilder.Impl withFundsReserveRequested(
        @NonNull CodeableConcept fundsReserveRequested) {
      this.fundsReserveRequested = Optional.of(fundsReserveRequested);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withFundsReserveRequested(
        @NonNull CodeableConceptBuilder fundsReserveRequested) {
      this.fundsReserveRequested = Optional.of(fundsReserveRequested.build());
      return this;
    }
    /**
     * @param payee - The party to be reimbursed for cost of the products and services according to
     *     the terms of the policy.
     */
    public ExplanationOfBenefitBuilder.Impl withPayee(@NonNull ExplanationOfBenefit.Payee payee) {
      this.payee = Optional.of(payee);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withPayee(
        @NonNull ExplanationOfBenefit_PayeeBuilder payee) {
      this.payee = Optional.of(payee.build());
      return this;
    }
    /** @param total - Categorized monetary totals for the adjudication. */
    public ExplanationOfBenefitBuilder.Impl withTotal(
        @NonNull ExplanationOfBenefit.Total... total) {
      this.total = Arrays.asList(total);
      return this;
    }
    /** @param total - Categorized monetary totals for the adjudication. */
    public ExplanationOfBenefitBuilder.Impl withTotal(
        @NonNull Collection<ExplanationOfBenefit.Total> total) {
      this.total = Collections.unmodifiableCollection(total);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withTotal(
        @NonNull ExplanationOfBenefit_TotalBuilder... total) {
      this.total = Arrays.stream(total).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param related - Other claims which are related to this claim such as prior submissions or
     *     claims for related services or for the same event.
     */
    public ExplanationOfBenefitBuilder.Impl withRelated(
        @NonNull ExplanationOfBenefit.Related... related) {
      this.related = Arrays.asList(related);
      return this;
    }
    /**
     * @param related - Other claims which are related to this claim such as prior submissions or
     *     claims for related services or for the same event.
     */
    public ExplanationOfBenefitBuilder.Impl withRelated(
        @NonNull Collection<ExplanationOfBenefit.Related> related) {
      this.related = Collections.unmodifiableCollection(related);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withRelated(
        @NonNull ExplanationOfBenefit_RelatedBuilder... related) {
      this.related = Arrays.stream(related).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param payment - Payment details for the adjudication of the claim. */
    public ExplanationOfBenefitBuilder.Impl withPayment(
        @NonNull ExplanationOfBenefit.Payment payment) {
      this.payment = Optional.of(payment);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withPayment(
        @NonNull ExplanationOfBenefit_PaymentBuilder payment) {
      this.payment = Optional.of(payment.build());
      return this;
    }
    /** @param careTeam - The members of the team who provided the products and services. */
    public ExplanationOfBenefitBuilder.Impl withCareTeam(
        @NonNull ExplanationOfBenefit.CareTeam... careTeam) {
      this.careTeam = Arrays.asList(careTeam);
      return this;
    }
    /** @param careTeam - The members of the team who provided the products and services. */
    public ExplanationOfBenefitBuilder.Impl withCareTeam(
        @NonNull Collection<ExplanationOfBenefit.CareTeam> careTeam) {
      this.careTeam = Collections.unmodifiableCollection(careTeam);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withCareTeam(
        @NonNull ExplanationOfBenefit_CareTeamBuilder... careTeam) {
      this.careTeam = Arrays.stream(careTeam).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param accident - Details of a accident which resulted in injuries which required the
     *     products and services listed in the claim.
     */
    public ExplanationOfBenefitBuilder.Impl withAccident(
        @NonNull ExplanationOfBenefit.Accident accident) {
      this.accident = Optional.of(accident);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withAccident(
        @NonNull ExplanationOfBenefit_AccidentBuilder accident) {
      this.accident = Optional.of(accident.build());
      return this;
    }
    /** @param diagnosis - Information about diagnoses relevant to the claim items. */
    public ExplanationOfBenefitBuilder.Impl withDiagnosis(
        @NonNull ExplanationOfBenefit.Diagnosis... diagnosis) {
      this.diagnosis = Arrays.asList(diagnosis);
      return this;
    }
    /** @param diagnosis - Information about diagnoses relevant to the claim items. */
    public ExplanationOfBenefitBuilder.Impl withDiagnosis(
        @NonNull Collection<ExplanationOfBenefit.Diagnosis> diagnosis) {
      this.diagnosis = Collections.unmodifiableCollection(diagnosis);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withDiagnosis(
        @NonNull ExplanationOfBenefit_DiagnosisBuilder... diagnosis) {
      this.diagnosis = Arrays.stream(diagnosis).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param procedure - Procedures performed on the patient relevant to the billing items with the
     *     claim.
     */
    public ExplanationOfBenefitBuilder.Impl withProcedure(
        @NonNull ExplanationOfBenefit.Procedure... procedure) {
      this.procedure = Arrays.asList(procedure);
      return this;
    }
    /**
     * @param procedure - Procedures performed on the patient relevant to the billing items with the
     *     claim.
     */
    public ExplanationOfBenefitBuilder.Impl withProcedure(
        @NonNull Collection<ExplanationOfBenefit.Procedure> procedure) {
      this.procedure = Collections.unmodifiableCollection(procedure);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withProcedure(
        @NonNull ExplanationOfBenefit_ProcedureBuilder... procedure) {
      this.procedure = Arrays.stream(procedure).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param processNote - A note that describes or explains adjudication results in a human
     *     readable form.
     */
    public ExplanationOfBenefitBuilder.Impl withProcessNote(
        @NonNull ExplanationOfBenefit.ProcessNote... processNote) {
      this.processNote = Arrays.asList(processNote);
      return this;
    }
    /**
     * @param processNote - A note that describes or explains adjudication results in a human
     *     readable form.
     */
    public ExplanationOfBenefitBuilder.Impl withProcessNote(
        @NonNull Collection<ExplanationOfBenefit.ProcessNote> processNote) {
      this.processNote = Collections.unmodifiableCollection(processNote);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withProcessNote(
        @NonNull ExplanationOfBenefit_ProcessNoteBuilder... processNote) {
      this.processNote = Arrays.stream(processNote).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param supportingInfo - Additional information codes regarding exceptions, special
     *     considerations, the condition, situation, prior or concurrent issues.
     */
    public ExplanationOfBenefitBuilder.Impl withSupportingInfo(
        @NonNull ExplanationOfBenefit.SupportingInfo... supportingInfo) {
      this.supportingInfo = Arrays.asList(supportingInfo);
      return this;
    }
    /**
     * @param supportingInfo - Additional information codes regarding exceptions, special
     *     considerations, the condition, situation, prior or concurrent issues.
     */
    public ExplanationOfBenefitBuilder.Impl withSupportingInfo(
        @NonNull Collection<ExplanationOfBenefit.SupportingInfo> supportingInfo) {
      this.supportingInfo = Collections.unmodifiableCollection(supportingInfo);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withSupportingInfo(
        @NonNull ExplanationOfBenefit_SupportingInfoBuilder... supportingInfo) {
      this.supportingInfo = Arrays.stream(supportingInfo).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param item - A claim line. Either a simple (a product or service) or a 'group' of details
     *     which can also be a simple items or groups of sub-details.
     */
    public ExplanationOfBenefitBuilder.Impl withItem(@NonNull ExplanationOfBenefit.Item... item) {
      this.item = Arrays.asList(item);
      return this;
    }
    /**
     * @param item - A claim line. Either a simple (a product or service) or a 'group' of details
     *     which can also be a simple items or groups of sub-details.
     */
    public ExplanationOfBenefitBuilder.Impl withItem(
        @NonNull Collection<ExplanationOfBenefit.Item> item) {
      this.item = Collections.unmodifiableCollection(item);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withItem(
        @NonNull ExplanationOfBenefit_ItemBuilder... item) {
      this.item = Arrays.stream(item).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param addItem - The first-tier service adjudications for payor added product or service
     *     lines.
     */
    public ExplanationOfBenefitBuilder.Impl withAddItem(
        @NonNull ExplanationOfBenefit.AddItem... addItem) {
      this.addItem = Arrays.asList(addItem);
      return this;
    }
    /**
     * @param addItem - The first-tier service adjudications for payor added product or service
     *     lines.
     */
    public ExplanationOfBenefitBuilder.Impl withAddItem(
        @NonNull Collection<ExplanationOfBenefit.AddItem> addItem) {
      this.addItem = Collections.unmodifiableCollection(addItem);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withAddItem(
        @NonNull ExplanationOfBenefit_AddItemBuilder... addItem) {
      this.addItem = Arrays.stream(addItem).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param benefitBalance - Balance by Benefit Category. */
    public ExplanationOfBenefitBuilder.Impl withBenefitBalance(
        @NonNull ExplanationOfBenefit.BenefitBalance... benefitBalance) {
      this.benefitBalance = Arrays.asList(benefitBalance);
      return this;
    }
    /** @param benefitBalance - Balance by Benefit Category. */
    public ExplanationOfBenefitBuilder.Impl withBenefitBalance(
        @NonNull Collection<ExplanationOfBenefit.BenefitBalance> benefitBalance) {
      this.benefitBalance = Collections.unmodifiableCollection(benefitBalance);
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withBenefitBalance(
        @NonNull ExplanationOfBenefit_BenefitBalanceBuilder... benefitBalance) {
      this.benefitBalance = Arrays.stream(benefitBalance).map(e -> e.build()).collect(toList());
      return this;
    }

    public ExplanationOfBenefitBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public ExplanationOfBenefit build() {
      return new ExplanationOfBenefit(
          OptionConverters.toScala(id),
          use,
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          _type,
          OptionConverters.toScala(form),
          OptionConverters.toScala(claim),
          status,
          OptionConverters.toScala(subType),
          patient,
          created,
          OptionConverters.toScala(enterer),
          insurer,
          outcome,
          OptionConverters.toScala(language),
          provider,
          OptionConverters.toScala(priority),
          OptionConverters.toScala(referral),
          OptionConverters.toScala(facility),
          OptionConverters.toScala(formCode),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          preAuthRef.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(precedence.map(x -> (Object) x)),
          OptionConverters.toScala(disposition),
          OptionConverters.toScala(fundsReserve),
          OptionConverters.toScala(prescription),
          adjudication.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(claimResponse),
          OptionConverters.toScala(benefitPeriod),
          OptionConverters.toScala(billablePeriod),
          preAuthRefPeriod.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(originalPrescription),
          OptionConverters.toScala(fundsReserveRequested),
          OptionConverters.toScala(payee),
          total.stream().collect(new LitSeqJCollector<>()),
          related.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(payment),
          careTeam.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(accident),
          diagnosis.stream().collect(new LitSeqJCollector<>()),
          procedure.stream().collect(new LitSeqJCollector<>()),
          insurance.stream().collect(new NonEmptyLitSeqJCollector<>()),
          processNote.stream().collect(new LitSeqJCollector<>()),
          supportingInfo.stream().collect(new LitSeqJCollector<>()),
          item.stream().collect(new LitSeqJCollector<>()),
          addItem.stream().collect(new LitSeqJCollector<>()),
          benefitBalance.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
