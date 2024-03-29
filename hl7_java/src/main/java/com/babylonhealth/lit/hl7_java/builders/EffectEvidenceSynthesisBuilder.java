package com.babylonhealth.lit.hl7_java.builders;

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
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface EffectEvidenceSynthesisBuilder extends DomainResourceBuilder {
  public EffectEvidenceSynthesis build();

  public static Impl init(
      PUBLICATION_STATUS status,
      Reference outcome,
      Reference exposure,
      Reference population,
      Reference exposureAlternative) {
    return new Impl(status, outcome, exposure, population, exposureAlternative);
  }

  public static Impl builder(
      PUBLICATION_STATUS status,
      ReferenceBuilder outcome,
      ReferenceBuilder exposure,
      ReferenceBuilder population,
      ReferenceBuilder exposureAlternative) {
    return new Impl(
        status, outcome.build(), exposure.build(), population.build(), exposureAlternative.build());
  }

  public class Impl implements EffectEvidenceSynthesisBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> url = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<String> name = Optional.empty();
    private Optional<FHIRDateTime> date = Optional.empty();
    private Collection<Annotation> note = Collections.emptyList();
    private Optional<String> title = Optional.empty();
    private Collection<CodeableConcept> topic = Collections.emptyList();
    private PUBLICATION_STATUS status;
    private Collection<ContactDetail> author = Collections.emptyList();
    private Collection<ContactDetail> editor = Collections.emptyList();
    private Optional<String> version = Optional.empty();
    private Collection<ContactDetail> contact = Collections.emptyList();
    private Reference outcome;
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<ContactDetail> reviewer = Collections.emptyList();
    private Collection<ContactDetail> endorser = Collections.emptyList();
    private Reference exposure;
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> publisher = Optional.empty();
    private Optional<String> copyright = Optional.empty();
    private Optional<CodeableConcept> studyType = Optional.empty();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Collection<UsageContext> useContext = Collections.emptyList();
    private Reference population;
    private Optional<String> description = Optional.empty();
    private Collection<CodeableConcept> jurisdiction = Collections.emptyList();
    private Optional<FHIRDate> approvalDate = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<CodeableConcept> synthesisType = Optional.empty();
    private Optional<FHIRDate> lastReviewDate = Optional.empty();
    private Optional<Period> effectivePeriod = Optional.empty();
    private Collection<RelatedArtifact> relatedArtifact = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Reference exposureAlternative;
    private Optional<EffectEvidenceSynthesis.SampleSize> sampleSize = Optional.empty();
    private Collection<EffectEvidenceSynthesis.ResultsByExposure> resultsByExposure =
        Collections.emptyList();
    private Collection<EffectEvidenceSynthesis.Certainty> certainty = Collections.emptyList();
    private Collection<EffectEvidenceSynthesis.EffectEstimate> effectEstimate =
        Collections.emptyList();

    /**
     * Required fields for {@link EffectEvidenceSynthesis}
     *
     * @param status - The status of this effect evidence synthesis. Enables tracking the life-cycle
     *     of the content.
     * @param outcome - A reference to a EvidenceVariable resomece that defines the outcome for the
     *     research.
     * @param exposure - A reference to a EvidenceVariable resource that defines the exposure for
     *     the research.
     * @param population - A reference to a EvidenceVariable resource that defines the population
     *     for the research.
     * @param exposureAlternative - A reference to a EvidenceVariable resource that defines the
     *     comparison exposure for the research.
     */
    public Impl(
        PUBLICATION_STATUS status,
        Reference outcome,
        Reference exposure,
        Reference population,
        Reference exposureAlternative) {
      this.status = status;
      this.outcome = outcome;
      this.exposure = exposure;
      this.population = population;
      this.exposureAlternative = exposureAlternative;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public EffectEvidenceSynthesisBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param url - An absolute URI that is used to identify this effect evidence synthesis when it
     *     is referenced in a specification, model, design or an instance; also called its canonical
     *     identifier. This SHOULD be globally unique and SHOULD be a literal address at which at
     *     which an authoritative instance of this effect evidence synthesis is (or will be)
     *     published. This URL can be the target of a canonical reference. It SHALL remain the same
     *     when the effect evidence synthesis is stored on different servers.
     */
    public EffectEvidenceSynthesisBuilder.Impl withUrl(@NonNull String url) {
      this.url = Optional.of(url);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public EffectEvidenceSynthesisBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public EffectEvidenceSynthesisBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public EffectEvidenceSynthesisBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public EffectEvidenceSynthesisBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param name - A natural language name identifying the effect evidence synthesis. This name
     *     should be usable as an identifier for the module by machine processing applications such
     *     as code generation.
     */
    public EffectEvidenceSynthesisBuilder.Impl withName(@NonNull String name) {
      this.name = Optional.of(name);
      return this;
    }
    /**
     * @param date - The date (and optionally time) when the effect evidence synthesis was
     *     published. The date must change when the business version changes and it must change if
     *     the status code changes. In addition, it should change when the substantive content of
     *     the effect evidence synthesis changes.
     */
    public EffectEvidenceSynthesisBuilder.Impl withDate(@NonNull FHIRDateTime date) {
      this.date = Optional.of(date);
      return this;
    }
    /** @param note - A human-readable string to clarify or explain concepts about the resource. */
    public EffectEvidenceSynthesisBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /** @param note - A human-readable string to clarify or explain concepts about the resource. */
    public EffectEvidenceSynthesisBuilder.Impl withNote(@NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public EffectEvidenceSynthesisBuilder.Impl withNote(@NonNull AnnotationBuilder... note) {
      this.note = Arrays.stream(note).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param title - A short, descriptive, user-friendly title for the effect evidence synthesis.
     */
    public EffectEvidenceSynthesisBuilder.Impl withTitle(@NonNull String title) {
      this.title = Optional.of(title);
      return this;
    }
    /**
     * @param topic - Descriptive topics related to the content of the EffectEvidenceSynthesis.
     *     Topics provide a high-level categorization grouping types of EffectEvidenceSynthesiss
     *     that can be useful for filtering and searching.
     */
    public EffectEvidenceSynthesisBuilder.Impl withTopic(@NonNull CodeableConcept... topic) {
      this.topic = Arrays.asList(topic);
      return this;
    }
    /**
     * @param topic - Descriptive topics related to the content of the EffectEvidenceSynthesis.
     *     Topics provide a high-level categorization grouping types of EffectEvidenceSynthesiss
     *     that can be useful for filtering and searching.
     */
    public EffectEvidenceSynthesisBuilder.Impl withTopic(
        @NonNull Collection<CodeableConcept> topic) {
      this.topic = Collections.unmodifiableCollection(topic);
      return this;
    }

    public EffectEvidenceSynthesisBuilder.Impl withTopic(@NonNull CodeableConceptBuilder... topic) {
      this.topic = Arrays.stream(topic).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param author - An individiual or organization primarily involved in the creation and
     *     maintenance of the content.
     */
    public EffectEvidenceSynthesisBuilder.Impl withAuthor(@NonNull ContactDetail... author) {
      this.author = Arrays.asList(author);
      return this;
    }
    /**
     * @param author - An individiual or organization primarily involved in the creation and
     *     maintenance of the content.
     */
    public EffectEvidenceSynthesisBuilder.Impl withAuthor(
        @NonNull Collection<ContactDetail> author) {
      this.author = Collections.unmodifiableCollection(author);
      return this;
    }

    public EffectEvidenceSynthesisBuilder.Impl withAuthor(@NonNull ContactDetailBuilder... author) {
      this.author = Arrays.stream(author).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param editor - An individual or organization primarily responsible for internal coherence of
     *     the content.
     */
    public EffectEvidenceSynthesisBuilder.Impl withEditor(@NonNull ContactDetail... editor) {
      this.editor = Arrays.asList(editor);
      return this;
    }
    /**
     * @param editor - An individual or organization primarily responsible for internal coherence of
     *     the content.
     */
    public EffectEvidenceSynthesisBuilder.Impl withEditor(
        @NonNull Collection<ContactDetail> editor) {
      this.editor = Collections.unmodifiableCollection(editor);
      return this;
    }

    public EffectEvidenceSynthesisBuilder.Impl withEditor(@NonNull ContactDetailBuilder... editor) {
      this.editor = Arrays.stream(editor).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param version - The identifier that is used to identify this version of the effect evidence
     *     synthesis when it is referenced in a specification, model, design or instance. This is an
     *     arbitrary value managed by the effect evidence synthesis author and is not expected to be
     *     globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed
     *     version is not available. There is also no expectation that versions can be placed in a
     *     lexicographical sequence.
     */
    public EffectEvidenceSynthesisBuilder.Impl withVersion(@NonNull String version) {
      this.version = Optional.of(version);
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in finding and communicating with the
     *     publisher.
     */
    public EffectEvidenceSynthesisBuilder.Impl withContact(@NonNull ContactDetail... contact) {
      this.contact = Arrays.asList(contact);
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in finding and communicating with the
     *     publisher.
     */
    public EffectEvidenceSynthesisBuilder.Impl withContact(
        @NonNull Collection<ContactDetail> contact) {
      this.contact = Collections.unmodifiableCollection(contact);
      return this;
    }

    public EffectEvidenceSynthesisBuilder.Impl withContact(
        @NonNull ContactDetailBuilder... contact) {
      this.contact = Arrays.stream(contact).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public EffectEvidenceSynthesisBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param reviewer - An individual or organization primarily responsible for review of some
     *     aspect of the content.
     */
    public EffectEvidenceSynthesisBuilder.Impl withReviewer(@NonNull ContactDetail... reviewer) {
      this.reviewer = Arrays.asList(reviewer);
      return this;
    }
    /**
     * @param reviewer - An individual or organization primarily responsible for review of some
     *     aspect of the content.
     */
    public EffectEvidenceSynthesisBuilder.Impl withReviewer(
        @NonNull Collection<ContactDetail> reviewer) {
      this.reviewer = Collections.unmodifiableCollection(reviewer);
      return this;
    }

    public EffectEvidenceSynthesisBuilder.Impl withReviewer(
        @NonNull ContactDetailBuilder... reviewer) {
      this.reviewer = Arrays.stream(reviewer).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param endorser - An individual or organization responsible for officially endorsing the
     *     content for use in some setting.
     */
    public EffectEvidenceSynthesisBuilder.Impl withEndorser(@NonNull ContactDetail... endorser) {
      this.endorser = Arrays.asList(endorser);
      return this;
    }
    /**
     * @param endorser - An individual or organization responsible for officially endorsing the
     *     content for use in some setting.
     */
    public EffectEvidenceSynthesisBuilder.Impl withEndorser(
        @NonNull Collection<ContactDetail> endorser) {
      this.endorser = Collections.unmodifiableCollection(endorser);
      return this;
    }

    public EffectEvidenceSynthesisBuilder.Impl withEndorser(
        @NonNull ContactDetailBuilder... endorser) {
      this.endorser = Arrays.stream(endorser).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public EffectEvidenceSynthesisBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public EffectEvidenceSynthesisBuilder.Impl withContained(
        @NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public EffectEvidenceSynthesisBuilder.Impl withContained(
        @NonNull ResourceBuilder... contained) {
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
    public EffectEvidenceSynthesisBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public EffectEvidenceSynthesisBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public EffectEvidenceSynthesisBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param publisher - The name of the organization or individual that published the effect
     *     evidence synthesis.
     */
    public EffectEvidenceSynthesisBuilder.Impl withPublisher(@NonNull String publisher) {
      this.publisher = Optional.of(publisher);
      return this;
    }
    /**
     * @param copyright - A copyright statement relating to the effect evidence synthesis and/or its
     *     contents. Copyright statements are generally legal restrictions on the use and publishing
     *     of the effect evidence synthesis.
     */
    public EffectEvidenceSynthesisBuilder.Impl withCopyright(@NonNull String copyright) {
      this.copyright = Optional.of(copyright);
      return this;
    }
    /** @param studyType - Type of study eg randomized trial. */
    public EffectEvidenceSynthesisBuilder.Impl withStudyType(@NonNull CodeableConcept studyType) {
      this.studyType = Optional.of(studyType);
      return this;
    }

    public EffectEvidenceSynthesisBuilder.Impl withStudyType(
        @NonNull CodeableConceptBuilder studyType) {
      this.studyType = Optional.of(studyType.build());
      return this;
    }
    /**
     * @param identifier - A formal identifier that is used to identify this effect evidence
     *     synthesis when it is represented in other formats, or referenced in a specification,
     *     model, design or an instance.
     */
    public EffectEvidenceSynthesisBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - A formal identifier that is used to identify this effect evidence
     *     synthesis when it is represented in other formats, or referenced in a specification,
     *     model, design or an instance.
     */
    public EffectEvidenceSynthesisBuilder.Impl withIdentifier(
        @NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public EffectEvidenceSynthesisBuilder.Impl withIdentifier(
        @NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param useContext - The content was developed with a focus and intent of supporting the
     *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
     *     may be references to specific programs (insurance plans, studies, ...) and may be used to
     *     assist with indexing and searching for appropriate effect evidence synthesis instances.
     */
    public EffectEvidenceSynthesisBuilder.Impl withUseContext(@NonNull UsageContext... useContext) {
      this.useContext = Arrays.asList(useContext);
      return this;
    }
    /**
     * @param useContext - The content was developed with a focus and intent of supporting the
     *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
     *     may be references to specific programs (insurance plans, studies, ...) and may be used to
     *     assist with indexing and searching for appropriate effect evidence synthesis instances.
     */
    public EffectEvidenceSynthesisBuilder.Impl withUseContext(
        @NonNull Collection<UsageContext> useContext) {
      this.useContext = Collections.unmodifiableCollection(useContext);
      return this;
    }

    public EffectEvidenceSynthesisBuilder.Impl withUseContext(
        @NonNull UsageContextBuilder... useContext) {
      this.useContext = Arrays.stream(useContext).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param description - A free text natural language description of the effect evidence
     *     synthesis from a consumer's perspective.
     */
    public EffectEvidenceSynthesisBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /**
     * @param jurisdiction - A legal or geographic region in which the effect evidence synthesis is
     *     intended to be used.
     */
    public EffectEvidenceSynthesisBuilder.Impl withJurisdiction(
        @NonNull CodeableConcept... jurisdiction) {
      this.jurisdiction = Arrays.asList(jurisdiction);
      return this;
    }
    /**
     * @param jurisdiction - A legal or geographic region in which the effect evidence synthesis is
     *     intended to be used.
     */
    public EffectEvidenceSynthesisBuilder.Impl withJurisdiction(
        @NonNull Collection<CodeableConcept> jurisdiction) {
      this.jurisdiction = Collections.unmodifiableCollection(jurisdiction);
      return this;
    }

    public EffectEvidenceSynthesisBuilder.Impl withJurisdiction(
        @NonNull CodeableConceptBuilder... jurisdiction) {
      this.jurisdiction = Arrays.stream(jurisdiction).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param approvalDate - The date on which the resource content was approved by the publisher.
     *     Approval happens once when the content is officially approved for usage.
     */
    public EffectEvidenceSynthesisBuilder.Impl withApprovalDate(@NonNull FHIRDate approvalDate) {
      this.approvalDate = Optional.of(approvalDate);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public EffectEvidenceSynthesisBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /** @param synthesisType - Type of synthesis eg meta-analysis. */
    public EffectEvidenceSynthesisBuilder.Impl withSynthesisType(
        @NonNull CodeableConcept synthesisType) {
      this.synthesisType = Optional.of(synthesisType);
      return this;
    }

    public EffectEvidenceSynthesisBuilder.Impl withSynthesisType(
        @NonNull CodeableConceptBuilder synthesisType) {
      this.synthesisType = Optional.of(synthesisType.build());
      return this;
    }
    /**
     * @param lastReviewDate - The date on which the resource content was last reviewed. Review
     *     happens periodically after approval but does not change the original approval date.
     */
    public EffectEvidenceSynthesisBuilder.Impl withLastReviewDate(
        @NonNull FHIRDate lastReviewDate) {
      this.lastReviewDate = Optional.of(lastReviewDate);
      return this;
    }
    /**
     * @param effectivePeriod - The period during which the effect evidence synthesis content was or
     *     is planned to be in active use.
     */
    public EffectEvidenceSynthesisBuilder.Impl withEffectivePeriod(
        @NonNull Period effectivePeriod) {
      this.effectivePeriod = Optional.of(effectivePeriod);
      return this;
    }

    public EffectEvidenceSynthesisBuilder.Impl withEffectivePeriod(
        @NonNull PeriodBuilder effectivePeriod) {
      this.effectivePeriod = Optional.of(effectivePeriod.build());
      return this;
    }
    /**
     * @param relatedArtifact - Related artifacts such as additional documentation, justification,
     *     or bibliographic references.
     */
    public EffectEvidenceSynthesisBuilder.Impl withRelatedArtifact(
        @NonNull RelatedArtifact... relatedArtifact) {
      this.relatedArtifact = Arrays.asList(relatedArtifact);
      return this;
    }
    /**
     * @param relatedArtifact - Related artifacts such as additional documentation, justification,
     *     or bibliographic references.
     */
    public EffectEvidenceSynthesisBuilder.Impl withRelatedArtifact(
        @NonNull Collection<RelatedArtifact> relatedArtifact) {
      this.relatedArtifact = Collections.unmodifiableCollection(relatedArtifact);
      return this;
    }

    public EffectEvidenceSynthesisBuilder.Impl withRelatedArtifact(
        @NonNull RelatedArtifactBuilder... relatedArtifact) {
      this.relatedArtifact = Arrays.stream(relatedArtifact).map(e -> e.build()).collect(toList());
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
    public EffectEvidenceSynthesisBuilder.Impl withModifierExtension(
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
    public EffectEvidenceSynthesisBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public EffectEvidenceSynthesisBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param sampleSize - A description of the size of the sample involved in the synthesis. */
    public EffectEvidenceSynthesisBuilder.Impl withSampleSize(
        @NonNull EffectEvidenceSynthesis.SampleSize sampleSize) {
      this.sampleSize = Optional.of(sampleSize);
      return this;
    }

    public EffectEvidenceSynthesisBuilder.Impl withSampleSize(
        @NonNull EffectEvidenceSynthesis_SampleSizeBuilder sampleSize) {
      this.sampleSize = Optional.of(sampleSize.build());
      return this;
    }
    /**
     * @param resultsByExposure - A description of the results for each exposure considered in the
     *     effect estimate.
     */
    public EffectEvidenceSynthesisBuilder.Impl withResultsByExposure(
        @NonNull EffectEvidenceSynthesis.ResultsByExposure... resultsByExposure) {
      this.resultsByExposure = Arrays.asList(resultsByExposure);
      return this;
    }
    /**
     * @param resultsByExposure - A description of the results for each exposure considered in the
     *     effect estimate.
     */
    public EffectEvidenceSynthesisBuilder.Impl withResultsByExposure(
        @NonNull Collection<EffectEvidenceSynthesis.ResultsByExposure> resultsByExposure) {
      this.resultsByExposure = Collections.unmodifiableCollection(resultsByExposure);
      return this;
    }

    public EffectEvidenceSynthesisBuilder.Impl withResultsByExposure(
        @NonNull EffectEvidenceSynthesis_ResultsByExposureBuilder... resultsByExposure) {
      this.resultsByExposure =
          Arrays.stream(resultsByExposure).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param certainty - A description of the certainty of the effect estimate. */
    public EffectEvidenceSynthesisBuilder.Impl withCertainty(
        @NonNull EffectEvidenceSynthesis.Certainty... certainty) {
      this.certainty = Arrays.asList(certainty);
      return this;
    }
    /** @param certainty - A description of the certainty of the effect estimate. */
    public EffectEvidenceSynthesisBuilder.Impl withCertainty(
        @NonNull Collection<EffectEvidenceSynthesis.Certainty> certainty) {
      this.certainty = Collections.unmodifiableCollection(certainty);
      return this;
    }

    public EffectEvidenceSynthesisBuilder.Impl withCertainty(
        @NonNull EffectEvidenceSynthesis_CertaintyBuilder... certainty) {
      this.certainty = Arrays.stream(certainty).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param effectEstimate - The estimated effect of the exposure variant. */
    public EffectEvidenceSynthesisBuilder.Impl withEffectEstimate(
        @NonNull EffectEvidenceSynthesis.EffectEstimate... effectEstimate) {
      this.effectEstimate = Arrays.asList(effectEstimate);
      return this;
    }
    /** @param effectEstimate - The estimated effect of the exposure variant. */
    public EffectEvidenceSynthesisBuilder.Impl withEffectEstimate(
        @NonNull Collection<EffectEvidenceSynthesis.EffectEstimate> effectEstimate) {
      this.effectEstimate = Collections.unmodifiableCollection(effectEstimate);
      return this;
    }

    public EffectEvidenceSynthesisBuilder.Impl withEffectEstimate(
        @NonNull EffectEvidenceSynthesis_EffectEstimateBuilder... effectEstimate) {
      this.effectEstimate = Arrays.stream(effectEstimate).map(e -> e.build()).collect(toList());
      return this;
    }

    public EffectEvidenceSynthesisBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public EffectEvidenceSynthesis build() {
      return new EffectEvidenceSynthesis(
          OptionConverters.toScala(id),
          OptionConverters.toScala(url),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(name),
          OptionConverters.toScala(date),
          note.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(title),
          topic.stream().collect(new LitSeqJCollector<>()),
          status,
          author.stream().collect(new LitSeqJCollector<>()),
          editor.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(version),
          contact.stream().collect(new LitSeqJCollector<>()),
          outcome,
          OptionConverters.toScala(language),
          reviewer.stream().collect(new LitSeqJCollector<>()),
          endorser.stream().collect(new LitSeqJCollector<>()),
          exposure,
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(publisher),
          OptionConverters.toScala(copyright),
          OptionConverters.toScala(studyType),
          identifier.stream().collect(new LitSeqJCollector<>()),
          useContext.stream().collect(new LitSeqJCollector<>()),
          population,
          OptionConverters.toScala(description),
          jurisdiction.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(approvalDate),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(synthesisType),
          OptionConverters.toScala(lastReviewDate),
          OptionConverters.toScala(effectivePeriod),
          relatedArtifact.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          exposureAlternative,
          OptionConverters.toScala(sampleSize),
          resultsByExposure.stream().collect(new LitSeqJCollector<>()),
          certainty.stream().collect(new LitSeqJCollector<>()),
          effectEstimate.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
