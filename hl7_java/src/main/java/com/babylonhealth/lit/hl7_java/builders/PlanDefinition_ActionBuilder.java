package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.ACTION_CARDINALITY_BEHAVIOR;
import com.babylonhealth.lit.hl7.ACTION_GROUPING_BEHAVIOR;
import com.babylonhealth.lit.hl7.ACTION_PRECHECK_BEHAVIOR;
import com.babylonhealth.lit.hl7.ACTION_REQUIRED_BEHAVIOR;
import com.babylonhealth.lit.hl7.ACTION_SELECTION_BEHAVIOR;
import com.babylonhealth.lit.hl7.REQUEST_PRIORITY;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.Option;
import scala.jdk.javaapi.OptionConverters;

public interface PlanDefinition_ActionBuilder {
  public PlanDefinition.Action build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public static Choice01405873694 timing(Age a) {
    return new Choice01405873694(a);
  }

  public static Choice01405873694 timing(Duration d) {
    return new Choice01405873694(d);
  }

  public static Choice01405873694 timing(FHIRDateTime f) {
    return new Choice01405873694(f);
  }

  public static Choice01405873694 timing(Period p) {
    return new Choice01405873694(p);
  }

  public static Choice01405873694 timing(Range r) {
    return new Choice01405873694(r);
  }

  public static Choice01405873694 timing(Timing t) {
    return new Choice01405873694(t);
  }

  public static ChoiceCodeableConceptOrReference subject(CodeableConcept c) {
    return new ChoiceCodeableConceptOrReference(c);
  }

  public static ChoiceCodeableConceptOrReference subject(Reference r) {
    return new ChoiceCodeableConceptOrReference(r);
  }

  public static ChoiceCanonicalOrUri definitionCanonical(String s) {
    return ChoiceCanonicalOrUri.ChoiceCanonicalOrUriCanonical(s);
  }

  public static ChoiceCanonicalOrUri definitionUri(String s) {
    return ChoiceCanonicalOrUri.ChoiceCanonicalOrUriUriStr(s);
  }

  public class Impl implements PlanDefinition_ActionBuilder {
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
    private Optional<Choice01405873694> timing = Optional.empty();
    private Optional<String> transform = Optional.empty();
    private Optional<ChoiceCodeableConceptOrReference> subject = Optional.empty();
    private Optional<String> description = Optional.empty();
    private Collection<RelatedArtifact> documentation = Collections.emptyList();
    private Optional<ChoiceCanonicalOrUri> definition = Optional.empty();
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
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public PlanDefinition_ActionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param code */
    public PlanDefinition_ActionBuilder.Impl withCode(@NonNull CodeableConcept... code) {
      this.code = Arrays.asList(code);
      return this;
    }
    /** @param code */
    public PlanDefinition_ActionBuilder.Impl withCode(@NonNull Collection<CodeableConcept> code) {
      this.code = Collections.unmodifiableCollection(code);
      return this;
    }

    public PlanDefinition_ActionBuilder.Impl withCode(@NonNull CodeableConceptBuilder... code) {
      this.code = Arrays.stream(code).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param _type - A high-level category for the plan definition that distinguishes the kinds of
     *     systems that would be interested in the plan definition.
     */
    public PlanDefinition_ActionBuilder.Impl withType(@NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public PlanDefinition_ActionBuilder.Impl withType(@NonNull CodeableConceptBuilder _type) {
      this._type = Optional.of(_type.build());
      return this;
    }
    /** @param title - A short, descriptive, user-friendly title for the plan definition. */
    public PlanDefinition_ActionBuilder.Impl withTitle(@NonNull String title) {
      this.title = Optional.of(title);
      return this;
    }
    /** @param input */
    public PlanDefinition_ActionBuilder.Impl withInput(@NonNull DataRequirement... input) {
      this.input = Arrays.asList(input);
      return this;
    }
    /** @param input */
    public PlanDefinition_ActionBuilder.Impl withInput(@NonNull Collection<DataRequirement> input) {
      this.input = Collections.unmodifiableCollection(input);
      return this;
    }

    public PlanDefinition_ActionBuilder.Impl withInput(@NonNull DataRequirementBuilder... input) {
      this.input = Arrays.stream(input).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param prefix */
    public PlanDefinition_ActionBuilder.Impl withPrefix(@NonNull String prefix) {
      this.prefix = Optional.of(prefix);
      return this;
    }
    /** @param reason */
    public PlanDefinition_ActionBuilder.Impl withReason(@NonNull CodeableConcept... reason) {
      this.reason = Arrays.asList(reason);
      return this;
    }
    /** @param reason */
    public PlanDefinition_ActionBuilder.Impl withReason(
        @NonNull Collection<CodeableConcept> reason) {
      this.reason = Collections.unmodifiableCollection(reason);
      return this;
    }

    public PlanDefinition_ActionBuilder.Impl withReason(@NonNull CodeableConceptBuilder... reason) {
      this.reason = Arrays.stream(reason).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param goalId */
    public PlanDefinition_ActionBuilder.Impl withGoalId(@NonNull String... goalId) {
      this.goalId = Arrays.asList(goalId);
      return this;
    }
    /** @param goalId */
    public PlanDefinition_ActionBuilder.Impl withGoalId(@NonNull Collection<String> goalId) {
      this.goalId = Collections.unmodifiableCollection(goalId);
      return this;
    }
    /** @param output */
    public PlanDefinition_ActionBuilder.Impl withOutput(@NonNull DataRequirement... output) {
      this.output = Arrays.asList(output);
      return this;
    }
    /** @param output */
    public PlanDefinition_ActionBuilder.Impl withOutput(
        @NonNull Collection<DataRequirement> output) {
      this.output = Collections.unmodifiableCollection(output);
      return this;
    }

    public PlanDefinition_ActionBuilder.Impl withOutput(@NonNull DataRequirementBuilder... output) {
      this.output = Arrays.stream(output).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param action - An action or group of actions to be taken as part of the plan. */
    public PlanDefinition_ActionBuilder.Impl withAction(@NonNull PlanDefinition.Action... action) {
      this.action = Arrays.asList(action);
      return this;
    }
    /** @param action - An action or group of actions to be taken as part of the plan. */
    public PlanDefinition_ActionBuilder.Impl withAction(
        @NonNull Collection<PlanDefinition.Action> action) {
      this.action = Collections.unmodifiableCollection(action);
      return this;
    }

    public PlanDefinition_ActionBuilder.Impl withAction(
        @NonNull PlanDefinition_ActionBuilder... action) {
      this.action = Arrays.stream(action).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param trigger */
    public PlanDefinition_ActionBuilder.Impl withTrigger(@NonNull TriggerDefinition... trigger) {
      this.trigger = Arrays.asList(trigger);
      return this;
    }
    /** @param trigger */
    public PlanDefinition_ActionBuilder.Impl withTrigger(
        @NonNull Collection<TriggerDefinition> trigger) {
      this.trigger = Collections.unmodifiableCollection(trigger);
      return this;
    }

    public PlanDefinition_ActionBuilder.Impl withTrigger(
        @NonNull TriggerDefinitionBuilder... trigger) {
      this.trigger = Arrays.stream(trigger).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param priority */
    public PlanDefinition_ActionBuilder.Impl withPriority(@NonNull REQUEST_PRIORITY priority) {
      this.priority = Optional.of(priority);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public PlanDefinition_ActionBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public PlanDefinition_ActionBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public PlanDefinition_ActionBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param timing Field is a 'choice' field. Type should be one of Age, Duration, FHIRDateTime,
     *     Period, Range, Timing. To pass the value in, wrap with one of the
     *     PlanDefinition_ActionBuilder.timing static methods
     */
    public PlanDefinition_ActionBuilder.Impl withTiming(@NonNull Choice01405873694 timing) {
      this.timing = Optional.of(timing);
      return this;
    }
    /** @param transform */
    public PlanDefinition_ActionBuilder.Impl withTransform(@NonNull String transform) {
      this.transform = Optional.of(transform);
      return this;
    }
    /**
     * @param subject - A code or group definition that describes the intended subject of the plan
     *     definition. Field is a 'choice' field. Type should be one of CodeableConcept, Reference.
     *     To pass the value in, wrap with one of the PlanDefinition_ActionBuilder.subject static
     *     methods
     */
    public PlanDefinition_ActionBuilder.Impl withSubject(
        @NonNull ChoiceCodeableConceptOrReference subject) {
      this.subject = Optional.of(subject);
      return this;
    }
    /**
     * @param description - A free text natural language description of the plan definition from a
     *     consumer's perspective.
     */
    public PlanDefinition_ActionBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /** @param documentation */
    public PlanDefinition_ActionBuilder.Impl withDocumentation(
        @NonNull RelatedArtifact... documentation) {
      this.documentation = Arrays.asList(documentation);
      return this;
    }
    /** @param documentation */
    public PlanDefinition_ActionBuilder.Impl withDocumentation(
        @NonNull Collection<RelatedArtifact> documentation) {
      this.documentation = Collections.unmodifiableCollection(documentation);
      return this;
    }

    public PlanDefinition_ActionBuilder.Impl withDocumentation(
        @NonNull RelatedArtifactBuilder... documentation) {
      this.documentation = Arrays.stream(documentation).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param definition Field is a 'choice' field. Type should be one of String. To pass the value
     *     in, wrap with one of the PlanDefinition_ActionBuilder.definition static methods
     */
    public PlanDefinition_ActionBuilder.Impl withDefinition(
        @NonNull ChoiceCanonicalOrUri definition) {
      this.definition = Optional.of(definition);
      return this;
    }
    /** @param textEquivalent */
    public PlanDefinition_ActionBuilder.Impl withTextEquivalent(@NonNull String textEquivalent) {
      this.textEquivalent = Optional.of(textEquivalent);
      return this;
    }
    /** @param groupingBehavior */
    public PlanDefinition_ActionBuilder.Impl withGroupingBehavior(
        @NonNull ACTION_GROUPING_BEHAVIOR groupingBehavior) {
      this.groupingBehavior = Optional.of(groupingBehavior);
      return this;
    }
    /** @param requiredBehavior */
    public PlanDefinition_ActionBuilder.Impl withRequiredBehavior(
        @NonNull ACTION_REQUIRED_BEHAVIOR requiredBehavior) {
      this.requiredBehavior = Optional.of(requiredBehavior);
      return this;
    }
    /** @param precheckBehavior */
    public PlanDefinition_ActionBuilder.Impl withPrecheckBehavior(
        @NonNull ACTION_PRECHECK_BEHAVIOR precheckBehavior) {
      this.precheckBehavior = Optional.of(precheckBehavior);
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
    public PlanDefinition_ActionBuilder.Impl withModifierExtension(
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
    public PlanDefinition_ActionBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public PlanDefinition_ActionBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param selectionBehavior */
    public PlanDefinition_ActionBuilder.Impl withSelectionBehavior(
        @NonNull ACTION_SELECTION_BEHAVIOR selectionBehavior) {
      this.selectionBehavior = Optional.of(selectionBehavior);
      return this;
    }
    /** @param cardinalityBehavior */
    public PlanDefinition_ActionBuilder.Impl withCardinalityBehavior(
        @NonNull ACTION_CARDINALITY_BEHAVIOR cardinalityBehavior) {
      this.cardinalityBehavior = Optional.of(cardinalityBehavior);
      return this;
    }
    /** @param condition */
    public PlanDefinition_ActionBuilder.Impl withCondition(
        @NonNull PlanDefinition$Action$Condition... condition) {
      this.condition = Arrays.asList(condition);
      return this;
    }
    /** @param condition */
    public PlanDefinition_ActionBuilder.Impl withCondition(
        @NonNull Collection<PlanDefinition$Action$Condition> condition) {
      this.condition = Collections.unmodifiableCollection(condition);
      return this;
    }

    public PlanDefinition_ActionBuilder.Impl withCondition(
        @NonNull PlanDefinition_Action_ConditionBuilder... condition) {
      this.condition = Arrays.stream(condition).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param participant */
    public PlanDefinition_ActionBuilder.Impl withParticipant(
        @NonNull PlanDefinition$Action$Participant... participant) {
      this.participant = Arrays.asList(participant);
      return this;
    }
    /** @param participant */
    public PlanDefinition_ActionBuilder.Impl withParticipant(
        @NonNull Collection<PlanDefinition$Action$Participant> participant) {
      this.participant = Collections.unmodifiableCollection(participant);
      return this;
    }

    public PlanDefinition_ActionBuilder.Impl withParticipant(
        @NonNull PlanDefinition_Action_ParticipantBuilder... participant) {
      this.participant = Arrays.stream(participant).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param dynamicValue */
    public PlanDefinition_ActionBuilder.Impl withDynamicValue(
        @NonNull PlanDefinition$Action$DynamicValue... dynamicValue) {
      this.dynamicValue = Arrays.asList(dynamicValue);
      return this;
    }
    /** @param dynamicValue */
    public PlanDefinition_ActionBuilder.Impl withDynamicValue(
        @NonNull Collection<PlanDefinition$Action$DynamicValue> dynamicValue) {
      this.dynamicValue = Collections.unmodifiableCollection(dynamicValue);
      return this;
    }

    public PlanDefinition_ActionBuilder.Impl withDynamicValue(
        @NonNull PlanDefinition_Action_DynamicValueBuilder... dynamicValue) {
      this.dynamicValue = Arrays.stream(dynamicValue).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param relatedAction */
    public PlanDefinition_ActionBuilder.Impl withRelatedAction(
        @NonNull PlanDefinition$Action$RelatedAction... relatedAction) {
      this.relatedAction = Arrays.asList(relatedAction);
      return this;
    }
    /** @param relatedAction */
    public PlanDefinition_ActionBuilder.Impl withRelatedAction(
        @NonNull Collection<PlanDefinition$Action$RelatedAction> relatedAction) {
      this.relatedAction = Collections.unmodifiableCollection(relatedAction);
      return this;
    }

    public PlanDefinition_ActionBuilder.Impl withRelatedAction(
        @NonNull PlanDefinition_Action_RelatedActionBuilder... relatedAction) {
      this.relatedAction = Arrays.stream(relatedAction).map(e -> e.build()).collect(toList());
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
          (Option) OptionConverters.toScala(timing),
          OptionConverters.toScala(transform),
          (Option) OptionConverters.toScala(subject),
          OptionConverters.toScala(description),
          documentation.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(definition),
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
}
