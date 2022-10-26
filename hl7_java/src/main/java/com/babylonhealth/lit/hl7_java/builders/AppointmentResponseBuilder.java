package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.PARTICIPATIONSTATUS;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface AppointmentResponseBuilder extends DomainResourceBuilder {
  public AppointmentResponse build();

  public static Impl init(Reference appointment, PARTICIPATIONSTATUS participantStatus) {
    return new Impl(appointment, participantStatus);
  }

  public static Impl builder(ReferenceBuilder appointment, PARTICIPATIONSTATUS participantStatus) {
    return new Impl(appointment.build(), participantStatus);
  }

  public class Impl implements AppointmentResponseBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<ZonedDateTime> end = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<ZonedDateTime> start = Optional.empty();
    private Optional<Reference> actor = Optional.empty();
    private Optional<String> comment = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Reference appointment;
    private Optional<String> implicitRules = Optional.empty();
    private Collection<CodeableConcept> participantType = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private PARTICIPATIONSTATUS participantStatus;

    /**
     * Required fields for {@link AppointmentResponse}
     *
     * @param appointment - Appointment that this response is replying to.
     * @param participantStatus - Participation status of the participant. When the status is
     *     declined or tentative if the start/end times are different to the appointment, then these
     *     times should be interpreted as a requested time change. When the status is accepted, the
     *     times can either be the time of the appointment (as a confirmation of the time) or can be
     *     empty.
     */
    public Impl(Reference appointment, PARTICIPATIONSTATUS participantStatus) {
      this.appointment = appointment;
      this.participantStatus = participantStatus;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public AppointmentResponseBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param end - This may be either the same as the appointment request to confirm the details of
     *     the appointment, or alternately a new time to request a re-negotiation of the end time.
     */
    public AppointmentResponseBuilder.Impl withEnd(@NonNull ZonedDateTime end) {
      this.end = Optional.of(end);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public AppointmentResponseBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public AppointmentResponseBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public AppointmentResponseBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public AppointmentResponseBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param start - Date/Time that the appointment is to take place, or requested new start time.
     */
    public AppointmentResponseBuilder.Impl withStart(@NonNull ZonedDateTime start) {
      this.start = Optional.of(start);
      return this;
    }
    /**
     * @param actor - A Person, Location, HealthcareService, or Device that is participating in the
     *     appointment.
     */
    public AppointmentResponseBuilder.Impl withActor(@NonNull Reference actor) {
      this.actor = Optional.of(actor);
      return this;
    }

    public AppointmentResponseBuilder.Impl withActor(@NonNull ReferenceBuilder actor) {
      this.actor = Optional.of(actor.build());
      return this;
    }
    /** @param comment - Additional comments about the appointment. */
    public AppointmentResponseBuilder.Impl withComment(@NonNull String comment) {
      this.comment = Optional.of(comment);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public AppointmentResponseBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public AppointmentResponseBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public AppointmentResponseBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public AppointmentResponseBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public AppointmentResponseBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public AppointmentResponseBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public AppointmentResponseBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param identifier - This records identifiers associated with this appointment response
     *     concern that are defined by business processes and/ or used to refer to it when a direct
     *     URL reference to the resource itself is not appropriate.
     */
    public AppointmentResponseBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - This records identifiers associated with this appointment response
     *     concern that are defined by business processes and/ or used to refer to it when a direct
     *     URL reference to the resource itself is not appropriate.
     */
    public AppointmentResponseBuilder.Impl withIdentifier(
        @NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public AppointmentResponseBuilder.Impl withIdentifier(
        @NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public AppointmentResponseBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /** @param participantType - Role of participant in the appointment. */
    public AppointmentResponseBuilder.Impl withParticipantType(
        @NonNull CodeableConcept... participantType) {
      this.participantType = Arrays.asList(participantType);
      return this;
    }
    /** @param participantType - Role of participant in the appointment. */
    public AppointmentResponseBuilder.Impl withParticipantType(
        @NonNull Collection<CodeableConcept> participantType) {
      this.participantType = Collections.unmodifiableCollection(participantType);
      return this;
    }

    public AppointmentResponseBuilder.Impl withParticipantType(
        @NonNull CodeableConceptBuilder... participantType) {
      this.participantType = Arrays.stream(participantType).map(e -> e.build()).collect(toList());
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
    public AppointmentResponseBuilder.Impl withModifierExtension(
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
    public AppointmentResponseBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public AppointmentResponseBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public AppointmentResponseBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public AppointmentResponse build() {
      return new AppointmentResponse(
          OptionConverters.toScala(id),
          OptionConverters.toScala(end),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(start),
          OptionConverters.toScala(actor),
          OptionConverters.toScala(comment),
          OptionConverters.toScala(language),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          appointment,
          OptionConverters.toScala(implicitRules),
          participantType.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          participantStatus,
          LitUtils.emptyMetaElMap());
    }
  }
}
