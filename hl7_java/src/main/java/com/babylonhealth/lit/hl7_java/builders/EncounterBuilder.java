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
import com.babylonhealth.lit.hl7.ENCOUNTER_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface EncounterBuilder extends DomainResourceBuilder {
  public Encounter build();

  public static Impl init(Coding _class, ENCOUNTER_STATUS status) {
    return new Impl(_class, status);
  }

  public static Impl builder(CodingBuilder _class, ENCOUNTER_STATUS status) {
    return new Impl(_class.build(), status);
  }

  public class Impl implements EncounterBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Collection<CodeableConcept> _type = Collections.emptyList();
    private Coding _class;
    private ENCOUNTER_STATUS status;
    private Optional<Period> period = Optional.empty();
    private Optional<Duration> length = Optional.empty();
    private Collection<CodeableReference> reason = Collections.emptyList();
    private Optional<Reference> partOf = Optional.empty();
    private Optional<Reference> subject = Optional.empty();
    private Collection<Reference> basedOn = Collections.emptyList();
    private Collection<Reference> account = Collections.emptyList();
    private Optional<LANGUAGES> language = Optional.empty();
    private Optional<CodeableConcept> priority = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<CodeableConcept> serviceType = Optional.empty();
    private Collection<Reference> appointment = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<CodeableConcept> subjectStatus = Optional.empty();
    private Collection<Reference> episodeOfCare = Collections.emptyList();
    private Optional<Reference> serviceProvider = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Encounter.Location> location = Collections.emptyList();
    private Collection<Encounter.Diagnosis> diagnosis = Collections.emptyList();
    private Collection<Encounter.Participant> participant = Collections.emptyList();
    private Collection<Encounter.ClassHistory> classHistory = Collections.emptyList();
    private Collection<Encounter.StatusHistory> statusHistory = Collections.emptyList();
    private Optional<Encounter.Hospitalization> hospitalization = Optional.empty();

    /**
     * Required fields for {@link Encounter}
     *
     * @param _class - Concepts representing classification of patient encounter such as ambulatory
     *     (outpatient), inpatient, emergency, home health or others due to local variations.
     * @param status - planned | in-progress | onhold | completed | cancelled | entered-in-error |
     *     unknown.
     */
    public Impl(Coding _class, ENCOUNTER_STATUS status) {
      this._class = _class;
      this.status = status;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public EncounterBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public EncounterBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public EncounterBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public EncounterBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public EncounterBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param _type - Specific type of encounter (e.g. e-mail consultation, surgical day-care,
     *     skilled nursing, rehabilitation).
     */
    public EncounterBuilder.Impl withType(@NonNull CodeableConcept... _type) {
      this._type = Arrays.asList(_type);
      return this;
    }
    /**
     * @param _type - Specific type of encounter (e.g. e-mail consultation, surgical day-care,
     *     skilled nursing, rehabilitation).
     */
    public EncounterBuilder.Impl withType(@NonNull Collection<CodeableConcept> _type) {
      this._type = Collections.unmodifiableCollection(_type);
      return this;
    }

    public EncounterBuilder.Impl withType(@NonNull CodeableConceptBuilder... _type) {
      this._type = Arrays.stream(_type).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param period - The start and end time of the encounter. */
    public EncounterBuilder.Impl withPeriod(@NonNull Period period) {
      this.period = Optional.of(period);
      return this;
    }

    public EncounterBuilder.Impl withPeriod(@NonNull PeriodBuilder period) {
      this.period = Optional.of(period.build());
      return this;
    }
    /**
     * @param length - Quantity of time the encounter lasted. This excludes the time during leaves
     *     of absence.
     */
    public EncounterBuilder.Impl withLength(@NonNull Duration length) {
      this.length = Optional.of(length);
      return this;
    }

    public EncounterBuilder.Impl withLength(@NonNull DurationBuilder length) {
      this.length = Optional.of(length.build());
      return this;
    }
    /**
     * @param reason - Reason the encounter takes place, expressed as a code or a reference to
     *     another resource. For admissions, this can be used for a coded admission diagnosis.
     */
    public EncounterBuilder.Impl withReason(@NonNull CodeableReference... reason) {
      this.reason = Arrays.asList(reason);
      return this;
    }
    /**
     * @param reason - Reason the encounter takes place, expressed as a code or a reference to
     *     another resource. For admissions, this can be used for a coded admission diagnosis.
     */
    public EncounterBuilder.Impl withReason(@NonNull Collection<CodeableReference> reason) {
      this.reason = Collections.unmodifiableCollection(reason);
      return this;
    }

    public EncounterBuilder.Impl withReason(@NonNull CodeableReferenceBuilder... reason) {
      this.reason = Arrays.stream(reason).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param partOf - Another Encounter of which this encounter is a part of (administratively or
     *     in time).
     */
    public EncounterBuilder.Impl withPartOf(@NonNull Reference partOf) {
      this.partOf = Optional.of(partOf);
      return this;
    }

    public EncounterBuilder.Impl withPartOf(@NonNull ReferenceBuilder partOf) {
      this.partOf = Optional.of(partOf.build());
      return this;
    }
    /** @param subject - The patient or group present at the encounter. */
    public EncounterBuilder.Impl withSubject(@NonNull Reference subject) {
      this.subject = Optional.of(subject);
      return this;
    }

    public EncounterBuilder.Impl withSubject(@NonNull ReferenceBuilder subject) {
      this.subject = Optional.of(subject.build());
      return this;
    }
    /**
     * @param basedOn - The request this encounter satisfies (e.g. incoming referral or procedure
     *     request).
     */
    public EncounterBuilder.Impl withBasedOn(@NonNull Reference... basedOn) {
      this.basedOn = Arrays.asList(basedOn);
      return this;
    }
    /**
     * @param basedOn - The request this encounter satisfies (e.g. incoming referral or procedure
     *     request).
     */
    public EncounterBuilder.Impl withBasedOn(@NonNull Collection<Reference> basedOn) {
      this.basedOn = Collections.unmodifiableCollection(basedOn);
      return this;
    }

    public EncounterBuilder.Impl withBasedOn(@NonNull ReferenceBuilder... basedOn) {
      this.basedOn = Arrays.stream(basedOn).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param account - The set of accounts that may be used for billing for this Encounter. */
    public EncounterBuilder.Impl withAccount(@NonNull Reference... account) {
      this.account = Arrays.asList(account);
      return this;
    }
    /** @param account - The set of accounts that may be used for billing for this Encounter. */
    public EncounterBuilder.Impl withAccount(@NonNull Collection<Reference> account) {
      this.account = Collections.unmodifiableCollection(account);
      return this;
    }

    public EncounterBuilder.Impl withAccount(@NonNull ReferenceBuilder... account) {
      this.account = Arrays.stream(account).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public EncounterBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /** @param priority - Indicates the urgency of the encounter. */
    public EncounterBuilder.Impl withPriority(@NonNull CodeableConcept priority) {
      this.priority = Optional.of(priority);
      return this;
    }

    public EncounterBuilder.Impl withPriority(@NonNull CodeableConceptBuilder priority) {
      this.priority = Optional.of(priority.build());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, nor can they have
     *     their own independent transaction scope.
     */
    public EncounterBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, nor can they have
     *     their own independent transaction scope.
     */
    public EncounterBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public EncounterBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public EncounterBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public EncounterBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public EncounterBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param identifier - Identifier(s) by which this encounter is known. */
    public EncounterBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /** @param identifier - Identifier(s) by which this encounter is known. */
    public EncounterBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public EncounterBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param serviceType - Broad categorization of the service that is to be provided (e.g.
     *     cardiology).
     */
    public EncounterBuilder.Impl withServiceType(@NonNull CodeableConcept serviceType) {
      this.serviceType = Optional.of(serviceType);
      return this;
    }

    public EncounterBuilder.Impl withServiceType(@NonNull CodeableConceptBuilder serviceType) {
      this.serviceType = Optional.of(serviceType.build());
      return this;
    }
    /** @param appointment - The appointment that scheduled this encounter. */
    public EncounterBuilder.Impl withAppointment(@NonNull Reference... appointment) {
      this.appointment = Arrays.asList(appointment);
      return this;
    }
    /** @param appointment - The appointment that scheduled this encounter. */
    public EncounterBuilder.Impl withAppointment(@NonNull Collection<Reference> appointment) {
      this.appointment = Collections.unmodifiableCollection(appointment);
      return this;
    }

    public EncounterBuilder.Impl withAppointment(@NonNull ReferenceBuilder... appointment) {
      this.appointment = Arrays.stream(appointment).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public EncounterBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param subjectStatus - The subjectStatus value can be used to track the patient's status
     *     within the encounter. It details whether the patient has arrived or departed, has been
     *     triaged or is currently in a waiting status.
     */
    public EncounterBuilder.Impl withSubjectStatus(@NonNull CodeableConcept subjectStatus) {
      this.subjectStatus = Optional.of(subjectStatus);
      return this;
    }

    public EncounterBuilder.Impl withSubjectStatus(@NonNull CodeableConceptBuilder subjectStatus) {
      this.subjectStatus = Optional.of(subjectStatus.build());
      return this;
    }
    /**
     * @param episodeOfCare - Where a specific encounter should be classified as a part of a
     *     specific episode(s) of care this field should be used. This association can facilitate
     *     grouping of related encounters together for a specific purpose, such as government
     *     reporting, issue tracking, association via a common problem. The association is recorded
     *     on the encounter as these are typically created after the episode of care and grouped on
     *     entry rather than editing the episode of care to append another encounter to it (the
     *     episode of care could span years).
     */
    public EncounterBuilder.Impl withEpisodeOfCare(@NonNull Reference... episodeOfCare) {
      this.episodeOfCare = Arrays.asList(episodeOfCare);
      return this;
    }
    /**
     * @param episodeOfCare - Where a specific encounter should be classified as a part of a
     *     specific episode(s) of care this field should be used. This association can facilitate
     *     grouping of related encounters together for a specific purpose, such as government
     *     reporting, issue tracking, association via a common problem. The association is recorded
     *     on the encounter as these are typically created after the episode of care and grouped on
     *     entry rather than editing the episode of care to append another encounter to it (the
     *     episode of care could span years).
     */
    public EncounterBuilder.Impl withEpisodeOfCare(@NonNull Collection<Reference> episodeOfCare) {
      this.episodeOfCare = Collections.unmodifiableCollection(episodeOfCare);
      return this;
    }

    public EncounterBuilder.Impl withEpisodeOfCare(@NonNull ReferenceBuilder... episodeOfCare) {
      this.episodeOfCare = Arrays.stream(episodeOfCare).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param serviceProvider - The organization that is primarily responsible for this Encounter's
     *     services. This MAY be the same as the organization on the Patient record, however it
     *     could be different, such as if the actor performing the services was from an external
     *     organization (which may be billed seperately) for an external consultation. Refer to the
     *     example bundle showing an abbreviated set of Encounters for a colonoscopy.
     */
    public EncounterBuilder.Impl withServiceProvider(@NonNull Reference serviceProvider) {
      this.serviceProvider = Optional.of(serviceProvider);
      return this;
    }

    public EncounterBuilder.Impl withServiceProvider(@NonNull ReferenceBuilder serviceProvider) {
      this.serviceProvider = Optional.of(serviceProvider.build());
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
    public EncounterBuilder.Impl withModifierExtension(@NonNull Extension... modifierExtension) {
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
    public EncounterBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public EncounterBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param location - List of locations where the patient has been during this encounter. */
    public EncounterBuilder.Impl withLocation(@NonNull Encounter.Location... location) {
      this.location = Arrays.asList(location);
      return this;
    }
    /** @param location - List of locations where the patient has been during this encounter. */
    public EncounterBuilder.Impl withLocation(@NonNull Collection<Encounter.Location> location) {
      this.location = Collections.unmodifiableCollection(location);
      return this;
    }

    public EncounterBuilder.Impl withLocation(@NonNull Encounter_LocationBuilder... location) {
      this.location = Arrays.stream(location).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param diagnosis - The list of diagnosis relevant to this encounter. */
    public EncounterBuilder.Impl withDiagnosis(@NonNull Encounter.Diagnosis... diagnosis) {
      this.diagnosis = Arrays.asList(diagnosis);
      return this;
    }
    /** @param diagnosis - The list of diagnosis relevant to this encounter. */
    public EncounterBuilder.Impl withDiagnosis(@NonNull Collection<Encounter.Diagnosis> diagnosis) {
      this.diagnosis = Collections.unmodifiableCollection(diagnosis);
      return this;
    }

    public EncounterBuilder.Impl withDiagnosis(@NonNull Encounter_DiagnosisBuilder... diagnosis) {
      this.diagnosis = Arrays.stream(diagnosis).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param participant - The list of people responsible for providing the service. */
    public EncounterBuilder.Impl withParticipant(@NonNull Encounter.Participant... participant) {
      this.participant = Arrays.asList(participant);
      return this;
    }
    /** @param participant - The list of people responsible for providing the service. */
    public EncounterBuilder.Impl withParticipant(
        @NonNull Collection<Encounter.Participant> participant) {
      this.participant = Collections.unmodifiableCollection(participant);
      return this;
    }

    public EncounterBuilder.Impl withParticipant(
        @NonNull Encounter_ParticipantBuilder... participant) {
      this.participant = Arrays.stream(participant).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param classHistory - The class history permits the tracking of the encounters transitions
     *     without needing to go through the resource history. This would be used for a case where
     *     an admission starts of as an emergency encounter, then transitions into an inpatient
     *     scenario. Doing this and not restarting a new encounter ensures that any lab/diagnostic
     *     results can more easily follow the patient and not require re-processing and not get lost
     *     or cancelled during a kind of discharge from emergency to inpatient.
     */
    public EncounterBuilder.Impl withClassHistory(@NonNull Encounter.ClassHistory... classHistory) {
      this.classHistory = Arrays.asList(classHistory);
      return this;
    }
    /**
     * @param classHistory - The class history permits the tracking of the encounters transitions
     *     without needing to go through the resource history. This would be used for a case where
     *     an admission starts of as an emergency encounter, then transitions into an inpatient
     *     scenario. Doing this and not restarting a new encounter ensures that any lab/diagnostic
     *     results can more easily follow the patient and not require re-processing and not get lost
     *     or cancelled during a kind of discharge from emergency to inpatient.
     */
    public EncounterBuilder.Impl withClassHistory(
        @NonNull Collection<Encounter.ClassHistory> classHistory) {
      this.classHistory = Collections.unmodifiableCollection(classHistory);
      return this;
    }

    public EncounterBuilder.Impl withClassHistory(
        @NonNull Encounter_ClassHistoryBuilder... classHistory) {
      this.classHistory = Arrays.stream(classHistory).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param statusHistory - The status history permits the encounter resource to contain the
     *     status history without needing to read through the historical versions of the resource,
     *     or even have the server store them.
     */
    public EncounterBuilder.Impl withStatusHistory(
        @NonNull Encounter.StatusHistory... statusHistory) {
      this.statusHistory = Arrays.asList(statusHistory);
      return this;
    }
    /**
     * @param statusHistory - The status history permits the encounter resource to contain the
     *     status history without needing to read through the historical versions of the resource,
     *     or even have the server store them.
     */
    public EncounterBuilder.Impl withStatusHistory(
        @NonNull Collection<Encounter.StatusHistory> statusHistory) {
      this.statusHistory = Collections.unmodifiableCollection(statusHistory);
      return this;
    }

    public EncounterBuilder.Impl withStatusHistory(
        @NonNull Encounter_StatusHistoryBuilder... statusHistory) {
      this.statusHistory = Arrays.stream(statusHistory).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param hospitalization - Details about the admission to a healthcare service. */
    public EncounterBuilder.Impl withHospitalization(
        @NonNull Encounter.Hospitalization hospitalization) {
      this.hospitalization = Optional.of(hospitalization);
      return this;
    }

    public EncounterBuilder.Impl withHospitalization(
        @NonNull Encounter_HospitalizationBuilder hospitalization) {
      this.hospitalization = Optional.of(hospitalization.build());
      return this;
    }

    public EncounterBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Encounter build() {
      return new Encounter(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          _type.stream().collect(new LitSeqJCollector<>()),
          _class,
          status,
          OptionConverters.toScala(period),
          OptionConverters.toScala(length),
          reason.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(partOf),
          OptionConverters.toScala(subject),
          basedOn.stream().collect(new LitSeqJCollector<>()),
          account.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(language),
          OptionConverters.toScala(priority),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(serviceType),
          appointment.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(subjectStatus),
          episodeOfCare.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(serviceProvider),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          location.stream().collect(new LitSeqJCollector<>()),
          diagnosis.stream().collect(new LitSeqJCollector<>()),
          participant.stream().collect(new LitSeqJCollector<>()),
          classHistory.stream().collect(new LitSeqJCollector<>()),
          statusHistory.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(hospitalization),
          LitUtils.emptyMetaElMap());
    }
  }
}
