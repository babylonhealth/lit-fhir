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
import com.babylonhealth.lit.hl7.REQUEST_RESOURCE_TYPES;
import com.babylonhealth.lit.hl7.PUBLICATION_STATUS;
import com.babylonhealth.lit.hl7.REQUEST_INTENT;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.hl7.REQUEST_PRIORITY;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface ActivityDefinitionBuilder extends DomainResourceBuilder {
  public ActivityDefinition build();

  public static Impl init(PUBLICATION_STATUS status) {
    return new Impl(status);
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

  public static Choice01025009075 subject(CodeableConcept c) {
    return new Choice01025009075(c);
  }

  public static Choice01025009075 subject(Reference r) {
    return new Choice01025009075(r);
  }

  public static Choice01025009075 product(CodeableConcept c) {
    return new Choice01025009075(c);
  }

  public static Choice01025009075 product(Reference r) {
    return new Choice01025009075(r);
  }

  public class Impl implements ActivityDefinitionBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> url = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<String> name = Optional.empty();
    private Optional<FHIRDateTime> date = Optional.empty();
    private Optional<REQUEST_RESOURCE_TYPES> kind = Optional.empty();
    private Optional<CodeableConcept> code = Optional.empty();
    private Optional<String> title = Optional.empty();
    private Optional<String> usage = Optional.empty();
    private Collection<CodeableConcept> topic = Collections.emptyList();
    private PUBLICATION_STATUS status;
    private Collection<ContactDetail> author = Collections.emptyList();
    private Collection<ContactDetail> editor = Collections.emptyList();
    private Optional<REQUEST_INTENT> intent = Optional.empty();
    private Collection<Dosage> dosage = Collections.emptyList();
    private Optional<String> version = Optional.empty();
    private Collection<ContactDetail> contact = Collections.emptyList();
    private Optional<String> purpose = Optional.empty();
    private Collection<String> library = Collections.emptyList();
    private Optional<String> profile = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Optional<String> subtitle = Optional.empty();
    private Collection<ContactDetail> reviewer = Collections.emptyList();
    private Collection<ContactDetail> endorser = Collections.emptyList();
    private Optional<REQUEST_PRIORITY> priority = Optional.empty();
    private Optional<Reference> location = Optional.empty();
    private Optional<Quantity> quantity = Optional.empty();
    private Collection<CodeableConcept> bodySite = Collections.emptyList();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> publisher = Optional.empty();
    private Optional<String> copyright = Optional.empty();
    private Optional<Choice_0181779868> timing = Optional.empty();
    private Optional<String> transform = Optional.empty();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<Choice01025009075> subject = Optional.empty();
    private Collection<UsageContext> useContext = Collections.emptyList();
    private Optional<Choice01025009075> product = Optional.empty();
    private Optional<String> description = Optional.empty();
    private Optional<Boolean> experimental = Optional.empty();
    private Collection<CodeableConcept> jurisdiction = Collections.emptyList();
    private Optional<FHIRDate> approvalDate = Optional.empty();
    private Optional<Boolean> doNotPerform = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<FHIRDate> lastReviewDate = Optional.empty();
    private Optional<Period> effectivePeriod = Optional.empty();
    private Collection<RelatedArtifact> relatedArtifact = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Reference> specimenRequirement = Collections.emptyList();
    private Collection<Reference> observationRequirement = Collections.emptyList();
    private Collection<Reference> observationResultRequirement = Collections.emptyList();
    private Collection<ActivityDefinition.Participant> participant = Collections.emptyList();
    private Collection<ActivityDefinition.DynamicValue> dynamicValue = Collections.emptyList();

    /**
     * Required fields for {@link ActivityDefinition}
     *
     * @param status - The status of this activity definition. Enables tracking the life-cycle of
     *     the content.
     */
    public Impl(PUBLICATION_STATUS status) {
      this.status = status;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ActivityDefinitionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param url - An absolute URI that is used to identify this activity definition when it is
     *     referenced in a specification, model, design or an instance; also called its canonical
     *     identifier. This SHOULD be globally unique and SHOULD be a literal address at which at
     *     which an authoritative instance of this activity definition is (or will be) published.
     *     This URL can be the target of a canonical reference. It SHALL remain the same when the
     *     activity definition is stored on different servers.
     */
    public ActivityDefinitionBuilder.Impl withUrl(@NonNull String url) {
      this.url = Optional.of(url);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public ActivityDefinitionBuilder.Impl withMeta(@NonNull Meta meta) {
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
    public ActivityDefinitionBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }
    /**
     * @param name - A natural language name identifying the activity definition. This name should
     *     be usable as an identifier for the module by machine processing applications such as code
     *     generation.
     */
    public ActivityDefinitionBuilder.Impl withName(@NonNull String name) {
      this.name = Optional.of(name);
      return this;
    }
    /**
     * @param date - The date (and optionally time) when the activity definition was published. The
     *     date must change when the business version changes and it must change if the status code
     *     changes. In addition, it should change when the substantive content of the activity
     *     definition changes.
     */
    public ActivityDefinitionBuilder.Impl withDate(@NonNull FHIRDateTime date) {
      this.date = Optional.of(date);
      return this;
    }
    /**
     * @param kind - A description of the kind of resource the activity definition is representing.
     *     For example, a MedicationRequest, a ServiceRequest, or a CommunicationRequest. Typically,
     *     but not always, this is a Request resource.
     */
    public ActivityDefinitionBuilder.Impl withKind(@NonNull REQUEST_RESOURCE_TYPES kind) {
      this.kind = Optional.of(kind);
      return this;
    }
    /**
     * @param code - Detailed description of the type of activity; e.g. What lab test, what
     *     procedure, what kind of encounter.
     */
    public ActivityDefinitionBuilder.Impl withCode(@NonNull CodeableConcept code) {
      this.code = Optional.of(code);
      return this;
    }
    /** @param title - A short, descriptive, user-friendly title for the activity definition. */
    public ActivityDefinitionBuilder.Impl withTitle(@NonNull String title) {
      this.title = Optional.of(title);
      return this;
    }
    /**
     * @param usage - A detailed description of how the activity definition is used from a clinical
     *     perspective.
     */
    public ActivityDefinitionBuilder.Impl withUsage(@NonNull String usage) {
      this.usage = Optional.of(usage);
      return this;
    }
    /**
     * @param topic - Descriptive topics related to the content of the activity. Topics provide a
     *     high-level categorization of the activity that can be useful for filtering and searching.
     */
    public ActivityDefinitionBuilder.Impl withTopic(@NonNull CodeableConcept... topic) {
      this.topic = Arrays.asList(topic);
      return this;
    }
    /**
     * @param topic - Descriptive topics related to the content of the activity. Topics provide a
     *     high-level categorization of the activity that can be useful for filtering and searching.
     */
    public ActivityDefinitionBuilder.Impl withTopic(@NonNull Collection<CodeableConcept> topic) {
      this.topic = Collections.unmodifiableCollection(topic);
      return this;
    }
    /**
     * @param author - An individiual or organization primarily involved in the creation and
     *     maintenance of the content.
     */
    public ActivityDefinitionBuilder.Impl withAuthor(@NonNull ContactDetail... author) {
      this.author = Arrays.asList(author);
      return this;
    }
    /**
     * @param author - An individiual or organization primarily involved in the creation and
     *     maintenance of the content.
     */
    public ActivityDefinitionBuilder.Impl withAuthor(@NonNull Collection<ContactDetail> author) {
      this.author = Collections.unmodifiableCollection(author);
      return this;
    }
    /**
     * @param editor - An individual or organization primarily responsible for internal coherence of
     *     the content.
     */
    public ActivityDefinitionBuilder.Impl withEditor(@NonNull ContactDetail... editor) {
      this.editor = Arrays.asList(editor);
      return this;
    }
    /**
     * @param editor - An individual or organization primarily responsible for internal coherence of
     *     the content.
     */
    public ActivityDefinitionBuilder.Impl withEditor(@NonNull Collection<ContactDetail> editor) {
      this.editor = Collections.unmodifiableCollection(editor);
      return this;
    }
    /**
     * @param intent - Indicates the level of authority/intentionality associated with the activity
     *     and where the request should fit into the workflow chain.
     */
    public ActivityDefinitionBuilder.Impl withIntent(@NonNull REQUEST_INTENT intent) {
      this.intent = Optional.of(intent);
      return this;
    }
    /**
     * @param dosage - Provides detailed dosage instructions in the same way that they are described
     *     for MedicationRequest resources.
     */
    public ActivityDefinitionBuilder.Impl withDosage(@NonNull Dosage... dosage) {
      this.dosage = Arrays.asList(dosage);
      return this;
    }
    /**
     * @param dosage - Provides detailed dosage instructions in the same way that they are described
     *     for MedicationRequest resources.
     */
    public ActivityDefinitionBuilder.Impl withDosage(@NonNull Collection<Dosage> dosage) {
      this.dosage = Collections.unmodifiableCollection(dosage);
      return this;
    }
    /**
     * @param version - The identifier that is used to identify this version of the activity
     *     definition when it is referenced in a specification, model, design or instance. This is
     *     an arbitrary value managed by the activity definition author and is not expected to be
     *     globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed
     *     version is not available. There is also no expectation that versions can be placed in a
     *     lexicographical sequence. To provide a version consistent with the Decision Support
     *     Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more
     *     information on versioning knowledge assets, refer to the Decision Support Service
     *     specification. Note that a version is required for non-experimental active assets.
     */
    public ActivityDefinitionBuilder.Impl withVersion(@NonNull String version) {
      this.version = Optional.of(version);
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in finding and communicating with the
     *     publisher.
     */
    public ActivityDefinitionBuilder.Impl withContact(@NonNull ContactDetail... contact) {
      this.contact = Arrays.asList(contact);
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in finding and communicating with the
     *     publisher.
     */
    public ActivityDefinitionBuilder.Impl withContact(@NonNull Collection<ContactDetail> contact) {
      this.contact = Collections.unmodifiableCollection(contact);
      return this;
    }
    /**
     * @param purpose - Explanation of why this activity definition is needed and why it has been
     *     designed as it has.
     */
    public ActivityDefinitionBuilder.Impl withPurpose(@NonNull String purpose) {
      this.purpose = Optional.of(purpose);
      return this;
    }
    /**
     * @param library - A reference to a Library resource containing any formal logic used by the
     *     activity definition.
     */
    public ActivityDefinitionBuilder.Impl withLibrary(@NonNull String... library) {
      this.library = Arrays.asList(library);
      return this;
    }
    /**
     * @param library - A reference to a Library resource containing any formal logic used by the
     *     activity definition.
     */
    public ActivityDefinitionBuilder.Impl withLibrary(@NonNull Collection<String> library) {
      this.library = Collections.unmodifiableCollection(library);
      return this;
    }
    /**
     * @param profile - A profile to which the target of the activity definition is expected to
     *     conform.
     */
    public ActivityDefinitionBuilder.Impl withProfile(@NonNull String profile) {
      this.profile = Optional.of(profile);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public ActivityDefinitionBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param subtitle - An explanatory or alternate title for the activity definition giving
     *     additional information about its content.
     */
    public ActivityDefinitionBuilder.Impl withSubtitle(@NonNull String subtitle) {
      this.subtitle = Optional.of(subtitle);
      return this;
    }
    /**
     * @param reviewer - An individual or organization primarily responsible for review of some
     *     aspect of the content.
     */
    public ActivityDefinitionBuilder.Impl withReviewer(@NonNull ContactDetail... reviewer) {
      this.reviewer = Arrays.asList(reviewer);
      return this;
    }
    /**
     * @param reviewer - An individual or organization primarily responsible for review of some
     *     aspect of the content.
     */
    public ActivityDefinitionBuilder.Impl withReviewer(
        @NonNull Collection<ContactDetail> reviewer) {
      this.reviewer = Collections.unmodifiableCollection(reviewer);
      return this;
    }
    /**
     * @param endorser - An individual or organization responsible for officially endorsing the
     *     content for use in some setting.
     */
    public ActivityDefinitionBuilder.Impl withEndorser(@NonNull ContactDetail... endorser) {
      this.endorser = Arrays.asList(endorser);
      return this;
    }
    /**
     * @param endorser - An individual or organization responsible for officially endorsing the
     *     content for use in some setting.
     */
    public ActivityDefinitionBuilder.Impl withEndorser(
        @NonNull Collection<ContactDetail> endorser) {
      this.endorser = Collections.unmodifiableCollection(endorser);
      return this;
    }
    /**
     * @param priority - Indicates how quickly the activity should be addressed with respect to
     *     other requests.
     */
    public ActivityDefinitionBuilder.Impl withPriority(@NonNull REQUEST_PRIORITY priority) {
      this.priority = Optional.of(priority);
      return this;
    }
    /**
     * @param location - Identifies the facility where the activity will occur; e.g. home, hospital,
     *     specific clinic, etc.
     */
    public ActivityDefinitionBuilder.Impl withLocation(@NonNull Reference location) {
      this.location = Optional.of(location);
      return this;
    }
    /**
     * @param quantity - Identifies the quantity expected to be consumed at once (per dose, per
     *     meal, etc.).
     */
    public ActivityDefinitionBuilder.Impl withQuantity(@NonNull Quantity quantity) {
      this.quantity = Optional.of(quantity);
      return this;
    }
    /**
     * @param bodySite - Indicates the sites on the subject's body where the procedure should be
     *     performed (I.e. the target sites).
     */
    public ActivityDefinitionBuilder.Impl withBodySite(@NonNull CodeableConcept... bodySite) {
      this.bodySite = Arrays.asList(bodySite);
      return this;
    }
    /**
     * @param bodySite - Indicates the sites on the subject's body where the procedure should be
     *     performed (I.e. the target sites).
     */
    public ActivityDefinitionBuilder.Impl withBodySite(
        @NonNull Collection<CodeableConcept> bodySite) {
      this.bodySite = Collections.unmodifiableCollection(bodySite);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public ActivityDefinitionBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public ActivityDefinitionBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
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
    public ActivityDefinitionBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ActivityDefinitionBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }
    /**
     * @param publisher - The name of the organization or individual that published the activity
     *     definition.
     */
    public ActivityDefinitionBuilder.Impl withPublisher(@NonNull String publisher) {
      this.publisher = Optional.of(publisher);
      return this;
    }
    /**
     * @param copyright - A copyright statement relating to the activity definition and/or its
     *     contents. Copyright statements are generally legal restrictions on the use and publishing
     *     of the activity definition.
     */
    public ActivityDefinitionBuilder.Impl withCopyright(@NonNull String copyright) {
      this.copyright = Optional.of(copyright);
      return this;
    }
    /**
     * @param timing - The period, timing or frequency upon which the described activity is to
     *     occur. Field is a 'choice' field. Type should be one of Age, Duration, FHIRDateTime,
     *     Period, Range, Timing. To pass the value in, wrap with one of the
     *     ActivityDefinitionBuilder.timing static methods
     */
    public ActivityDefinitionBuilder.Impl withTiming(@NonNull Choice_0181779868 timing) {
      this.timing = Optional.of(timing);
      return this;
    }
    /**
     * @param transform - A reference to a StructureMap resource that defines a transform that can
     *     be executed to produce the intent resource using the ActivityDefinition instance as the
     *     input.
     */
    public ActivityDefinitionBuilder.Impl withTransform(@NonNull String transform) {
      this.transform = Optional.of(transform);
      return this;
    }
    /**
     * @param identifier - A formal identifier that is used to identify this activity definition
     *     when it is represented in other formats, or referenced in a specification, model, design
     *     or an instance.
     */
    public ActivityDefinitionBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - A formal identifier that is used to identify this activity definition
     *     when it is represented in other formats, or referenced in a specification, model, design
     *     or an instance.
     */
    public ActivityDefinitionBuilder.Impl withIdentifier(
        @NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }
    /**
     * @param subject - A code or group definition that describes the intended subject of the
     *     activity being defined. Field is a 'choice' field. Type should be one of CodeableConcept,
     *     Reference. To pass the value in, wrap with one of the ActivityDefinitionBuilder.subject
     *     static methods
     */
    public ActivityDefinitionBuilder.Impl withSubject(@NonNull Choice01025009075 subject) {
      this.subject = Optional.of(subject);
      return this;
    }
    /**
     * @param useContext - The content was developed with a focus and intent of supporting the
     *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
     *     may be references to specific programs (insurance plans, studies, ...) and may be used to
     *     assist with indexing and searching for appropriate activity definition instances.
     */
    public ActivityDefinitionBuilder.Impl withUseContext(@NonNull UsageContext... useContext) {
      this.useContext = Arrays.asList(useContext);
      return this;
    }
    /**
     * @param useContext - The content was developed with a focus and intent of supporting the
     *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
     *     may be references to specific programs (insurance plans, studies, ...) and may be used to
     *     assist with indexing and searching for appropriate activity definition instances.
     */
    public ActivityDefinitionBuilder.Impl withUseContext(
        @NonNull Collection<UsageContext> useContext) {
      this.useContext = Collections.unmodifiableCollection(useContext);
      return this;
    }
    /**
     * @param product - Identifies the food, drug or other product being consumed or supplied in the
     *     activity. Field is a 'choice' field. Type should be one of CodeableConcept, Reference. To
     *     pass the value in, wrap with one of the ActivityDefinitionBuilder.product static methods
     */
    public ActivityDefinitionBuilder.Impl withProduct(@NonNull Choice01025009075 product) {
      this.product = Optional.of(product);
      return this;
    }
    /**
     * @param description - A free text natural language description of the activity definition from
     *     a consumer's perspective.
     */
    public ActivityDefinitionBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /**
     * @param experimental - A Boolean value to indicate that this activity definition is authored
     *     for testing purposes (or education/evaluation/marketing) and is not intended to be used
     *     for genuine usage.
     */
    public ActivityDefinitionBuilder.Impl withExperimental(@NonNull Boolean experimental) {
      this.experimental = Optional.of(experimental);
      return this;
    }
    /**
     * @param jurisdiction - A legal or geographic region in which the activity definition is
     *     intended to be used.
     */
    public ActivityDefinitionBuilder.Impl withJurisdiction(
        @NonNull CodeableConcept... jurisdiction) {
      this.jurisdiction = Arrays.asList(jurisdiction);
      return this;
    }
    /**
     * @param jurisdiction - A legal or geographic region in which the activity definition is
     *     intended to be used.
     */
    public ActivityDefinitionBuilder.Impl withJurisdiction(
        @NonNull Collection<CodeableConcept> jurisdiction) {
      this.jurisdiction = Collections.unmodifiableCollection(jurisdiction);
      return this;
    }
    /**
     * @param approvalDate - The date on which the resource content was approved by the publisher.
     *     Approval happens once when the content is officially approved for usage.
     */
    public ActivityDefinitionBuilder.Impl withApprovalDate(@NonNull FHIRDate approvalDate) {
      this.approvalDate = Optional.of(approvalDate);
      return this;
    }
    /**
     * @param doNotPerform - Set this to true if the definition is to indicate that a particular
     *     activity should NOT be performed. If true, this element should be interpreted to
     *     reinforce a negative coding. For example NPO as a code with a doNotPerform of true would
     *     still indicate to NOT perform the action.
     */
    public ActivityDefinitionBuilder.Impl withDoNotPerform(@NonNull Boolean doNotPerform) {
      this.doNotPerform = Optional.of(doNotPerform);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public ActivityDefinitionBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param lastReviewDate - The date on which the resource content was last reviewed. Review
     *     happens periodically after approval but does not change the original approval date.
     */
    public ActivityDefinitionBuilder.Impl withLastReviewDate(@NonNull FHIRDate lastReviewDate) {
      this.lastReviewDate = Optional.of(lastReviewDate);
      return this;
    }
    /**
     * @param effectivePeriod - The period during which the activity definition content was or is
     *     planned to be in active use.
     */
    public ActivityDefinitionBuilder.Impl withEffectivePeriod(@NonNull Period effectivePeriod) {
      this.effectivePeriod = Optional.of(effectivePeriod);
      return this;
    }
    /**
     * @param relatedArtifact - Related artifacts such as additional documentation, justification,
     *     or bibliographic references.
     */
    public ActivityDefinitionBuilder.Impl withRelatedArtifact(
        @NonNull RelatedArtifact... relatedArtifact) {
      this.relatedArtifact = Arrays.asList(relatedArtifact);
      return this;
    }
    /**
     * @param relatedArtifact - Related artifacts such as additional documentation, justification,
     *     or bibliographic references.
     */
    public ActivityDefinitionBuilder.Impl withRelatedArtifact(
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
    public ActivityDefinitionBuilder.Impl withModifierExtension(
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
    public ActivityDefinitionBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }
    /**
     * @param specimenRequirement - Defines specimen requirements for the action to be performed,
     *     such as required specimens for a lab test.
     */
    public ActivityDefinitionBuilder.Impl withSpecimenRequirement(
        @NonNull Reference... specimenRequirement) {
      this.specimenRequirement = Arrays.asList(specimenRequirement);
      return this;
    }
    /**
     * @param specimenRequirement - Defines specimen requirements for the action to be performed,
     *     such as required specimens for a lab test.
     */
    public ActivityDefinitionBuilder.Impl withSpecimenRequirement(
        @NonNull Collection<Reference> specimenRequirement) {
      this.specimenRequirement = Collections.unmodifiableCollection(specimenRequirement);
      return this;
    }
    /**
     * @param observationRequirement - Defines observation requirements for the action to be
     *     performed, such as body weight or surface area.
     */
    public ActivityDefinitionBuilder.Impl withObservationRequirement(
        @NonNull Reference... observationRequirement) {
      this.observationRequirement = Arrays.asList(observationRequirement);
      return this;
    }
    /**
     * @param observationRequirement - Defines observation requirements for the action to be
     *     performed, such as body weight or surface area.
     */
    public ActivityDefinitionBuilder.Impl withObservationRequirement(
        @NonNull Collection<Reference> observationRequirement) {
      this.observationRequirement = Collections.unmodifiableCollection(observationRequirement);
      return this;
    }
    /**
     * @param observationResultRequirement - Defines the observations that are expected to be
     *     produced by the action.
     */
    public ActivityDefinitionBuilder.Impl withObservationResultRequirement(
        @NonNull Reference... observationResultRequirement) {
      this.observationResultRequirement = Arrays.asList(observationResultRequirement);
      return this;
    }
    /**
     * @param observationResultRequirement - Defines the observations that are expected to be
     *     produced by the action.
     */
    public ActivityDefinitionBuilder.Impl withObservationResultRequirement(
        @NonNull Collection<Reference> observationResultRequirement) {
      this.observationResultRequirement =
          Collections.unmodifiableCollection(observationResultRequirement);
      return this;
    }
    /** @param participant - Indicates who should participate in performing the action described. */
    public ActivityDefinitionBuilder.Impl withParticipant(
        @NonNull ActivityDefinition.Participant... participant) {
      this.participant = Arrays.asList(participant);
      return this;
    }
    /** @param participant - Indicates who should participate in performing the action described. */
    public ActivityDefinitionBuilder.Impl withParticipant(
        @NonNull Collection<ActivityDefinition.Participant> participant) {
      this.participant = Collections.unmodifiableCollection(participant);
      return this;
    }
    /**
     * @param dynamicValue - Dynamic values that will be evaluated to produce values for elements of
     *     the resulting resource. For example, if the dosage of a medication must be computed based
     *     on the patient's weight, a dynamic value would be used to specify an expression that
     *     calculated the weight, and the path on the request resource that would contain the
     *     result.
     */
    public ActivityDefinitionBuilder.Impl withDynamicValue(
        @NonNull ActivityDefinition.DynamicValue... dynamicValue) {
      this.dynamicValue = Arrays.asList(dynamicValue);
      return this;
    }
    /**
     * @param dynamicValue - Dynamic values that will be evaluated to produce values for elements of
     *     the resulting resource. For example, if the dosage of a medication must be computed based
     *     on the patient's weight, a dynamic value would be used to specify an expression that
     *     calculated the weight, and the path on the request resource that would contain the
     *     result.
     */
    public ActivityDefinitionBuilder.Impl withDynamicValue(
        @NonNull Collection<ActivityDefinition.DynamicValue> dynamicValue) {
      this.dynamicValue = Collections.unmodifiableCollection(dynamicValue);
      return this;
    }

    public ActivityDefinitionBuilder withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public ActivityDefinition build() {
      return new ActivityDefinition(
          OptionConverters.toScala(id),
          OptionConverters.toScala(url),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(name),
          OptionConverters.toScala(date),
          OptionConverters.toScala(kind),
          OptionConverters.toScala(code),
          OptionConverters.toScala(title),
          OptionConverters.toScala(usage),
          topic.stream().collect(new LitSeqJCollector<>()),
          status,
          author.stream().collect(new LitSeqJCollector<>()),
          editor.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(intent),
          dosage.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(version),
          contact.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(purpose),
          library.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(profile),
          OptionConverters.toScala(language),
          OptionConverters.toScala(subtitle),
          reviewer.stream().collect(new LitSeqJCollector<>()),
          endorser.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(priority),
          OptionConverters.toScala(location),
          OptionConverters.toScala(quantity),
          bodySite.stream().collect(new LitSeqJCollector<>()),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(publisher),
          OptionConverters.toScala(copyright),
          (Option) OptionConverters.toScala(timing),
          OptionConverters.toScala(transform),
          identifier.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(subject),
          useContext.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(product),
          OptionConverters.toScala(description),
          OptionConverters.toScala(experimental.map(x -> (Object) x)),
          jurisdiction.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(approvalDate),
          OptionConverters.toScala(doNotPerform.map(x -> (Object) x)),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(lastReviewDate),
          OptionConverters.toScala(effectivePeriod),
          relatedArtifact.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          specimenRequirement.stream().collect(new LitSeqJCollector<>()),
          observationRequirement.stream().collect(new LitSeqJCollector<>()),
          observationResultRequirement.stream().collect(new LitSeqJCollector<>()),
          participant.stream().collect(new LitSeqJCollector<>()),
          dynamicValue.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
