package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.RESEARCH_STUDY_STATUS;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface ResearchStudyBuilder extends DomainResourceBuilder {
  public ResearchStudy build();

  public static Impl init(RESEARCH_STUDY_STATUS status) {
    return new Impl(status);
  }

  public static Impl builder(RESEARCH_STUDY_STATUS status) {
    return new Impl(status);
  }

  public class Impl implements ResearchStudyBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Meta> meta = Optional.empty();
    private Optional<Narrative> text = Optional.empty();
    private Collection<Reference> site = Collections.emptyList();
    private Collection<Annotation> note = Collections.emptyList();
    private Optional<String> title = Optional.empty();
    private Optional<CodeableConcept> phase = Optional.empty();
    private Collection<CodeableConcept> focus = Collections.emptyList();
    private Collection<Reference> partOf = Collections.emptyList();
    private RESEARCH_STUDY_STATUS status;
    private Optional<Period> period = Optional.empty();
    private Collection<ContactDetail> contact = Collections.emptyList();
    private Collection<CodeableConcept> keyword = Collections.emptyList();
    private Optional<Reference> sponsor = Optional.empty();
    private Optional<LANGUAGES> language = Optional.empty();
    private Collection<Reference> protocol = Collections.emptyList();
    private Collection<CodeableConcept> category = Collections.emptyList();
    private Collection<CodeableConcept> location = Collections.emptyList();
    private Collection<Resource> contained = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<CodeableConcept> condition = Collections.emptyList();
    private Collection<Identifier> identifier = Collections.emptyList();
    private Collection<Reference> enrollment = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Optional<String> implicitRules = Optional.empty();
    private Optional<CodeableConcept> reasonStopped = Optional.empty();
    private Collection<RelatedArtifact> relatedArtifact = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<CodeableConcept> primaryPurposeType = Optional.empty();
    private Optional<Reference> principalInvestigator = Optional.empty();
    private Collection<ResearchStudy.Arm> arm = Collections.emptyList();
    private Collection<ResearchStudy.Objective> objective = Collections.emptyList();

    /**
     * Required fields for {@link ResearchStudy}
     *
     * @param status - The current state of the study.
     */
    public Impl(RESEARCH_STUDY_STATUS status) {
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
    /** @param title - A short, descriptive user-friendly label for the study. */
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
     * @param focus - The medication(s), food(s), therapy(ies), device(s) or other concerns or
     *     interventions that the study is seeking to gain more information about.
     */
    public ResearchStudyBuilder.Impl withFocus(@NonNull CodeableConcept... focus) {
      this.focus = Arrays.asList(focus);
      return this;
    }
    /**
     * @param focus - The medication(s), food(s), therapy(ies), device(s) or other concerns or
     *     interventions that the study is seeking to gain more information about.
     */
    public ResearchStudyBuilder.Impl withFocus(@NonNull Collection<CodeableConcept> focus) {
      this.focus = Collections.unmodifiableCollection(focus);
      return this;
    }

    public ResearchStudyBuilder.Impl withFocus(@NonNull CodeableConceptBuilder... focus) {
      this.focus = Arrays.stream(focus).map(e -> e.build()).collect(toList());
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
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
     */
    public ResearchStudyBuilder.Impl withContained(@NonNull Resource... contained) {
      this.contained = Arrays.asList(contained);
      return this;
    }
    /**
     * @param contained - These resources do not have an independent existence apart from the
     *     resource that contains them - they cannot be identified independently, and nor can they
     *     have their own independent transaction scope.
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
     * @param enrollment - Reference to a Group that defines the criteria for and quantity of
     *     subjects participating in the study. E.g. " 200 female Europeans between the ages of 20
     *     and 45 with early onset diabetes".
     */
    public ResearchStudyBuilder.Impl withEnrollment(@NonNull Reference... enrollment) {
      this.enrollment = Arrays.asList(enrollment);
      return this;
    }
    /**
     * @param enrollment - Reference to a Group that defines the criteria for and quantity of
     *     subjects participating in the study. E.g. " 200 female Europeans between the ages of 20
     *     and 45 with early onset diabetes".
     */
    public ResearchStudyBuilder.Impl withEnrollment(@NonNull Collection<Reference> enrollment) {
      this.enrollment = Collections.unmodifiableCollection(enrollment);
      return this;
    }

    public ResearchStudyBuilder.Impl withEnrollment(@NonNull ReferenceBuilder... enrollment) {
      this.enrollment = Arrays.stream(enrollment).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param description - A full description of how the study is being conducted. */
    public ResearchStudyBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
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
    /**
     * @param reasonStopped - A description and/or code explaining the premature termination of the
     *     study.
     */
    public ResearchStudyBuilder.Impl withReasonStopped(@NonNull CodeableConcept reasonStopped) {
      this.reasonStopped = Optional.of(reasonStopped);
      return this;
    }

    public ResearchStudyBuilder.Impl withReasonStopped(
        @NonNull CodeableConceptBuilder reasonStopped) {
      this.reasonStopped = Optional.of(reasonStopped.build());
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
     * @param primaryPurposeType - The type of study based upon the intent of the study's
     *     activities. A classification of the intent of the study.
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
    /**
     * @param arm - Describes an expected sequence of events for one of the participants of a study.
     *     E.g. Exposure to drug A, wash-out, exposure to drug B, wash-out, follow-up.
     */
    public ResearchStudyBuilder.Impl withArm(@NonNull ResearchStudy.Arm... arm) {
      this.arm = Arrays.asList(arm);
      return this;
    }
    /**
     * @param arm - Describes an expected sequence of events for one of the participants of a study.
     *     E.g. Exposure to drug A, wash-out, exposure to drug B, wash-out, follow-up.
     */
    public ResearchStudyBuilder.Impl withArm(@NonNull Collection<ResearchStudy.Arm> arm) {
      this.arm = Collections.unmodifiableCollection(arm);
      return this;
    }

    public ResearchStudyBuilder.Impl withArm(@NonNull ResearchStudy_ArmBuilder... arm) {
      this.arm = Arrays.stream(arm).map(e -> e.build()).collect(toList());
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

    public ResearchStudyBuilder.Impl withoutMeta() {
      this.meta = Optional.empty();
      return this;
    }

    public ResearchStudy build() {
      return new ResearchStudy(
          OptionConverters.toScala(id),
          OptionConverters.toScala(meta),
          OptionConverters.toScala(text),
          site.stream().collect(new LitSeqJCollector<>()),
          note.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(title),
          OptionConverters.toScala(phase),
          focus.stream().collect(new LitSeqJCollector<>()),
          partOf.stream().collect(new LitSeqJCollector<>()),
          status,
          OptionConverters.toScala(period),
          contact.stream().collect(new LitSeqJCollector<>()),
          keyword.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(sponsor),
          OptionConverters.toScala(language),
          protocol.stream().collect(new LitSeqJCollector<>()),
          category.stream().collect(new LitSeqJCollector<>()),
          location.stream().collect(new LitSeqJCollector<>()),
          contained.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          condition.stream().collect(new LitSeqJCollector<>()),
          identifier.stream().collect(new LitSeqJCollector<>()),
          enrollment.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          OptionConverters.toScala(implicitRules),
          OptionConverters.toScala(reasonStopped),
          relatedArtifact.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(primaryPurposeType),
          OptionConverters.toScala(principalInvestigator),
          arm.stream().collect(new LitSeqJCollector<>()),
          objective.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
