package com.babylonhealth.lit.uscore_java.builders;

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
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.uscore.model.*;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.usbase_java.builders.*;
import com.babylonhealth.lit.uscore_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import com.babylonhealth.lit.uscore_java.model.Unions.*;
import com.babylonhealth.lit.hl7.REQUEST_STATUS;
import com.babylonhealth.lit.hl7.CARE_PLAN_INTENT;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class Us_core_careplanBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta =
      Optional.of(
          new MetaBuilder()
              .withProfile("http://hl7.org/fhir/us/core/StructureDefinition/us-core-careplan")
              .build());
  private Collection<Reference> goal = Collections.emptyList();
  private Collection<Annotation> note = Collections.emptyList();
  private Optional<String> title = Optional.empty();
  private Collection<Reference> partOf = Collections.emptyList();
  private REQUEST_STATUS status;
  private CARE_PLAN_INTENT intent;
  private Optional<Period> period = Optional.empty();
  private Optional<Reference> author = Optional.empty();
  private Collection<Reference> basedOn = Collections.emptyList();
  private Reference subject;
  private Optional<FHIRDateTime> created = Optional.empty();
  private Optional<LANGUAGES> language = Optional.empty();
  private Collection<Reference> replaces = Collections.emptyList();
  private Collection<CodeableConcept> category;
  private Collection<Reference> careTeam = Collections.emptyList();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Reference> encounter = Optional.empty();
  private Collection<Reference> addresses = Collections.emptyList();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Optional<String> description = Optional.empty();
  private Collection<Reference> contributor = Collections.emptyList();
  private Optional<String> implicitRules = Optional.empty();
  private Narrative text;
  private Collection<Reference> supportingInfo = Collections.emptyList();
  private Collection<String> instantiatesUri = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<String> instantiatesCanonical = Collections.emptyList();
  private Collection<CarePlan.Activity> activity = Collections.emptyList();

  /**
   * Required fields for {@link Us_core_careplan}
   *
   * @param status - Indicates whether the plan is currently being acted upon, represents future
   *     intentions or is now a historical record.
   * @param intent - Indicates the level of authority/intentionality associated with the care plan
   *     and where the care plan fits into the workflow chain.
   * @param subject - Who care plan is for.
   * @param category - Type of plan.
   * @param text - A human-readable narrative that contains a summary of the resource and can be
   *     used to represent the content of the resource to a human. The narrative need not encode all
   *     the structured data, but is required to contain sufficient detail to make it "clinically
   *     safe" for a human to just read the narrative. Resource definitions may define what content
   *     should be represented in the narrative to ensure clinical safety.
   */
  public Us_core_careplanBuilder(
      REQUEST_STATUS status,
      CARE_PLAN_INTENT intent,
      Reference subject,
      Collection<CodeableConcept> category,
      Narrative text) {
    this.status = status;
    this.intent = intent;
    this.subject = subject;
    this.category = category;
    this.text = text;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public Us_core_careplanBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public Us_core_careplanBuilder withMeta(@NonNull Meta meta) {
    this.meta = Optional.of(meta);
    return this;
  }
  /** @param goal - Describes the intended objective(s) of carrying out the care plan. */
  public Us_core_careplanBuilder withGoal(@NonNull Reference... goal) {
    this.goal = Arrays.asList(goal);
    return this;
  }
  /** @param goal - Describes the intended objective(s) of carrying out the care plan. */
  public Us_core_careplanBuilder withGoal(@NonNull Collection<Reference> goal) {
    this.goal = Collections.unmodifiableCollection(goal);
    return this;
  }
  /** @param note - General notes about the care plan not covered elsewhere. */
  public Us_core_careplanBuilder withNote(@NonNull Annotation... note) {
    this.note = Arrays.asList(note);
    return this;
  }
  /** @param note - General notes about the care plan not covered elsewhere. */
  public Us_core_careplanBuilder withNote(@NonNull Collection<Annotation> note) {
    this.note = Collections.unmodifiableCollection(note);
    return this;
  }
  /** @param title - Human-friendly name for the care plan. */
  public Us_core_careplanBuilder withTitle(@NonNull String title) {
    this.title = Optional.of(title);
    return this;
  }
  /**
   * @param partOf - A larger care plan of which this particular care plan is a component or step.
   */
  public Us_core_careplanBuilder withPartOf(@NonNull Reference... partOf) {
    this.partOf = Arrays.asList(partOf);
    return this;
  }
  /**
   * @param partOf - A larger care plan of which this particular care plan is a component or step.
   */
  public Us_core_careplanBuilder withPartOf(@NonNull Collection<Reference> partOf) {
    this.partOf = Collections.unmodifiableCollection(partOf);
    return this;
  }
  /** @param period - Indicates when the plan did (or is intended to) come into effect and end. */
  public Us_core_careplanBuilder withPeriod(@NonNull Period period) {
    this.period = Optional.of(period);
    return this;
  }
  /**
   * @param author - When populated, the author is responsible for the care plan. The care plan is
   *     attributed to the author.
   */
  public Us_core_careplanBuilder withAuthor(@NonNull Reference author) {
    this.author = Optional.of(author);
    return this;
  }
  /** @param basedOn - A care plan that is fulfilled in whole or in part by this care plan. */
  public Us_core_careplanBuilder withBasedOn(@NonNull Reference... basedOn) {
    this.basedOn = Arrays.asList(basedOn);
    return this;
  }
  /** @param basedOn - A care plan that is fulfilled in whole or in part by this care plan. */
  public Us_core_careplanBuilder withBasedOn(@NonNull Collection<Reference> basedOn) {
    this.basedOn = Collections.unmodifiableCollection(basedOn);
    return this;
  }
  /**
   * @param created - Represents when this particular CarePlan record was created in the system,
   *     which is often a system-generated date.
   */
  public Us_core_careplanBuilder withCreated(@NonNull FHIRDateTime created) {
    this.created = Optional.of(created);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public Us_core_careplanBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param replaces - Completed or terminated care plan whose function is taken by this new care
   *     plan.
   */
  public Us_core_careplanBuilder withReplaces(@NonNull Reference... replaces) {
    this.replaces = Arrays.asList(replaces);
    return this;
  }
  /**
   * @param replaces - Completed or terminated care plan whose function is taken by this new care
   *     plan.
   */
  public Us_core_careplanBuilder withReplaces(@NonNull Collection<Reference> replaces) {
    this.replaces = Collections.unmodifiableCollection(replaces);
    return this;
  }
  /**
   * @param careTeam - Identifies all people and organizations who are expected to be involved in
   *     the care envisioned by this plan.
   */
  public Us_core_careplanBuilder withCareTeam(@NonNull Reference... careTeam) {
    this.careTeam = Arrays.asList(careTeam);
    return this;
  }
  /**
   * @param careTeam - Identifies all people and organizations who are expected to be involved in
   *     the care envisioned by this plan.
   */
  public Us_core_careplanBuilder withCareTeam(@NonNull Collection<Reference> careTeam) {
    this.careTeam = Collections.unmodifiableCollection(careTeam);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public Us_core_careplanBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public Us_core_careplanBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public Us_core_careplanBuilder withExtension(@NonNull Extension... extension) {
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
  public Us_core_careplanBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param encounter - The Encounter during which this CarePlan was created or to which the
   *     creation of this record is tightly associated.
   */
  public Us_core_careplanBuilder withEncounter(@NonNull Reference encounter) {
    this.encounter = Optional.of(encounter);
    return this;
  }
  /**
   * @param addresses - Identifies the conditions/problems/concerns/diagnoses/etc. whose management
   *     and/or mitigation are handled by this plan.
   */
  public Us_core_careplanBuilder withAddresses(@NonNull Reference... addresses) {
    this.addresses = Arrays.asList(addresses);
    return this;
  }
  /**
   * @param addresses - Identifies the conditions/problems/concerns/diagnoses/etc. whose management
   *     and/or mitigation are handled by this plan.
   */
  public Us_core_careplanBuilder withAddresses(@NonNull Collection<Reference> addresses) {
    this.addresses = Collections.unmodifiableCollection(addresses);
    return this;
  }
  /**
   * @param identifier - Business identifiers assigned to this care plan by the performer or other
   *     systems which remain constant as the resource is updated and propagates from server to
   *     server.
   */
  public Us_core_careplanBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /**
   * @param identifier - Business identifiers assigned to this care plan by the performer or other
   *     systems which remain constant as the resource is updated and propagates from server to
   *     server.
   */
  public Us_core_careplanBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /** @param description - A description of the scope and nature of the plan. */
  public Us_core_careplanBuilder withDescription(@NonNull String description) {
    this.description = Optional.of(description);
    return this;
  }
  /**
   * @param contributor - Identifies the individual(s) or organization who provided the contents of
   *     the care plan.
   */
  public Us_core_careplanBuilder withContributor(@NonNull Reference... contributor) {
    this.contributor = Arrays.asList(contributor);
    return this;
  }
  /**
   * @param contributor - Identifies the individual(s) or organization who provided the contents of
   *     the care plan.
   */
  public Us_core_careplanBuilder withContributor(@NonNull Collection<Reference> contributor) {
    this.contributor = Collections.unmodifiableCollection(contributor);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public Us_core_careplanBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param supportingInfo - Identifies portions of the patient's record that specifically
   *     influenced the formation of the plan. These might include comorbidities, recent procedures,
   *     limitations, recent assessments, etc.
   */
  public Us_core_careplanBuilder withSupportingInfo(@NonNull Reference... supportingInfo) {
    this.supportingInfo = Arrays.asList(supportingInfo);
    return this;
  }
  /**
   * @param supportingInfo - Identifies portions of the patient's record that specifically
   *     influenced the formation of the plan. These might include comorbidities, recent procedures,
   *     limitations, recent assessments, etc.
   */
  public Us_core_careplanBuilder withSupportingInfo(@NonNull Collection<Reference> supportingInfo) {
    this.supportingInfo = Collections.unmodifiableCollection(supportingInfo);
    return this;
  }
  /**
   * @param instantiatesUri - The URL pointing to an externally maintained protocol, guideline,
   *     questionnaire or other definition that is adhered to in whole or in part by this CarePlan.
   */
  public Us_core_careplanBuilder withInstantiatesUri(@NonNull String... instantiatesUri) {
    this.instantiatesUri = Arrays.asList(instantiatesUri);
    return this;
  }
  /**
   * @param instantiatesUri - The URL pointing to an externally maintained protocol, guideline,
   *     questionnaire or other definition that is adhered to in whole or in part by this CarePlan.
   */
  public Us_core_careplanBuilder withInstantiatesUri(@NonNull Collection<String> instantiatesUri) {
    this.instantiatesUri = Collections.unmodifiableCollection(instantiatesUri);
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
  public Us_core_careplanBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public Us_core_careplanBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param instantiatesCanonical - The URL pointing to a FHIR-defined protocol, guideline,
   *     questionnaire or other definition that is adhered to in whole or in part by this CarePlan.
   */
  public Us_core_careplanBuilder withInstantiatesCanonical(
      @NonNull String... instantiatesCanonical) {
    this.instantiatesCanonical = Arrays.asList(instantiatesCanonical);
    return this;
  }
  /**
   * @param instantiatesCanonical - The URL pointing to a FHIR-defined protocol, guideline,
   *     questionnaire or other definition that is adhered to in whole or in part by this CarePlan.
   */
  public Us_core_careplanBuilder withInstantiatesCanonical(
      @NonNull Collection<String> instantiatesCanonical) {
    this.instantiatesCanonical = Collections.unmodifiableCollection(instantiatesCanonical);
    return this;
  }
  /**
   * @param activity - Identifies a planned action to occur as part of the plan. For example, a
   *     medication to be used, lab tests to perform, self-monitoring, education, etc.
   */
  public Us_core_careplanBuilder withActivity(@NonNull CarePlan.Activity... activity) {
    this.activity = Arrays.asList(activity);
    return this;
  }
  /**
   * @param activity - Identifies a planned action to occur as part of the plan. For example, a
   *     medication to be used, lab tests to perform, self-monitoring, education, etc.
   */
  public Us_core_careplanBuilder withActivity(@NonNull Collection<CarePlan.Activity> activity) {
    this.activity = Collections.unmodifiableCollection(activity);
    return this;
  }

  public Us_core_careplanBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public Us_core_careplan build() {
    return new Us_core_careplan(
        (Option) OptionConverters.toScala(id),
        (Option) OptionConverters.toScala(meta),
        goal.stream().collect(new LitSeqJCollector<>()),
        note.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(title),
        partOf.stream().collect(new LitSeqJCollector<>()),
        status,
        intent,
        (Option) OptionConverters.toScala(period),
        (Option) OptionConverters.toScala(author),
        basedOn.stream().collect(new LitSeqJCollector<>()),
        subject,
        (Option) OptionConverters.toScala(created),
        (Option) OptionConverters.toScala(language),
        replaces.stream().collect(new LitSeqJCollector<>()),
        category.stream().collect(new NonEmptyLitSeqJCollector<>()),
        careTeam.stream().collect(new LitSeqJCollector<>()),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(encounter),
        addresses.stream().collect(new LitSeqJCollector<>()),
        identifier.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(description),
        contributor.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(implicitRules),
        text,
        supportingInfo.stream().collect(new LitSeqJCollector<>()),
        instantiatesUri.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        instantiatesCanonical.stream().collect(new LitSeqJCollector<>()),
        activity.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
