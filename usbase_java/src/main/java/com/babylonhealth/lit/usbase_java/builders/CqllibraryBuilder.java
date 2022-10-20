package com.babylonhealth.lit.usbase_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDate;
import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.PUBLICATION_STATUS;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.Option;
import scala.jdk.javaapi.OptionConverters;

public interface CqllibraryBuilder extends LibraryBuilder {
  public Cqllibrary build();

  public static Impl init(CodeableConcept _type, PUBLICATION_STATUS status) {
    return new Impl(_type, status);
  }

  public static Impl builder(CodeableConceptBuilder _type, PUBLICATION_STATUS status) {
    return new Impl(_type.build(), status);
  }

  public static ChoiceCodeableConceptOrReference subject(CodeableConcept c) {
    return new ChoiceCodeableConceptOrReference(c);
  }

  public static ChoiceCodeableConceptOrReference subject(Reference r) {
    return new ChoiceCodeableConceptOrReference(r);
  }

  public class Impl implements CqllibraryBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> url = Optional.empty();
    private Optional<Meta> meta =
        Optional.of(
            MetaBuilder.init()
                .withProfile("http://hl7.org/fhir/StructureDefinition/cqllibrary")
                .build());
    private Optional<Narrative> text = Optional.empty();
    private Optional<String> name = Optional.empty();
    private CodeableConcept _type;
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
    private Collection<Attachment> content = Collections.emptyList();
    private Optional<LANGUAGES> language = Optional.empty();
    private Optional<String> subtitle = Optional.empty();
    private Collection<ContactDetail> reviewer = Collections.emptyList();
    private Collection<ContactDetail> endorser = Collections.emptyList();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> publisher = Optional.empty();
    private Optional<String> copyright = Optional.empty();
    private Collection<ParameterDefinition> parameter = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<ChoiceCodeableConceptOrReference> subject = Optional.empty();
    private Collection<UsageContext> useContext = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Optional<Boolean> experimental = Optional.empty();
    private Collection<CodeableConcept> jurisdiction = Collections.emptyList();
    private Optional<FHIRDate> approvalDate = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<FHIRDate> lastReviewDate = Optional.empty();
    private Optional<Period> effectivePeriod = Optional.empty();
    private Collection<RelatedArtifact> relatedArtifact = Collections.emptyList();
    private Collection<DataRequirement> dataRequirement = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link Cqllibrary}
     *
     * @param _type - Identifies the type of library such as a Logic Library, Model Definition,
     *     Asset Collection, or Module Definition.
     * @param status - The status of this library. Enables tracking the life-cycle of the content.
     */
    public Impl(CodeableConcept _type, PUBLICATION_STATUS status) {
      this._type = _type;
      this.status = status;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public CqllibraryBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param url - An absolute URI that is used to identify this library when it is referenced in a
     *     specification, model, design or an instance; also called its canonical identifier. This
     *     SHOULD be globally unique and SHOULD be a literal address at which at which an
     *     authoritative instance of this library is (or will be) published. This URL can be the
     *     target of a canonical reference. It SHALL remain the same when the library is stored on
     *     different servers.
     */
    public CqllibraryBuilder.Impl withUrl(@NonNull String url) {
      this.url = Optional.of(url);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public CqllibraryBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public CqllibraryBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public CqllibraryBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public CqllibraryBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param name - A natural language name identifying the library. This name should be usable as
     *     an identifier for the module by machine processing applications such as code generation.
     */
    public CqllibraryBuilder.Impl withName(@NonNull String name) {
      this.name = Optional.of(name);
      return this;
    }
    /**
     * @param date - The date (and optionally time) when the library was published. The date must
     *     change when the business version changes and it must change if the status code changes.
     *     In addition, it should change when the substantive content of the library changes.
     */
    public CqllibraryBuilder.Impl withDate(@NonNull FHIRDateTime date) {
      this.date = Optional.of(date);
      return this;
    }
    /** @param title - A short, descriptive, user-friendly title for the library. */
    public CqllibraryBuilder.Impl withTitle(@NonNull String title) {
      this.title = Optional.of(title);
      return this;
    }
    /**
     * @param usage - A detailed description of how the library is used from a clinical perspective.
     */
    public CqllibraryBuilder.Impl withUsage(@NonNull String usage) {
      this.usage = Optional.of(usage);
      return this;
    }
    /**
     * @param topic - Descriptive topics related to the content of the library. Topics provide a
     *     high-level categorization of the library that can be useful for filtering and searching.
     */
    public CqllibraryBuilder.Impl withTopic(@NonNull CodeableConcept... topic) {
      this.topic = Arrays.asList(topic);
      return this;
    }
    /**
     * @param topic - Descriptive topics related to the content of the library. Topics provide a
     *     high-level categorization of the library that can be useful for filtering and searching.
     */
    public CqllibraryBuilder.Impl withTopic(@NonNull Collection<CodeableConcept> topic) {
      this.topic = Collections.unmodifiableCollection(topic);
      return this;
    }

    public CqllibraryBuilder.Impl withTopic(@NonNull CodeableConceptBuilder... topic) {
      this.topic = Arrays.stream(topic).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param author - An individiual or organization primarily involved in the creation and
     *     maintenance of the content.
     */
    public CqllibraryBuilder.Impl withAuthor(@NonNull ContactDetail... author) {
      this.author = Arrays.asList(author);
      return this;
    }
    /**
     * @param author - An individiual or organization primarily involved in the creation and
     *     maintenance of the content.
     */
    public CqllibraryBuilder.Impl withAuthor(@NonNull Collection<ContactDetail> author) {
      this.author = Collections.unmodifiableCollection(author);
      return this;
    }

    public CqllibraryBuilder.Impl withAuthor(@NonNull ContactDetailBuilder... author) {
      this.author = Arrays.stream(author).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param editor - An individual or organization primarily responsible for internal coherence of
     *     the content.
     */
    public CqllibraryBuilder.Impl withEditor(@NonNull ContactDetail... editor) {
      this.editor = Arrays.asList(editor);
      return this;
    }
    /**
     * @param editor - An individual or organization primarily responsible for internal coherence of
     *     the content.
     */
    public CqllibraryBuilder.Impl withEditor(@NonNull Collection<ContactDetail> editor) {
      this.editor = Collections.unmodifiableCollection(editor);
      return this;
    }

    public CqllibraryBuilder.Impl withEditor(@NonNull ContactDetailBuilder... editor) {
      this.editor = Arrays.stream(editor).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param version - The identifier that is used to identify this version of the library when it
     *     is referenced in a specification, model, design or instance. This is an arbitrary value
     *     managed by the library author and is not expected to be globally unique. For example, it
     *     might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also
     *     no expectation that versions can be placed in a lexicographical sequence. To provide a
     *     version consistent with the Decision Support Service specification, use the format
     *     Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge assets,
     *     refer to the Decision Support Service specification. Note that a version is required for
     *     non-experimental active artifacts.
     */
    public CqllibraryBuilder.Impl withVersion(@NonNull String version) {
      this.version = Optional.of(version);
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in finding and communicating with the
     *     publisher.
     */
    public CqllibraryBuilder.Impl withContact(@NonNull ContactDetail... contact) {
      this.contact = Arrays.asList(contact);
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in finding and communicating with the
     *     publisher.
     */
    public CqllibraryBuilder.Impl withContact(@NonNull Collection<ContactDetail> contact) {
      this.contact = Collections.unmodifiableCollection(contact);
      return this;
    }

    public CqllibraryBuilder.Impl withContact(@NonNull ContactDetailBuilder... contact) {
      this.contact = Arrays.stream(contact).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param purpose - Explanation of why this library is needed and why it has been designed as it
     *     has.
     */
    public CqllibraryBuilder.Impl withPurpose(@NonNull String purpose) {
      this.purpose = Optional.of(purpose);
      return this;
    }
    /**
     * @param content - The content of the library as an Attachment. The content may be a reference
     *     to a url, or may be directly embedded as a base-64 string. Either way, the contentType of
     *     the attachment determines how to interpret the content.
     */
    public CqllibraryBuilder.Impl withContent(@NonNull Attachment... content) {
      this.content = Arrays.asList(content);
      return this;
    }
    /**
     * @param content - The content of the library as an Attachment. The content may be a reference
     *     to a url, or may be directly embedded as a base-64 string. Either way, the contentType of
     *     the attachment determines how to interpret the content.
     */
    public CqllibraryBuilder.Impl withContent(@NonNull Collection<Attachment> content) {
      this.content = Collections.unmodifiableCollection(content);
      return this;
    }

    public CqllibraryBuilder.Impl withContent(@NonNull AttachmentBuilder... content) {
      this.content = Arrays.stream(content).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public CqllibraryBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param subtitle - An explanatory or alternate title for the library giving additional
     *     information about its content.
     */
    public CqllibraryBuilder.Impl withSubtitle(@NonNull String subtitle) {
      this.subtitle = Optional.of(subtitle);
      return this;
    }
    /**
     * @param reviewer - An individual or organization primarily responsible for review of some
     *     aspect of the content.
     */
    public CqllibraryBuilder.Impl withReviewer(@NonNull ContactDetail... reviewer) {
      this.reviewer = Arrays.asList(reviewer);
      return this;
    }
    /**
     * @param reviewer - An individual or organization primarily responsible for review of some
     *     aspect of the content.
     */
    public CqllibraryBuilder.Impl withReviewer(@NonNull Collection<ContactDetail> reviewer) {
      this.reviewer = Collections.unmodifiableCollection(reviewer);
      return this;
    }

    public CqllibraryBuilder.Impl withReviewer(@NonNull ContactDetailBuilder... reviewer) {
      this.reviewer = Arrays.stream(reviewer).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param endorser - An individual or organization responsible for officially endorsing the
     *     content for use in some setting.
     */
    public CqllibraryBuilder.Impl withEndorser(@NonNull ContactDetail... endorser) {
      this.endorser = Arrays.asList(endorser);
      return this;
    }
    /**
     * @param endorser - An individual or organization responsible for officially endorsing the
     *     content for use in some setting.
     */
    public CqllibraryBuilder.Impl withEndorser(@NonNull Collection<ContactDetail> endorser) {
      this.endorser = Collections.unmodifiableCollection(endorser);
      return this;
    }

    public CqllibraryBuilder.Impl withEndorser(@NonNull ContactDetailBuilder... endorser) {
      this.endorser = Arrays.stream(endorser).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public CqllibraryBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public CqllibraryBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public CqllibraryBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public CqllibraryBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public CqllibraryBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public CqllibraryBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param publisher - The name of the organization or individual that published the library. */
    public CqllibraryBuilder.Impl withPublisher(@NonNull String publisher) {
      this.publisher = Optional.of(publisher);
      return this;
    }
    /**
     * @param copyright - A copyright statement relating to the library and/or its contents.
     *     Copyright statements are generally legal restrictions on the use and publishing of the
     *     library.
     */
    public CqllibraryBuilder.Impl withCopyright(@NonNull String copyright) {
      this.copyright = Optional.of(copyright);
      return this;
    }
    /** @param parameter - The parameter element defines parameters used by the library. */
    public CqllibraryBuilder.Impl withParameter(@NonNull ParameterDefinition... parameter) {
      this.parameter = Arrays.asList(parameter);
      return this;
    }
    /** @param parameter - The parameter element defines parameters used by the library. */
    public CqllibraryBuilder.Impl withParameter(
        @NonNull Collection<ParameterDefinition> parameter) {
      this.parameter = Collections.unmodifiableCollection(parameter);
      return this;
    }

    public CqllibraryBuilder.Impl withParameter(@NonNull ParameterDefinitionBuilder... parameter) {
      this.parameter = Arrays.stream(parameter).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param identifier - A formal identifier that is used to identify this library when it is
     *     represented in other formats, or referenced in a specification, model, design or an
     *     instance. e.g. CMS or NQF identifiers for a measure artifact. Note that at least one
     *     identifier is required for non-experimental active artifacts.
     */
    public CqllibraryBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - A formal identifier that is used to identify this library when it is
     *     represented in other formats, or referenced in a specification, model, design or an
     *     instance. e.g. CMS or NQF identifiers for a measure artifact. Note that at least one
     *     identifier is required for non-experimental active artifacts.
     */
    public CqllibraryBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public CqllibraryBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param subject - A code or group definition that describes the intended subject of the
     *     contents of the library. Field is a 'choice' field. Type should be one of
     *     CodeableConcept, Reference. To pass the value in, wrap with one of the
     *     CqllibraryBuilder.subject static methods
     */
    public CqllibraryBuilder.Impl withSubject(@NonNull ChoiceCodeableConceptOrReference subject) {
      this.subject = Optional.of(subject);
      return this;
    }
    /**
     * @param useContext - The content was developed with a focus and intent of supporting the
     *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
     *     may be references to specific programs (insurance plans, studies, ...) and may be used to
     *     assist with indexing and searching for appropriate library instances.
     */
    public CqllibraryBuilder.Impl withUseContext(@NonNull UsageContext... useContext) {
      this.useContext = Arrays.asList(useContext);
      return this;
    }
    /**
     * @param useContext - The content was developed with a focus and intent of supporting the
     *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
     *     may be references to specific programs (insurance plans, studies, ...) and may be used to
     *     assist with indexing and searching for appropriate library instances.
     */
    public CqllibraryBuilder.Impl withUseContext(@NonNull Collection<UsageContext> useContext) {
      this.useContext = Collections.unmodifiableCollection(useContext);
      return this;
    }

    public CqllibraryBuilder.Impl withUseContext(@NonNull UsageContextBuilder... useContext) {
      this.useContext = Arrays.stream(useContext).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param description - A free text natural language description of the library from a
     *     consumer's perspective.
     */
    public CqllibraryBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /**
     * @param experimental - A Boolean value to indicate that this library is authored for testing
     *     purposes (or education/evaluation/marketing) and is not intended to be used for genuine
     *     usage.
     */
    public CqllibraryBuilder.Impl withExperimental(@NonNull Boolean experimental) {
      this.experimental = Optional.of(experimental);
      return this;
    }
    /**
     * @param jurisdiction - A legal or geographic region in which the library is intended to be
     *     used.
     */
    public CqllibraryBuilder.Impl withJurisdiction(@NonNull CodeableConcept... jurisdiction) {
      this.jurisdiction = Arrays.asList(jurisdiction);
      return this;
    }
    /**
     * @param jurisdiction - A legal or geographic region in which the library is intended to be
     *     used.
     */
    public CqllibraryBuilder.Impl withJurisdiction(
        @NonNull Collection<CodeableConcept> jurisdiction) {
      this.jurisdiction = Collections.unmodifiableCollection(jurisdiction);
      return this;
    }

    public CqllibraryBuilder.Impl withJurisdiction(
        @NonNull CodeableConceptBuilder... jurisdiction) {
      this.jurisdiction = Arrays.stream(jurisdiction).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param approvalDate - The date on which the resource content was approved by the publisher.
     *     Approval happens once when the content is officially approved for usage.
     */
    public CqllibraryBuilder.Impl withApprovalDate(@NonNull FHIRDate approvalDate) {
      this.approvalDate = Optional.of(approvalDate);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public CqllibraryBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param lastReviewDate - The date on which the resource content was last reviewed. Review
     *     happens periodically after approval but does not change the original approval date.
     */
    public CqllibraryBuilder.Impl withLastReviewDate(@NonNull FHIRDate lastReviewDate) {
      this.lastReviewDate = Optional.of(lastReviewDate);
      return this;
    }
    /**
     * @param effectivePeriod - The period during which the library content was or is planned to be
     *     in active use.
     */
    public CqllibraryBuilder.Impl withEffectivePeriod(@NonNull Period effectivePeriod) {
      this.effectivePeriod = Optional.of(effectivePeriod);
      return this;
    }

    public CqllibraryBuilder.Impl withEffectivePeriod(@NonNull PeriodBuilder effectivePeriod) {
      this.effectivePeriod = Optional.of(effectivePeriod.build());
      return this;
    }
    /**
     * @param relatedArtifact - Related artifacts such as additional documentation, justification,
     *     or bibliographic references.
     */
    public CqllibraryBuilder.Impl withRelatedArtifact(@NonNull RelatedArtifact... relatedArtifact) {
      this.relatedArtifact = Arrays.asList(relatedArtifact);
      return this;
    }
    /**
     * @param relatedArtifact - Related artifacts such as additional documentation, justification,
     *     or bibliographic references.
     */
    public CqllibraryBuilder.Impl withRelatedArtifact(
        @NonNull Collection<RelatedArtifact> relatedArtifact) {
      this.relatedArtifact = Collections.unmodifiableCollection(relatedArtifact);
      return this;
    }

    public CqllibraryBuilder.Impl withRelatedArtifact(
        @NonNull RelatedArtifactBuilder... relatedArtifact) {
      this.relatedArtifact = Arrays.stream(relatedArtifact).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param dataRequirement - Describes a set of data that must be provided in order to be able to
     *     successfully perform the computations defined by the library.
     */
    public CqllibraryBuilder.Impl withDataRequirement(@NonNull DataRequirement... dataRequirement) {
      this.dataRequirement = Arrays.asList(dataRequirement);
      return this;
    }
    /**
     * @param dataRequirement - Describes a set of data that must be provided in order to be able to
     *     successfully perform the computations defined by the library.
     */
    public CqllibraryBuilder.Impl withDataRequirement(
        @NonNull Collection<DataRequirement> dataRequirement) {
      this.dataRequirement = Collections.unmodifiableCollection(dataRequirement);
      return this;
    }

    public CqllibraryBuilder.Impl withDataRequirement(
        @NonNull DataRequirementBuilder... dataRequirement) {
      this.dataRequirement = Arrays.stream(dataRequirement).map(e -> e.build()).collect(toList());
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
    public CqllibraryBuilder.Impl withModifierExtension(@NonNull Extension... modifierExtension) {
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
    public CqllibraryBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public CqllibraryBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public CqllibraryBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Cqllibrary build() {
      return new Cqllibrary(
          OptionConverters.toScala(id),
          OptionConverters.toScala(url),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(name),
          _type,
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
          content.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(language),
          OptionConverters.toScala(subtitle),
          reviewer.stream().collect(new LitSeqJCollector<>()),
          endorser.stream().collect(new LitSeqJCollector<>()),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(publisher),
          OptionConverters.toScala(copyright),
          parameter.stream().collect(new LitSeqJCollector<>()),
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
          dataRequirement.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
