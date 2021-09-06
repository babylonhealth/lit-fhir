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
import com.babylonhealth.lit.hl7.EPISODE_OF_CARE_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface EpisodeOfCareBuilder extends DomainResourceBuilder {
  public EpisodeOfCare build();

  public static Impl init(EPISODE_OF_CARE_STATUS status, Reference patient) {
    return new Impl(status, patient);
  }

  public static Impl builder(EPISODE_OF_CARE_STATUS status, ReferenceBuilder patient) {
    return new Impl(status, patient.build());
  }

  public class Impl implements EpisodeOfCareBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Collection<CodeableConcept> _type = Collections.emptyList();
    private Collection<Reference> team = Collections.emptyList();
    private EPISODE_OF_CARE_STATUS status;
    private Optional<Period> period = Optional.empty();
    private Reference patient;
    private Collection<Reference> account = Collections.emptyList();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<Reference> careManager = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Reference> referralRequest = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<Reference> managingOrganization = Optional.empty();
    private Collection<EpisodeOfCare.Diagnosis> diagnosis = Collections.emptyList();
    private Collection<EpisodeOfCare.StatusHistory> statusHistory = Collections.emptyList();

    /**
     * Required fields for {@link EpisodeOfCare}
     *
     * @param status - planned | waitlist | active | onhold | finished | cancelled.
     * @param patient - The patient who is the focus of this episode of care.
     */
    public Impl(EPISODE_OF_CARE_STATUS status, Reference patient) {
      this.status = status;
      this.patient = patient;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public EpisodeOfCareBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public EpisodeOfCareBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public EpisodeOfCareBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public EpisodeOfCareBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public EpisodeOfCareBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param _type - A classification of the type of episode of care; e.g. specialist referral,
     *     disease management, type of funded care.
     */
    public EpisodeOfCareBuilder.Impl withType(@NonNull CodeableConcept... _type) {
      this._type = Arrays.asList(_type);
      return this;
    }
    /**
     * @param _type - A classification of the type of episode of care; e.g. specialist referral,
     *     disease management, type of funded care.
     */
    public EpisodeOfCareBuilder.Impl withType(@NonNull Collection<CodeableConcept> _type) {
      this._type = Collections.unmodifiableCollection(_type);
      return this;
    }

    public EpisodeOfCareBuilder.Impl withType(@NonNull CodeableConceptBuilder... _type) {
      this._type = Arrays.stream(_type).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param team - The list of practitioners that may be facilitating this episode of care for
     *     specific purposes.
     */
    public EpisodeOfCareBuilder.Impl withTeam(@NonNull Reference... team) {
      this.team = Arrays.asList(team);
      return this;
    }
    /**
     * @param team - The list of practitioners that may be facilitating this episode of care for
     *     specific purposes.
     */
    public EpisodeOfCareBuilder.Impl withTeam(@NonNull Collection<Reference> team) {
      this.team = Collections.unmodifiableCollection(team);
      return this;
    }

    public EpisodeOfCareBuilder.Impl withTeam(@NonNull ReferenceBuilder... team) {
      this.team = Arrays.stream(team).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param period - The interval during which the managing organization assumes the defined
     *     responsibility.
     */
    public EpisodeOfCareBuilder.Impl withPeriod(@NonNull Period period) {
      this.period = Optional.of(period);
      return this;
    }

    public EpisodeOfCareBuilder.Impl withPeriod(@NonNull PeriodBuilder period) {
      this.period = Optional.of(period.build());
      return this;
    }
    /** @param account - The set of accounts that may be used for billing for this EpisodeOfCare. */
    public EpisodeOfCareBuilder.Impl withAccount(@NonNull Reference... account) {
      this.account = Arrays.asList(account);
      return this;
    }
    /** @param account - The set of accounts that may be used for billing for this EpisodeOfCare. */
    public EpisodeOfCareBuilder.Impl withAccount(@NonNull Collection<Reference> account) {
      this.account = Collections.unmodifiableCollection(account);
      return this;
    }

    public EpisodeOfCareBuilder.Impl withAccount(@NonNull ReferenceBuilder... account) {
      this.account = Arrays.stream(account).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public EpisodeOfCareBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public EpisodeOfCareBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public EpisodeOfCareBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public EpisodeOfCareBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public EpisodeOfCareBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public EpisodeOfCareBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public EpisodeOfCareBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param identifier - The EpisodeOfCare may be known by different identifiers for different
     *     contexts of use, such as when an external agency is tracking the Episode for funding
     *     purposes.
     */
    public EpisodeOfCareBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - The EpisodeOfCare may be known by different identifiers for different
     *     contexts of use, such as when an external agency is tracking the Episode for funding
     *     purposes.
     */
    public EpisodeOfCareBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public EpisodeOfCareBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param careManager - The practitioner that is the care manager/care coordinator for this
     *     patient.
     */
    public EpisodeOfCareBuilder.Impl withCareManager(@NonNull Reference careManager) {
      this.careManager = Optional.of(careManager);
      return this;
    }

    public EpisodeOfCareBuilder.Impl withCareManager(@NonNull ReferenceBuilder careManager) {
      this.careManager = Optional.of(careManager.build());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public EpisodeOfCareBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param referralRequest - Referral Request(s) that are fulfilled by this EpisodeOfCare,
     *     incoming referrals.
     */
    public EpisodeOfCareBuilder.Impl withReferralRequest(@NonNull Reference... referralRequest) {
      this.referralRequest = Arrays.asList(referralRequest);
      return this;
    }
    /**
     * @param referralRequest - Referral Request(s) that are fulfilled by this EpisodeOfCare,
     *     incoming referrals.
     */
    public EpisodeOfCareBuilder.Impl withReferralRequest(
        @NonNull Collection<Reference> referralRequest) {
      this.referralRequest = Collections.unmodifiableCollection(referralRequest);
      return this;
    }

    public EpisodeOfCareBuilder.Impl withReferralRequest(
        @NonNull ReferenceBuilder... referralRequest) {
      this.referralRequest = Arrays.stream(referralRequest).map(e -> e.build()).collect(toList());
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
    public EpisodeOfCareBuilder.Impl withModifierExtension(
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
    public EpisodeOfCareBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public EpisodeOfCareBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param managingOrganization - The organization that has assumed the specific responsibilities
     *     for the specified duration.
     */
    public EpisodeOfCareBuilder.Impl withManagingOrganization(
        @NonNull Reference managingOrganization) {
      this.managingOrganization = Optional.of(managingOrganization);
      return this;
    }

    public EpisodeOfCareBuilder.Impl withManagingOrganization(
        @NonNull ReferenceBuilder managingOrganization) {
      this.managingOrganization = Optional.of(managingOrganization.build());
      return this;
    }
    /** @param diagnosis - The list of diagnosis relevant to this episode of care. */
    public EpisodeOfCareBuilder.Impl withDiagnosis(@NonNull EpisodeOfCare.Diagnosis... diagnosis) {
      this.diagnosis = Arrays.asList(diagnosis);
      return this;
    }
    /** @param diagnosis - The list of diagnosis relevant to this episode of care. */
    public EpisodeOfCareBuilder.Impl withDiagnosis(
        @NonNull Collection<EpisodeOfCare.Diagnosis> diagnosis) {
      this.diagnosis = Collections.unmodifiableCollection(diagnosis);
      return this;
    }

    public EpisodeOfCareBuilder.Impl withDiagnosis(
        @NonNull EpisodeOfCare_DiagnosisBuilder... diagnosis) {
      this.diagnosis = Arrays.stream(diagnosis).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param statusHistory - The history of statuses that the EpisodeOfCare has been through
     *     (without requiring processing the history of the resource).
     */
    public EpisodeOfCareBuilder.Impl withStatusHistory(
        @NonNull EpisodeOfCare.StatusHistory... statusHistory) {
      this.statusHistory = Arrays.asList(statusHistory);
      return this;
    }
    /**
     * @param statusHistory - The history of statuses that the EpisodeOfCare has been through
     *     (without requiring processing the history of the resource).
     */
    public EpisodeOfCareBuilder.Impl withStatusHistory(
        @NonNull Collection<EpisodeOfCare.StatusHistory> statusHistory) {
      this.statusHistory = Collections.unmodifiableCollection(statusHistory);
      return this;
    }

    public EpisodeOfCareBuilder.Impl withStatusHistory(
        @NonNull EpisodeOfCare_StatusHistoryBuilder... statusHistory) {
      this.statusHistory = Arrays.stream(statusHistory).map(e -> e.build()).collect(toList());
      return this;
    }

    public EpisodeOfCareBuilder withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public EpisodeOfCare build() {
      return new EpisodeOfCare(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          _type.stream().collect(new LitSeqJCollector<>()),
          team.stream().collect(new LitSeqJCollector<>()),
          status,
          OptionConverters.toScala(period),
          patient,
          account.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(language),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(careManager),
          OptionConverters.toScala(implicitRules),
          referralRequest.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(managingOrganization),
          diagnosis.stream().collect(new LitSeqJCollector<>()),
          statusHistory.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
