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
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class ScheduleBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private Collection<Reference> actor;
  private Optional<Boolean> active = Optional.empty();
  private Optional<String> comment = Optional.empty();
  private Optional<LANGUAGES> language = Optional.empty();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<CodeableConcept> specialty = Collections.emptyList();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Collection<CodeableConcept> serviceType = Collections.emptyList();
  private Optional<String> implicitRules = Optional.empty();
  private Collection<CodeableConcept> serviceCategory = Collections.emptyList();
  private Optional<Period> planningHorizon = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();

  /**
   * Required fields for {@link Schedule}
   *
   * @param actor - Slots that reference this schedule resource provide the availability details to
   *     these referenced resource(s).
   */
  public ScheduleBuilder(Collection<Reference> actor) {
    this.actor = actor;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public ScheduleBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public ScheduleBuilder withMeta(@NonNull Meta meta) {
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
  public ScheduleBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param active - Whether this schedule record is in active use or should not be used (such as
   *     was entered in error).
   */
  public ScheduleBuilder withActive(@NonNull Boolean active) {
    this.active = Optional.of(active);
    return this;
  }
  /**
   * @param comment - Comments on the availability to describe any extended information. Such as
   *     custom constraints on the slots that may be associated.
   */
  public ScheduleBuilder withComment(@NonNull String comment) {
    this.comment = Optional.of(comment);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public ScheduleBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public ScheduleBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public ScheduleBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public ScheduleBuilder withExtension(@NonNull Extension... extension) {
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
  public ScheduleBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param specialty - The specialty of a practitioner that would be required to perform the
   *     service requested in this appointment.
   */
  public ScheduleBuilder withSpecialty(@NonNull CodeableConcept... specialty) {
    this.specialty = Arrays.asList(specialty);
    return this;
  }
  /**
   * @param specialty - The specialty of a practitioner that would be required to perform the
   *     service requested in this appointment.
   */
  public ScheduleBuilder withSpecialty(@NonNull Collection<CodeableConcept> specialty) {
    this.specialty = Collections.unmodifiableCollection(specialty);
    return this;
  }
  /** @param identifier - External Ids for this item. */
  public ScheduleBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /** @param identifier - External Ids for this item. */
  public ScheduleBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /** @param serviceType - The specific service that is to be performed during this appointment. */
  public ScheduleBuilder withServiceType(@NonNull CodeableConcept... serviceType) {
    this.serviceType = Arrays.asList(serviceType);
    return this;
  }
  /** @param serviceType - The specific service that is to be performed during this appointment. */
  public ScheduleBuilder withServiceType(@NonNull Collection<CodeableConcept> serviceType) {
    this.serviceType = Collections.unmodifiableCollection(serviceType);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public ScheduleBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param serviceCategory - A broad categorization of the service that is to be performed during
   *     this appointment.
   */
  public ScheduleBuilder withServiceCategory(@NonNull CodeableConcept... serviceCategory) {
    this.serviceCategory = Arrays.asList(serviceCategory);
    return this;
  }
  /**
   * @param serviceCategory - A broad categorization of the service that is to be performed during
   *     this appointment.
   */
  public ScheduleBuilder withServiceCategory(@NonNull Collection<CodeableConcept> serviceCategory) {
    this.serviceCategory = Collections.unmodifiableCollection(serviceCategory);
    return this;
  }
  /**
   * @param planningHorizon - The period of time that the slots that reference this Schedule
   *     resource cover (even if none exist). These cover the amount of time that an organization's
   *     planning horizon; the interval for which they are currently accepting appointments. This
   *     does not define a "template" for planning outside these dates.
   */
  public ScheduleBuilder withPlanningHorizon(@NonNull Period planningHorizon) {
    this.planningHorizon = Optional.of(planningHorizon);
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
  public ScheduleBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public ScheduleBuilder withModifierExtension(@NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }

  public ScheduleBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public Schedule build() {
    return new Schedule(
        OptionConverters.toScala(id),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        actor.stream().collect(new NonEmptyLitSeqJCollector<>()),
        OptionConverters.toScala(active.map(x -> (Object) x)),
        OptionConverters.toScala(comment),
        OptionConverters.toScala(language),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        specialty.stream().collect(new LitSeqJCollector<>()),
        identifier.stream().collect(new LitSeqJCollector<>()),
        serviceType.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(implicitRules),
        serviceCategory.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(planningHorizon),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}