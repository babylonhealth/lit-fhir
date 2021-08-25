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
import com.babylonhealth.lit.hl7.APPOINTMENTSTATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface AppointmentBuilder extends DomainResourceBuilder {
  public Appointment build();

  public static Impl init(
      APPOINTMENTSTATUS status, Collection<Appointment.Participant> participant) {
    return new Impl(status, participant);
  }

  public static Impl builder(
      APPOINTMENTSTATUS status, Collection<Appointment_ParticipantBuilder> participant) {
    return new Impl(status, new LitSeq<>(participant).map(Appointment_ParticipantBuilder::build));
  }

  public class Impl implements AppointmentBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<ZonedDateTime> end = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Collection<Reference> slot = Collections.emptyList();
    private Optional<ZonedDateTime> start = Optional.empty();
    private APPOINTMENTSTATUS status;
    private Collection<CodeableReference> reason = Collections.emptyList();
    private Optional<FHIRDateTime> created = Optional.empty();
    private Optional<String> comment = Optional.empty();
    private Collection<Reference> basedOn = Collections.emptyList();
    private Optional<LANGUAGES> language = Optional.empty();
    private Optional<CodeableConcept> priority = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<CodeableConcept> specialty = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Collection<CodeableConcept> serviceType = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<CodeableConcept> serviceCategory = Collections.emptyList();
    private Optional<CodeableConcept> appointmentType = Optional.empty();
    private Optional<Integer> minutesDuration = Optional.empty();
    private Collection<Period> requestedPeriod = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<CodeableConcept> cancelationReason = Optional.empty();
    private Optional<String> patientInstruction = Optional.empty();
    private Collection<Reference> supportingInformation = Collections.emptyList();
    private Collection<Appointment.Participant> participant;

    /**
     * Required fields for {@link Appointment}
     *
     * @param status - The overall status of the Appointment. Each of the participants has their own
     *     participation status which indicates their involvement in the process, however this
     *     status indicates the shared status.
     * @param participant - List of participants involved in the appointment.
     */
    public Impl(APPOINTMENTSTATUS status, Collection<Appointment.Participant> participant) {
      this.status = status;
      this.participant = participant;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public AppointmentBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param end - Date/Time that the appointment is to conclude. */
    public AppointmentBuilder.Impl withEnd(@NonNull ZonedDateTime end) {
      this.end = Optional.of(end);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public AppointmentBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public AppointmentBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public AppointmentBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public AppointmentBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param slot - The slots from the participants' schedules that will be filled by the
     *     appointment.
     */
    public AppointmentBuilder.Impl withSlot(@NonNull Reference... slot) {
      this.slot = Arrays.asList(slot);
      return this;
    }
    /**
     * @param slot - The slots from the participants' schedules that will be filled by the
     *     appointment.
     */
    public AppointmentBuilder.Impl withSlot(@NonNull Collection<Reference> slot) {
      this.slot = Collections.unmodifiableCollection(slot);
      return this;
    }

    public AppointmentBuilder.Impl withSlot(@NonNull ReferenceBuilder... slot) {
      this.slot = Arrays.stream(slot).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param start - Date/Time that the appointment is to take place. */
    public AppointmentBuilder.Impl withStart(@NonNull ZonedDateTime start) {
      this.start = Optional.of(start);
      return this;
    }
    /**
     * @param reason - The reason that this appointment is being scheduled. This is more clinical
     *     than administrative. This can be coded, or as specified using information from another
     *     resource. When the patient arrives and the encounter begins it may be used as the
     *     admission diagnosis. The indication will typically be a Condition (with other resources
     *     referenced in the evidence.detail), or a Procedure.
     */
    public AppointmentBuilder.Impl withReason(@NonNull CodeableReference... reason) {
      this.reason = Arrays.asList(reason);
      return this;
    }
    /**
     * @param reason - The reason that this appointment is being scheduled. This is more clinical
     *     than administrative. This can be coded, or as specified using information from another
     *     resource. When the patient arrives and the encounter begins it may be used as the
     *     admission diagnosis. The indication will typically be a Condition (with other resources
     *     referenced in the evidence.detail), or a Procedure.
     */
    public AppointmentBuilder.Impl withReason(@NonNull Collection<CodeableReference> reason) {
      this.reason = Collections.unmodifiableCollection(reason);
      return this;
    }

    public AppointmentBuilder.Impl withReason(@NonNull CodeableReferenceBuilder... reason) {
      this.reason = Arrays.stream(reason).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param created - The date that this appointment was initially created. This could be
     *     different to the meta.lastModified value on the initial entry, as this could have been
     *     before the resource was created on the FHIR server, and should remain unchanged over the
     *     lifespan of the appointment.
     */
    public AppointmentBuilder.Impl withCreated(@NonNull FHIRDateTime created) {
      this.created = Optional.of(created);
      return this;
    }
    /** @param comment - Additional comments about the appointment. */
    public AppointmentBuilder.Impl withComment(@NonNull String comment) {
      this.comment = Optional.of(comment);
      return this;
    }
    /**
     * @param basedOn - The service request this appointment is allocated to assess (e.g. incoming
     *     referral or procedure request).
     */
    public AppointmentBuilder.Impl withBasedOn(@NonNull Reference... basedOn) {
      this.basedOn = Arrays.asList(basedOn);
      return this;
    }
    /**
     * @param basedOn - The service request this appointment is allocated to assess (e.g. incoming
     *     referral or procedure request).
     */
    public AppointmentBuilder.Impl withBasedOn(@NonNull Collection<Reference> basedOn) {
      this.basedOn = Collections.unmodifiableCollection(basedOn);
      return this;
    }

    public AppointmentBuilder.Impl withBasedOn(@NonNull ReferenceBuilder... basedOn) {
      this.basedOn = Arrays.stream(basedOn).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public AppointmentBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param priority - The priority of the appointment. Can be used to make informed decisions if
     *     needing to re-prioritize appointments. (The iCal Standard specifies 0 as undefined, 1 as
     *     highest, 9 as lowest priority).
     */
    public AppointmentBuilder.Impl withPriority(@NonNull CodeableConcept priority) {
      this.priority = Optional.of(priority);
      return this;
    }

    public AppointmentBuilder.Impl withPriority(@NonNull CodeableConceptBuilder priority) {
      this.priority = Optional.of(priority.build());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, nor can they have
     *     their own independent transaction scope.
     */
    public AppointmentBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, nor can they have
     *     their own independent transaction scope.
     */
    public AppointmentBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public AppointmentBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public AppointmentBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public AppointmentBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public AppointmentBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param specialty - The specialty of a practitioner that would be required to perform the
     *     service requested in this appointment.
     */
    public AppointmentBuilder.Impl withSpecialty(@NonNull CodeableConcept... specialty) {
      this.specialty = Arrays.asList(specialty);
      return this;
    }
    /**
     * @param specialty - The specialty of a practitioner that would be required to perform the
     *     service requested in this appointment.
     */
    public AppointmentBuilder.Impl withSpecialty(@NonNull Collection<CodeableConcept> specialty) {
      this.specialty = Collections.unmodifiableCollection(specialty);
      return this;
    }

    public AppointmentBuilder.Impl withSpecialty(@NonNull CodeableConceptBuilder... specialty) {
      this.specialty = Arrays.stream(specialty).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param identifier - This records identifiers associated with this appointment concern that
     *     are defined by business processes and/or used to refer to it when a direct URL reference
     *     to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed
     *     documentation).
     */
    public AppointmentBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - This records identifiers associated with this appointment concern that
     *     are defined by business processes and/or used to refer to it when a direct URL reference
     *     to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed
     *     documentation).
     */
    public AppointmentBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public AppointmentBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param serviceType - The specific service that is to be performed during this appointment.
     */
    public AppointmentBuilder.Impl withServiceType(@NonNull CodeableConcept... serviceType) {
      this.serviceType = Arrays.asList(serviceType);
      return this;
    }
    /**
     * @param serviceType - The specific service that is to be performed during this appointment.
     */
    public AppointmentBuilder.Impl withServiceType(
        @NonNull Collection<CodeableConcept> serviceType) {
      this.serviceType = Collections.unmodifiableCollection(serviceType);
      return this;
    }

    public AppointmentBuilder.Impl withServiceType(@NonNull CodeableConceptBuilder... serviceType) {
      this.serviceType = Arrays.stream(serviceType).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param description - The brief description of the appointment as would be shown on a subject
     *     line in a meeting request, or appointment list. Detailed or expanded information should
     *     be put in the comment field.
     */
    public AppointmentBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public AppointmentBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param serviceCategory - A broad categorization of the service that is to be performed during
     *     this appointment.
     */
    public AppointmentBuilder.Impl withServiceCategory(
        @NonNull CodeableConcept... serviceCategory) {
      this.serviceCategory = Arrays.asList(serviceCategory);
      return this;
    }
    /**
     * @param serviceCategory - A broad categorization of the service that is to be performed during
     *     this appointment.
     */
    public AppointmentBuilder.Impl withServiceCategory(
        @NonNull Collection<CodeableConcept> serviceCategory) {
      this.serviceCategory = Collections.unmodifiableCollection(serviceCategory);
      return this;
    }

    public AppointmentBuilder.Impl withServiceCategory(
        @NonNull CodeableConceptBuilder... serviceCategory) {
      this.serviceCategory = Arrays.stream(serviceCategory).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param appointmentType - The style of appointment or patient that has been booked in the slot
     *     (not service type).
     */
    public AppointmentBuilder.Impl withAppointmentType(@NonNull CodeableConcept appointmentType) {
      this.appointmentType = Optional.of(appointmentType);
      return this;
    }

    public AppointmentBuilder.Impl withAppointmentType(
        @NonNull CodeableConceptBuilder appointmentType) {
      this.appointmentType = Optional.of(appointmentType.build());
      return this;
    }
    /**
     * @param minutesDuration - Number of minutes that the appointment is to take. This can be less
     *     than the duration between the start and end times. For example, where the actual time of
     *     appointment is only an estimate or if a 30 minute appointment is being requested, but any
     *     time would work. Also, if there is, for example, a planned 15 minute break in the middle
     *     of a long appointment, the duration may be 15 minutes less than the difference between
     *     the start and end.
     */
    public AppointmentBuilder.Impl withMinutesDuration(@NonNull Integer minutesDuration) {
      this.minutesDuration = Optional.of(minutesDuration);
      return this;
    }
    /**
     * @param requestedPeriod - A set of date ranges (potentially including times) that the
     *     appointment is preferred to be scheduled within.
     *     <p>The duration (usually in minutes) could also be provided to indicate the length of the
     *     appointment to fill and populate the start/end times for the actual allocated time.
     *     However, in other situations the duration may be calculated by the scheduling system.
     */
    public AppointmentBuilder.Impl withRequestedPeriod(@NonNull Period... requestedPeriod) {
      this.requestedPeriod = Arrays.asList(requestedPeriod);
      return this;
    }
    /**
     * @param requestedPeriod - A set of date ranges (potentially including times) that the
     *     appointment is preferred to be scheduled within.
     *     <p>The duration (usually in minutes) could also be provided to indicate the length of the
     *     appointment to fill and populate the start/end times for the actual allocated time.
     *     However, in other situations the duration may be calculated by the scheduling system.
     */
    public AppointmentBuilder.Impl withRequestedPeriod(
        @NonNull Collection<Period> requestedPeriod) {
      this.requestedPeriod = Collections.unmodifiableCollection(requestedPeriod);
      return this;
    }

    public AppointmentBuilder.Impl withRequestedPeriod(@NonNull PeriodBuilder... requestedPeriod) {
      this.requestedPeriod = Arrays.stream(requestedPeriod).map(e -> e.build()).collect(toList());
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
    public AppointmentBuilder.Impl withModifierExtension(@NonNull Extension... modifierExtension) {
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
    public AppointmentBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public AppointmentBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param cancelationReason - The coded reason for the appointment being cancelled. This is
     *     often used in reporting/billing/futher processing to determine if further actions are
     *     required, or specific fees apply.
     */
    public AppointmentBuilder.Impl withCancelationReason(
        @NonNull CodeableConcept cancelationReason) {
      this.cancelationReason = Optional.of(cancelationReason);
      return this;
    }

    public AppointmentBuilder.Impl withCancelationReason(
        @NonNull CodeableConceptBuilder cancelationReason) {
      this.cancelationReason = Optional.of(cancelationReason.build());
      return this;
    }
    /**
     * @param patientInstruction - While Appointment.comment contains information for internal use,
     *     Appointment.patientInstructions is used to capture patient facing information about the
     *     Appointment (e.g. please bring your referral or fast from 8pm night before).
     */
    public AppointmentBuilder.Impl withPatientInstruction(@NonNull String patientInstruction) {
      this.patientInstruction = Optional.of(patientInstruction);
      return this;
    }
    /**
     * @param supportingInformation - Additional information to support the appointment provided
     *     when making the appointment.
     */
    public AppointmentBuilder.Impl withSupportingInformation(
        @NonNull Reference... supportingInformation) {
      this.supportingInformation = Arrays.asList(supportingInformation);
      return this;
    }
    /**
     * @param supportingInformation - Additional information to support the appointment provided
     *     when making the appointment.
     */
    public AppointmentBuilder.Impl withSupportingInformation(
        @NonNull Collection<Reference> supportingInformation) {
      this.supportingInformation = Collections.unmodifiableCollection(supportingInformation);
      return this;
    }

    public AppointmentBuilder.Impl withSupportingInformation(
        @NonNull ReferenceBuilder... supportingInformation) {
      this.supportingInformation =
          Arrays.stream(supportingInformation).map(e -> e.build()).collect(toList());
      return this;
    }

    public AppointmentBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Appointment build() {
      return new Appointment(
          OptionConverters.toScala(id),
          OptionConverters.toScala(end),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          slot.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(start),
          status,
          reason.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(created),
          OptionConverters.toScala(comment),
          basedOn.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(language),
          OptionConverters.toScala(priority),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          specialty.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          serviceType.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          OptionConverters.toScala(implicitRules),
          serviceCategory.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(appointmentType),
          OptionConverters.toScala(minutesDuration.map(x -> (Object) x)),
          requestedPeriod.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(cancelationReason),
          OptionConverters.toScala(patientInstruction),
          supportingInformation.stream().collect(new LitSeqJCollector<>()),
          participant.stream().collect(new NonEmptyLitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
