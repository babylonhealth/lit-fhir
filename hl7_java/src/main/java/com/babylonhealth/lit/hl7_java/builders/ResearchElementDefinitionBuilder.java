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
import com.babylonhealth.lit.hl7.RESEARCH_ELEMENT_TYPE;
import com.babylonhealth.lit.hl7.PUBLICATION_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.hl7.VARIABLE_TYPE;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class ResearchElementDefinitionBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<String> url = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private Optional<String> name = Optional.empty();
  private Optional<FHIRDateTime> date = Optional.empty();
  private RESEARCH_ELEMENT_TYPE _type;
  private Optional<String> title = Optional.empty();
  private Optional<String> usage = Optional.empty();
  private Collection<CodeableConcept> topic = Collections.emptyList();
  private PUBLICATION_STATUS status;
  private Collection<ContactDetail> author = Collections.emptyList();
  private Collection<ContactDetail> editor = Collections.emptyList();
  private Optional<String> version = Optional.empty();
  private Collection<ContactDetail> contact = Collections.emptyList();
  private Collection<String> comment = Collections.emptyList();
  private Optional<String> purpose = Optional.empty();
  private Collection<String> library = Collections.emptyList();
  private Optional<LANGUAGES> language = Optional.empty();
  private Optional<String> subtitle = Optional.empty();
  private Collection<ContactDetail> reviewer = Collections.emptyList();
  private Collection<ContactDetail> endorser = Collections.emptyList();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<String> publisher = Optional.empty();
  private Optional<String> copyright = Optional.empty();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Optional<String> shortTitle = Optional.empty();
  private Optional<Choice01025009075> subject = Optional.empty();
  private Collection<UsageContext> useContext = Collections.emptyList();
  private Optional<String> description = Optional.empty();
  private Optional<Boolean> experimental = Optional.empty();
  private Collection<CodeableConcept> jurisdiction = Collections.emptyList();
  private Optional<FHIRDate> approvalDate = Optional.empty();
  private Optional<VARIABLE_TYPE> variableType = Optional.empty();
  private Optional<String> implicitRules = Optional.empty();
  private Optional<FHIRDate> lastReviewDate = Optional.empty();
  private Optional<Period> effectivePeriod = Optional.empty();
  private Collection<RelatedArtifact> relatedArtifact = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<ResearchElementDefinition.Characteristic> characteristic;

  /**
   * Required fields for {@link ResearchElementDefinition}
   *
   * @param _type - The type of research element, a population, an exposure, or an outcome.
   * @param status - The status of this research element definition. Enables tracking the life-cycle
   *     of the content.
   * @param characteristic - A characteristic that defines the members of the research element.
   *     Multiple characteristics are applied with "and" semantics.
   */
  public ResearchElementDefinitionBuilder(
      RESEARCH_ELEMENT_TYPE _type,
      PUBLICATION_STATUS status,
      Collection<ResearchElementDefinition.Characteristic> characteristic) {
    this._type = _type;
    this.status = status;
    this.characteristic = characteristic;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public ResearchElementDefinitionBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param url - An absolute URI that is used to identify this research element definition when it
   *     is referenced in a specification, model, design or an instance; also called its canonical
   *     identifier. This SHOULD be globally unique and SHOULD be a literal address at which at
   *     which an authoritative instance of this research element definition is (or will be)
   *     published. This URL can be the target of a canonical reference. It SHALL remain the same
   *     when the research element definition is stored on different servers.
   */
  public ResearchElementDefinitionBuilder withUrl(@NonNull String url) {
    this.url = Optional.of(url);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public ResearchElementDefinitionBuilder withMeta(@NonNull Meta meta) {
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
  public ResearchElementDefinitionBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param name - A natural language name identifying the research element definition. This name
   *     should be usable as an identifier for the module by machine processing applications such as
   *     code generation.
   */
  public ResearchElementDefinitionBuilder withName(@NonNull String name) {
    this.name = Optional.of(name);
    return this;
  }
  /**
   * @param date - The date (and optionally time) when the research element definition was
   *     published. The date must change when the business version changes and it must change if the
   *     status code changes. In addition, it should change when the substantive content of the
   *     research element definition changes.
   */
  public ResearchElementDefinitionBuilder withDate(@NonNull FHIRDateTime date) {
    this.date = Optional.of(date);
    return this;
  }
  /**
   * @param title - A short, descriptive, user-friendly title for the research element definition.
   */
  public ResearchElementDefinitionBuilder withTitle(@NonNull String title) {
    this.title = Optional.of(title);
    return this;
  }
  /**
   * @param usage - A detailed description, from a clinical perspective, of how the
   *     ResearchElementDefinition is used.
   */
  public ResearchElementDefinitionBuilder withUsage(@NonNull String usage) {
    this.usage = Optional.of(usage);
    return this;
  }
  /**
   * @param topic - Descriptive topics related to the content of the ResearchElementDefinition.
   *     Topics provide a high-level categorization grouping types of ResearchElementDefinitions
   *     that can be useful for filtering and searching.
   */
  public ResearchElementDefinitionBuilder withTopic(@NonNull CodeableConcept... topic) {
    this.topic = Arrays.asList(topic);
    return this;
  }
  /**
   * @param topic - Descriptive topics related to the content of the ResearchElementDefinition.
   *     Topics provide a high-level categorization grouping types of ResearchElementDefinitions
   *     that can be useful for filtering and searching.
   */
  public ResearchElementDefinitionBuilder withTopic(@NonNull Collection<CodeableConcept> topic) {
    this.topic = Collections.unmodifiableCollection(topic);
    return this;
  }
  /**
   * @param author - An individiual or organization primarily involved in the creation and
   *     maintenance of the content.
   */
  public ResearchElementDefinitionBuilder withAuthor(@NonNull ContactDetail... author) {
    this.author = Arrays.asList(author);
    return this;
  }
  /**
   * @param author - An individiual or organization primarily involved in the creation and
   *     maintenance of the content.
   */
  public ResearchElementDefinitionBuilder withAuthor(@NonNull Collection<ContactDetail> author) {
    this.author = Collections.unmodifiableCollection(author);
    return this;
  }
  /**
   * @param editor - An individual or organization primarily responsible for internal coherence of
   *     the content.
   */
  public ResearchElementDefinitionBuilder withEditor(@NonNull ContactDetail... editor) {
    this.editor = Arrays.asList(editor);
    return this;
  }
  /**
   * @param editor - An individual or organization primarily responsible for internal coherence of
   *     the content.
   */
  public ResearchElementDefinitionBuilder withEditor(@NonNull Collection<ContactDetail> editor) {
    this.editor = Collections.unmodifiableCollection(editor);
    return this;
  }
  /**
   * @param version - The identifier that is used to identify this version of the research element
   *     definition when it is referenced in a specification, model, design or instance. This is an
   *     arbitrary value managed by the research element definition author and is not expected to be
   *     globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version
   *     is not available. There is also no expectation that versions can be placed in a
   *     lexicographical sequence. To provide a version consistent with the Decision Support Service
   *     specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on
   *     versioning knowledge assets, refer to the Decision Support Service specification. Note that
   *     a version is required for non-experimental active artifacts.
   */
  public ResearchElementDefinitionBuilder withVersion(@NonNull String version) {
    this.version = Optional.of(version);
    return this;
  }
  /**
   * @param contact - Contact details to assist a user in finding and communicating with the
   *     publisher.
   */
  public ResearchElementDefinitionBuilder withContact(@NonNull ContactDetail... contact) {
    this.contact = Arrays.asList(contact);
    return this;
  }
  /**
   * @param contact - Contact details to assist a user in finding and communicating with the
   *     publisher.
   */
  public ResearchElementDefinitionBuilder withContact(@NonNull Collection<ContactDetail> contact) {
    this.contact = Collections.unmodifiableCollection(contact);
    return this;
  }
  /** @param comment - A human-readable string to clarify or explain concepts about the resource. */
  public ResearchElementDefinitionBuilder withComment(@NonNull String... comment) {
    this.comment = Arrays.asList(comment);
    return this;
  }
  /** @param comment - A human-readable string to clarify or explain concepts about the resource. */
  public ResearchElementDefinitionBuilder withComment(@NonNull Collection<String> comment) {
    this.comment = Collections.unmodifiableCollection(comment);
    return this;
  }
  /**
   * @param purpose - Explanation of why this research element definition is needed and why it has
   *     been designed as it has.
   */
  public ResearchElementDefinitionBuilder withPurpose(@NonNull String purpose) {
    this.purpose = Optional.of(purpose);
    return this;
  }
  /**
   * @param library - A reference to a Library resource containing the formal logic used by the
   *     ResearchElementDefinition.
   */
  public ResearchElementDefinitionBuilder withLibrary(@NonNull String... library) {
    this.library = Arrays.asList(library);
    return this;
  }
  /**
   * @param library - A reference to a Library resource containing the formal logic used by the
   *     ResearchElementDefinition.
   */
  public ResearchElementDefinitionBuilder withLibrary(@NonNull Collection<String> library) {
    this.library = Collections.unmodifiableCollection(library);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public ResearchElementDefinitionBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param subtitle - An explanatory or alternate title for the ResearchElementDefinition giving
   *     additional information about its content.
   */
  public ResearchElementDefinitionBuilder withSubtitle(@NonNull String subtitle) {
    this.subtitle = Optional.of(subtitle);
    return this;
  }
  /**
   * @param reviewer - An individual or organization primarily responsible for review of some aspect
   *     of the content.
   */
  public ResearchElementDefinitionBuilder withReviewer(@NonNull ContactDetail... reviewer) {
    this.reviewer = Arrays.asList(reviewer);
    return this;
  }
  /**
   * @param reviewer - An individual or organization primarily responsible for review of some aspect
   *     of the content.
   */
  public ResearchElementDefinitionBuilder withReviewer(
      @NonNull Collection<ContactDetail> reviewer) {
    this.reviewer = Collections.unmodifiableCollection(reviewer);
    return this;
  }
  /**
   * @param endorser - An individual or organization responsible for officially endorsing the
   *     content for use in some setting.
   */
  public ResearchElementDefinitionBuilder withEndorser(@NonNull ContactDetail... endorser) {
    this.endorser = Arrays.asList(endorser);
    return this;
  }
  /**
   * @param endorser - An individual or organization responsible for officially endorsing the
   *     content for use in some setting.
   */
  public ResearchElementDefinitionBuilder withEndorser(
      @NonNull Collection<ContactDetail> endorser) {
    this.endorser = Collections.unmodifiableCollection(endorser);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public ResearchElementDefinitionBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public ResearchElementDefinitionBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public ResearchElementDefinitionBuilder withExtension(@NonNull Extension... extension) {
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
  public ResearchElementDefinitionBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param publisher - The name of the organization or individual that published the research
   *     element definition.
   */
  public ResearchElementDefinitionBuilder withPublisher(@NonNull String publisher) {
    this.publisher = Optional.of(publisher);
    return this;
  }
  /**
   * @param copyright - A copyright statement relating to the research element definition and/or its
   *     contents. Copyright statements are generally legal restrictions on the use and publishing
   *     of the research element definition.
   */
  public ResearchElementDefinitionBuilder withCopyright(@NonNull String copyright) {
    this.copyright = Optional.of(copyright);
    return this;
  }
  /**
   * @param identifier - A formal identifier that is used to identify this research element
   *     definition when it is represented in other formats, or referenced in a specification,
   *     model, design or an instance.
   */
  public ResearchElementDefinitionBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /**
   * @param identifier - A formal identifier that is used to identify this research element
   *     definition when it is represented in other formats, or referenced in a specification,
   *     model, design or an instance.
   */
  public ResearchElementDefinitionBuilder withIdentifier(
      @NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /**
   * @param shortTitle - The short title provides an alternate title for use in informal descriptive
   *     contexts where the full, formal title is not necessary.
   */
  public ResearchElementDefinitionBuilder withShortTitle(@NonNull String shortTitle) {
    this.shortTitle = Optional.of(shortTitle);
    return this;
  }
  /**
   * @param subject - The intended subjects for the ResearchElementDefinition. If this element is
   *     not provided, a Patient subject is assumed, but the subject of the
   *     ResearchElementDefinition can be anything. Field is a 'choice' field. Type should be one of
   *     CodeableConcept, Reference.
   */
  public ResearchElementDefinitionBuilder withSubject(@NonNull Choice01025009075 subject) {
    this.subject = Optional.of(subject);
    return this;
  }
  /**
   * @param useContext - The content was developed with a focus and intent of supporting the
   *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
   *     may be references to specific programs (insurance plans, studies, ...) and may be used to
   *     assist with indexing and searching for appropriate research element definition instances.
   */
  public ResearchElementDefinitionBuilder withUseContext(@NonNull UsageContext... useContext) {
    this.useContext = Arrays.asList(useContext);
    return this;
  }
  /**
   * @param useContext - The content was developed with a focus and intent of supporting the
   *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
   *     may be references to specific programs (insurance plans, studies, ...) and may be used to
   *     assist with indexing and searching for appropriate research element definition instances.
   */
  public ResearchElementDefinitionBuilder withUseContext(
      @NonNull Collection<UsageContext> useContext) {
    this.useContext = Collections.unmodifiableCollection(useContext);
    return this;
  }
  /**
   * @param description - A free text natural language description of the research element
   *     definition from a consumer's perspective.
   */
  public ResearchElementDefinitionBuilder withDescription(@NonNull String description) {
    this.description = Optional.of(description);
    return this;
  }
  /**
   * @param experimental - A Boolean value to indicate that this research element definition is
   *     authored for testing purposes (or education/evaluation/marketing) and is not intended to be
   *     used for genuine usage.
   */
  public ResearchElementDefinitionBuilder withExperimental(@NonNull Boolean experimental) {
    this.experimental = Optional.of(experimental);
    return this;
  }
  /**
   * @param jurisdiction - A legal or geographic region in which the research element definition is
   *     intended to be used.
   */
  public ResearchElementDefinitionBuilder withJurisdiction(
      @NonNull CodeableConcept... jurisdiction) {
    this.jurisdiction = Arrays.asList(jurisdiction);
    return this;
  }
  /**
   * @param jurisdiction - A legal or geographic region in which the research element definition is
   *     intended to be used.
   */
  public ResearchElementDefinitionBuilder withJurisdiction(
      @NonNull Collection<CodeableConcept> jurisdiction) {
    this.jurisdiction = Collections.unmodifiableCollection(jurisdiction);
    return this;
  }
  /**
   * @param approvalDate - The date on which the resource content was approved by the publisher.
   *     Approval happens once when the content is officially approved for usage.
   */
  public ResearchElementDefinitionBuilder withApprovalDate(@NonNull FHIRDate approvalDate) {
    this.approvalDate = Optional.of(approvalDate);
    return this;
  }
  /**
   * @param variableType - The type of the outcome (e.g. Dichotomous, Continuous, or Descriptive).
   */
  public ResearchElementDefinitionBuilder withVariableType(@NonNull VARIABLE_TYPE variableType) {
    this.variableType = Optional.of(variableType);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public ResearchElementDefinitionBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param lastReviewDate - The date on which the resource content was last reviewed. Review
   *     happens periodically after approval but does not change the original approval date.
   */
  public ResearchElementDefinitionBuilder withLastReviewDate(@NonNull FHIRDate lastReviewDate) {
    this.lastReviewDate = Optional.of(lastReviewDate);
    return this;
  }
  /**
   * @param effectivePeriod - The period during which the research element definition content was or
   *     is planned to be in active use.
   */
  public ResearchElementDefinitionBuilder withEffectivePeriod(@NonNull Period effectivePeriod) {
    this.effectivePeriod = Optional.of(effectivePeriod);
    return this;
  }
  /**
   * @param relatedArtifact - Related artifacts such as additional documentation, justification, or
   *     bibliographic references.
   */
  public ResearchElementDefinitionBuilder withRelatedArtifact(
      @NonNull RelatedArtifact... relatedArtifact) {
    this.relatedArtifact = Arrays.asList(relatedArtifact);
    return this;
  }
  /**
   * @param relatedArtifact - Related artifacts such as additional documentation, justification, or
   *     bibliographic references.
   */
  public ResearchElementDefinitionBuilder withRelatedArtifact(
      @NonNull Collection<RelatedArtifact> relatedArtifact) {
    this.relatedArtifact = Collections.unmodifiableCollection(relatedArtifact);
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
  public ResearchElementDefinitionBuilder withModifierExtension(
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
  public ResearchElementDefinitionBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }

  public ResearchElementDefinitionBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public ResearchElementDefinition build() {
    return new ResearchElementDefinition(
        (Option) OptionConverters.toScala(id),
        (Option) OptionConverters.toScala(url),
        (Option) OptionConverters.toScala(meta),
        (Option) OptionConverters.toScala(text),
        (Option) OptionConverters.toScala(name),
        (Option) OptionConverters.toScala(date),
        _type,
        (Option) OptionConverters.toScala(title),
        (Option) OptionConverters.toScala(usage),
        topic.stream().collect(new LitSeqJCollector<>()),
        status,
        author.stream().collect(new LitSeqJCollector<>()),
        editor.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(version),
        contact.stream().collect(new LitSeqJCollector<>()),
        comment.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(purpose),
        library.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(language),
        (Option) OptionConverters.toScala(subtitle),
        reviewer.stream().collect(new LitSeqJCollector<>()),
        endorser.stream().collect(new LitSeqJCollector<>()),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(publisher),
        (Option) OptionConverters.toScala(copyright),
        identifier.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(shortTitle),
        (Option) OptionConverters.toScala(subject),
        useContext.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(description),
        (Option) OptionConverters.toScala(experimental.map(x -> (Object) x)),
        jurisdiction.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(approvalDate),
        (Option) OptionConverters.toScala(variableType),
        (Option) OptionConverters.toScala(implicitRules),
        (Option) OptionConverters.toScala(lastReviewDate),
        (Option) OptionConverters.toScala(effectivePeriod),
        relatedArtifact.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        characteristic.stream().collect(new NonEmptyLitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
