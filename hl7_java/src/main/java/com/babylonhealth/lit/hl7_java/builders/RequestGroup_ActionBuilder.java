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
import com.babylonhealth.lit.hl7.REQUEST_PRIORITY;
import com.babylonhealth.lit.hl7.ACTION_GROUPING_BEHAVIOR;
import com.babylonhealth.lit.hl7.ACTION_REQUIRED_BEHAVIOR;
import com.babylonhealth.lit.hl7.ACTION_PRECHECK_BEHAVIOR;
import com.babylonhealth.lit.hl7.ACTION_SELECTION_BEHAVIOR;
import com.babylonhealth.lit.hl7.ACTION_CARDINALITY_BEHAVIOR;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface RequestGroup_ActionBuilder {
  public RequestGroup.Action build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public static Choice_0181779868 timing(Age a) {
    return new Choice_0181779868(a);
  }

  public static Choice_0181779868 timing(Duration d) {
    return new Choice_0181779868(d);
  }

  public static Choice_0181779868 timing(FHIRDateTime f) {
    return new Choice_0181779868(f);
  }

  public static Choice_0181779868 timing(Period p) {
    return new Choice_0181779868(p);
  }

  public static Choice_0181779868 timing(Range r) {
    return new Choice_0181779868(r);
  }

  public static Choice_0181779868 timing(Timing t) {
    return new Choice_0181779868(t);
  }

  public class Impl implements RequestGroup_ActionBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<CodeableConcept> code = Collections.emptyList();
    private Optional<CodeableConcept> _type = Optional.empty();
    private Optional<String> title = Optional.empty();
    private Optional<String> prefix = Optional.empty();
    private Collection<RequestGroup.Action> action = Collections.emptyList();
    private Optional<REQUEST_PRIORITY> priority = Optional.empty();
    private Optional<Reference> resource = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Choice_0181779868> timing = Optional.empty();
    private Optional<String> description = Optional.empty();
    private Collection<Reference> participant = Collections.emptyList();
    private Collection<RelatedArtifact> documentation = Collections.emptyList();
    private Optional<String> textEquivalent = Optional.empty();
    private Optional<ACTION_GROUPING_BEHAVIOR> groupingBehavior = Optional.empty();
    private Optional<ACTION_REQUIRED_BEHAVIOR> requiredBehavior = Optional.empty();
    private Optional<ACTION_PRECHECK_BEHAVIOR> precheckBehavior = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<ACTION_SELECTION_BEHAVIOR> selectionBehavior = Optional.empty();
    private Optional<ACTION_CARDINALITY_BEHAVIOR> cardinalityBehavior = Optional.empty();
    private Collection<RequestGroup$Action$Condition> condition = Collections.emptyList();
    private Collection<RequestGroup$Action$RelatedAction> relatedAction = Collections.emptyList();

    /** Required fields for {@link RequestGroup.Action} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public RequestGroup_ActionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param code - A code that identifies what the overall request group is. */
    public RequestGroup_ActionBuilder.Impl withCode(@NonNull CodeableConcept... code) {
      this.code = Arrays.asList(code);
      return this;
    }
    /** @param code - A code that identifies what the overall request group is. */
    public RequestGroup_ActionBuilder.Impl withCode(@NonNull Collection<CodeableConcept> code) {
      this.code = Collections.unmodifiableCollection(code);
      return this;
    }

    public RequestGroup_ActionBuilder.Impl withCode(@NonNull CodeableConceptBuilder... code) {
      this.code = Arrays.stream(code).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param _type */
    public RequestGroup_ActionBuilder.Impl withType(@NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public RequestGroup_ActionBuilder.Impl withType(@NonNull CodeableConceptBuilder _type) {
      this._type = Optional.of(_type.build());
      return this;
    }
    /** @param title */
    public RequestGroup_ActionBuilder.Impl withTitle(@NonNull String title) {
      this.title = Optional.of(title);
      return this;
    }
    /** @param prefix */
    public RequestGroup_ActionBuilder.Impl withPrefix(@NonNull String prefix) {
      this.prefix = Optional.of(prefix);
      return this;
    }
    /** @param action - The actions, if any, produced by the evaluation of the artifact. */
    public RequestGroup_ActionBuilder.Impl withAction(@NonNull RequestGroup.Action... action) {
      this.action = Arrays.asList(action);
      return this;
    }
    /** @param action - The actions, if any, produced by the evaluation of the artifact. */
    public RequestGroup_ActionBuilder.Impl withAction(
        @NonNull Collection<RequestGroup.Action> action) {
      this.action = Collections.unmodifiableCollection(action);
      return this;
    }

    public RequestGroup_ActionBuilder.Impl withAction(
        @NonNull RequestGroup_ActionBuilder... action) {
      this.action = Arrays.stream(action).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param priority - Indicates how quickly the request should be addressed with respect to other
     *     requests.
     */
    public RequestGroup_ActionBuilder.Impl withPriority(@NonNull REQUEST_PRIORITY priority) {
      this.priority = Optional.of(priority);
      return this;
    }
    /** @param resource */
    public RequestGroup_ActionBuilder.Impl withResource(@NonNull Reference resource) {
      this.resource = Optional.of(resource);
      return this;
    }

    public RequestGroup_ActionBuilder.Impl withResource(@NonNull ReferenceBuilder resource) {
      this.resource = Optional.of(resource.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public RequestGroup_ActionBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public RequestGroup_ActionBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public RequestGroup_ActionBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param timing Field is a 'choice' field. Type should be one of Age, Duration, FHIRDateTime,
     *     Period, Range, Timing. To pass the value in, wrap with one of the
     *     RequestGroup_ActionBuilder.timing static methods
     */
    public RequestGroup_ActionBuilder.Impl withTiming(@NonNull Choice_0181779868 timing) {
      this.timing = Optional.of(timing);
      return this;
    }
    /** @param description */
    public RequestGroup_ActionBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /** @param participant */
    public RequestGroup_ActionBuilder.Impl withParticipant(@NonNull Reference... participant) {
      this.participant = Arrays.asList(participant);
      return this;
    }
    /** @param participant */
    public RequestGroup_ActionBuilder.Impl withParticipant(
        @NonNull Collection<Reference> participant) {
      this.participant = Collections.unmodifiableCollection(participant);
      return this;
    }

    public RequestGroup_ActionBuilder.Impl withParticipant(
        @NonNull ReferenceBuilder... participant) {
      this.participant = Arrays.stream(participant).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param documentation */
    public RequestGroup_ActionBuilder.Impl withDocumentation(
        @NonNull RelatedArtifact... documentation) {
      this.documentation = Arrays.asList(documentation);
      return this;
    }
    /** @param documentation */
    public RequestGroup_ActionBuilder.Impl withDocumentation(
        @NonNull Collection<RelatedArtifact> documentation) {
      this.documentation = Collections.unmodifiableCollection(documentation);
      return this;
    }

    public RequestGroup_ActionBuilder.Impl withDocumentation(
        @NonNull RelatedArtifactBuilder... documentation) {
      this.documentation = Arrays.stream(documentation).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param textEquivalent */
    public RequestGroup_ActionBuilder.Impl withTextEquivalent(@NonNull String textEquivalent) {
      this.textEquivalent = Optional.of(textEquivalent);
      return this;
    }
    /** @param groupingBehavior */
    public RequestGroup_ActionBuilder.Impl withGroupingBehavior(
        @NonNull ACTION_GROUPING_BEHAVIOR groupingBehavior) {
      this.groupingBehavior = Optional.of(groupingBehavior);
      return this;
    }
    /** @param requiredBehavior */
    public RequestGroup_ActionBuilder.Impl withRequiredBehavior(
        @NonNull ACTION_REQUIRED_BEHAVIOR requiredBehavior) {
      this.requiredBehavior = Optional.of(requiredBehavior);
      return this;
    }
    /** @param precheckBehavior */
    public RequestGroup_ActionBuilder.Impl withPrecheckBehavior(
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
    public RequestGroup_ActionBuilder.Impl withModifierExtension(
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
    public RequestGroup_ActionBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public RequestGroup_ActionBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param selectionBehavior */
    public RequestGroup_ActionBuilder.Impl withSelectionBehavior(
        @NonNull ACTION_SELECTION_BEHAVIOR selectionBehavior) {
      this.selectionBehavior = Optional.of(selectionBehavior);
      return this;
    }
    /** @param cardinalityBehavior */
    public RequestGroup_ActionBuilder.Impl withCardinalityBehavior(
        @NonNull ACTION_CARDINALITY_BEHAVIOR cardinalityBehavior) {
      this.cardinalityBehavior = Optional.of(cardinalityBehavior);
      return this;
    }
    /** @param condition */
    public RequestGroup_ActionBuilder.Impl withCondition(
        @NonNull RequestGroup$Action$Condition... condition) {
      this.condition = Arrays.asList(condition);
      return this;
    }
    /** @param condition */
    public RequestGroup_ActionBuilder.Impl withCondition(
        @NonNull Collection<RequestGroup$Action$Condition> condition) {
      this.condition = Collections.unmodifiableCollection(condition);
      return this;
    }

    public RequestGroup_ActionBuilder.Impl withCondition(
        @NonNull RequestGroup_Action_ConditionBuilder... condition) {
      this.condition = Arrays.stream(condition).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param relatedAction */
    public RequestGroup_ActionBuilder.Impl withRelatedAction(
        @NonNull RequestGroup$Action$RelatedAction... relatedAction) {
      this.relatedAction = Arrays.asList(relatedAction);
      return this;
    }
    /** @param relatedAction */
    public RequestGroup_ActionBuilder.Impl withRelatedAction(
        @NonNull Collection<RequestGroup$Action$RelatedAction> relatedAction) {
      this.relatedAction = Collections.unmodifiableCollection(relatedAction);
      return this;
    }

    public RequestGroup_ActionBuilder.Impl withRelatedAction(
        @NonNull RequestGroup_Action_RelatedActionBuilder... relatedAction) {
      this.relatedAction = Arrays.stream(relatedAction).map(e -> e.build()).collect(toList());
      return this;
    }

    public RequestGroup.Action build() {
      return new RequestGroup.Action(
          OptionConverters.toScala(id),
          code.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(_type),
          OptionConverters.toScala(title),
          OptionConverters.toScala(prefix),
          action.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(priority),
          OptionConverters.toScala(resource),
          extension.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(timing),
          OptionConverters.toScala(description),
          participant.stream().collect(new LitSeqJCollector<>()),
          documentation.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(textEquivalent),
          OptionConverters.toScala(groupingBehavior),
          OptionConverters.toScala(requiredBehavior),
          OptionConverters.toScala(precheckBehavior),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(selectionBehavior),
          OptionConverters.toScala(cardinalityBehavior),
          condition.stream().collect(new LitSeqJCollector<>()),
          relatedAction.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
