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
import com.babylonhealth.lit.hl7.PUBLICATION_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface EvidenceBuilder extends MetadataResourceBuilder {
  public Evidence build();

  public static Impl init(
      PUBLICATION_STATUS status, Collection<Evidence.VariableDefinition> variableDefinition) {
    return new Impl(status, variableDefinition);
  }

  public static Impl builder(
      PUBLICATION_STATUS status,
      Collection<Evidence_VariableDefinitionBuilder> variableDefinition) {
    return new Impl(
        status, new LitSeq<>(variableDefinition).map(Evidence_VariableDefinitionBuilder::build));
  }

  public static ChoiceMarkdownOrReference citeAs(String s) {
    return new ChoiceMarkdownOrReference(s);
  }

  public static ChoiceMarkdownOrReference citeAs(Reference r) {
    return new ChoiceMarkdownOrReference(r);
  }

  public class Impl implements EvidenceBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> url = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<FHIRDateTime> date = Optional.empty();
    private Collection<Annotation> note = Collections.emptyList();
    private Optional<String> title = Optional.empty();
    private PUBLICATION_STATUS status;
    private Collection<ContactDetail> author = Collections.emptyList();
    private Collection<ContactDetail> editor = Collections.emptyList();
    private Optional<String> version = Optional.empty();
    private Collection<ContactDetail> contact = Collections.emptyList();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<ContactDetail> reviewer = Collections.emptyList();
    private Collection<ContactDetail> endorser = Collections.emptyList();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<ChoiceMarkdownOrReference> citeAs = Optional.empty();
    private Optional<String> publisher = Optional.empty();
    private Optional<String> assertion = Optional.empty();
    private Optional<CodeableConcept> studyType = Optional.empty();
    private Collection<Statistic> statistic = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Collection<UsageContext> useContext = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Optional<FHIRDate> approvalDate = Optional.empty();
    private Collection<OrderedDistribution> distribution = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<CodeableConcept> synthesisType = Optional.empty();
    private Optional<FHIRDate> lastReviewDate = Optional.empty();
    private Collection<RelatedArtifact> relatedArtifact = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Collection<Evidence.Certainty> certainty = Collections.emptyList();
    private Collection<Evidence.VariableDefinition> variableDefinition;

    /**
     * Required fields for {@link Evidence}
     *
     * @param status - The status of this summary. Enables tracking the life-cycle of the content.
     * @param variableDefinition - Evidence variable such as population, exposure, or outcome.
     */
    public Impl(
        PUBLICATION_STATUS status, Collection<Evidence.VariableDefinition> variableDefinition) {
      this.status = status;
      this.variableDefinition = variableDefinition;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public EvidenceBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param url - An absolute URI that is used to identify this evidence when it is referenced in
     *     a specification, model, design or an instance; also called its canonical identifier. This
     *     SHOULD be globally unique and SHOULD be a literal address at which at which an
     *     authoritative instance of this summary is (or will be) published. This URL can be the
     *     target of a canonical reference. It SHALL remain the same when the summary is stored on
     *     different servers.
     */
    public EvidenceBuilder.Impl withUrl(@NonNull String url) {
      this.url = Optional.of(url);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public EvidenceBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public EvidenceBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public EvidenceBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public EvidenceBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /**
     * @param date - The date (and optionally time) when the summary was published. The date must
     *     change when the business version changes and it must change if the status code changes.
     *     In addition, it should change when the substantive content of the summary changes.
     */
    public EvidenceBuilder.Impl withDate(@NonNull FHIRDateTime date) {
      this.date = Optional.of(date);
      return this;
    }
    /** @param note - Footnotes and/or explanatory notes. */
    public EvidenceBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /** @param note - Footnotes and/or explanatory notes. */
    public EvidenceBuilder.Impl withNote(@NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public EvidenceBuilder.Impl withNote(@NonNull AnnotationBuilder... note) {
      this.note = Arrays.stream(note).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param title - A short, descriptive, user-friendly title for the summary. */
    public EvidenceBuilder.Impl withTitle(@NonNull String title) {
      this.title = Optional.of(title);
      return this;
    }
    /**
     * @param author - An individiual, organization, or device primarily involved in the creation
     *     and maintenance of the content.
     */
    public EvidenceBuilder.Impl withAuthor(@NonNull ContactDetail... author) {
      this.author = Arrays.asList(author);
      return this;
    }
    /**
     * @param author - An individiual, organization, or device primarily involved in the creation
     *     and maintenance of the content.
     */
    public EvidenceBuilder.Impl withAuthor(@NonNull Collection<ContactDetail> author) {
      this.author = Collections.unmodifiableCollection(author);
      return this;
    }

    public EvidenceBuilder.Impl withAuthor(@NonNull ContactDetailBuilder... author) {
      this.author = Arrays.stream(author).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param editor - An individiual, organization, or device primarily responsible for internal
     *     coherence of the content.
     */
    public EvidenceBuilder.Impl withEditor(@NonNull ContactDetail... editor) {
      this.editor = Arrays.asList(editor);
      return this;
    }
    /**
     * @param editor - An individiual, organization, or device primarily responsible for internal
     *     coherence of the content.
     */
    public EvidenceBuilder.Impl withEditor(@NonNull Collection<ContactDetail> editor) {
      this.editor = Collections.unmodifiableCollection(editor);
      return this;
    }

    public EvidenceBuilder.Impl withEditor(@NonNull ContactDetailBuilder... editor) {
      this.editor = Arrays.stream(editor).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param version - The identifier that is used to identify this version of the summary when it
     *     is referenced in a specification, model, design or instance. This is an arbitrary value
     *     managed by the summary author and is not expected to be globally unique. For example, it
     *     might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also
     *     no expectation that versions can be placed in a lexicographical sequence.
     */
    public EvidenceBuilder.Impl withVersion(@NonNull String version) {
      this.version = Optional.of(version);
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in finding and communicating with the
     *     publisher.
     */
    public EvidenceBuilder.Impl withContact(@NonNull ContactDetail... contact) {
      this.contact = Arrays.asList(contact);
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in finding and communicating with the
     *     publisher.
     */
    public EvidenceBuilder.Impl withContact(@NonNull Collection<ContactDetail> contact) {
      this.contact = Collections.unmodifiableCollection(contact);
      return this;
    }

    public EvidenceBuilder.Impl withContact(@NonNull ContactDetailBuilder... contact) {
      this.contact = Arrays.stream(contact).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public EvidenceBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param reviewer - An individiual, organization, or device primarily responsible for review of
     *     some aspect of the content.
     */
    public EvidenceBuilder.Impl withReviewer(@NonNull ContactDetail... reviewer) {
      this.reviewer = Arrays.asList(reviewer);
      return this;
    }
    /**
     * @param reviewer - An individiual, organization, or device primarily responsible for review of
     *     some aspect of the content.
     */
    public EvidenceBuilder.Impl withReviewer(@NonNull Collection<ContactDetail> reviewer) {
      this.reviewer = Collections.unmodifiableCollection(reviewer);
      return this;
    }

    public EvidenceBuilder.Impl withReviewer(@NonNull ContactDetailBuilder... reviewer) {
      this.reviewer = Arrays.stream(reviewer).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param endorser - An individiual, organization, or device responsible for officially
     *     endorsing the content for use in some setting.
     */
    public EvidenceBuilder.Impl withEndorser(@NonNull ContactDetail... endorser) {
      this.endorser = Arrays.asList(endorser);
      return this;
    }
    /**
     * @param endorser - An individiual, organization, or device responsible for officially
     *     endorsing the content for use in some setting.
     */
    public EvidenceBuilder.Impl withEndorser(@NonNull Collection<ContactDetail> endorser) {
      this.endorser = Collections.unmodifiableCollection(endorser);
      return this;
    }

    public EvidenceBuilder.Impl withEndorser(@NonNull ContactDetailBuilder... endorser) {
      this.endorser = Arrays.stream(endorser).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, nor can they have
     *     their own independent transaction scope.
     */
    public EvidenceBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, nor can they have
     *     their own independent transaction scope.
     */
    public EvidenceBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public EvidenceBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public EvidenceBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public EvidenceBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public EvidenceBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param citeAs - Citation Resource or display of suggested citation for this evidence. Field
     *     is a 'choice' field. Type should be one of String, Reference. To pass the value in, wrap
     *     with one of the EvidenceBuilder.citeAs static methods
     */
    public EvidenceBuilder.Impl withCiteAs(@NonNull ChoiceMarkdownOrReference citeAs) {
      this.citeAs = Optional.of(citeAs);
      return this;
    }
    /**
     * @param publisher - The name of the organization or individual that published the evidence.
     */
    public EvidenceBuilder.Impl withPublisher(@NonNull String publisher) {
      this.publisher = Optional.of(publisher);
      return this;
    }
    /** @param assertion - Declarative description of the Evidence. */
    public EvidenceBuilder.Impl withAssertion(@NonNull String assertion) {
      this.assertion = Optional.of(assertion);
      return this;
    }
    /** @param studyType - The type of study that produced this evidence. */
    public EvidenceBuilder.Impl withStudyType(@NonNull CodeableConcept studyType) {
      this.studyType = Optional.of(studyType);
      return this;
    }

    public EvidenceBuilder.Impl withStudyType(@NonNull CodeableConceptBuilder studyType) {
      this.studyType = Optional.of(studyType.build());
      return this;
    }
    /** @param statistic - Values and parameters for a single statistic. */
    public EvidenceBuilder.Impl withStatistic(@NonNull Statistic... statistic) {
      this.statistic = Arrays.asList(statistic);
      return this;
    }
    /** @param statistic - Values and parameters for a single statistic. */
    public EvidenceBuilder.Impl withStatistic(@NonNull Collection<Statistic> statistic) {
      this.statistic = Collections.unmodifiableCollection(statistic);
      return this;
    }

    public EvidenceBuilder.Impl withStatistic(@NonNull StatisticBuilder... statistic) {
      this.statistic = Arrays.stream(statistic).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param identifier - A formal identifier that is used to identify this summary when it is
     *     represented in other formats, or referenced in a specification, model, design or an
     *     instance.
     */
    public EvidenceBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - A formal identifier that is used to identify this summary when it is
     *     represented in other formats, or referenced in a specification, model, design or an
     *     instance.
     */
    public EvidenceBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public EvidenceBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param useContext - The content was developed with a focus and intent of supporting the
     *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
     *     may be references to specific programs (insurance plans, studies, ...) and may be used to
     *     assist with indexing and searching for appropriate evidence instances.
     */
    public EvidenceBuilder.Impl withUseContext(@NonNull UsageContext... useContext) {
      this.useContext = Arrays.asList(useContext);
      return this;
    }
    /**
     * @param useContext - The content was developed with a focus and intent of supporting the
     *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
     *     may be references to specific programs (insurance plans, studies, ...) and may be used to
     *     assist with indexing and searching for appropriate evidence instances.
     */
    public EvidenceBuilder.Impl withUseContext(@NonNull Collection<UsageContext> useContext) {
      this.useContext = Collections.unmodifiableCollection(useContext);
      return this;
    }

    public EvidenceBuilder.Impl withUseContext(@NonNull UsageContextBuilder... useContext) {
      this.useContext = Arrays.stream(useContext).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param description - A free text natural language description of the evidence from a
     *     consumer's perspective.
     */
    public EvidenceBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /**
     * @param approvalDate - The date on which the resource content was approved by the publisher.
     *     Approval happens once when the content is officially approved for usage.
     */
    public EvidenceBuilder.Impl withApprovalDate(@NonNull FHIRDate approvalDate) {
      this.approvalDate = Optional.of(approvalDate);
      return this;
    }
    /** @param distribution - An ordered group of statistics. */
    public EvidenceBuilder.Impl withDistribution(@NonNull OrderedDistribution... distribution) {
      this.distribution = Arrays.asList(distribution);
      return this;
    }
    /** @param distribution - An ordered group of statistics. */
    public EvidenceBuilder.Impl withDistribution(
        @NonNull Collection<OrderedDistribution> distribution) {
      this.distribution = Collections.unmodifiableCollection(distribution);
      return this;
    }

    public EvidenceBuilder.Impl withDistribution(
        @NonNull OrderedDistributionBuilder... distribution) {
      this.distribution = Arrays.stream(distribution).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public EvidenceBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /** @param synthesisType - The method to combine studies. */
    public EvidenceBuilder.Impl withSynthesisType(@NonNull CodeableConcept synthesisType) {
      this.synthesisType = Optional.of(synthesisType);
      return this;
    }

    public EvidenceBuilder.Impl withSynthesisType(@NonNull CodeableConceptBuilder synthesisType) {
      this.synthesisType = Optional.of(synthesisType.build());
      return this;
    }
    /**
     * @param lastReviewDate - The date on which the resource content was last reviewed. Review
     *     happens periodically after approval but does not change the original approval date.
     */
    public EvidenceBuilder.Impl withLastReviewDate(@NonNull FHIRDate lastReviewDate) {
      this.lastReviewDate = Optional.of(lastReviewDate);
      return this;
    }
    /** @param relatedArtifact - Link or citation to artifact associated with the summary. */
    public EvidenceBuilder.Impl withRelatedArtifact(@NonNull RelatedArtifact... relatedArtifact) {
      this.relatedArtifact = Arrays.asList(relatedArtifact);
      return this;
    }
    /** @param relatedArtifact - Link or citation to artifact associated with the summary. */
    public EvidenceBuilder.Impl withRelatedArtifact(
        @NonNull Collection<RelatedArtifact> relatedArtifact) {
      this.relatedArtifact = Collections.unmodifiableCollection(relatedArtifact);
      return this;
    }

    public EvidenceBuilder.Impl withRelatedArtifact(
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
    public EvidenceBuilder.Impl withModifierExtension(@NonNull Extension... modifierExtension) {
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
    public EvidenceBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public EvidenceBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param certainty - Assessment of certainty, confidence in the estimates, or quality of the
     *     evidence.
     */
    public EvidenceBuilder.Impl withCertainty(@NonNull Evidence.Certainty... certainty) {
      this.certainty = Arrays.asList(certainty);
      return this;
    }
    /**
     * @param certainty - Assessment of certainty, confidence in the estimates, or quality of the
     *     evidence.
     */
    public EvidenceBuilder.Impl withCertainty(@NonNull Collection<Evidence.Certainty> certainty) {
      this.certainty = Collections.unmodifiableCollection(certainty);
      return this;
    }

    public EvidenceBuilder.Impl withCertainty(@NonNull Evidence_CertaintyBuilder... certainty) {
      this.certainty = Arrays.stream(certainty).map(e -> e.build()).collect(toList());
      return this;
    }

    public EvidenceBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public Evidence build() {
      return new Evidence(
          OptionConverters.toScala(id),
          OptionConverters.toScala(url),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(date),
          note.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(title),
          status,
          author.stream().collect(new LitSeqJCollector<>()),
          editor.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(version),
          contact.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(language),
          reviewer.stream().collect(new LitSeqJCollector<>()),
          endorser.stream().collect(new LitSeqJCollector<>()),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(citeAs),
          OptionConverters.toScala(publisher),
          OptionConverters.toScala(assertion),
          OptionConverters.toScala(studyType),
          statistic.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          useContext.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          OptionConverters.toScala(approvalDate),
          distribution.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(synthesisType),
          OptionConverters.toScala(lastReviewDate),
          relatedArtifact.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          certainty.stream().collect(new LitSeqJCollector<>()),
          variableDefinition.stream().collect(new NonEmptyLitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
