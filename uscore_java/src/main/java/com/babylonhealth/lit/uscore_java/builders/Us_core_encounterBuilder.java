package com.babylonhealth.lit.uscore_java.builders;

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
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.uscore.model.*;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.usbase_java.builders.*;
import com.babylonhealth.lit.uscore_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import com.babylonhealth.lit.uscore_java.model.Unions.*;
import com.babylonhealth.lit.hl7.ENCOUNTER_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class Us_core_encounterBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta =
      Optional.of(
          new MetaBuilder()
              .withProfile("http://hl7.org/fhir/us/core/StructureDefinition/us-core-encounter")
              .build());
  private Optional<Narrative> text = Optional.empty();
  private Collection<CodeableConcept> _type;
  private Coding _class;
  private ENCOUNTER_STATUS status;
  private Optional<Period> period = Optional.empty();
  private Optional<Duration> length = Optional.empty();
  private Optional<Reference> partOf = Optional.empty();
  private Reference subject;
  private Collection<Reference> basedOn = Collections.emptyList();
  private Collection<Reference> account = Collections.emptyList();
  private Optional<LANGUAGES> language = Optional.empty();
  private Optional<CodeableConcept> priority = Optional.empty();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<CodeableConcept> reasonCode = Collections.emptyList();
  private Optional<CodeableConcept> serviceType = Optional.empty();
  private Collection<Reference> appointment = Collections.emptyList();
  private Optional<String> implicitRules = Optional.empty();
  private Collection<Reference> episodeOfCare = Collections.emptyList();
  private Collection<Reference> reasonReference = Collections.emptyList();
  private Optional<Reference> serviceProvider = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Collection<Encounter.Location> location = Collections.emptyList();
  private Collection<Encounter.Diagnosis> diagnosis = Collections.emptyList();
  private Collection<Encounter.Participant> participant = Collections.emptyList();
  private Collection<Encounter.ClassHistory> classHistory = Collections.emptyList();
  private Collection<Encounter.StatusHistory> statusHistory = Collections.emptyList();
  private Optional<Encounter.Hospitalization> hospitalization = Optional.empty();

  /**
   * Required fields for {@link Us_core_encounter}
   *
   * @param _type - Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled
   *     nursing, rehabilitation).
   * @param _class - Concepts representing classification of patient encounter such as ambulatory
   *     (outpatient), inpatient, emergency, home health or others due to local variations.
   * @param status - planned | arrived | triaged | in-progress | onleave | finished | cancelled +.
   * @param subject - The patient or group present at the encounter.
   */
  public Us_core_encounterBuilder(
      Collection<CodeableConcept> _type,
      Coding _class,
      ENCOUNTER_STATUS status,
      Reference subject) {
    this._type = _type;
    this._class = _class;
    this.status = status;
    this.subject = subject;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public Us_core_encounterBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public Us_core_encounterBuilder withMeta(@NonNull Meta meta) {
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
  public Us_core_encounterBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /** @param period - The start and end time of the encounter. */
  public Us_core_encounterBuilder withPeriod(@NonNull Period period) {
    this.period = Optional.of(period);
    return this;
  }
  /**
   * @param length - Quantity of time the encounter lasted. This excludes the time during leaves of
   *     absence.
   */
  public Us_core_encounterBuilder withLength(@NonNull Duration length) {
    this.length = Optional.of(length);
    return this;
  }
  /**
   * @param partOf - Another Encounter of which this encounter is a part of (administratively or in
   *     time).
   */
  public Us_core_encounterBuilder withPartOf(@NonNull Reference partOf) {
    this.partOf = Optional.of(partOf);
    return this;
  }
  /**
   * @param basedOn - The request this encounter satisfies (e.g. incoming referral or procedure
   *     request).
   */
  public Us_core_encounterBuilder withBasedOn(@NonNull Reference... basedOn) {
    this.basedOn = Arrays.asList(basedOn);
    return this;
  }
  /**
   * @param basedOn - The request this encounter satisfies (e.g. incoming referral or procedure
   *     request).
   */
  public Us_core_encounterBuilder withBasedOn(@NonNull Collection<Reference> basedOn) {
    this.basedOn = Collections.unmodifiableCollection(basedOn);
    return this;
  }
  /** @param account - The set of accounts that may be used for billing for this Encounter. */
  public Us_core_encounterBuilder withAccount(@NonNull Reference... account) {
    this.account = Arrays.asList(account);
    return this;
  }
  /** @param account - The set of accounts that may be used for billing for this Encounter. */
  public Us_core_encounterBuilder withAccount(@NonNull Collection<Reference> account) {
    this.account = Collections.unmodifiableCollection(account);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public Us_core_encounterBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /** @param priority - Indicates the urgency of the encounter. */
  public Us_core_encounterBuilder withPriority(@NonNull CodeableConcept priority) {
    this.priority = Optional.of(priority);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public Us_core_encounterBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public Us_core_encounterBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public Us_core_encounterBuilder withExtension(@NonNull Extension... extension) {
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
  public Us_core_encounterBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param reasonCode - Reason the encounter takes place, expressed as a code. For admissions, this
   *     can be used for a coded admission diagnosis.
   */
  public Us_core_encounterBuilder withReasonCode(@NonNull CodeableConcept... reasonCode) {
    this.reasonCode = Arrays.asList(reasonCode);
    return this;
  }
  /**
   * @param reasonCode - Reason the encounter takes place, expressed as a code. For admissions, this
   *     can be used for a coded admission diagnosis.
   */
  public Us_core_encounterBuilder withReasonCode(@NonNull Collection<CodeableConcept> reasonCode) {
    this.reasonCode = Collections.unmodifiableCollection(reasonCode);
    return this;
  }
  /**
   * @param serviceType - Broad categorization of the service that is to be provided (e.g.
   *     cardiology).
   */
  public Us_core_encounterBuilder withServiceType(@NonNull CodeableConcept serviceType) {
    this.serviceType = Optional.of(serviceType);
    return this;
  }
  /** @param appointment - The appointment that scheduled this encounter. */
  public Us_core_encounterBuilder withAppointment(@NonNull Reference... appointment) {
    this.appointment = Arrays.asList(appointment);
    return this;
  }
  /** @param appointment - The appointment that scheduled this encounter. */
  public Us_core_encounterBuilder withAppointment(@NonNull Collection<Reference> appointment) {
    this.appointment = Collections.unmodifiableCollection(appointment);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public Us_core_encounterBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param episodeOfCare - Where a specific encounter should be classified as a part of a specific
   *     episode(s) of care this field should be used. This association can facilitate grouping of
   *     related encounters together for a specific purpose, such as government reporting, issue
   *     tracking, association via a common problem. The association is recorded on the encounter as
   *     these are typically created after the episode of care and grouped on entry rather than
   *     editing the episode of care to append another encounter to it (the episode of care could
   *     span years).
   */
  public Us_core_encounterBuilder withEpisodeOfCare(@NonNull Reference... episodeOfCare) {
    this.episodeOfCare = Arrays.asList(episodeOfCare);
    return this;
  }
  /**
   * @param episodeOfCare - Where a specific encounter should be classified as a part of a specific
   *     episode(s) of care this field should be used. This association can facilitate grouping of
   *     related encounters together for a specific purpose, such as government reporting, issue
   *     tracking, association via a common problem. The association is recorded on the encounter as
   *     these are typically created after the episode of care and grouped on entry rather than
   *     editing the episode of care to append another encounter to it (the episode of care could
   *     span years).
   */
  public Us_core_encounterBuilder withEpisodeOfCare(@NonNull Collection<Reference> episodeOfCare) {
    this.episodeOfCare = Collections.unmodifiableCollection(episodeOfCare);
    return this;
  }
  /**
   * @param reasonReference - Reason the encounter takes place, expressed as a code. For admissions,
   *     this can be used for a coded admission diagnosis.
   */
  public Us_core_encounterBuilder withReasonReference(@NonNull Reference... reasonReference) {
    this.reasonReference = Arrays.asList(reasonReference);
    return this;
  }
  /**
   * @param reasonReference - Reason the encounter takes place, expressed as a code. For admissions,
   *     this can be used for a coded admission diagnosis.
   */
  public Us_core_encounterBuilder withReasonReference(
      @NonNull Collection<Reference> reasonReference) {
    this.reasonReference = Collections.unmodifiableCollection(reasonReference);
    return this;
  }
  /**
   * @param serviceProvider - The organization that is primarily responsible for this Encounter's
   *     services. This MAY be the same as the organization on the Patient record, however it could
   *     be different, such as if the actor performing the services was from an external
   *     organization (which may be billed seperately) for an external consultation. Refer to the
   *     example bundle showing an abbreviated set of Encounters for a colonoscopy.
   */
  public Us_core_encounterBuilder withServiceProvider(@NonNull Reference serviceProvider) {
    this.serviceProvider = Optional.of(serviceProvider);
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
  public Us_core_encounterBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public Us_core_encounterBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param identifier - Identifier(s) by which this encounter is known. */
  public Us_core_encounterBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /** @param identifier - Identifier(s) by which this encounter is known. */
  public Us_core_encounterBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /** @param location - List of locations where the patient has been during this encounter. */
  public Us_core_encounterBuilder withLocation(@NonNull Encounter.Location... location) {
    this.location = Arrays.asList(location);
    return this;
  }
  /** @param location - List of locations where the patient has been during this encounter. */
  public Us_core_encounterBuilder withLocation(@NonNull Collection<Encounter.Location> location) {
    this.location = Collections.unmodifiableCollection(location);
    return this;
  }
  /** @param diagnosis - The list of diagnosis relevant to this encounter. */
  public Us_core_encounterBuilder withDiagnosis(@NonNull Encounter.Diagnosis... diagnosis) {
    this.diagnosis = Arrays.asList(diagnosis);
    return this;
  }
  /** @param diagnosis - The list of diagnosis relevant to this encounter. */
  public Us_core_encounterBuilder withDiagnosis(
      @NonNull Collection<Encounter.Diagnosis> diagnosis) {
    this.diagnosis = Collections.unmodifiableCollection(diagnosis);
    return this;
  }
  /** @param participant - The list of people responsible for providing the service. */
  public Us_core_encounterBuilder withParticipant(@NonNull Encounter.Participant... participant) {
    this.participant = Arrays.asList(participant);
    return this;
  }
  /** @param participant - The list of people responsible for providing the service. */
  public Us_core_encounterBuilder withParticipant(
      @NonNull Collection<Encounter.Participant> participant) {
    this.participant = Collections.unmodifiableCollection(participant);
    return this;
  }
  /**
   * @param classHistory - The class history permits the tracking of the encounters transitions
   *     without needing to go through the resource history. This would be used for a case where an
   *     admission starts of as an emergency encounter, then transitions into an inpatient scenario.
   *     Doing this and not restarting a new encounter ensures that any lab/diagnostic results can
   *     more easily follow the patient and not require re-processing and not get lost or cancelled
   *     during a kind of discharge from emergency to inpatient.
   */
  public Us_core_encounterBuilder withClassHistory(
      @NonNull Encounter.ClassHistory... classHistory) {
    this.classHistory = Arrays.asList(classHistory);
    return this;
  }
  /**
   * @param classHistory - The class history permits the tracking of the encounters transitions
   *     without needing to go through the resource history. This would be used for a case where an
   *     admission starts of as an emergency encounter, then transitions into an inpatient scenario.
   *     Doing this and not restarting a new encounter ensures that any lab/diagnostic results can
   *     more easily follow the patient and not require re-processing and not get lost or cancelled
   *     during a kind of discharge from emergency to inpatient.
   */
  public Us_core_encounterBuilder withClassHistory(
      @NonNull Collection<Encounter.ClassHistory> classHistory) {
    this.classHistory = Collections.unmodifiableCollection(classHistory);
    return this;
  }
  /**
   * @param statusHistory - The status history permits the encounter resource to contain the status
   *     history without needing to read through the historical versions of the resource, or even
   *     have the server store them.
   */
  public Us_core_encounterBuilder withStatusHistory(
      @NonNull Encounter.StatusHistory... statusHistory) {
    this.statusHistory = Arrays.asList(statusHistory);
    return this;
  }
  /**
   * @param statusHistory - The status history permits the encounter resource to contain the status
   *     history without needing to read through the historical versions of the resource, or even
   *     have the server store them.
   */
  public Us_core_encounterBuilder withStatusHistory(
      @NonNull Collection<Encounter.StatusHistory> statusHistory) {
    this.statusHistory = Collections.unmodifiableCollection(statusHistory);
    return this;
  }
  /** @param hospitalization - Details about the admission to a healthcare service. */
  public Us_core_encounterBuilder withHospitalization(
      @NonNull Encounter.Hospitalization hospitalization) {
    this.hospitalization = Optional.of(hospitalization);
    return this;
  }

  public Us_core_encounterBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public Us_core_encounter build() {
    return new Us_core_encounter(
        OptionConverters.toScala(id),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        _type.stream().collect(new NonEmptyLitSeqJCollector<>()),
        _class,
        status,
        OptionConverters.toScala(period),
        OptionConverters.toScala(length),
        OptionConverters.toScala(partOf),
        subject,
        basedOn.stream().collect(new LitSeqJCollector<>()),
        account.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(language),
        OptionConverters.toScala(priority),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        reasonCode.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(serviceType),
        appointment.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(implicitRules),
        episodeOfCare.stream().collect(new LitSeqJCollector<>()),
        reasonReference.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(serviceProvider),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        identifier.stream().collect(new LitSeqJCollector<>()),
        location.stream().collect(new LitSeqJCollector<>()),
        diagnosis.stream().collect(new LitSeqJCollector<>()),
        participant.stream().collect(new LitSeqJCollector<>()),
        classHistory.stream().collect(new LitSeqJCollector<>()),
        statusHistory.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(hospitalization),
        LitUtils.emptyMetaElMap());
  }
}
