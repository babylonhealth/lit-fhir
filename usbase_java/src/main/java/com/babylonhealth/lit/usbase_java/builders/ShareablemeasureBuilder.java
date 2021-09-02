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
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class ShareablemeasureBuilder {
  private Optional<String> id = Optional.empty();
  private String url;
  private Optional<Meta> meta =
      Optional.of(
          new MetaBuilder()
              .withProfile("http://hl7.org/fhir/StructureDefinition/shareablemeasure")
              .build());
  private Optional<Narrative> text = Optional.empty();
  private String name;
  private Optional<FHIRDateTime> date = Optional.empty();
  private Collection<CodeableConcept> _type = Collections.emptyList();
  private Optional<String> title = Optional.empty();
  private Optional<String> usage = Optional.empty();
  private Collection<CodeableConcept> topic = Collections.emptyList();
  private PUBLICATION_STATUS status;
  private Collection<ContactDetail> author = Collections.emptyList();
  private Collection<ContactDetail> editor = Collections.emptyList();
  private String version;
  private Collection<ContactDetail> contact = Collections.emptyList();
  private Optional<String> purpose = Optional.empty();
  private Collection<String> library = Collections.emptyList();
  private Optional<CodeableConcept> scoring = Optional.empty();
  private Optional<LANGUAGES> language = Optional.empty();
  private Optional<String> subtitle = Optional.empty();
  private Collection<ContactDetail> reviewer = Collections.emptyList();
  private Collection<ContactDetail> endorser = Collections.emptyList();
  private Optional<String> guidance = Optional.empty();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private String publisher;
  private Optional<String> copyright = Optional.empty();
  private Optional<String> rationale = Optional.empty();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Optional<Choice01025009075> subject = Optional.empty();
  private Collection<UsageContext> useContext = Collections.emptyList();
  private Optional<String> disclaimer = Optional.empty();
  private Collection<String> definition = Collections.emptyList();
  private String description;
  private Boolean experimental;
  private Collection<CodeableConcept> jurisdiction = Collections.emptyList();
  private Optional<FHIRDate> approvalDate = Optional.empty();
  private Optional<String> implicitRules = Optional.empty();
  private Optional<FHIRDate> lastReviewDate = Optional.empty();
  private Optional<String> riskAdjustment = Optional.empty();
  private Optional<Period> effectivePeriod = Optional.empty();
  private Collection<RelatedArtifact> relatedArtifact = Collections.emptyList();
  private Optional<String> rateAggregation = Optional.empty();
  private Optional<CodeableConcept> compositeScoring = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<CodeableConcept> improvementNotation = Optional.empty();
  private Optional<String> clinicalRecommendationStatement = Optional.empty();
  private Collection<Measure.SupplementalData> supplementalData = Collections.emptyList();
  private Collection<Measure.Group> group = Collections.emptyList();

  /**
   * Required fields for {@link Shareablemeasure}
   *
   * @param url - An absolute URI that is used to identify this measure when it is referenced in a
   *     specification, model, design or an instance; also called its canonical identifier. This
   *     SHOULD be globally unique and SHOULD be a literal address at which at which an
   *     authoritative instance of this measure is (or will be) published. This URL can be the
   *     target of a canonical reference. It SHALL remain the same when the measure is stored on
   *     different servers.
   * @param name - A natural language name identifying the measure. This name should be usable as an
   *     identifier for the module by machine processing applications such as code generation.
   * @param status - The status of this measure. Enables tracking the life-cycle of the content.
   * @param version - The identifier that is used to identify this version of the measure when it is
   *     referenced in a specification, model, design or instance. This is an arbitrary value
   *     managed by the measure author and is not expected to be globally unique. For example, it
   *     might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also
   *     no expectation that versions can be placed in a lexicographical sequence. To provide a
   *     version consistent with the Decision Support Service specification, use the format
   *     Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge assets,
   *     refer to the Decision Support Service specification. Note that a version is required for
   *     non-experimental active artifacts.
   * @param publisher - The name of the organization or individual that published the measure.
   * @param description - A free text natural language description of the measure from a consumer's
   *     perspective.
   * @param experimental - A Boolean value to indicate that this measure is authored for testing
   *     purposes (or education/evaluation/marketing) and is not intended to be used for genuine
   *     usage.
   */
  public ShareablemeasureBuilder(
      String url,
      String name,
      PUBLICATION_STATUS status,
      String version,
      String publisher,
      String description,
      Boolean experimental) {
    this.url = url;
    this.name = name;
    this.status = status;
    this.version = version;
    this.publisher = publisher;
    this.description = description;
    this.experimental = experimental;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public ShareablemeasureBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public ShareablemeasureBuilder withMeta(@NonNull Meta meta) {
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
  public ShareablemeasureBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param date - The date (and optionally time) when the measure was published. The date must
   *     change when the business version changes and it must change if the status code changes. In
   *     addition, it should change when the substantive content of the measure changes.
   */
  public ShareablemeasureBuilder withDate(@NonNull FHIRDateTime date) {
    this.date = Optional.of(date);
    return this;
  }
  /**
   * @param _type - Indicates whether the measure is used to examine a process, an outcome over
   *     time, a patient-reported outcome, or a structure measure such as utilization.
   */
  public ShareablemeasureBuilder withType(@NonNull CodeableConcept... _type) {
    this._type = Arrays.asList(_type);
    return this;
  }
  /**
   * @param _type - Indicates whether the measure is used to examine a process, an outcome over
   *     time, a patient-reported outcome, or a structure measure such as utilization.
   */
  public ShareablemeasureBuilder withType(@NonNull Collection<CodeableConcept> _type) {
    this._type = Collections.unmodifiableCollection(_type);
    return this;
  }
  /** @param title - A short, descriptive, user-friendly title for the measure. */
  public ShareablemeasureBuilder withTitle(@NonNull String title) {
    this.title = Optional.of(title);
    return this;
  }
  /**
   * @param usage - A detailed description, from a clinical perspective, of how the measure is used.
   */
  public ShareablemeasureBuilder withUsage(@NonNull String usage) {
    this.usage = Optional.of(usage);
    return this;
  }
  /**
   * @param topic - Descriptive topics related to the content of the measure. Topics provide a
   *     high-level categorization grouping types of measures that can be useful for filtering and
   *     searching.
   */
  public ShareablemeasureBuilder withTopic(@NonNull CodeableConcept... topic) {
    this.topic = Arrays.asList(topic);
    return this;
  }
  /**
   * @param topic - Descriptive topics related to the content of the measure. Topics provide a
   *     high-level categorization grouping types of measures that can be useful for filtering and
   *     searching.
   */
  public ShareablemeasureBuilder withTopic(@NonNull Collection<CodeableConcept> topic) {
    this.topic = Collections.unmodifiableCollection(topic);
    return this;
  }
  /**
   * @param author - An individiual or organization primarily involved in the creation and
   *     maintenance of the content.
   */
  public ShareablemeasureBuilder withAuthor(@NonNull ContactDetail... author) {
    this.author = Arrays.asList(author);
    return this;
  }
  /**
   * @param author - An individiual or organization primarily involved in the creation and
   *     maintenance of the content.
   */
  public ShareablemeasureBuilder withAuthor(@NonNull Collection<ContactDetail> author) {
    this.author = Collections.unmodifiableCollection(author);
    return this;
  }
  /**
   * @param editor - An individual or organization primarily responsible for internal coherence of
   *     the content.
   */
  public ShareablemeasureBuilder withEditor(@NonNull ContactDetail... editor) {
    this.editor = Arrays.asList(editor);
    return this;
  }
  /**
   * @param editor - An individual or organization primarily responsible for internal coherence of
   *     the content.
   */
  public ShareablemeasureBuilder withEditor(@NonNull Collection<ContactDetail> editor) {
    this.editor = Collections.unmodifiableCollection(editor);
    return this;
  }
  /**
   * @param contact - Contact details to assist a user in finding and communicating with the
   *     publisher.
   */
  public ShareablemeasureBuilder withContact(@NonNull ContactDetail... contact) {
    this.contact = Arrays.asList(contact);
    return this;
  }
  /**
   * @param contact - Contact details to assist a user in finding and communicating with the
   *     publisher.
   */
  public ShareablemeasureBuilder withContact(@NonNull Collection<ContactDetail> contact) {
    this.contact = Collections.unmodifiableCollection(contact);
    return this;
  }
  /**
   * @param purpose - Explanation of why this measure is needed and why it has been designed as it
   *     has.
   */
  public ShareablemeasureBuilder withPurpose(@NonNull String purpose) {
    this.purpose = Optional.of(purpose);
    return this;
  }
  /**
   * @param library - A reference to a Library resource containing the formal logic used by the
   *     measure.
   */
  public ShareablemeasureBuilder withLibrary(@NonNull String... library) {
    this.library = Arrays.asList(library);
    return this;
  }
  /**
   * @param library - A reference to a Library resource containing the formal logic used by the
   *     measure.
   */
  public ShareablemeasureBuilder withLibrary(@NonNull Collection<String> library) {
    this.library = Collections.unmodifiableCollection(library);
    return this;
  }
  /**
   * @param scoring - Indicates how the calculation is performed for the measure, including
   *     proportion, ratio, continuous-variable, and cohort. The value set is extensible, allowing
   *     additional measure scoring types to be represented.
   */
  public ShareablemeasureBuilder withScoring(@NonNull CodeableConcept scoring) {
    this.scoring = Optional.of(scoring);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public ShareablemeasureBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param subtitle - An explanatory or alternate title for the measure giving additional
   *     information about its content.
   */
  public ShareablemeasureBuilder withSubtitle(@NonNull String subtitle) {
    this.subtitle = Optional.of(subtitle);
    return this;
  }
  /**
   * @param reviewer - An individual or organization primarily responsible for review of some aspect
   *     of the content.
   */
  public ShareablemeasureBuilder withReviewer(@NonNull ContactDetail... reviewer) {
    this.reviewer = Arrays.asList(reviewer);
    return this;
  }
  /**
   * @param reviewer - An individual or organization primarily responsible for review of some aspect
   *     of the content.
   */
  public ShareablemeasureBuilder withReviewer(@NonNull Collection<ContactDetail> reviewer) {
    this.reviewer = Collections.unmodifiableCollection(reviewer);
    return this;
  }
  /**
   * @param endorser - An individual or organization responsible for officially endorsing the
   *     content for use in some setting.
   */
  public ShareablemeasureBuilder withEndorser(@NonNull ContactDetail... endorser) {
    this.endorser = Arrays.asList(endorser);
    return this;
  }
  /**
   * @param endorser - An individual or organization responsible for officially endorsing the
   *     content for use in some setting.
   */
  public ShareablemeasureBuilder withEndorser(@NonNull Collection<ContactDetail> endorser) {
    this.endorser = Collections.unmodifiableCollection(endorser);
    return this;
  }
  /**
   * @param guidance - Additional guidance for the measure including how it can be used in a
   *     clinical context, and the intent of the measure.
   */
  public ShareablemeasureBuilder withGuidance(@NonNull String guidance) {
    this.guidance = Optional.of(guidance);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public ShareablemeasureBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public ShareablemeasureBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public ShareablemeasureBuilder withExtension(@NonNull Extension... extension) {
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
  public ShareablemeasureBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param copyright - A copyright statement relating to the measure and/or its contents. Copyright
   *     statements are generally legal restrictions on the use and publishing of the measure.
   */
  public ShareablemeasureBuilder withCopyright(@NonNull String copyright) {
    this.copyright = Optional.of(copyright);
    return this;
  }
  /**
   * @param rationale - Provides a succinct statement of the need for the measure. Usually includes
   *     statements pertaining to importance criterion: impact, gap in care, and evidence.
   */
  public ShareablemeasureBuilder withRationale(@NonNull String rationale) {
    this.rationale = Optional.of(rationale);
    return this;
  }
  /**
   * @param identifier - A formal identifier that is used to identify this measure when it is
   *     represented in other formats, or referenced in a specification, model, design or an
   *     instance.
   */
  public ShareablemeasureBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /**
   * @param identifier - A formal identifier that is used to identify this measure when it is
   *     represented in other formats, or referenced in a specification, model, design or an
   *     instance.
   */
  public ShareablemeasureBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /**
   * @param subject - The intended subjects for the measure. If this element is not provided, a
   *     Patient subject is assumed, but the subject of the measure can be anything. Field is a
   *     'choice' field. Type should be one of CodeableConcept, Reference.
   */
  public ShareablemeasureBuilder withSubject(@NonNull Choice01025009075 subject) {
    this.subject = Optional.of(subject);
    return this;
  }
  /**
   * @param useContext - The content was developed with a focus and intent of supporting the
   *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
   *     may be references to specific programs (insurance plans, studies, ...) and may be used to
   *     assist with indexing and searching for appropriate measure instances.
   */
  public ShareablemeasureBuilder withUseContext(@NonNull UsageContext... useContext) {
    this.useContext = Arrays.asList(useContext);
    return this;
  }
  /**
   * @param useContext - The content was developed with a focus and intent of supporting the
   *     contexts that are listed. These contexts may be general categories (gender, age, ...) or
   *     may be references to specific programs (insurance plans, studies, ...) and may be used to
   *     assist with indexing and searching for appropriate measure instances.
   */
  public ShareablemeasureBuilder withUseContext(@NonNull Collection<UsageContext> useContext) {
    this.useContext = Collections.unmodifiableCollection(useContext);
    return this;
  }
  /**
   * @param disclaimer - Notices and disclaimers regarding the use of the measure or related to
   *     intellectual property (such as code systems) referenced by the measure.
   */
  public ShareablemeasureBuilder withDisclaimer(@NonNull String disclaimer) {
    this.disclaimer = Optional.of(disclaimer);
    return this;
  }
  /** @param definition - Provides a description of an individual term used within the measure. */
  public ShareablemeasureBuilder withDefinition(@NonNull String... definition) {
    this.definition = Arrays.asList(definition);
    return this;
  }
  /** @param definition - Provides a description of an individual term used within the measure. */
  public ShareablemeasureBuilder withDefinition(@NonNull Collection<String> definition) {
    this.definition = Collections.unmodifiableCollection(definition);
    return this;
  }
  /**
   * @param jurisdiction - A legal or geographic region in which the measure is intended to be used.
   */
  public ShareablemeasureBuilder withJurisdiction(@NonNull CodeableConcept... jurisdiction) {
    this.jurisdiction = Arrays.asList(jurisdiction);
    return this;
  }
  /**
   * @param jurisdiction - A legal or geographic region in which the measure is intended to be used.
   */
  public ShareablemeasureBuilder withJurisdiction(
      @NonNull Collection<CodeableConcept> jurisdiction) {
    this.jurisdiction = Collections.unmodifiableCollection(jurisdiction);
    return this;
  }
  /**
   * @param approvalDate - The date on which the resource content was approved by the publisher.
   *     Approval happens once when the content is officially approved for usage.
   */
  public ShareablemeasureBuilder withApprovalDate(@NonNull FHIRDate approvalDate) {
    this.approvalDate = Optional.of(approvalDate);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public ShareablemeasureBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param lastReviewDate - The date on which the resource content was last reviewed. Review
   *     happens periodically after approval but does not change the original approval date.
   */
  public ShareablemeasureBuilder withLastReviewDate(@NonNull FHIRDate lastReviewDate) {
    this.lastReviewDate = Optional.of(lastReviewDate);
    return this;
  }
  /**
   * @param riskAdjustment - A description of the risk adjustment factors that may impact the
   *     resulting score for the measure and how they may be accounted for when computing and
   *     reporting measure results.
   */
  public ShareablemeasureBuilder withRiskAdjustment(@NonNull String riskAdjustment) {
    this.riskAdjustment = Optional.of(riskAdjustment);
    return this;
  }
  /**
   * @param effectivePeriod - The period during which the measure content was or is planned to be in
   *     active use.
   */
  public ShareablemeasureBuilder withEffectivePeriod(@NonNull Period effectivePeriod) {
    this.effectivePeriod = Optional.of(effectivePeriod);
    return this;
  }
  /**
   * @param relatedArtifact - Related artifacts such as additional documentation, justification, or
   *     bibliographic references.
   */
  public ShareablemeasureBuilder withRelatedArtifact(@NonNull RelatedArtifact... relatedArtifact) {
    this.relatedArtifact = Arrays.asList(relatedArtifact);
    return this;
  }
  /**
   * @param relatedArtifact - Related artifacts such as additional documentation, justification, or
   *     bibliographic references.
   */
  public ShareablemeasureBuilder withRelatedArtifact(
      @NonNull Collection<RelatedArtifact> relatedArtifact) {
    this.relatedArtifact = Collections.unmodifiableCollection(relatedArtifact);
    return this;
  }
  /**
   * @param rateAggregation - Describes how to combine the information calculated, based on logic in
   *     each of several populations, into one summarized result.
   */
  public ShareablemeasureBuilder withRateAggregation(@NonNull String rateAggregation) {
    this.rateAggregation = Optional.of(rateAggregation);
    return this;
  }
  /**
   * @param compositeScoring - If this is a composite measure, the scoring method used to combine
   *     the component measures to determine the composite score.
   */
  public ShareablemeasureBuilder withCompositeScoring(@NonNull CodeableConcept compositeScoring) {
    this.compositeScoring = Optional.of(compositeScoring);
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
  public ShareablemeasureBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public ShareablemeasureBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param improvementNotation - Information on whether an increase or decrease in score is the
   *     preferred result (e.g., a higher score indicates better quality OR a lower score indicates
   *     better quality OR quality is within a range).
   */
  public ShareablemeasureBuilder withImprovementNotation(
      @NonNull CodeableConcept improvementNotation) {
    this.improvementNotation = Optional.of(improvementNotation);
    return this;
  }
  /**
   * @param clinicalRecommendationStatement - Provides a summary of relevant clinical guidelines or
   *     other clinical recommendations supporting the measure.
   */
  public ShareablemeasureBuilder withClinicalRecommendationStatement(
      @NonNull String clinicalRecommendationStatement) {
    this.clinicalRecommendationStatement = Optional.of(clinicalRecommendationStatement);
    return this;
  }
  /**
   * @param supplementalData - The supplemental data criteria for the measure report, specified as
   *     either the name of a valid CQL expression within a referenced library, or a valid FHIR
   *     Resource Path.
   */
  public ShareablemeasureBuilder withSupplementalData(
      @NonNull Measure.SupplementalData... supplementalData) {
    this.supplementalData = Arrays.asList(supplementalData);
    return this;
  }
  /**
   * @param supplementalData - The supplemental data criteria for the measure report, specified as
   *     either the name of a valid CQL expression within a referenced library, or a valid FHIR
   *     Resource Path.
   */
  public ShareablemeasureBuilder withSupplementalData(
      @NonNull Collection<Measure.SupplementalData> supplementalData) {
    this.supplementalData = Collections.unmodifiableCollection(supplementalData);
    return this;
  }
  /** @param group - A group of population criteria for the measure. */
  public ShareablemeasureBuilder withGroup(@NonNull Measure.Group... group) {
    this.group = Arrays.asList(group);
    return this;
  }
  /** @param group - A group of population criteria for the measure. */
  public ShareablemeasureBuilder withGroup(@NonNull Collection<Measure.Group> group) {
    this.group = Collections.unmodifiableCollection(group);
    return this;
  }

  public ShareablemeasureBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public Shareablemeasure build() {
    return new Shareablemeasure(
        (Option) OptionConverters.toScala(id),
        url,
        (Option) OptionConverters.toScala(meta),
        (Option) OptionConverters.toScala(text),
        name,
        (Option) OptionConverters.toScala(date),
        _type.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(title),
        (Option) OptionConverters.toScala(usage),
        topic.stream().collect(new LitSeqJCollector<>()),
        status,
        author.stream().collect(new LitSeqJCollector<>()),
        editor.stream().collect(new LitSeqJCollector<>()),
        version,
        contact.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(purpose),
        library.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(scoring),
        (Option) OptionConverters.toScala(language),
        (Option) OptionConverters.toScala(subtitle),
        reviewer.stream().collect(new LitSeqJCollector<>()),
        endorser.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(guidance),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        publisher,
        (Option) OptionConverters.toScala(copyright),
        (Option) OptionConverters.toScala(rationale),
        identifier.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(subject),
        useContext.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(disclaimer),
        definition.stream().collect(new LitSeqJCollector<>()),
        description,
        experimental,
        jurisdiction.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(approvalDate),
        (Option) OptionConverters.toScala(implicitRules),
        (Option) OptionConverters.toScala(lastReviewDate),
        (Option) OptionConverters.toScala(riskAdjustment),
        (Option) OptionConverters.toScala(effectivePeriod),
        relatedArtifact.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(rateAggregation),
        (Option) OptionConverters.toScala(compositeScoring),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(improvementNotation),
        (Option) OptionConverters.toScala(clinicalRecommendationStatement),
        supplementalData.stream().collect(new LitSeqJCollector<>()),
        group.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
