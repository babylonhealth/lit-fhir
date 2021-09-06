package com.babylonhealth.lit.usbase_java.builders;

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
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.usbase_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import com.babylonhealth.lit.hl7.PUBLICATION_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface ComputableplandefinitionBuilder extends PlanDefinitionBuilder {
  public Computableplandefinition build();

  public static Impl init(PUBLICATION_STATUS status, String library) {
    return new Impl(status, library);
  }

  public static Impl builder(PUBLICATION_STATUS status, String library) {
    return new Impl(status, library);
  }

  public static Choice01025009075 subject(CodeableConcept c) {
    return new Choice01025009075(c);
  }

  public static Choice01025009075 subject(Reference r) {
    return new Choice01025009075(r);
  }

  public class Impl implements ComputableplandefinitionBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> url = Optional.empty();
    private Optional<Meta> meta =
        Optional.of(
            MetaBuilder.init()
                .withProfile("http://hl7.org/fhir/StructureDefinition/computableplandefinition")
                .build());
    private Optional<Narrative> text = Optional.empty();
    private Optional<String> name = Optional.empty();
    private Optional<CodeableConcept> _type = Optional.empty();
    private Optional<FHIRDateTime> date = Optional.empty();
    private Optional<String> title = Optional.empty();
    private Optional<String> usage = Optional.empty();
    private Collection<CodeableConcept> topic = Collections.emptyList();
    private PUBLICATION_STATUS status;
    private Collection<ContactDetail> author = Collections.emptyList();
    private Collection<ContactDetail> editor = Collections.emptyList();
    private Optional<String> version = Optional.empty();
    private Collection<ContactDetail> contact = Collections.emptyList();
    private Optional<String> purpose = Optional.empty();
    private String library;
    private Optional<LANGUAGES> language = Optional.empty();
    private Optional<String> subtitle = Optional.empty();
    private Collection<ContactDetail> reviewer = Collections.emptyList();
    private Collection<ContactDetail> endorser = Collections.emptyList();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> publisher = Optional.empty();
    private Optional<String> copyright = Optional.empty();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<Choice01025009075> subject = Optional.empty();
    private Collection<UsageContext> useContext = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Optional<Boolean> experimental = Optional.empty();
    private Collection<CodeableConcept> jurisdiction = Collections.emptyList();
    private Optional<FHIRDate> approvalDate = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<FHIRDate> lastReviewDate = Optional.empty();
    private Optional<Period> effectivePeriod = Optional.empty();
    private Collection<RelatedArtifact> relatedArtifact = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<PlanDefinition.Goal> goal = Collections.emptyList();
    private Collection<PlanDefinition.Action> action = Collections.emptyList();

    /**
     * Required fields for {@link Computableplandefinition}
     *
     * @param status - The status of this plan definition. Enables tracking the life-cycle of the
     *     content.
     * @param library - A reference to a Library resource containing any formal logic used by the
     *     plan definition.
     */
    public Impl(PUBLICATION_STATUS status, String library) {
      this.status = status;
      this.library = library;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ComputableplandefinitionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param url - An absolute URI that is used to identify this plan definition when it is
     *     referenced in a specification, model, design or an instance; also called its canonical
     *     identifier. This SHOULD be globally unique and SHOULD be a literal address at which at
     *     which an authoritative instance of this plan definition is (or will be) published. This
     *     URL can be the target of a canonical reference. It SHALL remain the same when the plan
     *     definition is stored on different servers.
     */
    public ComputableplandefinitionBuilder.Impl withUrl(@NonNull String url) {
      this.url = Optional.of(url);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public ComputableplandefinitionBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }
    /**
     * @param text - A human-readable narrative that contains a summary of the resource and can be
     *     used to represent the content of the resource to a human. The narrative need not encode
     *     all the structured data, but is required to contain sufficient detail to make it
     *     "clinically safe" for a human to just read the narrative. Resource definitions may define
     *     what content should be represented in the narrative to ensure clinical safety.
     */
    public ComputableplandefinitionBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }
    /**
     * @param name - A natural language name identifying the plan definition. This name should be
     *     usable as an identifier for the module by machine processing applications such as code
     *     generation.
     */
    public ComputableplandefinitionBuilder.Impl withName(@NonNull String name) {
      this.name = Optional.of(name);
      return this;
    }
    /**
     * @param _type - A high-level category for the plan definition that distinguishes the kinds of
     *     systems that would be interested in the plan definition.
     */
    public ComputableplandefinitionBuilder.Impl withType(@NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }
    /**
     * @param date - The date (and optionally time) when the plan definition was published. The date
     *     must change when the business version changes and it must change if the status code
     *     changes. In addition, it should change when the substantive content of the plan
     *     definition changes.
     */
    public ComputableplandefinitionBuilder.Impl withDate(@NonNull FHIRDateTime date) {
      this.date = Optional.of(date);
      return this;
    }
    /** @param title - A short, descriptive, user-friendly title for the plan definition. */
    public ComputableplandefinitionBuilder.Impl withTitle(@NonNull String title) {
      this.title = Optional.of(title);
      return this;
    }
    /**
     * @param usage - A detailed description of how the plan definition is used from a clinical
     *     perspective.
     */
    public ComputableplandefinitionBuilder.Impl withUsage(@NonNull String usage) {
      this.usage = Optional.of(usage);
      return this;
    }
    /**
     * @param topic - Descriptive topics related to the content of the plan definition. Topics
     *     provide a high-level categorization of the definition that can be useful for filtering
     *     and searching.
     */
    public ComputableplandefinitionBuilder.Impl withTopic(@NonNull CodeableConcept... topic) {
      this.topic = Arrays.asList(topic);
      return this;
    }
    /**
     * @param topic - Descriptive topics related to the content of the plan definition. Topics
     *     provide a high-level categorization of the definition that can be useful for filtering
     *     and searching.
     */
    public ComputableplandefinitionBuilder.Impl withTopic(
        @NonNull Collection<CodeableConcept> topic) {
      this.topic = Collections.unmodifiableCollection(topic);
      return this;
    }
    /**
     * @param author - An individiual or organization primarily involved in the creation and
     *     maintenance of the content.
     */
    public ComputableplandefinitionBuilder.Impl withAuthor(@NonNull ContactDetail... author) {
      this.author = Arrays.asList(author);
      return this;
    }
    /**
     * @param author - An individiual or organization primarily involved in the creation and
     *     maintenance of the content.
     */
    public ComputableplandefinitionBuilder.Impl withAuthor(
        @NonNull Collection<ContactDetail> author) {
      this.author = Collections.unmodifiableCollection(author);
      return this;
    }
    /**
     * @param editor - An individual or organization primarily responsible for internal coherence of
     *     the content.
     */
    public ComputableplandefinitionBuilder.Impl withEditor(@NonNull ContactDetail... editor) {
      this.editor = Arrays.asList(editor);
      return this;
    }
    /**
     * @param editor - An individual or organization primarily responsible for internal coherence of
     *     the content.
     */
    public ComputableplandefinitionBuilder.Impl withEditor(
        @NonNull Collection<ContactDetail> editor) {
      this.editor = Collections.unmodifiableCollection(editor);
      return this;
    }
    /**
     * @param version - The identifier that is used to identify this version of the plan definition
     *     when it is referenced in a specification, model, design or instance. This is an arbitrary
     *     value managed by the plan definition author and is not expected to be globally unique.
     *     For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not
     *     available. There is also no expectation that versions can be placed in a lexicographical
     *     sequence. To provide a version consistent with the Decision Support Service
     *     specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on
     *     versioning knowledge assets, refer to the Decision Support Service specification. Note
     *     that a version is required for non-experimental active artifacts.
     */
    public ComputableplandefinitionBuilder.Impl withVersion(@NonNull String version) {
      this.version = Optional.of(version);
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in finding and communicating with the
     *     publisher.
     */
    public ComputableplandefinitionBuilder.Impl withContact(@NonNull ContactDetail... contact) {
      this.contact = Arrays.asList(contact);
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in finding and communicating with the
     *     publisher.
     */
    public ComputableplandefinitionBuilder.Impl withContact(
        @NonNull Collection<ContactDetail> contact) {
      this.contact = Collections.unmodifiableCollection(contact);
      return this;
    }
    /**
     * @param purpose - Explanation of why this plan definition is needed and why it has been
     *     designed as it has.
     */
    public ComputableplandefinitionBuilder.Impl withPurpose(@NonNull String purpose) {
      this.purpose = Optional.of(purpose);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public ComputableplandefinitionBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param subtitle - An explanatory or alternate title for the plan definition giving additional
     *     information about its content.
     */
    public ComputableplandefinitionBuilder.Impl withSubtitle(@NonNull String subtitle) {
      this.subtitle = Optional.of(subtitle);
      return this;
    }
    /**
     * @param reviewer - An individual or organization primarily responsible for review of some
     *     aspect of the content.
     */
    public ComputableplandefinitionBuilder.Impl withReviewer(@NonNull ContactDetail... reviewer) {
      this.reviewer = Arrays.asList(reviewer);
      return this;
    }
    /**
     * @param reviewer - An individual or organization primarily responsible for review of some
     *     aspect of the content.
     */
    public ComputableplandefinitionBuilder.Impl withReviewer(
        @NonNull Collection<ContactDetail> reviewer) {
      this.reviewer = Collections.unmodifiableCollection(reviewer);
      return this;
    }
    /**
     * @param endorser - An individual or organization responsible for officially endorsing the
     *     content for use in some setting.
     */
    public ComputableplandefinitionBuilder.Impl withEndorser(@NonNull ContactDetail... endorser) {
      this.endorser = Arrays.asList(endorser);
      return this;
    }
    /**
     * @param endorser - An individual or organization responsible for officially endorsing the
     *     content for use in some setting.
     */
    public ComputableplandefinitionBuilder.Impl withEndorser(
        @NonNull Collection<ContactDetail> endorser) {
      this.endorser = Collections.unmodifiableCollection(endorser);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public ComputableplandefinitionBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public ComputableplandefinitionBuilder.Impl withContained(
        @NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ComputableplandefinitionBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ComputableplandefinitionBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }
    /**
     * @param publisher - The name of the organization or individual that published the plan
     *     definition.
     */
    public ComputableplandefinitionBuilder.Impl withPublisher(@NonNull String publisher) {
      this.publisher = Optional.of(publisher);
      return this;
    }
    /**
     * @param copyright - A copyright statement relating to the plan definition and/or its contents.
     *     Copyright statements are generally legal restrictions on the use and publishing of the
     *     plan definition.
     */
    public ComputableplandefinitionBuilder.Impl withCopyright(@NonNull String copyright) {
      this.copyright = Optional.of(copyright);
      return this;
    }
    /**
     * @param identifier - A formal identifier that is used to identify this plan definition when it
     *     is represented in other formats, or referenced in a specification, model, design or an
     *     instance.
     */
    public ComputableplandefinitionBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - A formal identifier that is used to identify this plan definition when it
     *     is represented in other formats, or referenced in a specification, model, design or an
     *     instance.
     */
    public ComputableplandefinitionBuilder.Impl withIdentifier(
        @NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }
    /**
     * @param subject - A code or group definition that describes the intended subject of the plan
     *     definition. Field is a 'choice' field. Type should be one of CodeableConcept, Reference.
     *     To pass the value in, wrap with one of the ComputableplandefinitionBuilder.subject static
     *     methods
     */
    public ComputableplandefinitionBuilder.Impl withSubject(@NonNull Choice01025009075 subject) {
      this.subject = Optional.of(subject);
      return this;
    }
    /**
     * @param useContext - The content was developed with a focus and intent of supporting the
     *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
     *     may be references to specific programs (insurance plans, studies, ...) and may be used to
     *     assist with indexing and searching for appropriate plan definition instances.
     */
    public ComputableplandefinitionBuilder.Impl withUseContext(
        @NonNull UsageContext... useContext) {
      this.useContext = Arrays.asList(useContext);
      return this;
    }
    /**
     * @param useContext - The content was developed with a focus and intent of supporting the
     *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
     *     may be references to specific programs (insurance plans, studies, ...) and may be used to
     *     assist with indexing and searching for appropriate plan definition instances.
     */
    public ComputableplandefinitionBuilder.Impl withUseContext(
        @NonNull Collection<UsageContext> useContext) {
      this.useContext = Collections.unmodifiableCollection(useContext);
      return this;
    }
    /**
     * @param description - A free text natural language description of the plan definition from a
     *     consumer's perspective.
     */
    public ComputableplandefinitionBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /**
     * @param experimental - A Boolean value to indicate that this plan definition is authored for
     *     testing purposes (or education/evaluation/marketing) and is not intended to be used for
     *     genuine usage.
     */
    public ComputableplandefinitionBuilder.Impl withExperimental(@NonNull Boolean experimental) {
      this.experimental = Optional.of(experimental);
      return this;
    }
    /**
     * @param jurisdiction - A legal or geographic region in which the plan definition is intended
     *     to be used.
     */
    public ComputableplandefinitionBuilder.Impl withJurisdiction(
        @NonNull CodeableConcept... jurisdiction) {
      this.jurisdiction = Arrays.asList(jurisdiction);
      return this;
    }
    /**
     * @param jurisdiction - A legal or geographic region in which the plan definition is intended
     *     to be used.
     */
    public ComputableplandefinitionBuilder.Impl withJurisdiction(
        @NonNull Collection<CodeableConcept> jurisdiction) {
      this.jurisdiction = Collections.unmodifiableCollection(jurisdiction);
      return this;
    }
    /**
     * @param approvalDate - The date on which the resource content was approved by the publisher.
     *     Approval happens once when the content is officially approved for usage.
     */
    public ComputableplandefinitionBuilder.Impl withApprovalDate(@NonNull FHIRDate approvalDate) {
      this.approvalDate = Optional.of(approvalDate);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public ComputableplandefinitionBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param lastReviewDate - The date on which the resource content was last reviewed. Review
     *     happens periodically after approval but does not change the original approval date.
     */
    public ComputableplandefinitionBuilder.Impl withLastReviewDate(
        @NonNull FHIRDate lastReviewDate) {
      this.lastReviewDate = Optional.of(lastReviewDate);
      return this;
    }
    /**
     * @param effectivePeriod - The period during which the plan definition content was or is
     *     planned to be in active use.
     */
    public ComputableplandefinitionBuilder.Impl withEffectivePeriod(
        @NonNull Period effectivePeriod) {
      this.effectivePeriod = Optional.of(effectivePeriod);
      return this;
    }
    /**
     * @param relatedArtifact - Related artifacts such as additional documentation, justification,
     *     or bibliographic references.
     */
    public ComputableplandefinitionBuilder.Impl withRelatedArtifact(
        @NonNull RelatedArtifact... relatedArtifact) {
      this.relatedArtifact = Arrays.asList(relatedArtifact);
      return this;
    }
    /**
     * @param relatedArtifact - Related artifacts such as additional documentation, justification,
     *     or bibliographic references.
     */
    public ComputableplandefinitionBuilder.Impl withRelatedArtifact(
        @NonNull Collection<RelatedArtifact> relatedArtifact) {
      this.relatedArtifact = Collections.unmodifiableCollection(relatedArtifact);
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
    public ComputableplandefinitionBuilder.Impl withModifierExtension(
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
    public ComputableplandefinitionBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }
    /**
     * @param goal - Goals that describe what the activities within the plan are intended to
     *     achieve. For example, weight loss, restoring an activity of daily living, obtaining herd
     *     immunity via immunization, meeting a process improvement objective, etc.
     */
    public ComputableplandefinitionBuilder.Impl withGoal(@NonNull PlanDefinition.Goal... goal) {
      this.goal = Arrays.asList(goal);
      return this;
    }
    /**
     * @param goal - Goals that describe what the activities within the plan are intended to
     *     achieve. For example, weight loss, restoring an activity of daily living, obtaining herd
     *     immunity via immunization, meeting a process improvement objective, etc.
     */
    public ComputableplandefinitionBuilder.Impl withGoal(
        @NonNull Collection<PlanDefinition.Goal> goal) {
      this.goal = Collections.unmodifiableCollection(goal);
      return this;
    }
    /** @param action - An action or group of actions to be taken as part of the plan. */
    public ComputableplandefinitionBuilder.Impl withAction(
        @NonNull PlanDefinition.Action... action) {
      this.action = Arrays.asList(action);
      return this;
    }
    /** @param action - An action or group of actions to be taken as part of the plan. */
    public ComputableplandefinitionBuilder.Impl withAction(
        @NonNull Collection<PlanDefinition.Action> action) {
      this.action = Collections.unmodifiableCollection(action);
      return this;
    }

    public ComputableplandefinitionBuilder withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Computableplandefinition build() {
      return new Computableplandefinition(
          OptionConverters.toScala(id),
          OptionConverters.toScala(url),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(name),
          OptionConverters.toScala(_type),
          OptionConverters.toScala(date),
          OptionConverters.toScala(title),
          OptionConverters.toScala(usage),
          topic.stream().collect(new LitSeqJCollector<>()),
          status,
          author.stream().collect(new LitSeqJCollector<>()),
          editor.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(version),
          contact.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(purpose),
          library,
          OptionConverters.toScala(language),
          OptionConverters.toScala(subtitle),
          reviewer.stream().collect(new LitSeqJCollector<>()),
          endorser.stream().collect(new LitSeqJCollector<>()),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(publisher),
          OptionConverters.toScala(copyright),
          identifier.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(subject),
          useContext.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          OptionConverters.toScala(experimental.map(x -> (Object) x)),
          jurisdiction.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(approvalDate),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(lastReviewDate),
          OptionConverters.toScala(effectivePeriod),
          relatedArtifact.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          goal.stream().collect(new LitSeqJCollector<>()),
          action.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
