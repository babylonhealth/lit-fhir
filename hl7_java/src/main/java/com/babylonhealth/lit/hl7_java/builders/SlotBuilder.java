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
import com.babylonhealth.lit.hl7.SLOTSTATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface SlotBuilder extends DomainResourceBuilder {
  public Slot build();

  public static Impl init(
      ZonedDateTime end, ZonedDateTime start, SLOTSTATUS status, Reference schedule) {
    return new Impl(end, start, status, schedule);
  }

  public static Impl builder(
      ZonedDateTime end, ZonedDateTime start, SLOTSTATUS status, ReferenceBuilder schedule) {
    return new Impl(end, start, status, schedule.build());
  }

  public class Impl implements SlotBuilder {
    private Optional<String> id = Optional.empty();
    private ZonedDateTime end;
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private ZonedDateTime start;
    private SLOTSTATUS status;
    private Optional<String> comment = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Reference schedule;
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<CodeableConcept> specialty = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<Boolean> overbooked = Optional.empty();
    private Collection<CodeableConcept> serviceType = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<CodeableConcept> serviceCategory = Collections.emptyList();
    private Optional<CodeableConcept> appointmentType = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link Slot}
     *
     * @param end - Date/Time that the slot is to conclude.
     * @param start - Date/Time that the slot is to begin.
     * @param status - busy | free | busy-unavailable | busy-tentative | entered-in-error.
     * @param schedule - The schedule resource that this slot defines an interval of status
     *     information.
     */
    public Impl(ZonedDateTime end, ZonedDateTime start, SLOTSTATUS status, Reference schedule) {
      this.end = end;
      this.start = start;
      this.status = status;
      this.schedule = schedule;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public SlotBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public SlotBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public SlotBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public SlotBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public SlotBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param comment - Comments on the slot to describe any extended information. Such as custom
     *     constraints on the slot.
     */
    public SlotBuilder.Impl withComment(@NonNull String comment) {
      this.comment = Optional.of(comment);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public SlotBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public SlotBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public SlotBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public SlotBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public SlotBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public SlotBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public SlotBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param specialty - The specialty of a practitioner that would be required to perform the
     *     service requested in this appointment.
     */
    public SlotBuilder.Impl withSpecialty(@NonNull CodeableConcept... specialty) {
      this.specialty = Arrays.asList(specialty);
      return this;
    }
    /**
     * @param specialty - The specialty of a practitioner that would be required to perform the
     *     service requested in this appointment.
     */
    public SlotBuilder.Impl withSpecialty(@NonNull Collection<CodeableConcept> specialty) {
      this.specialty = Collections.unmodifiableCollection(specialty);
      return this;
    }

    public SlotBuilder.Impl withSpecialty(@NonNull CodeableConceptBuilder... specialty) {
      this.specialty = Arrays.stream(specialty).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param identifier - External Ids for this item. */
    public SlotBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /** @param identifier - External Ids for this item. */
    public SlotBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public SlotBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param overbooked - This slot has already been overbooked, appointments are unlikely to be
     *     accepted for this time.
     */
    public SlotBuilder.Impl withOverbooked(@NonNull Boolean overbooked) {
      this.overbooked = Optional.of(overbooked);
      return this;
    }
    /**
     * @param serviceType - The type of appointments that can be booked into this slot (ideally this
     *     would be an identifiable service - which is at a location, rather than the location
     *     itself). If provided then this overrides the value provided on the availability resource.
     */
    public SlotBuilder.Impl withServiceType(@NonNull CodeableConcept... serviceType) {
      this.serviceType = Arrays.asList(serviceType);
      return this;
    }
    /**
     * @param serviceType - The type of appointments that can be booked into this slot (ideally this
     *     would be an identifiable service - which is at a location, rather than the location
     *     itself). If provided then this overrides the value provided on the availability resource.
     */
    public SlotBuilder.Impl withServiceType(@NonNull Collection<CodeableConcept> serviceType) {
      this.serviceType = Collections.unmodifiableCollection(serviceType);
      return this;
    }

    public SlotBuilder.Impl withServiceType(@NonNull CodeableConceptBuilder... serviceType) {
      this.serviceType = Arrays.stream(serviceType).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public SlotBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param serviceCategory - A broad categorization of the service that is to be performed during
     *     this appointment.
     */
    public SlotBuilder.Impl withServiceCategory(@NonNull CodeableConcept... serviceCategory) {
      this.serviceCategory = Arrays.asList(serviceCategory);
      return this;
    }
    /**
     * @param serviceCategory - A broad categorization of the service that is to be performed during
     *     this appointment.
     */
    public SlotBuilder.Impl withServiceCategory(
        @NonNull Collection<CodeableConcept> serviceCategory) {
      this.serviceCategory = Collections.unmodifiableCollection(serviceCategory);
      return this;
    }

    public SlotBuilder.Impl withServiceCategory(
        @NonNull CodeableConceptBuilder... serviceCategory) {
      this.serviceCategory = Arrays.stream(serviceCategory).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param appointmentType - The style of appointment or patient that may be booked in the slot
     *     (not service type).
     */
    public SlotBuilder.Impl withAppointmentType(@NonNull CodeableConcept appointmentType) {
      this.appointmentType = Optional.of(appointmentType);
      return this;
    }

    public SlotBuilder.Impl withAppointmentType(@NonNull CodeableConceptBuilder appointmentType) {
      this.appointmentType = Optional.of(appointmentType.build());
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
    public SlotBuilder.Impl withModifierExtension(@NonNull Extension... modifierExtension) {
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
    public SlotBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public SlotBuilder.Impl withModifierExtension(@NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public SlotBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Slot build() {
      return new Slot(
          OptionConverters.toScala(id),
          end,
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          start,
          status,
          OptionConverters.toScala(comment),
          OptionConverters.toScala(language),
          schedule,
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          specialty.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(overbooked.map(x -> (Object) x)),
          serviceType.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          serviceCategory.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(appointmentType),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
