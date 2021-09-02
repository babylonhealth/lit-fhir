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
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.hl7.GOAL_STATUS;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class GoalBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private Collection<Annotation> note = Collections.emptyList();
  private Reference subject;
  private Optional<LANGUAGES> language = Optional.empty();
  private Collection<CodeableConcept> category = Collections.emptyList();
  private Optional<CodeableConcept> priority = Optional.empty();
  private Optional<Choice00078348305> start = Optional.empty();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<Reference> addresses = Collections.emptyList();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Optional<FHIRDate> statusDate = Optional.empty();
  private CodeableConcept description;
  private Optional<Reference> expressedBy = Optional.empty();
  private Collection<CodeableConcept> outcomeCode = Collections.emptyList();
  private Optional<String> statusReason = Optional.empty();
  private Optional<String> implicitRules = Optional.empty();
  private GOAL_STATUS lifecycleStatus;
  private Collection<Reference> outcomeReference = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<CodeableConcept> achievementStatus = Optional.empty();
  private Collection<Goal.Target> target = Collections.emptyList();

  /**
   * Required fields for {@link Goal}
   *
   * @param subject - Identifies the patient, group or organization for whom the goal is being
   *     established.
   * @param description - Human-readable and/or coded description of a specific desired objective of
   *     care, such as "control blood pressure" or "negotiate an obstacle course" or "dance with
   *     child at wedding".
   * @param lifecycleStatus - The state of the goal throughout its lifecycle.
   */
  public GoalBuilder(Reference subject, CodeableConcept description, GOAL_STATUS lifecycleStatus) {
    this.subject = subject;
    this.description = description;
    this.lifecycleStatus = lifecycleStatus;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public GoalBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public GoalBuilder withMeta(@NonNull Meta meta) {
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
  public GoalBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /** @param note - Any comments related to the goal. */
  public GoalBuilder withNote(@NonNull Annotation... note) {
    this.note = Arrays.asList(note);
    return this;
  }
  /** @param note - Any comments related to the goal. */
  public GoalBuilder withNote(@NonNull Collection<Annotation> note) {
    this.note = Collections.unmodifiableCollection(note);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public GoalBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /** @param category - Indicates a category the goal falls within. */
  public GoalBuilder withCategory(@NonNull CodeableConcept... category) {
    this.category = Arrays.asList(category);
    return this;
  }
  /** @param category - Indicates a category the goal falls within. */
  public GoalBuilder withCategory(@NonNull Collection<CodeableConcept> category) {
    this.category = Collections.unmodifiableCollection(category);
    return this;
  }
  /**
   * @param priority - Identifies the mutually agreed level of importance associated with
   *     reaching/sustaining the goal.
   */
  public GoalBuilder withPriority(@NonNull CodeableConcept priority) {
    this.priority = Optional.of(priority);
    return this;
  }
  /**
   * @param start - The date or event after which the goal should begin being pursued. Field is a
   *     'choice' field. Type should be one of CodeableConcept, FHIRDate.
   */
  public GoalBuilder withStart(@NonNull Choice00078348305 start) {
    this.start = Optional.of(start);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public GoalBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public GoalBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public GoalBuilder withExtension(@NonNull Extension... extension) {
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
  public GoalBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param addresses - The identified conditions and other health record elements that are intended
   *     to be addressed by the goal.
   */
  public GoalBuilder withAddresses(@NonNull Reference... addresses) {
    this.addresses = Arrays.asList(addresses);
    return this;
  }
  /**
   * @param addresses - The identified conditions and other health record elements that are intended
   *     to be addressed by the goal.
   */
  public GoalBuilder withAddresses(@NonNull Collection<Reference> addresses) {
    this.addresses = Collections.unmodifiableCollection(addresses);
    return this;
  }
  /**
   * @param identifier - Business identifiers assigned to this goal by the performer or other
   *     systems which remain constant as the resource is updated and propagates from server to
   *     server.
   */
  public GoalBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /**
   * @param identifier - Business identifiers assigned to this goal by the performer or other
   *     systems which remain constant as the resource is updated and propagates from server to
   *     server.
   */
  public GoalBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /**
   * @param statusDate - Identifies when the current status. I.e. When initially created, when
   *     achieved, when cancelled, etc.
   */
  public GoalBuilder withStatusDate(@NonNull FHIRDate statusDate) {
    this.statusDate = Optional.of(statusDate);
    return this;
  }
  /** @param expressedBy - Indicates whose goal this is - patient goal, practitioner goal, etc. */
  public GoalBuilder withExpressedBy(@NonNull Reference expressedBy) {
    this.expressedBy = Optional.of(expressedBy);
    return this;
  }
  /**
   * @param outcomeCode - Identifies the change (or lack of change) at the point when the status of
   *     the goal is assessed.
   */
  public GoalBuilder withOutcomeCode(@NonNull CodeableConcept... outcomeCode) {
    this.outcomeCode = Arrays.asList(outcomeCode);
    return this;
  }
  /**
   * @param outcomeCode - Identifies the change (or lack of change) at the point when the status of
   *     the goal is assessed.
   */
  public GoalBuilder withOutcomeCode(@NonNull Collection<CodeableConcept> outcomeCode) {
    this.outcomeCode = Collections.unmodifiableCollection(outcomeCode);
    return this;
  }
  /** @param statusReason - Captures the reason for the current status. */
  public GoalBuilder withStatusReason(@NonNull String statusReason) {
    this.statusReason = Optional.of(statusReason);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public GoalBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /** @param outcomeReference - Details of what's changed (or not changed). */
  public GoalBuilder withOutcomeReference(@NonNull Reference... outcomeReference) {
    this.outcomeReference = Arrays.asList(outcomeReference);
    return this;
  }
  /** @param outcomeReference - Details of what's changed (or not changed). */
  public GoalBuilder withOutcomeReference(@NonNull Collection<Reference> outcomeReference) {
    this.outcomeReference = Collections.unmodifiableCollection(outcomeReference);
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
  public GoalBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public GoalBuilder withModifierExtension(@NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param achievementStatus - Describes the progression, or lack thereof, towards the goal against
   *     the target.
   */
  public GoalBuilder withAchievementStatus(@NonNull CodeableConcept achievementStatus) {
    this.achievementStatus = Optional.of(achievementStatus);
    return this;
  }
  /** @param target - Indicates what should be done by when. */
  public GoalBuilder withTarget(@NonNull Goal.Target... target) {
    this.target = Arrays.asList(target);
    return this;
  }
  /** @param target - Indicates what should be done by when. */
  public GoalBuilder withTarget(@NonNull Collection<Goal.Target> target) {
    this.target = Collections.unmodifiableCollection(target);
    return this;
  }

  public GoalBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public Goal build() {
    return new Goal(
        (Option) OptionConverters.toScala(id),
        (Option) OptionConverters.toScala(meta),
        (Option) OptionConverters.toScala(text),
        note.stream().collect(new LitSeqJCollector<>()),
        subject,
        (Option) OptionConverters.toScala(language),
        category.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(priority),
        (Option) OptionConverters.toScala(start),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        addresses.stream().collect(new LitSeqJCollector<>()),
        identifier.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(statusDate),
        description,
        (Option) OptionConverters.toScala(expressedBy),
        outcomeCode.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(statusReason),
        (Option) OptionConverters.toScala(implicitRules),
        lifecycleStatus,
        outcomeReference.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(achievementStatus),
        target.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
