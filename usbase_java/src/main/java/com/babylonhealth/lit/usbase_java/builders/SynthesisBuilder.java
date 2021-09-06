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

public interface SynthesisBuilder extends EvidenceBuilder {
  public Synthesis build();

  public static Impl init(
      PUBLICATION_STATUS status,
      Collection<Reference> outcome,
      Collection<Reference> exposureVariant,
      Reference exposureBackground) {
    return new Impl(status, outcome, exposureVariant, exposureBackground);
  }

  public static Impl builder(
      PUBLICATION_STATUS status,
      Collection<ReferenceBuilder> outcome,
      Collection<ReferenceBuilder> exposureVariant,
      ReferenceBuilder exposureBackground) {
    return new Impl(
        status,
        new LitSeq<>(outcome).map(ReferenceBuilder::build),
        new LitSeq<>(exposureVariant).map(ReferenceBuilder::build),
        exposureBackground.build());
  }

  public class Impl implements SynthesisBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> url = Optional.empty();
    private Optional<Meta> meta =
        Optional.of(
            MetaBuilder.init()
                .withProfile("http://hl7.org/fhir/StructureDefinition/synthesis")
                .build());
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
    private Collection<Reference> outcome;
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
    private Collection<UsageContext> useContext = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Collection<CodeableConcept> jurisdiction = Collections.emptyList();
    private Optional<FHIRDate> approvalDate = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<FHIRDate> lastReviewDate = Optional.empty();
    private Optional<Period> effectivePeriod = Optional.empty();
    private Collection<RelatedArtifact> relatedArtifact = Collections.emptyList();
    private Collection<Reference> exposureVariant;
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Reference exposureBackground;

    /**
     * Required fields for {@link Synthesis}
     *
     * @param status - The status of this evidence. Enables tracking the life-cycle of the content.
     * @param outcome - A reference to a EvidenceVariable resomece that defines the outcome for the
     *     research.
     * @param exposureVariant - A reference to a EvidenceVariable resource that defines the exposure
     *     for the research.
     * @param exposureBackground - A reference to a EvidenceVariable resource that defines the
     *     population for the research.
     */
    public Impl(
        PUBLICATION_STATUS status,
        Collection<Reference> outcome,
        Collection<Reference> exposureVariant,
        Reference exposureBackground) {
      this.status = status;
      this.outcome = outcome;
      this.exposureVariant = exposureVariant;
      this.exposureBackground = exposureBackground;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public SynthesisBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param url - An absolute URI that is used to identify this evidence when it is referenced in
     *     a specification, model, design or an instance; also called its canonical identifier. This
     *     SHOULD be globally unique and SHOULD be a literal address at which at which an
     *     authoritative instance of this evidence is (or will be) published. This URL can be the
     *     target of a canonical reference. It SHALL remain the same when the evidence is stored on
     *     different servers.
     */
    public SynthesisBuilder.Impl withUrl(@NonNull String url) {
      this.url = Optional.of(url);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public SynthesisBuilder.Impl withMeta(@NonNull Meta meta) {
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
    public SynthesisBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }
    /**
     * @param name - A natural language name identifying the evidence. This name should be usable as
     *     an identifier for the module by machine processing applications such as code generation.
     */
    public SynthesisBuilder.Impl withName(@NonNull String name) {
      this.name = Optional.of(name);
      return this;
    }
    /**
     * @param date - The date (and optionally time) when the evidence was published. The date must
     *     change when the business version changes and it must change if the status code changes.
     *     In addition, it should change when the substantive content of the evidence changes.
     */
    public SynthesisBuilder.Impl withDate(@NonNull FHIRDateTime date) {
      this.date = Optional.of(date);
      return this;
    }
    /** @param note - A human-readable string to clarify or explain concepts about the resource. */
    public SynthesisBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /** @param note - A human-readable string to clarify or explain concepts about the resource. */
    public SynthesisBuilder.Impl withNote(@NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }
    /** @param title - A short, descriptive, user-friendly title for the evidence. */
    public SynthesisBuilder.Impl withTitle(@NonNull String title) {
      this.title = Optional.of(title);
      return this;
    }
    /**
     * @param topic - Descriptive topics related to the content of the Evidence. Topics provide a
     *     high-level categorization grouping types of Evidences that can be useful for filtering
     *     and searching.
     */
    public SynthesisBuilder.Impl withTopic(@NonNull CodeableConcept... topic) {
      this.topic = Arrays.asList(topic);
      return this;
    }
    /**
     * @param topic - Descriptive topics related to the content of the Evidence. Topics provide a
     *     high-level categorization grouping types of Evidences that can be useful for filtering
     *     and searching.
     */
    public SynthesisBuilder.Impl withTopic(@NonNull Collection<CodeableConcept> topic) {
      this.topic = Collections.unmodifiableCollection(topic);
      return this;
    }
    /**
     * @param author - An individiual or organization primarily involved in the creation and
     *     maintenance of the content.
     */
    public SynthesisBuilder.Impl withAuthor(@NonNull ContactDetail... author) {
      this.author = Arrays.asList(author);
      return this;
    }
    /**
     * @param author - An individiual or organization primarily involved in the creation and
     *     maintenance of the content.
     */
    public SynthesisBuilder.Impl withAuthor(@NonNull Collection<ContactDetail> author) {
      this.author = Collections.unmodifiableCollection(author);
      return this;
    }
    /**
     * @param editor - An individual or organization primarily responsible for internal coherence of
     *     the content.
     */
    public SynthesisBuilder.Impl withEditor(@NonNull ContactDetail... editor) {
      this.editor = Arrays.asList(editor);
      return this;
    }
    /**
     * @param editor - An individual or organization primarily responsible for internal coherence of
     *     the content.
     */
    public SynthesisBuilder.Impl withEditor(@NonNull Collection<ContactDetail> editor) {
      this.editor = Collections.unmodifiableCollection(editor);
      return this;
    }
    /**
     * @param version - The identifier that is used to identify this version of the evidence when it
     *     is referenced in a specification, model, design or instance. This is an arbitrary value
     *     managed by the evidence author and is not expected to be globally unique. For example, it
     *     might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also
     *     no expectation that versions can be placed in a lexicographical sequence.
     */
    public SynthesisBuilder.Impl withVersion(@NonNull String version) {
      this.version = Optional.of(version);
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in finding and communicating with the
     *     publisher.
     */
    public SynthesisBuilder.Impl withContact(@NonNull ContactDetail... contact) {
      this.contact = Arrays.asList(contact);
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in finding and communicating with the
     *     publisher.
     */
    public SynthesisBuilder.Impl withContact(@NonNull Collection<ContactDetail> contact) {
      this.contact = Collections.unmodifiableCollection(contact);
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public SynthesisBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param subtitle - An explanatory or alternate title for the Evidence giving additional
     *     information about its content.
     */
    public SynthesisBuilder.Impl withSubtitle(@NonNull String subtitle) {
      this.subtitle = Optional.of(subtitle);
      return this;
    }
    /**
     * @param reviewer - An individual or organization primarily responsible for review of some
     *     aspect of the content.
     */
    public SynthesisBuilder.Impl withReviewer(@NonNull ContactDetail... reviewer) {
      this.reviewer = Arrays.asList(reviewer);
      return this;
    }
    /**
     * @param reviewer - An individual or organization primarily responsible for review of some
     *     aspect of the content.
     */
    public SynthesisBuilder.Impl withReviewer(@NonNull Collection<ContactDetail> reviewer) {
      this.reviewer = Collections.unmodifiableCollection(reviewer);
      return this;
    }
    /**
     * @param endorser - An individual or organization responsible for officially endorsing the
     *     content for use in some setting.
     */
    public SynthesisBuilder.Impl withEndorser(@NonNull ContactDetail... endorser) {
      this.endorser = Arrays.asList(endorser);
      return this;
    }
    /**
     * @param endorser - An individual or organization responsible for officially endorsing the
     *     content for use in some setting.
     */
    public SynthesisBuilder.Impl withEndorser(@NonNull Collection<ContactDetail> endorser) {
      this.endorser = Collections.unmodifiableCollection(endorser);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public SynthesisBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public SynthesisBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
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
    public SynthesisBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public SynthesisBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }
    /**
     * @param publisher - The name of the organization or individual that published the evidence.
     */
    public SynthesisBuilder.Impl withPublisher(@NonNull String publisher) {
      this.publisher = Optional.of(publisher);
      return this;
    }
    /**
     * @param copyright - A copyright statement relating to the evidence and/or its contents.
     *     Copyright statements are generally legal restrictions on the use and publishing of the
     *     evidence.
     */
    public SynthesisBuilder.Impl withCopyright(@NonNull String copyright) {
      this.copyright = Optional.of(copyright);
      return this;
    }
    /**
     * @param identifier - A formal identifier that is used to identify this evidence when it is
     *     represented in other formats, or referenced in a specification, model, design or an
     *     instance.
     */
    public SynthesisBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - A formal identifier that is used to identify this evidence when it is
     *     represented in other formats, or referenced in a specification, model, design or an
     *     instance.
     */
    public SynthesisBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }
    /**
     * @param shortTitle - The short title provides an alternate title for use in informal
     *     descriptive contexts where the full, formal title is not necessary.
     */
    public SynthesisBuilder.Impl withShortTitle(@NonNull String shortTitle) {
      this.shortTitle = Optional.of(shortTitle);
      return this;
    }
    /**
     * @param useContext - The content was developed with a focus and intent of supporting the
     *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
     *     may be references to specific programs (insurance plans, studies, ...) and may be used to
     *     assist with indexing and searching for appropriate evidence instances.
     */
    public SynthesisBuilder.Impl withUseContext(@NonNull UsageContext... useContext) {
      this.useContext = Arrays.asList(useContext);
      return this;
    }
    /**
     * @param useContext - The content was developed with a focus and intent of supporting the
     *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
     *     may be references to specific programs (insurance plans, studies, ...) and may be used to
     *     assist with indexing and searching for appropriate evidence instances.
     */
    public SynthesisBuilder.Impl withUseContext(@NonNull Collection<UsageContext> useContext) {
      this.useContext = Collections.unmodifiableCollection(useContext);
      return this;
    }
    /**
     * @param description - A free text natural language description of the evidence from a
     *     consumer's perspective.
     */
    public SynthesisBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /**
     * @param jurisdiction - A legal or geographic region in which the evidence is intended to be
     *     used.
     */
    public SynthesisBuilder.Impl withJurisdiction(@NonNull CodeableConcept... jurisdiction) {
      this.jurisdiction = Arrays.asList(jurisdiction);
      return this;
    }
    /**
     * @param jurisdiction - A legal or geographic region in which the evidence is intended to be
     *     used.
     */
    public SynthesisBuilder.Impl withJurisdiction(
        @NonNull Collection<CodeableConcept> jurisdiction) {
      this.jurisdiction = Collections.unmodifiableCollection(jurisdiction);
      return this;
    }
    /**
     * @param approvalDate - The date on which the resource content was approved by the publisher.
     *     Approval happens once when the content is officially approved for usage.
     */
    public SynthesisBuilder.Impl withApprovalDate(@NonNull FHIRDate approvalDate) {
      this.approvalDate = Optional.of(approvalDate);
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public SynthesisBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /**
     * @param lastReviewDate - The date on which the resource content was last reviewed. Review
     *     happens periodically after approval but does not change the original approval date.
     */
    public SynthesisBuilder.Impl withLastReviewDate(@NonNull FHIRDate lastReviewDate) {
      this.lastReviewDate = Optional.of(lastReviewDate);
      return this;
    }
    /**
     * @param effectivePeriod - The period during which the evidence content was or is planned to be
     *     in active use.
     */
    public SynthesisBuilder.Impl withEffectivePeriod(@NonNull Period effectivePeriod) {
      this.effectivePeriod = Optional.of(effectivePeriod);
      return this;
    }
    /**
     * @param relatedArtifact - Related artifacts such as additional documentation, justification,
     *     or bibliographic references.
     */
    public SynthesisBuilder.Impl withRelatedArtifact(@NonNull RelatedArtifact... relatedArtifact) {
      this.relatedArtifact = Arrays.asList(relatedArtifact);
      return this;
    }
    /**
     * @param relatedArtifact - Related artifacts such as additional documentation, justification,
     *     or bibliographic references.
     */
    public SynthesisBuilder.Impl withRelatedArtifact(
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
    public SynthesisBuilder.Impl withModifierExtension(@NonNull Extension... modifierExtension) {
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
    public SynthesisBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public SynthesisBuilder withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Synthesis build() {
      return new Synthesis(
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
          outcome.stream().collect(new NonEmptyLitSeqJCollector<>()),
          OptionConverters.toScala(language),
          OptionConverters.toScala(subtitle),
          reviewer.stream().collect(new LitSeqJCollector<>()),
          endorser.stream().collect(new LitSeqJCollector<>()),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(publisher),
          OptionConverters.toScala(copyright),
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(shortTitle),
          useContext.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          jurisdiction.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(approvalDate),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(lastReviewDate),
          OptionConverters.toScala(effectivePeriod),
          relatedArtifact.stream().collect(new LitSeqJCollector<>()),
          exposureVariant.stream().collect(new NonEmptyLitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          exposureBackground,
          LitUtils.emptyMetaElMap());
    }
  }
}
