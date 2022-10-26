package com.babylonhealth.lit.ukcore_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.CARE_PLAN_INTENT;
import com.babylonhealth.lit.hl7.REQUEST_STATUS;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.ukcore.model.*;
import com.babylonhealth.lit.ukcore_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface UKCore_CarePlanBuilder extends CarePlanBuilder {
  public UKCore_CarePlan build();

  public static Impl init(REQUEST_STATUS status, CARE_PLAN_INTENT intent, Reference subject) {
    return new Impl(status, intent, subject);
  }

  public static Impl builder(
      REQUEST_STATUS status, CARE_PLAN_INTENT intent, ReferenceBuilder subject) {
    return new Impl(status, intent, subject.build());
  }

  public class Impl implements UKCore_CarePlanBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta =
        Optional.of(
            MetaBuilder.init()
                .withProfile("https://fhir.hl7.org.uk/StructureDefinition/UKCore-CarePlan")
                .build());
    private Optional<Narrative> text = Optional.empty();
    private Optional<String> title = Optional.empty();
    private REQUEST_STATUS status;
    private CARE_PLAN_INTENT intent;
    private Optional<Period> period = Optional.empty();
    private Optional<FHIRDateTime> created = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<CodeableConcept> category = Collections.emptyList();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<Annotation> note = Collections.emptyList();
    private Collection<String> instantiatesUri = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Collection<String> instantiatesCanonical = Collections.emptyList();
    private Collection<Reference> goal = Collections.emptyList();
    private Collection<Reference> partOf = Collections.emptyList();
    private Optional<Reference> author = Optional.empty();
    private Collection<Reference> basedOn = Collections.emptyList();
    private Reference subject;
    private Collection<Reference> replaces = Collections.emptyList();
    private Collection<Reference> careTeam = Collections.emptyList();
    private Optional<Reference> encounter = Optional.empty();
    private Collection<Reference> addresses = Collections.emptyList();
    private Collection<Reference> contributor = Collections.emptyList();
    private Collection<Reference> supportingInfo = Collections.emptyList();
    private Collection<CarePlan.Activity> activity = Collections.emptyList();

    /**
     * Required fields for {@link UKCore_CarePlan}
     *
     * @param status - Indicates whether the plan is currently being acted upon, represents future
     *     intentions or is now a historical record.
     * @param intent - Indicates the level of authority/intentionality associated with the care plan
     *     and where the care plan fits into the workflow chain.
     * @param subject - Identifies the patient or group whose intended care is described by the
     *     plan.
     */
    public Impl(REQUEST_STATUS status, CARE_PLAN_INTENT intent, Reference subject) {
      this.status = status;
      this.intent = intent;
      this.subject = subject;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public UKCore_CarePlanBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public UKCore_CarePlanBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public UKCore_CarePlanBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public UKCore_CarePlanBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public UKCore_CarePlanBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param title - Human-friendly name for the care plan. */
    public UKCore_CarePlanBuilder.Impl withTitle(@NonNull String title) {
      this.title = Optional.of(title);
      return this;
    }
    /** @param period - Indicates when the plan did (or is intended to) come into effect and end. */
    public UKCore_CarePlanBuilder.Impl withPeriod(@NonNull Period period) {
      this.period = Optional.of(period);
      return this;
    }

    public UKCore_CarePlanBuilder.Impl withPeriod(@NonNull PeriodBuilder period) {
      this.period = Optional.of(period.build());
      return this;
    }
    /**
     * @param created - Represents when this particular CarePlan record was created in the system,
     *     which is often a system-generated date.
     */
    public UKCore_CarePlanBuilder.Impl withCreated(@NonNull FHIRDateTime created) {
      this.created = Optional.of(created);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public UKCore_CarePlanBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param category - Identifies what "kind" of plan this is to support differentiation between
     *     multiple co-existing plans; e.g. "Home health", "psychiatric", "asthma", "disease
     *     management", "wellness plan", etc.
     */
    public UKCore_CarePlanBuilder.Impl withCategory(@NonNull CodeableConcept... category) {
      this.category = Arrays.asList(category);
      return this;
    }
    /**
     * @param category - Identifies what "kind" of plan this is to support differentiation between
     *     multiple co-existing plans; e.g. "Home health", "psychiatric", "asthma", "disease
     *     management", "wellness plan", etc.
     */
    public UKCore_CarePlanBuilder.Impl withCategory(@NonNull Collection<CodeableConcept> category) {
      this.category = Collections.unmodifiableCollection(category);
      return this;
    }

    public UKCore_CarePlanBuilder.Impl withCategory(@NonNull CodeableConceptBuilder... category) {
      this.category = Arrays.stream(category).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public UKCore_CarePlanBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public UKCore_CarePlanBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public UKCore_CarePlanBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public UKCore_CarePlanBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public UKCore_CarePlanBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public UKCore_CarePlanBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param description - A description of the scope and nature of the plan. */
    public UKCore_CarePlanBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public UKCore_CarePlanBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /** @param note - General notes about the care plan not covered elsewhere. */
    public UKCore_CarePlanBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /** @param note - General notes about the care plan not covered elsewhere. */
    public UKCore_CarePlanBuilder.Impl withNote(@NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public UKCore_CarePlanBuilder.Impl withNote(@NonNull AnnotationBuilder... note) {
      this.note = Arrays.stream(note).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param instantiatesUri - The URL pointing to an externally maintained protocol, guideline,
     *     questionnaire or other definition that is adhered to in whole or in part by this
     *     CarePlan.
     */
    public UKCore_CarePlanBuilder.Impl withInstantiatesUri(@NonNull String... instantiatesUri) {
      this.instantiatesUri = Arrays.asList(instantiatesUri);
      return this;
    }
    /**
     * @param instantiatesUri - The URL pointing to an externally maintained protocol, guideline,
     *     questionnaire or other definition that is adhered to in whole or in part by this
     *     CarePlan.
     */
    public UKCore_CarePlanBuilder.Impl withInstantiatesUri(
        @NonNull Collection<String> instantiatesUri) {
      this.instantiatesUri = Collections.unmodifiableCollection(instantiatesUri);
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
    public UKCore_CarePlanBuilder.Impl withModifierExtension(
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
    public UKCore_CarePlanBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public UKCore_CarePlanBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param identifier - Business identifiers assigned to this care plan by the performer or other
     *     systems which remain constant as the resource is updated and propagates from server to
     *     server.
     */
    public UKCore_CarePlanBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - Business identifiers assigned to this care plan by the performer or other
     *     systems which remain constant as the resource is updated and propagates from server to
     *     server.
     */
    public UKCore_CarePlanBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public UKCore_CarePlanBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param instantiatesCanonical - The URL pointing to a FHIR-defined protocol, guideline,
     *     questionnaire or other definition that is adhered to in whole or in part by this
     *     CarePlan.
     */
    public UKCore_CarePlanBuilder.Impl withInstantiatesCanonical(
        @NonNull String... instantiatesCanonical) {
      this.instantiatesCanonical = Arrays.asList(instantiatesCanonical);
      return this;
    }
    /**
     * @param instantiatesCanonical - The URL pointing to a FHIR-defined protocol, guideline,
     *     questionnaire or other definition that is adhered to in whole or in part by this
     *     CarePlan.
     */
    public UKCore_CarePlanBuilder.Impl withInstantiatesCanonical(
        @NonNull Collection<String> instantiatesCanonical) {
      this.instantiatesCanonical = Collections.unmodifiableCollection(instantiatesCanonical);
      return this;
    }
    /** @param goal - Describes the intended objective(s) of carrying out the care plan. */
    public UKCore_CarePlanBuilder.Impl withGoal(@NonNull Reference... goal) {
      this.goal = Arrays.asList(goal);
      return this;
    }
    /** @param goal - Describes the intended objective(s) of carrying out the care plan. */
    public UKCore_CarePlanBuilder.Impl withGoal(@NonNull Collection<Reference> goal) {
      this.goal = Collections.unmodifiableCollection(goal);
      return this;
    }

    public UKCore_CarePlanBuilder.Impl withGoal(@NonNull ReferenceBuilder... goal) {
      this.goal = Arrays.stream(goal).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param partOf - A larger care plan of which this particular care plan is a component or step.
     */
    public UKCore_CarePlanBuilder.Impl withPartOf(@NonNull Reference... partOf) {
      this.partOf = Arrays.asList(partOf);
      return this;
    }
    /**
     * @param partOf - A larger care plan of which this particular care plan is a component or step.
     */
    public UKCore_CarePlanBuilder.Impl withPartOf(@NonNull Collection<Reference> partOf) {
      this.partOf = Collections.unmodifiableCollection(partOf);
      return this;
    }

    public UKCore_CarePlanBuilder.Impl withPartOf(@NonNull ReferenceBuilder... partOf) {
      this.partOf = Arrays.stream(partOf).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param author - When populated, the author is responsible for the care plan. The care plan is
     *     attributed to the author.
     */
    public UKCore_CarePlanBuilder.Impl withAuthor(@NonNull Reference author) {
      this.author = Optional.of(author);
      return this;
    }

    public UKCore_CarePlanBuilder.Impl withAuthor(@NonNull ReferenceBuilder author) {
      this.author = Optional.of(author.build());
      return this;
    }
    /** @param basedOn - A care plan that is fulfilled in whole or in part by this care plan. */
    public UKCore_CarePlanBuilder.Impl withBasedOn(@NonNull Reference... basedOn) {
      this.basedOn = Arrays.asList(basedOn);
      return this;
    }
    /** @param basedOn - A care plan that is fulfilled in whole or in part by this care plan. */
    public UKCore_CarePlanBuilder.Impl withBasedOn(@NonNull Collection<Reference> basedOn) {
      this.basedOn = Collections.unmodifiableCollection(basedOn);
      return this;
    }

    public UKCore_CarePlanBuilder.Impl withBasedOn(@NonNull ReferenceBuilder... basedOn) {
      this.basedOn = Arrays.stream(basedOn).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param replaces - Completed or terminated care plan whose function is taken by this new care
     *     plan.
     */
    public UKCore_CarePlanBuilder.Impl withReplaces(@NonNull Reference... replaces) {
      this.replaces = Arrays.asList(replaces);
      return this;
    }
    /**
     * @param replaces - Completed or terminated care plan whose function is taken by this new care
     *     plan.
     */
    public UKCore_CarePlanBuilder.Impl withReplaces(@NonNull Collection<Reference> replaces) {
      this.replaces = Collections.unmodifiableCollection(replaces);
      return this;
    }

    public UKCore_CarePlanBuilder.Impl withReplaces(@NonNull ReferenceBuilder... replaces) {
      this.replaces = Arrays.stream(replaces).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param careTeam - Identifies all people and organizations who are expected to be involved in
     *     the care envisioned by this plan.
     */
    public UKCore_CarePlanBuilder.Impl withCareTeam(@NonNull Reference... careTeam) {
      this.careTeam = Arrays.asList(careTeam);
      return this;
    }
    /**
     * @param careTeam - Identifies all people and organizations who are expected to be involved in
     *     the care envisioned by this plan.
     */
    public UKCore_CarePlanBuilder.Impl withCareTeam(@NonNull Collection<Reference> careTeam) {
      this.careTeam = Collections.unmodifiableCollection(careTeam);
      return this;
    }

    public UKCore_CarePlanBuilder.Impl withCareTeam(@NonNull ReferenceBuilder... careTeam) {
      this.careTeam = Arrays.stream(careTeam).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param encounter - The Encounter during which this CarePlan was created or to which the
     *     creation of this record is tightly associated.
     */
    public UKCore_CarePlanBuilder.Impl withEncounter(@NonNull Reference encounter) {
      this.encounter = Optional.of(encounter);
      return this;
    }

    public UKCore_CarePlanBuilder.Impl withEncounter(@NonNull ReferenceBuilder encounter) {
      this.encounter = Optional.of(encounter.build());
      return this;
    }
    /**
     * @param addresses - Identifies the conditions/problems/concerns/diagnoses/etc. whose
     *     management and/or mitigation are handled by this plan.
     */
    public UKCore_CarePlanBuilder.Impl withAddresses(@NonNull Reference... addresses) {
      this.addresses = Arrays.asList(addresses);
      return this;
    }
    /**
     * @param addresses - Identifies the conditions/problems/concerns/diagnoses/etc. whose
     *     management and/or mitigation are handled by this plan.
     */
    public UKCore_CarePlanBuilder.Impl withAddresses(@NonNull Collection<Reference> addresses) {
      this.addresses = Collections.unmodifiableCollection(addresses);
      return this;
    }

    public UKCore_CarePlanBuilder.Impl withAddresses(@NonNull ReferenceBuilder... addresses) {
      this.addresses = Arrays.stream(addresses).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param contributor - Identifies the individual(s) or organization who provided the contents
     *     of the care plan.
     */
    public UKCore_CarePlanBuilder.Impl withContributor(@NonNull Reference... contributor) {
      this.contributor = Arrays.asList(contributor);
      return this;
    }
    /**
     * @param contributor - Identifies the individual(s) or organization who provided the contents
     *     of the care plan.
     */
    public UKCore_CarePlanBuilder.Impl withContributor(@NonNull Collection<Reference> contributor) {
      this.contributor = Collections.unmodifiableCollection(contributor);
      return this;
    }

    public UKCore_CarePlanBuilder.Impl withContributor(@NonNull ReferenceBuilder... contributor) {
      this.contributor = Arrays.stream(contributor).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param supportingInfo - Identifies portions of the patient's record that specifically
     *     influenced the formation of the plan. These might include comorbidities, recent
     *     procedures, limitations, recent assessments, etc.
     */
    public UKCore_CarePlanBuilder.Impl withSupportingInfo(@NonNull Reference... supportingInfo) {
      this.supportingInfo = Arrays.asList(supportingInfo);
      return this;
    }
    /**
     * @param supportingInfo - Identifies portions of the patient's record that specifically
     *     influenced the formation of the plan. These might include comorbidities, recent
     *     procedures, limitations, recent assessments, etc.
     */
    public UKCore_CarePlanBuilder.Impl withSupportingInfo(
        @NonNull Collection<Reference> supportingInfo) {
      this.supportingInfo = Collections.unmodifiableCollection(supportingInfo);
      return this;
    }

    public UKCore_CarePlanBuilder.Impl withSupportingInfo(
        @NonNull ReferenceBuilder... supportingInfo) {
      this.supportingInfo = Arrays.stream(supportingInfo).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param activity - Identifies a planned action to occur as part of the plan. For example, a
     *     medication to be used, lab tests to perform, self-monitoring, education, etc.
     */
    public UKCore_CarePlanBuilder.Impl withActivity(@NonNull CarePlan.Activity... activity) {
      this.activity = Arrays.asList(activity);
      return this;
    }
    /**
     * @param activity - Identifies a planned action to occur as part of the plan. For example, a
     *     medication to be used, lab tests to perform, self-monitoring, education, etc.
     */
    public UKCore_CarePlanBuilder.Impl withActivity(
        @NonNull Collection<CarePlan.Activity> activity) {
      this.activity = Collections.unmodifiableCollection(activity);
      return this;
    }

    public UKCore_CarePlanBuilder.Impl withActivity(@NonNull CarePlan_ActivityBuilder... activity) {
      this.activity = Arrays.stream(activity).map(e -> e.build()).collect(toList());
      return this;
    }

    public UKCore_CarePlanBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public UKCore_CarePlan build() {
      return new UKCore_CarePlan(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(title),
          status,
          intent,
          OptionConverters.toScala(period),
          OptionConverters.toScala(created),
          OptionConverters.toScala(language),
          category.stream().collect(new LitSeqJCollector<>()),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          OptionConverters.toScala(implicitRules),
          note.stream().collect(new LitSeqJCollector<>()),
          instantiatesUri.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          instantiatesCanonical.stream().collect(new LitSeqJCollector<>()),
          goal.stream().collect(new LitSeqJCollector<>()),
          partOf.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(author),
          basedOn.stream().collect(new LitSeqJCollector<>()),
          subject,
          replaces.stream().collect(new LitSeqJCollector<>()),
          careTeam.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(encounter),
          addresses.stream().collect(new LitSeqJCollector<>()),
          contributor.stream().collect(new LitSeqJCollector<>()),
          supportingInfo.stream().collect(new LitSeqJCollector<>()),
          activity.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
