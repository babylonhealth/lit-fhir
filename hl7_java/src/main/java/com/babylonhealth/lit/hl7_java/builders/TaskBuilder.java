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
import com.babylonhealth.lit.hl7.TASK_STATUS;
import com.babylonhealth.lit.hl7.TASK_INTENT;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.hl7.REQUEST_PRIORITY;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface TaskBuilder extends DomainResourceBuilder {
  public Task build();

  public static Impl init(TASK_STATUS status, TASK_INTENT intent) {
    return new Impl(status, intent);
  }

  public static Impl builder(TASK_STATUS status, TASK_INTENT intent) {
    return new Impl(status, intent);
  }

  public class Impl implements TaskBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Reference> _for = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<CodeableConcept> code = Optional.empty();
    private Collection<Annotation> note = Collections.emptyList();
    private Optional<Reference> focus = Optional.empty();
    private Optional<Reference> owner = Optional.empty();
    private Collection<Reference> partOf = Collections.emptyList();
    private TASK_STATUS status;
    private TASK_INTENT intent;
    private Collection<Reference> basedOn = Collections.emptyList();
    private Optional<LANGUAGES> language = Optional.empty();
    private Optional<REQUEST_PRIORITY> priority = Optional.empty();
    private Optional<Reference> location = Optional.empty();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> encounter = Optional.empty();
    private Optional<Reference> requester = Optional.empty();
    private Collection<Reference> insurance = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<FHIRDateTime> authoredOn = Optional.empty();
    private Optional<CodeableConcept> reasonCode = Optional.empty();
    private Optional<String> description = Optional.empty();
    private Optional<CodeableConcept> statusReason = Optional.empty();
    private Optional<FHIRDateTime> lastModified = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<CodeableConcept> performerType = Collections.emptyList();
    private Optional<CodeableConcept> businessStatus = Optional.empty();
    private Optional<String> instantiatesUri = Optional.empty();
    private Optional<Identifier> groupIdentifier = Optional.empty();
    private Optional<Period> executionPeriod = Optional.empty();
    private Optional<Reference> reasonReference = Optional.empty();
    private Collection<Reference> relevantHistory = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<String> instantiatesCanonical = Optional.empty();
    private Collection<Task.Input> input = Collections.emptyList();
    private Collection<Task.Output> output = Collections.emptyList();
    private Optional<Task.Restriction> restriction = Optional.empty();

    /**
     * Required fields for {@link Task}
     *
     * @param status - The current status of the task.
     * @param intent - Indicates the "level" of actionability associated with the Task, i.e.
     *     i+R[9]Cs this a proposed task, a planned task, an actionable task, etc.
     */
    public Impl(TASK_STATUS status, TASK_INTENT intent) {
      this.status = status;
      this.intent = intent;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public TaskBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param _for - The entity who benefits from the performance of the service specified in the
     *     task (e.g., the patient).
     */
    public TaskBuilder.Impl withFor(@NonNull Reference _for) {
      this._for = Optional.of(_for);
      return this;
    }

    public TaskBuilder.Impl withFor(@NonNull ReferenceBuilder _for) {
      this._for = Optional.of(_for.build());
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public TaskBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public TaskBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public TaskBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public TaskBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param code - A name or code (or both) briefly describing what the task involves. */
    public TaskBuilder.Impl withCode(@NonNull CodeableConcept code) {
      this.code = Optional.of(code);
      return this;
    }

    public TaskBuilder.Impl withCode(@NonNull CodeableConceptBuilder code) {
      this.code = Optional.of(code.build());
      return this;
    }
    /** @param note - Free-text information captured about the task as it progresses. */
    public TaskBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /** @param note - Free-text information captured about the task as it progresses. */
    public TaskBuilder.Impl withNote(@NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public TaskBuilder.Impl withNote(@NonNull AnnotationBuilder... note) {
      this.note = Arrays.stream(note).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param focus - The request being actioned or the resource being manipulated by this task. */
    public TaskBuilder.Impl withFocus(@NonNull Reference focus) {
      this.focus = Optional.of(focus);
      return this;
    }

    public TaskBuilder.Impl withFocus(@NonNull ReferenceBuilder focus) {
      this.focus = Optional.of(focus.build());
      return this;
    }
    /**
     * @param owner - Individual organization or Device currently responsible for task execution.
     */
    public TaskBuilder.Impl withOwner(@NonNull Reference owner) {
      this.owner = Optional.of(owner);
      return this;
    }

    public TaskBuilder.Impl withOwner(@NonNull ReferenceBuilder owner) {
      this.owner = Optional.of(owner.build());
      return this;
    }
    /** @param partOf - Task that this particular task is part of. */
    public TaskBuilder.Impl withPartOf(@NonNull Reference... partOf) {
      this.partOf = Arrays.asList(partOf);
      return this;
    }
    /** @param partOf - Task that this particular task is part of. */
    public TaskBuilder.Impl withPartOf(@NonNull Collection<Reference> partOf) {
      this.partOf = Collections.unmodifiableCollection(partOf);
      return this;
    }

    public TaskBuilder.Impl withPartOf(@NonNull ReferenceBuilder... partOf) {
      this.partOf = Arrays.stream(partOf).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param basedOn - BasedOn refers to a higher-level authorization that triggered the creation
     *     of the task. It references a "request" resource such as a ServiceRequest,
     *     MedicationRequest, ServiceRequest, CarePlan, etc. which is distinct from the "request"
     *     resource the task is seeking to fulfill. This latter resource is referenced by FocusOn.
     *     For example, based on a ServiceRequest (= BasedOn), a task is created to fulfill a
     *     procedureRequest ( = FocusOn ) to collect a specimen from a patient.
     */
    public TaskBuilder.Impl withBasedOn(@NonNull Reference... basedOn) {
      this.basedOn = Arrays.asList(basedOn);
      return this;
    }
    /**
     * @param basedOn - BasedOn refers to a higher-level authorization that triggered the creation
     *     of the task. It references a "request" resource such as a ServiceRequest,
     *     MedicationRequest, ServiceRequest, CarePlan, etc. which is distinct from the "request"
     *     resource the task is seeking to fulfill. This latter resource is referenced by FocusOn.
     *     For example, based on a ServiceRequest (= BasedOn), a task is created to fulfill a
     *     procedureRequest ( = FocusOn ) to collect a specimen from a patient.
     */
    public TaskBuilder.Impl withBasedOn(@NonNull Collection<Reference> basedOn) {
      this.basedOn = Collections.unmodifiableCollection(basedOn);
      return this;
    }

    public TaskBuilder.Impl withBasedOn(@NonNull ReferenceBuilder... basedOn) {
      this.basedOn = Arrays.stream(basedOn).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public TaskBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param priority - Indicates how quickly the Task should be addressed with respect to other
     *     requests.
     */
    public TaskBuilder.Impl withPriority(@NonNull REQUEST_PRIORITY priority) {
      this.priority = Optional.of(priority);
      return this;
    }
    /** @param location - Principal physical location where the this task is performed. */
    public TaskBuilder.Impl withLocation(@NonNull Reference location) {
      this.location = Optional.of(location);
      return this;
    }

    public TaskBuilder.Impl withLocation(@NonNull ReferenceBuilder location) {
      this.location = Optional.of(location.build());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public TaskBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public TaskBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public TaskBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public TaskBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public TaskBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public TaskBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param encounter - The healthcare event (e.g. a patient and healthcare provider interaction)
     *     during which this task was created.
     */
    public TaskBuilder.Impl withEncounter(@NonNull Reference encounter) {
      this.encounter = Optional.of(encounter);
      return this;
    }

    public TaskBuilder.Impl withEncounter(@NonNull ReferenceBuilder encounter) {
      this.encounter = Optional.of(encounter.build());
      return this;
    }
    /** @param requester - The creator of the task. */
    public TaskBuilder.Impl withRequester(@NonNull Reference requester) {
      this.requester = Optional.of(requester);
      return this;
    }

    public TaskBuilder.Impl withRequester(@NonNull ReferenceBuilder requester) {
      this.requester = Optional.of(requester.build());
      return this;
    }
    /**
     * @param insurance - Insurance plans, coverage extensions, pre-authorizations and/or
     *     pre-determinations that may be relevant to the Task.
     */
    public TaskBuilder.Impl withInsurance(@NonNull Reference... insurance) {
      this.insurance = Arrays.asList(insurance);
      return this;
    }
    /**
     * @param insurance - Insurance plans, coverage extensions, pre-authorizations and/or
     *     pre-determinations that may be relevant to the Task.
     */
    public TaskBuilder.Impl withInsurance(@NonNull Collection<Reference> insurance) {
      this.insurance = Collections.unmodifiableCollection(insurance);
      return this;
    }

    public TaskBuilder.Impl withInsurance(@NonNull ReferenceBuilder... insurance) {
      this.insurance = Arrays.stream(insurance).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param identifier - The business identifier for this task. */
    public TaskBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /** @param identifier - The business identifier for this task. */
    public TaskBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public TaskBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param authoredOn - The date and time this task was created. */
    public TaskBuilder.Impl withAuthoredOn(@NonNull FHIRDateTime authoredOn) {
      this.authoredOn = Optional.of(authoredOn);
      return this;
    }
    /** @param reasonCode - A description or code indicating why this task needs to be performed. */
    public TaskBuilder.Impl withReasonCode(@NonNull CodeableConcept reasonCode) {
      this.reasonCode = Optional.of(reasonCode);
      return this;
    }

    public TaskBuilder.Impl withReasonCode(@NonNull CodeableConceptBuilder reasonCode) {
      this.reasonCode = Optional.of(reasonCode.build());
      return this;
    }
    /** @param description - A free-text description of what is to be performed. */
    public TaskBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /**
     * @param statusReason - An explanation as to why this task is held, failed, was refused, etc.
     */
    public TaskBuilder.Impl withStatusReason(@NonNull CodeableConcept statusReason) {
      this.statusReason = Optional.of(statusReason);
      return this;
    }

    public TaskBuilder.Impl withStatusReason(@NonNull CodeableConceptBuilder statusReason) {
      this.statusReason = Optional.of(statusReason.build());
      return this;
    }
    /** @param lastModified - The date and time of last modification to this task. */
    public TaskBuilder.Impl withLastModified(@NonNull FHIRDateTime lastModified) {
      this.lastModified = Optional.of(lastModified);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public TaskBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /** @param performerType - The kind of participant that should perform the task. */
    public TaskBuilder.Impl withPerformerType(@NonNull CodeableConcept... performerType) {
      this.performerType = Arrays.asList(performerType);
      return this;
    }
    /** @param performerType - The kind of participant that should perform the task. */
    public TaskBuilder.Impl withPerformerType(@NonNull Collection<CodeableConcept> performerType) {
      this.performerType = Collections.unmodifiableCollection(performerType);
      return this;
    }

    public TaskBuilder.Impl withPerformerType(@NonNull CodeableConceptBuilder... performerType) {
      this.performerType = Arrays.stream(performerType).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param businessStatus - Contains business-specific nuances of the business state. */
    public TaskBuilder.Impl withBusinessStatus(@NonNull CodeableConcept businessStatus) {
      this.businessStatus = Optional.of(businessStatus);
      return this;
    }

    public TaskBuilder.Impl withBusinessStatus(@NonNull CodeableConceptBuilder businessStatus) {
      this.businessStatus = Optional.of(businessStatus.build());
      return this;
    }
    /**
     * @param instantiatesUri - The URL pointing to an *externally* maintained protocol, guideline,
     *     orderset or other definition that is adhered to in whole or in part by this Task.
     */
    public TaskBuilder.Impl withInstantiatesUri(@NonNull String instantiatesUri) {
      this.instantiatesUri = Optional.of(instantiatesUri);
      return this;
    }
    /**
     * @param groupIdentifier - An identifier that links together multiple tasks and other requests
     *     that were created in the same context.
     */
    public TaskBuilder.Impl withGroupIdentifier(@NonNull Identifier groupIdentifier) {
      this.groupIdentifier = Optional.of(groupIdentifier);
      return this;
    }

    public TaskBuilder.Impl withGroupIdentifier(@NonNull IdentifierBuilder groupIdentifier) {
      this.groupIdentifier = Optional.of(groupIdentifier.build());
      return this;
    }
    /**
     * @param executionPeriod - Identifies the time action was first taken against the task (start)
     *     and/or the time final action was taken against the task prior to marking it as completed
     *     (end).
     */
    public TaskBuilder.Impl withExecutionPeriod(@NonNull Period executionPeriod) {
      this.executionPeriod = Optional.of(executionPeriod);
      return this;
    }

    public TaskBuilder.Impl withExecutionPeriod(@NonNull PeriodBuilder executionPeriod) {
      this.executionPeriod = Optional.of(executionPeriod.build());
      return this;
    }
    /**
     * @param reasonReference - A resource reference indicating why this task needs to be performed.
     */
    public TaskBuilder.Impl withReasonReference(@NonNull Reference reasonReference) {
      this.reasonReference = Optional.of(reasonReference);
      return this;
    }

    public TaskBuilder.Impl withReasonReference(@NonNull ReferenceBuilder reasonReference) {
      this.reasonReference = Optional.of(reasonReference.build());
      return this;
    }
    /**
     * @param relevantHistory - Links to Provenance records for past versions of this Task that
     *     identify key state transitions or updates that are likely to be relevant to a user
     *     looking at the current version of the task.
     */
    public TaskBuilder.Impl withRelevantHistory(@NonNull Reference... relevantHistory) {
      this.relevantHistory = Arrays.asList(relevantHistory);
      return this;
    }
    /**
     * @param relevantHistory - Links to Provenance records for past versions of this Task that
     *     identify key state transitions or updates that are likely to be relevant to a user
     *     looking at the current version of the task.
     */
    public TaskBuilder.Impl withRelevantHistory(@NonNull Collection<Reference> relevantHistory) {
      this.relevantHistory = Collections.unmodifiableCollection(relevantHistory);
      return this;
    }

    public TaskBuilder.Impl withRelevantHistory(@NonNull ReferenceBuilder... relevantHistory) {
      this.relevantHistory = Arrays.stream(relevantHistory).map(e -> e.build()).collect(toList());
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
    public TaskBuilder.Impl withModifierExtension(@NonNull Extension... modifierExtension) {
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
    public TaskBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public TaskBuilder.Impl withModifierExtension(@NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param instantiatesCanonical - The URL pointing to a *FHIR*-defined protocol, guideline,
     *     orderset or other definition that is adhered to in whole or in part by this Task.
     */
    public TaskBuilder.Impl withInstantiatesCanonical(@NonNull String instantiatesCanonical) {
      this.instantiatesCanonical = Optional.of(instantiatesCanonical);
      return this;
    }
    /** @param input - Additional information that may be needed in the execution of the task. */
    public TaskBuilder.Impl withInput(@NonNull Task.Input... input) {
      this.input = Arrays.asList(input);
      return this;
    }
    /** @param input - Additional information that may be needed in the execution of the task. */
    public TaskBuilder.Impl withInput(@NonNull Collection<Task.Input> input) {
      this.input = Collections.unmodifiableCollection(input);
      return this;
    }

    public TaskBuilder.Impl withInput(@NonNull Task_InputBuilder... input) {
      this.input = Arrays.stream(input).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param output - Outputs produced by the Task. */
    public TaskBuilder.Impl withOutput(@NonNull Task.Output... output) {
      this.output = Arrays.asList(output);
      return this;
    }
    /** @param output - Outputs produced by the Task. */
    public TaskBuilder.Impl withOutput(@NonNull Collection<Task.Output> output) {
      this.output = Collections.unmodifiableCollection(output);
      return this;
    }

    public TaskBuilder.Impl withOutput(@NonNull Task_OutputBuilder... output) {
      this.output = Arrays.stream(output).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param restriction - If the Task.focus is a request resource and the task is seeking
     *     fulfillment (i.e. is asking for the request to be actioned), this element identifies any
     *     limitations on what parts of the referenced request should be actioned.
     */
    public TaskBuilder.Impl withRestriction(@NonNull Task.Restriction restriction) {
      this.restriction = Optional.of(restriction);
      return this;
    }

    public TaskBuilder.Impl withRestriction(@NonNull Task_RestrictionBuilder restriction) {
      this.restriction = Optional.of(restriction.build());
      return this;
    }

    public TaskBuilder withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Task build() {
      return new Task(
          OptionConverters.toScala(id),
          OptionConverters.toScala(_for),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(code),
          note.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(focus),
          OptionConverters.toScala(owner),
          partOf.stream().collect(new LitSeqJCollector<>()),
          status,
          intent,
          basedOn.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(language),
          OptionConverters.toScala(priority),
          OptionConverters.toScala(location),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(encounter),
          OptionConverters.toScala(requester),
          insurance.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(authoredOn),
          OptionConverters.toScala(reasonCode),
          OptionConverters.toScala(description),
          OptionConverters.toScala(statusReason),
          OptionConverters.toScala(lastModified),
          OptionConverters.toScala(implicitRules),
          performerType.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(businessStatus),
          OptionConverters.toScala(instantiatesUri),
          OptionConverters.toScala(groupIdentifier),
          OptionConverters.toScala(executionPeriod),
          OptionConverters.toScala(reasonReference),
          relevantHistory.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(instantiatesCanonical),
          input.stream().collect(new LitSeqJCollector<>()),
          output.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(restriction),
          LitUtils.emptyMetaElMap());
    }
  }
}
