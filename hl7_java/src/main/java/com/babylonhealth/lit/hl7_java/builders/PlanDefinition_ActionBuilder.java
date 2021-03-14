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
import com.babylonhealth.lit.hl7.REQUEST_PRIORITY;
import com.babylonhealth.lit.hl7.ACTION_GROUPING_BEHAVIOR;
import com.babylonhealth.lit.hl7.ACTION_REQUIRED_BEHAVIOR;
import com.babylonhealth.lit.hl7.ACTION_PRECHECK_BEHAVIOR;
import com.babylonhealth.lit.hl7.ACTION_SELECTION_BEHAVIOR;
import com.babylonhealth.lit.hl7.ACTION_CARDINALITY_BEHAVIOR;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class PlanDefinition_ActionBuilder {
  private Optional<String> id = Optional.empty();
  private Collection<CodeableConcept> code = Collections.emptyList();
  private Optional<CodeableConcept> _type = Optional.empty();
  private Optional<String> title = Optional.empty();
  private Collection<DataRequirement> input = Collections.emptyList();
  private Optional<String> prefix = Optional.empty();
  private Collection<CodeableConcept> reason = Collections.emptyList();
  private Collection<String> goalId = Collections.emptyList();
  private Collection<DataRequirement> output = Collections.emptyList();
  private Collection<PlanDefinition.Action> action = Collections.emptyList();
  private Collection<TriggerDefinition> trigger = Collections.emptyList();
  private Optional<REQUEST_PRIORITY> priority = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<
          Choice<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<$bslash$div<$bslash$div<Age, Duration>, FHIRDateTime>, Period>,
                      Range>,
                  Timing>>>
      timing = Optional.empty();
  private Optional<String> transform = Optional.empty();
  private Optional<Choice<$bslash$div<CodeableConcept, Reference>>> subject = Optional.empty();
  private Optional<String> description = Optional.empty();
  private Collection<RelatedArtifact> documentation = Collections.emptyList();
  private Optional<Choice<$bslash$div<String, String>>> definition = Optional.empty();
  private Optional<String> textEquivalent = Optional.empty();
  private Optional<ACTION_GROUPING_BEHAVIOR> groupingBehavior = Optional.empty();
  private Optional<ACTION_REQUIRED_BEHAVIOR> requiredBehavior = Optional.empty();
  private Optional<ACTION_PRECHECK_BEHAVIOR> precheckBehavior = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<ACTION_SELECTION_BEHAVIOR> selectionBehavior = Optional.empty();
  private Optional<ACTION_CARDINALITY_BEHAVIOR> cardinalityBehavior = Optional.empty();
  private Collection<PlanDefinition$Action$Condition> condition = Collections.emptyList();
  private Collection<PlanDefinition$Action$Participant> participant = Collections.emptyList();
  private Collection<PlanDefinition$Action$DynamicValue> dynamicValue = Collections.emptyList();
  private Collection<PlanDefinition$Action$RelatedAction> relatedAction = Collections.emptyList();

  /** Required fields for {@link PlanDefinition.Action} */
  public PlanDefinition_ActionBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public PlanDefinition_ActionBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param code */
  public PlanDefinition_ActionBuilder withCode(@NonNull CodeableConcept... code) {
    this.code = Arrays.asList(code);
    return this;
  }
  /** @param code */
  public PlanDefinition_ActionBuilder withCode(@NonNull Collection<CodeableConcept> code) {
    this.code = Collections.unmodifiableCollection(code);
    return this;
  }
  /**
   * @param _type - A high-level category for the plan definition that distinguishes the kinds of
   *     systems that would be interested in the plan definition.
   */
  public PlanDefinition_ActionBuilder withType(@NonNull CodeableConcept _type) {
    this._type = Optional.of(_type);
    return this;
  }
  /** @param title - A short, descriptive, user-friendly title for the plan definition. */
  public PlanDefinition_ActionBuilder withTitle(@NonNull String title) {
    this.title = Optional.of(title);
    return this;
  }
  /** @param input */
  public PlanDefinition_ActionBuilder withInput(@NonNull DataRequirement... input) {
    this.input = Arrays.asList(input);
    return this;
  }
  /** @param input */
  public PlanDefinition_ActionBuilder withInput(@NonNull Collection<DataRequirement> input) {
    this.input = Collections.unmodifiableCollection(input);
    return this;
  }
  /** @param prefix */
  public PlanDefinition_ActionBuilder withPrefix(@NonNull String prefix) {
    this.prefix = Optional.of(prefix);
    return this;
  }
  /** @param reason */
  public PlanDefinition_ActionBuilder withReason(@NonNull CodeableConcept... reason) {
    this.reason = Arrays.asList(reason);
    return this;
  }
  /** @param reason */
  public PlanDefinition_ActionBuilder withReason(@NonNull Collection<CodeableConcept> reason) {
    this.reason = Collections.unmodifiableCollection(reason);
    return this;
  }
  /** @param goalId */
  public PlanDefinition_ActionBuilder withGoalId(@NonNull String... goalId) {
    this.goalId = Arrays.asList(goalId);
    return this;
  }
  /** @param goalId */
  public PlanDefinition_ActionBuilder withGoalId(@NonNull Collection<String> goalId) {
    this.goalId = Collections.unmodifiableCollection(goalId);
    return this;
  }
  /** @param output */
  public PlanDefinition_ActionBuilder withOutput(@NonNull DataRequirement... output) {
    this.output = Arrays.asList(output);
    return this;
  }
  /** @param output */
  public PlanDefinition_ActionBuilder withOutput(@NonNull Collection<DataRequirement> output) {
    this.output = Collections.unmodifiableCollection(output);
    return this;
  }
  /** @param action - An action or group of actions to be taken as part of the plan. */
  public PlanDefinition_ActionBuilder withAction(@NonNull PlanDefinition.Action... action) {
    this.action = Arrays.asList(action);
    return this;
  }
  /** @param action - An action or group of actions to be taken as part of the plan. */
  public PlanDefinition_ActionBuilder withAction(
      @NonNull Collection<PlanDefinition.Action> action) {
    this.action = Collections.unmodifiableCollection(action);
    return this;
  }
  /** @param trigger */
  public PlanDefinition_ActionBuilder withTrigger(@NonNull TriggerDefinition... trigger) {
    this.trigger = Arrays.asList(trigger);
    return this;
  }
  /** @param trigger */
  public PlanDefinition_ActionBuilder withTrigger(@NonNull Collection<TriggerDefinition> trigger) {
    this.trigger = Collections.unmodifiableCollection(trigger);
    return this;
  }
  /** @param priority */
  public PlanDefinition_ActionBuilder withPriority(@NonNull REQUEST_PRIORITY priority) {
    this.priority = Optional.of(priority);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public PlanDefinition_ActionBuilder withExtension(@NonNull Extension... extension) {
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
  public PlanDefinition_ActionBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param timing Field is a 'choice' field. Type should be one of Age, Duration, FHIRDateTime,
   *     Period, Range, Timing.
   */
  public <T> PlanDefinition_ActionBuilder withTiming(@NonNull T timing) {
    var guessedSuffix =
        autoSuffix(timing.getClass().getSimpleName(), PlanDefinition.Action$.MODULE$.timing());
    return withTiming(guessedSuffix, timing);
  }

  /**
   * Alternative to the 'main' withTiming method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param timing - The value to be passed to the builder
   */
  public <T> PlanDefinition_ActionBuilder withTiming(String suffix, @NonNull T timing) {
    guard(timing.getClass().getSimpleName(), suffix, PlanDefinition.Action$.MODULE$.timing());
    this.timing =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix, timing, PlanDefinition.Action$.MODULE$.timing()));
    return this;
  }
  /** @param transform */
  public PlanDefinition_ActionBuilder withTransform(@NonNull String transform) {
    this.transform = Optional.of(transform);
    return this;
  }
  /**
   * @param subject - A code or group definition that describes the intended subject of the plan
   *     definition. Field is a 'choice' field. Type should be one of CodeableConcept, Reference.
   */
  public <T> PlanDefinition_ActionBuilder withSubject(@NonNull T subject) {
    var guessedSuffix =
        autoSuffix(subject.getClass().getSimpleName(), PlanDefinition.Action$.MODULE$.subject());
    return withSubject(guessedSuffix, subject);
  }

  /**
   * Alternative to the 'main' withSubject method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param subject - The value to be passed to the builder
   */
  public <T> PlanDefinition_ActionBuilder withSubject(String suffix, @NonNull T subject) {
    guard(subject.getClass().getSimpleName(), suffix, PlanDefinition.Action$.MODULE$.subject());
    this.subject =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix, subject, PlanDefinition.Action$.MODULE$.subject()));
    return this;
  }
  /**
   * @param description - A free text natural language description of the plan definition from a
   *     consumer's perspective.
   */
  public PlanDefinition_ActionBuilder withDescription(@NonNull String description) {
    this.description = Optional.of(description);
    return this;
  }
  /** @param documentation */
  public PlanDefinition_ActionBuilder withDocumentation(@NonNull RelatedArtifact... documentation) {
    this.documentation = Arrays.asList(documentation);
    return this;
  }
  /** @param documentation */
  public PlanDefinition_ActionBuilder withDocumentation(
      @NonNull Collection<RelatedArtifact> documentation) {
    this.documentation = Collections.unmodifiableCollection(documentation);
    return this;
  }
  /** @param definition Field is a 'choice' field. Type should be one of String. */
  public <T> PlanDefinition_ActionBuilder withDefinition(@NonNull T definition) {
    var guessedSuffix =
        autoSuffix(
            definition.getClass().getSimpleName(), PlanDefinition.Action$.MODULE$.definition());
    return withDefinition(guessedSuffix, definition);
  }

  /**
   * Alternative to the 'main' withDefinition method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type. When the parameter is
   * one of String then there are multiple candidate 'types' for the FHIR object, and we are unable
   * to automagically disambiguate
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types. For values of type String, the valid values are Canonical, Uri.
   * @param definition - The value to be passed to the builder
   */
  public <T> PlanDefinition_ActionBuilder withDefinition(String suffix, @NonNull T definition) {
    guard(
        definition.getClass().getSimpleName(), suffix, PlanDefinition.Action$.MODULE$.definition());
    this.definition =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix, definition, PlanDefinition.Action$.MODULE$.definition()));
    return this;
  }
  /** @param textEquivalent */
  public PlanDefinition_ActionBuilder withTextEquivalent(@NonNull String textEquivalent) {
    this.textEquivalent = Optional.of(textEquivalent);
    return this;
  }
  /** @param groupingBehavior */
  public PlanDefinition_ActionBuilder withGroupingBehavior(
      @NonNull ACTION_GROUPING_BEHAVIOR groupingBehavior) {
    this.groupingBehavior = Optional.of(groupingBehavior);
    return this;
  }
  /** @param requiredBehavior */
  public PlanDefinition_ActionBuilder withRequiredBehavior(
      @NonNull ACTION_REQUIRED_BEHAVIOR requiredBehavior) {
    this.requiredBehavior = Optional.of(requiredBehavior);
    return this;
  }
  /** @param precheckBehavior */
  public PlanDefinition_ActionBuilder withPrecheckBehavior(
      @NonNull ACTION_PRECHECK_BEHAVIOR precheckBehavior) {
    this.precheckBehavior = Optional.of(precheckBehavior);
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
  public PlanDefinition_ActionBuilder withModifierExtension(
      @NonNull Extension... modifierExtension) {
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
  public PlanDefinition_ActionBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param selectionBehavior */
  public PlanDefinition_ActionBuilder withSelectionBehavior(
      @NonNull ACTION_SELECTION_BEHAVIOR selectionBehavior) {
    this.selectionBehavior = Optional.of(selectionBehavior);
    return this;
  }
  /** @param cardinalityBehavior */
  public PlanDefinition_ActionBuilder withCardinalityBehavior(
      @NonNull ACTION_CARDINALITY_BEHAVIOR cardinalityBehavior) {
    this.cardinalityBehavior = Optional.of(cardinalityBehavior);
    return this;
  }
  /** @param condition */
  public PlanDefinition_ActionBuilder withCondition(
      @NonNull PlanDefinition$Action$Condition... condition) {
    this.condition = Arrays.asList(condition);
    return this;
  }
  /** @param condition */
  public PlanDefinition_ActionBuilder withCondition(
      @NonNull Collection<PlanDefinition$Action$Condition> condition) {
    this.condition = Collections.unmodifiableCollection(condition);
    return this;
  }
  /** @param participant */
  public PlanDefinition_ActionBuilder withParticipant(
      @NonNull PlanDefinition$Action$Participant... participant) {
    this.participant = Arrays.asList(participant);
    return this;
  }
  /** @param participant */
  public PlanDefinition_ActionBuilder withParticipant(
      @NonNull Collection<PlanDefinition$Action$Participant> participant) {
    this.participant = Collections.unmodifiableCollection(participant);
    return this;
  }
  /** @param dynamicValue */
  public PlanDefinition_ActionBuilder withDynamicValue(
      @NonNull PlanDefinition$Action$DynamicValue... dynamicValue) {
    this.dynamicValue = Arrays.asList(dynamicValue);
    return this;
  }
  /** @param dynamicValue */
  public PlanDefinition_ActionBuilder withDynamicValue(
      @NonNull Collection<PlanDefinition$Action$DynamicValue> dynamicValue) {
    this.dynamicValue = Collections.unmodifiableCollection(dynamicValue);
    return this;
  }
  /** @param relatedAction */
  public PlanDefinition_ActionBuilder withRelatedAction(
      @NonNull PlanDefinition$Action$RelatedAction... relatedAction) {
    this.relatedAction = Arrays.asList(relatedAction);
    return this;
  }
  /** @param relatedAction */
  public PlanDefinition_ActionBuilder withRelatedAction(
      @NonNull Collection<PlanDefinition$Action$RelatedAction> relatedAction) {
    this.relatedAction = Collections.unmodifiableCollection(relatedAction);
    return this;
  }

  public PlanDefinition.Action build() {
    return new PlanDefinition.Action(
        OptionConverters.toScala(id),
        code.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(_type),
        OptionConverters.toScala(title),
        input.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(prefix),
        reason.stream().collect(new LitSeqJCollector<>()),
        goalId.stream().collect(new LitSeqJCollector<>()),
        output.stream().collect(new LitSeqJCollector<>()),
        action.stream().collect(new LitSeqJCollector<>()),
        trigger.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(priority),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(timing),
        OptionConverters.toScala(transform),
        OptionConverters.toScala(subject),
        OptionConverters.toScala(description),
        documentation.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(definition),
        OptionConverters.toScala(textEquivalent),
        OptionConverters.toScala(groupingBehavior),
        OptionConverters.toScala(requiredBehavior),
        OptionConverters.toScala(precheckBehavior),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(selectionBehavior),
        OptionConverters.toScala(cardinalityBehavior),
        condition.stream().collect(new LitSeqJCollector<>()),
        participant.stream().collect(new LitSeqJCollector<>()),
        dynamicValue.stream().collect(new LitSeqJCollector<>()),
        relatedAction.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
