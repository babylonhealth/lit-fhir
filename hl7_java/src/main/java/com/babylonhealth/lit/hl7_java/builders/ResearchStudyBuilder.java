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

public interface ResearchStudyBuilder extends DomainResourceBuilder {
  public ResearchStudy build();

  public static Impl init(PUBLICATION_STATUS status) {
    return new Impl(status);
  }

  public static Impl builder(PUBLICATION_STATUS status) {
    return new Impl(status);
  }

  public class Impl implements ResearchStudyBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> url = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Optional<String> name = Optional.empty();
    private Optional<FHIRDateTime> date = Optional.empty();
    private Collection<Reference> site = Collections.emptyList();
    private Collection<Annotation> note = Collections.emptyList();
    private Optional<String> title = Optional.empty();
    private Optional<CodeableConcept> phase = Optional.empty();
    private Collection<Reference> partOf = Collections.emptyList();
    private PUBLICATION_STATUS status;
    private Optional<Period> period = Optional.empty();
    private Collection<Reference> result = Collections.emptyList();
    private Optional<String> version = Optional.empty();
    private Collection<CodeableConcept> keyword = Collections.emptyList();
    private Collection<ContactDetail> contact = Collections.emptyList();
    private Optional<Reference> sponsor = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Reference> protocol = Collections.emptyList();
    private Collection<CodeableConcept> category = Collections.emptyList();
    private Collection<CodeableConcept> location = Collections.emptyList();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<CodeableConcept> condition = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Optional<CodeableConcept> whyStopped = Optional.empty();
    private Optional<String> description = Optional.empty();
    private Collection<CodeableConcept> currentState = Collections.emptyList();
    private Optional<String> implicitRules = Optional.empty();
    private Collection<RelatedArtifact> relatedArtifact = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<CodeableConcept> primaryPurposeType = Optional.empty();
    private Optional<String> descriptionSummary = Optional.empty();
    private Optional<Reference> principalInvestigator = Optional.empty();
    private Collection<ResearchStudy.Label> label = Collections.emptyList();
    private Collection<ResearchStudy.Focus> focus = Collections.emptyList();
    private Collection<ResearchStudy.Objective> objective = Collections.emptyList();
    private Collection<ResearchStudy.StatusDate> statusDate = Collections.emptyList();
    private Optional<ResearchStudy.Recruitment> recruitment = Optional.empty();
    private Collection<ResearchStudy.WebLocation> webLocation = Collections.emptyList();
    private Collection<ResearchStudy.Classification> classification = Collections.emptyList();
    private Collection<ResearchStudy.OutcomeMeasure> outcomeMeasure = Collections.emptyList();
    private Collection<ResearchStudy.AssociatedParty> associatedParty = Collections.emptyList();
    private Collection<ResearchStudy.ComparisonGroup> comparisonGroup = Collections.emptyList();

    /**
     * Required fields for {@link ResearchStudy}
     *
     * @param status - The publication state of the resource (not of the study).
     */
    public Impl(PUBLICATION_STATUS status) {
      this.status = status;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ResearchStudyBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param url - Canonical identifier for this study resource, represented as a globally unique
     *     URI.
     */
    public ResearchStudyBuilder.Impl withUrl(@NonNull String url) {
      this.url = Optional.of(url);
      return this;
    }
    /**
     * @param meta - The metadata about the resource. This is content that is maintained by the
     *     infrastructure. Changes to the content might not always be associated with version
     *     changes to the resource.
     */
    public ResearchStudyBuilder.Impl withMeta(@NonNull Meta meta) {
      this.meta = Optional.of(meta);
      return this;
    }

    public ResearchStudyBuilder.Impl withMeta(@NonNull MetaBuilder meta) {
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
    public ResearchStudyBuilder.Impl withText(@NonNull Narrative text) {
      this.text = Optional.of(text);
      return this;
    }

    public ResearchStudyBuilder.Impl withText(@NonNull NarrativeBuilder text) {
      this.text = Optional.of(text.build());
      return this;
    }
    /** @param name - Name for this study (computer friendly). */
    public ResearchStudyBuilder.Impl withName(@NonNull String name) {
      this.name = Optional.of(name);
      return this;
    }
    /** @param date - Date the resource last changed. */
    public ResearchStudyBuilder.Impl withDate(@NonNull FHIRDateTime date) {
      this.date = Optional.of(date);
      return this;
    }
    /** @param site - A facility in which study activities are conducted. */
    public ResearchStudyBuilder.Impl withSite(@NonNull Reference... site) {
      this.site = Arrays.asList(site);
      return this;
    }
    /** @param site - A facility in which study activities are conducted. */
    public ResearchStudyBuilder.Impl withSite(@NonNull Collection<Reference> site) {
      this.site = Collections.unmodifiableCollection(site);
      return this;
    }

    public ResearchStudyBuilder.Impl withSite(@NonNull ReferenceBuilder... site) {
      this.site = Arrays.stream(site).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param note - Comments made about the study by the performer, subject or other participants.
     */
    public ResearchStudyBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /**
     * @param note - Comments made about the study by the performer, subject or other participants.
     */
    public ResearchStudyBuilder.Impl withNote(@NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public ResearchStudyBuilder.Impl withNote(@NonNull AnnotationBuilder... note) {
      this.note = Arrays.stream(note).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param title - A short, descriptive label for the study particularly for compouter use. */
    public ResearchStudyBuilder.Impl withTitle(@NonNull String title) {
      this.title = Optional.of(title);
      return this;
    }
    /**
     * @param phase - The stage in the progression of a therapy from initial experimental use in
     *     humans in clinical trials to post-market evaluation.
     */
    public ResearchStudyBuilder.Impl withPhase(@NonNull CodeableConcept phase) {
      this.phase = Optional.of(phase);
      return this;
    }

    public ResearchStudyBuilder.Impl withPhase(@NonNull CodeableConceptBuilder phase) {
      this.phase = Optional.of(phase.build());
      return this;
    }
    /**
     * @param partOf - A larger research study of which this particular study is a component or
     *     step.
     */
    public ResearchStudyBuilder.Impl withPartOf(@NonNull Reference... partOf) {
      this.partOf = Arrays.asList(partOf);
      return this;
    }
    /**
     * @param partOf - A larger research study of which this particular study is a component or
     *     step.
     */
    public ResearchStudyBuilder.Impl withPartOf(@NonNull Collection<Reference> partOf) {
      this.partOf = Collections.unmodifiableCollection(partOf);
      return this;
    }

    public ResearchStudyBuilder.Impl withPartOf(@NonNull ReferenceBuilder... partOf) {
      this.partOf = Arrays.stream(partOf).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param period - Identifies the start date and the expected (or actual, depending on status)
     *     end date for the study.
     */
    public ResearchStudyBuilder.Impl withPeriod(@NonNull Period period) {
      this.period = Optional.of(period);
      return this;
    }

    public ResearchStudyBuilder.Impl withPeriod(@NonNull PeriodBuilder period) {
      this.period = Optional.of(period.build());
      return this;
    }
    /**
     * @param result - Link to one or more sets of results generated by the study. Could also link
     *     to a research registry holding the results such as ClinicalTrials.gov.
     */
    public ResearchStudyBuilder.Impl withResult(@NonNull Reference... result) {
      this.result = Arrays.asList(result);
      return this;
    }
    /**
     * @param result - Link to one or more sets of results generated by the study. Could also link
     *     to a research registry holding the results such as ClinicalTrials.gov.
     */
    public ResearchStudyBuilder.Impl withResult(@NonNull Collection<Reference> result) {
      this.result = Collections.unmodifiableCollection(result);
      return this;
    }

    public ResearchStudyBuilder.Impl withResult(@NonNull ReferenceBuilder... result) {
      this.result = Arrays.stream(result).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param version - Business identifier for the study record. */
    public ResearchStudyBuilder.Impl withVersion(@NonNull String version) {
      this.version = Optional.of(version);
      return this;
    }
    /** @param keyword - Key terms to aid in searching for or filtering the study. */
    public ResearchStudyBuilder.Impl withKeyword(@NonNull CodeableConcept... keyword) {
      this.keyword = Arrays.asList(keyword);
      return this;
    }
    /** @param keyword - Key terms to aid in searching for or filtering the study. */
    public ResearchStudyBuilder.Impl withKeyword(@NonNull Collection<CodeableConcept> keyword) {
      this.keyword = Collections.unmodifiableCollection(keyword);
      return this;
    }

    public ResearchStudyBuilder.Impl withKeyword(@NonNull CodeableConceptBuilder... keyword) {
      this.keyword = Arrays.stream(keyword).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in learning more about or engaging with the
     *     study.
     */
    public ResearchStudyBuilder.Impl withContact(@NonNull ContactDetail... contact) {
      this.contact = Arrays.asList(contact);
      return this;
    }
    /**
     * @param contact - Contact details to assist a user in learning more about or engaging with the
     *     study.
     */
    public ResearchStudyBuilder.Impl withContact(@NonNull Collection<ContactDetail> contact) {
      this.contact = Collections.unmodifiableCollection(contact);
      return this;
    }

    public ResearchStudyBuilder.Impl withContact(@NonNull ContactDetailBuilder... contact) {
      this.contact = Arrays.stream(contact).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param sponsor - An organization that initiates the investigation and is legally responsible
     *     for the study.
     */
    public ResearchStudyBuilder.Impl withSponsor(@NonNull Reference sponsor) {
      this.sponsor = Optional.of(sponsor);
      return this;
    }

    public ResearchStudyBuilder.Impl withSponsor(@NonNull ReferenceBuilder sponsor) {
      this.sponsor = Optional.of(sponsor.build());
      return this;
    }
    /** @param language - The base language in which the resource is written. */
    public ResearchStudyBuilder.Impl withLanguage(@NonNull LANGUAGES language) {
      this.language = Optional.of(language);
      return this;
    }
    /**
     * @param protocol - The set of steps expected to be performed as part of the execution of the
     *     study.
     */
    public ResearchStudyBuilder.Impl withProtocol(@NonNull Reference... protocol) {
      this.protocol = Arrays.asList(protocol);
      return this;
    }
    /**
     * @param protocol - The set of steps expected to be performed as part of the execution of the
     *     study.
     */
    public ResearchStudyBuilder.Impl withProtocol(@NonNull Collection<Reference> protocol) {
      this.protocol = Collections.unmodifiableCollection(protocol);
      return this;
    }

    public ResearchStudyBuilder.Impl withProtocol(@NonNull ReferenceBuilder... protocol) {
      this.protocol = Arrays.stream(protocol).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param category - Codes categorizing the type of study such as investigational vs.
     *     observational, type of blinding, type of randomization, safety vs. efficacy, etc.
     */
    public ResearchStudyBuilder.Impl withCategory(@NonNull CodeableConcept... category) {
      this.category = Arrays.asList(category);
      return this;
    }
    /**
     * @param category - Codes categorizing the type of study such as investigational vs.
     *     observational, type of blinding, type of randomization, safety vs. efficacy, etc.
     */
    public ResearchStudyBuilder.Impl withCategory(@NonNull Collection<CodeableConcept> category) {
      this.category = Collections.unmodifiableCollection(category);
      return this;
    }

    public ResearchStudyBuilder.Impl withCategory(@NonNull CodeableConceptBuilder... category) {
      this.category = Arrays.stream(category).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param location - Indicates a country, state or other region where the study is taking place.
     */
    public ResearchStudyBuilder.Impl withLocation(@NonNull CodeableConcept... location) {
      this.location = Arrays.asList(location);
      return this;
    }
    /**
     * @param location - Indicates a country, state or other region where the study is taking place.
     */
    public ResearchStudyBuilder.Impl withLocation(@NonNull Collection<CodeableConcept> location) {
      this.location = Collections.unmodifiableCollection(location);
      return this;
    }

    public ResearchStudyBuilder.Impl withLocation(@NonNull CodeableConceptBuilder... location) {
      this.location = Arrays.stream(location).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, nor can they have
     *     their own independent transaction scope.
     */
    public ResearchStudyBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, nor can they have
     *     their own independent transaction scope.
     */
    public ResearchStudyBuilder.Impl withContained(@NonNull Collection<Resource> contained) {
      this.contained = Collections.unmodifiableCollection(contained);
      return this;
    }

    public ResearchStudyBuilder.Impl withContained(@NonNull ResourceBuilder... contained) {
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
    public ResearchStudyBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public ResearchStudyBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ResearchStudyBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param condition - The condition that is the focus of the study. For example, In a study to
     *     examine risk factors for Lupus, might have as an inclusion criterion "healthy volunteer",
     *     but the target condition code would be a Lupus SNOMED code.
     */
    public ResearchStudyBuilder.Impl withCondition(@NonNull CodeableConcept... condition) {
      this.condition = Arrays.asList(condition);
      return this;
    }
    /**
     * @param condition - The condition that is the focus of the study. For example, In a study to
     *     examine risk factors for Lupus, might have as an inclusion criterion "healthy volunteer",
     *     but the target condition code would be a Lupus SNOMED code.
     */
    public ResearchStudyBuilder.Impl withCondition(@NonNull Collection<CodeableConcept> condition) {
      this.condition = Collections.unmodifiableCollection(condition);
      return this;
    }

    public ResearchStudyBuilder.Impl withCondition(@NonNull CodeableConceptBuilder... condition) {
      this.condition = Arrays.stream(condition).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param identifier - Identifiers assigned to this research study by the sponsor or other
     *     systems.
     */
    public ResearchStudyBuilder.Impl withIdentifier(@NonNull Identifier... identifier) {
      this.identifier = Arrays.asList(identifier);
      return this;
    }
    /**
     * @param identifier - Identifiers assigned to this research study by the sponsor or other
     *     systems.
     */
    public ResearchStudyBuilder.Impl withIdentifier(@NonNull Collection<Identifier> identifier) {
      this.identifier = Collections.unmodifiableCollection(identifier);
      return this;
    }

    public ResearchStudyBuilder.Impl withIdentifier(@NonNull IdentifierBuilder... identifier) {
      this.identifier = Arrays.stream(identifier).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param whyStopped - A description and/or code explaining the premature termination of the
     *     study.
     */
    public ResearchStudyBuilder.Impl withWhyStopped(@NonNull CodeableConcept whyStopped) {
      this.whyStopped = Optional.of(whyStopped);
      return this;
    }

    public ResearchStudyBuilder.Impl withWhyStopped(@NonNull CodeableConceptBuilder whyStopped) {
      this.whyStopped = Optional.of(whyStopped.build());
      return this;
    }
    /**
     * @param description - A full description of how the study is being conducted. For a
     *     description of what the study objectives are see ResearchStudy.objective.description.
     */
    public ResearchStudyBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /** @param currentState - Current status of the study. */
    public ResearchStudyBuilder.Impl withCurrentState(@NonNull CodeableConcept... currentState) {
      this.currentState = Arrays.asList(currentState);
      return this;
    }
    /** @param currentState - Current status of the study. */
    public ResearchStudyBuilder.Impl withCurrentState(
        @NonNull Collection<CodeableConcept> currentState) {
      this.currentState = Collections.unmodifiableCollection(currentState);
      return this;
    }

    public ResearchStudyBuilder.Impl withCurrentState(
        @NonNull CodeableConceptBuilder... currentState) {
      this.currentState = Arrays.stream(currentState).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param implicitRules - A reference to a set of rules that were followed when the resource was
     *     constructed, and which must be understood when processing the content. Often, this is a
     *     reference to an implementation guide that defines the special rules along with other
     *     profiles etc.
     */
    public ResearchStudyBuilder.Impl withImplicitRules(@NonNull String implicitRules) {
      this.implicitRules = Optional.of(implicitRules);
      return this;
    }
    /** @param relatedArtifact - Citations, references and other related documents. */
    public ResearchStudyBuilder.Impl withRelatedArtifact(
        @NonNull RelatedArtifact... relatedArtifact) {
      this.relatedArtifact = Arrays.asList(relatedArtifact);
      return this;
    }
    /** @param relatedArtifact - Citations, references and other related documents. */
    public ResearchStudyBuilder.Impl withRelatedArtifact(
        @NonNull Collection<RelatedArtifact> relatedArtifact) {
      this.relatedArtifact = Collections.unmodifiableCollection(relatedArtifact);
      return this;
    }

    public ResearchStudyBuilder.Impl withRelatedArtifact(
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
    public ResearchStudyBuilder.Impl withModifierExtension(
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
    public ResearchStudyBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ResearchStudyBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param primaryPurposeType - The type of study based upon the intent of the study activities.
     *     A classification of the intent of the study.
     */
    public ResearchStudyBuilder.Impl withPrimaryPurposeType(
        @NonNull CodeableConcept primaryPurposeType) {
      this.primaryPurposeType = Optional.of(primaryPurposeType);
      return this;
    }

    public ResearchStudyBuilder.Impl withPrimaryPurposeType(
        @NonNull CodeableConceptBuilder primaryPurposeType) {
      this.primaryPurposeType = Optional.of(primaryPurposeType.build());
      return this;
    }
    /** @param descriptionSummary - A brief summary of the study description. */
    public ResearchStudyBuilder.Impl withDescriptionSummary(@NonNull String descriptionSummary) {
      this.descriptionSummary = Optional.of(descriptionSummary);
      return this;
    }
    /**
     * @param principalInvestigator - A researcher in a study who oversees multiple aspects of the
     *     study, such as concept development, protocol writing, protocol submission for IRB
     *     approval, participant recruitment, informed consent, data collection, analysis,
     *     interpretation and presentation.
     */
    public ResearchStudyBuilder.Impl withPrincipalInvestigator(
        @NonNull Reference principalInvestigator) {
      this.principalInvestigator = Optional.of(principalInvestigator);
      return this;
    }

    public ResearchStudyBuilder.Impl withPrincipalInvestigator(
        @NonNull ReferenceBuilder principalInvestigator) {
      this.principalInvestigator = Optional.of(principalInvestigator.build());
      return this;
    }
    /** @param label - Additional names for the study. */
    public ResearchStudyBuilder.Impl withLabel(@NonNull ResearchStudy.Label... label) {
      this.label = Arrays.asList(label);
      return this;
    }
    /** @param label - Additional names for the study. */
    public ResearchStudyBuilder.Impl withLabel(@NonNull Collection<ResearchStudy.Label> label) {
      this.label = Collections.unmodifiableCollection(label);
      return this;
    }

    public ResearchStudyBuilder.Impl withLabel(@NonNull ResearchStudy_LabelBuilder... label) {
      this.label = Arrays.stream(label).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param focus - The medication(s), food(s), therapy(ies), device(s) or other concerns or
     *     interventions that the study is seeking to gain more information about.
     */
    public ResearchStudyBuilder.Impl withFocus(@NonNull ResearchStudy.Focus... focus) {
      this.focus = Arrays.asList(focus);
      return this;
    }
    /**
     * @param focus - The medication(s), food(s), therapy(ies), device(s) or other concerns or
     *     interventions that the study is seeking to gain more information about.
     */
    public ResearchStudyBuilder.Impl withFocus(@NonNull Collection<ResearchStudy.Focus> focus) {
      this.focus = Collections.unmodifiableCollection(focus);
      return this;
    }

    public ResearchStudyBuilder.Impl withFocus(@NonNull ResearchStudy_FocusBuilder... focus) {
      this.focus = Arrays.stream(focus).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param objective - A goal that the study is aiming to achieve in terms of a scientific
     *     question to be answered by the analysis of data collected during the study.
     */
    public ResearchStudyBuilder.Impl withObjective(@NonNull ResearchStudy.Objective... objective) {
      this.objective = Arrays.asList(objective);
      return this;
    }
    /**
     * @param objective - A goal that the study is aiming to achieve in terms of a scientific
     *     question to be answered by the analysis of data collected during the study.
     */
    public ResearchStudyBuilder.Impl withObjective(
        @NonNull Collection<ResearchStudy.Objective> objective) {
      this.objective = Collections.unmodifiableCollection(objective);
      return this;
    }

    public ResearchStudyBuilder.Impl withObjective(
        @NonNull ResearchStudy_ObjectiveBuilder... objective) {
      this.objective = Arrays.stream(objective).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param statusDate - Status of study with time for that status. */
    public ResearchStudyBuilder.Impl withStatusDate(
        @NonNull ResearchStudy.StatusDate... statusDate) {
      this.statusDate = Arrays.asList(statusDate);
      return this;
    }
    /** @param statusDate - Status of study with time for that status. */
    public ResearchStudyBuilder.Impl withStatusDate(
        @NonNull Collection<ResearchStudy.StatusDate> statusDate) {
      this.statusDate = Collections.unmodifiableCollection(statusDate);
      return this;
    }

    public ResearchStudyBuilder.Impl withStatusDate(
        @NonNull ResearchStudy_StatusDateBuilder... statusDate) {
      this.statusDate = Arrays.stream(statusDate).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param recruitment - Target or actual group of participants enrolled in study. */
    public ResearchStudyBuilder.Impl withRecruitment(
        @NonNull ResearchStudy.Recruitment recruitment) {
      this.recruitment = Optional.of(recruitment);
      return this;
    }

    public ResearchStudyBuilder.Impl withRecruitment(
        @NonNull ResearchStudy_RecruitmentBuilder recruitment) {
      this.recruitment = Optional.of(recruitment.build());
      return this;
    }
    /**
     * @param webLocation - A general storage or archive location for the study. This may contain an
     *     assortment of content which is not specified in advance.
     */
    public ResearchStudyBuilder.Impl withWebLocation(
        @NonNull ResearchStudy.WebLocation... webLocation) {
      this.webLocation = Arrays.asList(webLocation);
      return this;
    }
    /**
     * @param webLocation - A general storage or archive location for the study. This may contain an
     *     assortment of content which is not specified in advance.
     */
    public ResearchStudyBuilder.Impl withWebLocation(
        @NonNull Collection<ResearchStudy.WebLocation> webLocation) {
      this.webLocation = Collections.unmodifiableCollection(webLocation);
      return this;
    }

    public ResearchStudyBuilder.Impl withWebLocation(
        @NonNull ResearchStudy_WebLocationBuilder... webLocation) {
      this.webLocation = Arrays.stream(webLocation).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param classification - Classification for the study. */
    public ResearchStudyBuilder.Impl withClassification(
        @NonNull ResearchStudy.Classification... classification) {
      this.classification = Arrays.asList(classification);
      return this;
    }
    /** @param classification - Classification for the study. */
    public ResearchStudyBuilder.Impl withClassification(
        @NonNull Collection<ResearchStudy.Classification> classification) {
      this.classification = Collections.unmodifiableCollection(classification);
      return this;
    }

    public ResearchStudyBuilder.Impl withClassification(
        @NonNull ResearchStudy_ClassificationBuilder... classification) {
      this.classification = Arrays.stream(classification).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param outcomeMeasure - An outcome or planned variable to measure during the study. */
    public ResearchStudyBuilder.Impl withOutcomeMeasure(
        @NonNull ResearchStudy.OutcomeMeasure... outcomeMeasure) {
      this.outcomeMeasure = Arrays.asList(outcomeMeasure);
      return this;
    }
    /** @param outcomeMeasure - An outcome or planned variable to measure during the study. */
    public ResearchStudyBuilder.Impl withOutcomeMeasure(
        @NonNull Collection<ResearchStudy.OutcomeMeasure> outcomeMeasure) {
      this.outcomeMeasure = Collections.unmodifiableCollection(outcomeMeasure);
      return this;
    }

    public ResearchStudyBuilder.Impl withOutcomeMeasure(
        @NonNull ResearchStudy_OutcomeMeasureBuilder... outcomeMeasure) {
      this.outcomeMeasure = Arrays.stream(outcomeMeasure).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param associatedParty - Sponsors, collaborators, and other parties. */
    public ResearchStudyBuilder.Impl withAssociatedParty(
        @NonNull ResearchStudy.AssociatedParty... associatedParty) {
      this.associatedParty = Arrays.asList(associatedParty);
      return this;
    }
    /** @param associatedParty - Sponsors, collaborators, and other parties. */
    public ResearchStudyBuilder.Impl withAssociatedParty(
        @NonNull Collection<ResearchStudy.AssociatedParty> associatedParty) {
      this.associatedParty = Collections.unmodifiableCollection(associatedParty);
      return this;
    }

    public ResearchStudyBuilder.Impl withAssociatedParty(
        @NonNull ResearchStudy_AssociatedPartyBuilder... associatedParty) {
      this.associatedParty = Arrays.stream(associatedParty).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param comparisonGroup - Describes an expected sequence of events for one of the participants
     *     of a study. E.g. Exposure to drug A, wash-out, exposure to drug B, wash-out, follow-up.
     */
    public ResearchStudyBuilder.Impl withComparisonGroup(
        @NonNull ResearchStudy.ComparisonGroup... comparisonGroup) {
      this.comparisonGroup = Arrays.asList(comparisonGroup);
      return this;
    }
    /**
     * @param comparisonGroup - Describes an expected sequence of events for one of the participants
     *     of a study. E.g. Exposure to drug A, wash-out, exposure to drug B, wash-out, follow-up.
     */
    public ResearchStudyBuilder.Impl withComparisonGroup(
        @NonNull Collection<ResearchStudy.ComparisonGroup> comparisonGroup) {
      this.comparisonGroup = Collections.unmodifiableCollection(comparisonGroup);
      return this;
    }

    public ResearchStudyBuilder.Impl withComparisonGroup(
        @NonNull ResearchStudy_ComparisonGroupBuilder... comparisonGroup) {
      this.comparisonGroup = Arrays.stream(comparisonGroup).map(e -> e.build()).collect(toList());
      return this;
    }

    public ResearchStudyBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public ResearchStudy build() {
      return new ResearchStudy(
          OptionConverters.toScala(id),
          OptionConverters.toScala(url),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          OptionConverters.toScala(name),
          OptionConverters.toScala(date),
          site.stream().collect(new LitSeqJCollector<>()),
          note.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(title),
          OptionConverters.toScala(phase),
          partOf.stream().collect(new LitSeqJCollector<>()),
          status,
          OptionConverters.toScala(period),
          result.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(version),
          keyword.stream().collect(new LitSeqJCollector<>()),
          contact.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(sponsor),
          OptionConverters.toScala(language),
          protocol.stream().collect(new LitSeqJCollector<>()),
          category.stream().collect(new LitSeqJCollector<>()),
          location.stream().collect(new LitSeqJCollector<>()),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          condition.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(whyStopped),
          OptionConverters.toScala(description),
          currentState.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(implicitRules),
          relatedArtifact.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(primaryPurposeType),
          OptionConverters.toScala(descriptionSummary),
          OptionConverters.toScala(principalInvestigator),
          label.stream().collect(new LitSeqJCollector<>()),
          focus.stream().collect(new LitSeqJCollector<>()),
          objective.stream().collect(new LitSeqJCollector<>()),
          statusDate.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(recruitment),
          webLocation.stream().collect(new LitSeqJCollector<>()),
          classification.stream().collect(new LitSeqJCollector<>()),
          outcomeMeasure.stream().collect(new LitSeqJCollector<>()),
          associatedParty.stream().collect(new LitSeqJCollector<>()),
          comparisonGroup.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
