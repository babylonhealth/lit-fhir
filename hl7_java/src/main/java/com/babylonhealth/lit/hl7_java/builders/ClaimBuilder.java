package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeq;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.NonEmptyLitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.CLAIM_USE;
import com.babylonhealth.lit.hl7.FM_STATUS;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface ClaimBuilder extends DomainResourceBuilder {
  public Claim build();

  public static Impl init(
      CLAIM_USE use,
      CodeableConcept _type,
      FM_STATUS status,
      Reference patient,
      FHIRDateTime created,
      Reference provider,
      CodeableConcept priority,
      Collection<Claim.Insurance> insurance) {
    return new Impl(use, _type, status, patient, created, provider, priority, insurance);
  }

  public static Impl builder(
      CLAIM_USE use,
      CodeableConceptBuilder _type,
      FM_STATUS status,
      ReferenceBuilder patient,
      FHIRDateTime created,
      ReferenceBuilder provider,
      CodeableConceptBuilder priority,
      Collection<Claim_InsuranceBuilder> insurance) {
    return new Impl(
        use,
        _type.build(),
        status,
        patient.build(),
        created,
        provider.build(),
        priority.build(),
        new LitSeq<>(insurance).map(Claim_InsuranceBuilder::build));
  }

  public class Impl implements ClaimBuilder {
    private Optional<String> id = Optional.empty();
    private CLAIM_USE use;
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private CodeableConcept _type;
    private Optional<Money> total = Optional.empty();
    private FM_STATUS status;
    private Optional<CodeableConcept> subType = Optional.empty();
    private Reference patient;
    private FHIRDateTime created;
    private Optional<Reference> enterer = Optional.empty();
    private Optional<Reference> insurer = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Reference provider;
    private CodeableConcept priority;
    private Optional<Reference> referral = Optional.empty();
    private Optional<Reference> facility = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<CodeableConcept> fundsReserve = Optional.empty();
    private Optional<Reference> prescription = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<Period> billablePeriod = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<Reference> originalPrescription = Optional.empty();
    private Optional<Claim.Payee> payee = Optional.empty();
    private Collection<Claim.Related> related = Collections.emptyList();
    private Collection<Claim.CareTeam> careTeam = Collections.emptyList();
    private Optional<Claim.Accident> accident = Optional.empty();
    private Collection<Claim.Diagnosis> diagnosis = Collections.emptyList();
    private Collection<Claim.Procedure> procedure = Collections.emptyList();
    private Collection<Claim.Insurance> insurance;
    private Collection<Claim.SupportingInfo> supportingInfo = Collections.emptyList();
    private Collection<Claim.Item> item = Collections.emptyList();

    /**
     * Required fields for {@link Claim}
     *
     * @param use - A code to indicate whether the nature of the request is: to request adjudication
     *     of products and services previously rendered; or requesting authorization and
     *     adjudication for provision in the future; or requesting the non-binding adjudication of
     *     the listed products and services which could be provided in the future.
     * @param _type - The category of claim, e.g. oral, pharmacy, vision, institutional,
     *     professional.
     * @param status - The status of the resource instance.
     * @param patient - The party to whom the professional services and/or products have been
     *     supplied or are being considered and for whom actual or forecast reimbursement is sought.
     * @param created - The date this resource was created.
     * @param provider - The provider which is responsible for the claim, predetermination or
     *     preauthorization.
     * @param priority - The provider-required urgency of processing the request. Typical values
     *     include: stat, routine deferred.
     * @param insurance - Financial instruments for reimbursement for the health care products and
     *     services specified on the claim.
     */
    public Impl(
        CLAIM_USE use,
        CodeableConcept _type,
        FM_STATUS status,
        Reference patient,
        FHIRDateTime created,
        Reference provider,
        CodeableConcept priority,
        Collection<Claim.Insurance> insurance) {
      this.use = use;
      this._type = _type;
      this.status = status;
      this.patient = patient;
      this.created = created;
      this.provider = provider;
      this.priority = priority;
      this.insurance = insurance;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ClaimBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public ClaimBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public ClaimBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public ClaimBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public ClaimBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param total - The total value of the all the items in the claim. */
    public ClaimBuilder.Impl withTotal(@NonNull Money total) {
      this.total = Optional.of(total);
      return this;
    }

    public ClaimBuilder.Impl withTotal(@NonNull MoneyBuilder total) {
      this.total = Optional.of(total.build());
      return this;
    }
    /**
     * @param subType - A finer grained suite of claim type codes which may convey additional
     *     information such as Inpatient vs Outpatient and/or a specialty service.
     */
    public ClaimBuilder.Impl withSubType(@NonNull CodeableConcept subType) {
      this.subType = Optional.of(subType);
      return this;
    }

    public ClaimBuilder.Impl withSubType(@NonNull CodeableConceptBuilder subType) {
      this.subType = Optional.of(subType.build());
      return this;
    }
    /** @param enterer - Individual who created the claim, predetermination or preauthorization. */
    public ClaimBuilder.Impl withEnterer(@NonNull Reference enterer) {
      this.enterer = Optional.of(enterer);
      return this;
    }

    public ClaimBuilder.Impl withEnterer(@NonNull ReferenceBuilder enterer) {
      this.enterer = Optional.of(enterer.build());
      return this;
    }
    /** @param insurer - The Insurer who is target of the request. */
    public ClaimBuilder.Impl withInsurer(@NonNull Reference insurer) {
      this.insurer = Optional.of(insurer);
      return this;
    }

    public ClaimBuilder.Impl withInsurer(@NonNull ReferenceBuilder insurer) {
      this.insurer = Optional.of(insurer.build());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public ClaimBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /** @param referral - A reference to a referral resource. */
    public ClaimBuilder.Impl withReferral(@NonNull Reference referral) {
      this.referral = Optional.of(referral);
      return this;
    }

    public ClaimBuilder.Impl withReferral(@NonNull ReferenceBuilder referral) {
      this.referral = Optional.of(referral.build());
      return this;
    }
    /** @param facility - Facility where the services were provided. */
    public ClaimBuilder.Impl withFacility(@NonNull Reference facility) {
      this.facility = Optional.of(facility);
      return this;
    }

    public ClaimBuilder.Impl withFacility(@NonNull ReferenceBuilder facility) {
      this.facility = Optional.of(facility.build());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public ClaimBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public ClaimBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public ClaimBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public ClaimBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ClaimBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ClaimBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param identifier - A unique identifier assigned to this claim. */
    public ClaimBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /** @param identifier - A unique identifier assigned to this claim. */
    public ClaimBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public ClaimBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param fundsReserve - A code to indicate whether and for whom funds are to be reserved for
     *     future claims.
     */
    public ClaimBuilder.Impl withFundsReserve(@NonNull CodeableConcept fundsReserve) {
      this.fundsReserve = Optional.of(fundsReserve);
      return this;
    }

    public ClaimBuilder.Impl withFundsReserve(@NonNull CodeableConceptBuilder fundsReserve) {
      this.fundsReserve = Optional.of(fundsReserve.build());
      return this;
    }
    /**
     * @param prescription - Prescription to support the dispensing of pharmacy, device or vision
     *     products.
     */
    public ClaimBuilder.Impl withPrescription(@NonNull Reference prescription) {
      this.prescription = Optional.of(prescription);
      return this;
    }

    public ClaimBuilder.Impl withPrescription(@NonNull ReferenceBuilder prescription) {
      this.prescription = Optional.of(prescription.build());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public ClaimBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /** @param billablePeriod - The period for which charges are being submitted. */
    public ClaimBuilder.Impl withBillablePeriod(@NonNull Period billablePeriod) {
      this.billablePeriod = Optional.of(billablePeriod);
      return this;
    }

    public ClaimBuilder.Impl withBillablePeriod(@NonNull PeriodBuilder billablePeriod) {
      this.billablePeriod = Optional.of(billablePeriod.build());
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
    public ClaimBuilder.Impl withModifierExtension(@NonNull Extension... modifierExtension) {
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
    public ClaimBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ClaimBuilder.Impl withModifierExtension(@NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param originalPrescription - Original prescription which has been superseded by this
     *     prescription to support the dispensing of pharmacy services, medications or products.
     */
    public ClaimBuilder.Impl withOriginalPrescription(@NonNull Reference originalPrescription) {
      this.originalPrescription = Optional.of(originalPrescription);
      return this;
    }

    public ClaimBuilder.Impl withOriginalPrescription(
        @NonNull ReferenceBuilder originalPrescription) {
      this.originalPrescription = Optional.of(originalPrescription.build());
      return this;
    }
    /**
     * @param payee - The party to be reimbursed for cost of the products and services according to
     *     the terms of the policy.
     */
    public ClaimBuilder.Impl withPayee(@NonNull Claim.Payee payee) {
      this.payee = Optional.of(payee);
      return this;
    }

    public ClaimBuilder.Impl withPayee(@NonNull Claim_PayeeBuilder payee) {
      this.payee = Optional.of(payee.build());
      return this;
    }
    /**
     * @param related - Other claims which are related to this claim such as prior submissions or
     *     claims for related services or for the same event.
     */
    public ClaimBuilder.Impl withRelated(@NonNull Claim.Related... related) {
      this.related = Arrays.asList(related);
      return this;
    }
    /**
     * @param related - Other claims which are related to this claim such as prior submissions or
     *     claims for related services or for the same event.
     */
    public ClaimBuilder.Impl withRelated(@NonNull Collection<Claim.Related> related) {
      this.related = Collections.unmodifiableCollection(related);
      return this;
    }

    public ClaimBuilder.Impl withRelated(@NonNull Claim_RelatedBuilder... related) {
      this.related = Arrays.stream(related).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param careTeam - The members of the team who provided the products and services. */
    public ClaimBuilder.Impl withCareTeam(@NonNull Claim.CareTeam... careTeam) {
      this.careTeam = Arrays.asList(careTeam);
      return this;
    }
    /** @param careTeam - The members of the team who provided the products and services. */
    public ClaimBuilder.Impl withCareTeam(@NonNull Collection<Claim.CareTeam> careTeam) {
      this.careTeam = Collections.unmodifiableCollection(careTeam);
      return this;
    }

    public ClaimBuilder.Impl withCareTeam(@NonNull Claim_CareTeamBuilder... careTeam) {
      this.careTeam = Arrays.stream(careTeam).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param accident - Details of an accident which resulted in injuries which required the
     *     products and services listed in the claim.
     */
    public ClaimBuilder.Impl withAccident(@NonNull Claim.Accident accident) {
      this.accident = Optional.of(accident);
      return this;
    }

    public ClaimBuilder.Impl withAccident(@NonNull Claim_AccidentBuilder accident) {
      this.accident = Optional.of(accident.build());
      return this;
    }
    /** @param diagnosis - Information about diagnoses relevant to the claim items. */
    public ClaimBuilder.Impl withDiagnosis(@NonNull Claim.Diagnosis... diagnosis) {
      this.diagnosis = Arrays.asList(diagnosis);
      return this;
    }
    /** @param diagnosis - Information about diagnoses relevant to the claim items. */
    public ClaimBuilder.Impl withDiagnosis(@NonNull Collection<Claim.Diagnosis> diagnosis) {
      this.diagnosis = Collections.unmodifiableCollection(diagnosis);
      return this;
    }

    public ClaimBuilder.Impl withDiagnosis(@NonNull Claim_DiagnosisBuilder... diagnosis) {
      this.diagnosis = Arrays.stream(diagnosis).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param procedure - Procedures performed on the patient relevant to the billing items with the
     *     claim.
     */
    public ClaimBuilder.Impl withProcedure(@NonNull Claim.Procedure... procedure) {
      this.procedure = Arrays.asList(procedure);
      return this;
    }
    /**
     * @param procedure - Procedures performed on the patient relevant to the billing items with the
     *     claim.
     */
    public ClaimBuilder.Impl withProcedure(@NonNull Collection<Claim.Procedure> procedure) {
      this.procedure = Collections.unmodifiableCollection(procedure);
      return this;
    }

    public ClaimBuilder.Impl withProcedure(@NonNull Claim_ProcedureBuilder... procedure) {
      this.procedure = Arrays.stream(procedure).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param supportingInfo - Additional information codes regarding exceptions, special
     *     considerations, the condition, situation, prior or concurrent issues.
     */
    public ClaimBuilder.Impl withSupportingInfo(@NonNull Claim.SupportingInfo... supportingInfo) {
      this.supportingInfo = Arrays.asList(supportingInfo);
      return this;
    }
    /**
     * @param supportingInfo - Additional information codes regarding exceptions, special
     *     considerations, the condition, situation, prior or concurrent issues.
     */
    public ClaimBuilder.Impl withSupportingInfo(
        @NonNull Collection<Claim.SupportingInfo> supportingInfo) {
      this.supportingInfo = Collections.unmodifiableCollection(supportingInfo);
      return this;
    }

    public ClaimBuilder.Impl withSupportingInfo(
        @NonNull Claim_SupportingInfoBuilder... supportingInfo) {
      this.supportingInfo = Arrays.stream(supportingInfo).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param item - A claim line. Either a simple product or service or a 'group' of details which
     *     can each be a simple items or groups of sub-details.
     */
    public ClaimBuilder.Impl withItem(@NonNull Claim.Item... item) {
      this.item = Arrays.asList(item);
      return this;
    }
    /**
     * @param item - A claim line. Either a simple product or service or a 'group' of details which
     *     can each be a simple items or groups of sub-details.
     */
    public ClaimBuilder.Impl withItem(@NonNull Collection<Claim.Item> item) {
      this.item = Collections.unmodifiableCollection(item);
      return this;
    }

    public ClaimBuilder.Impl withItem(@NonNull Claim_ItemBuilder... item) {
      this.item = Arrays.stream(item).map(e -> e.build()).collect(toList());
      return this;
    }

    public ClaimBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Claim build() {
      return new Claim(
          OptionConverters.toScala(id),
          use,
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          _type,
          OptionConverters.toScala(total),
          status,
          OptionConverters.toScala(subType),
          patient,
          created,
          OptionConverters.toScala(enterer),
          OptionConverters.toScala(insurer),
          OptionConverters.toScala(language),
          provider,
          priority,
          OptionConverters.toScala(referral),
          OptionConverters.toScala(facility),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(fundsReserve),
          OptionConverters.toScala(prescription),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(billablePeriod),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(originalPrescription),
          OptionConverters.toScala(payee),
          related.stream().collect(new LitSeqJCollector<>()),
          careTeam.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(accident),
          diagnosis.stream().collect(new LitSeqJCollector<>()),
          procedure.stream().collect(new LitSeqJCollector<>()),
          insurance.stream().collect(new NonEmptyLitSeqJCollector<>()),
          supportingInfo.stream().collect(new LitSeqJCollector<>()),
          item.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
