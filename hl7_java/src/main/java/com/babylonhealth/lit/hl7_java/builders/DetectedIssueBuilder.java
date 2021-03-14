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
import com.babylonhealth.lit.hl7.OBSERVATION_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.hl7.DETECTEDISSUE_SEVERITY;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class DetectedIssueBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private Optional<CodeableConcept> code = Optional.empty();
  private OBSERVATION_STATUS status;
  private Optional<Reference> author = Optional.empty();
  private Optional<String> detail = Optional.empty();
  private Optional<Reference> patient = Optional.empty();
  private Optional<LANGUAGES> language = Optional.empty();
  private Optional<DETECTEDISSUE_SEVERITY> severity = Optional.empty();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<String> reference = Optional.empty();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Collection<Reference> implicated = Collections.emptyList();
  private Optional<String> implicitRules = Optional.empty();
  private Optional<Choice<$bslash$div<FHIRDateTime, Period>>> identified = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<DetectedIssue.Evidence> evidence = Collections.emptyList();
  private Collection<DetectedIssue.Mitigation> mitigation = Collections.emptyList();

  /**
   * Required fields for {@link DetectedIssue}
   *
   * @param status - Indicates the status of the detected issue.
   */
  public DetectedIssueBuilder(OBSERVATION_STATUS status) {
    this.status = status;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public DetectedIssueBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public DetectedIssueBuilder withMeta(@NonNull Meta meta) {
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
  public DetectedIssueBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /** @param code - Identifies the general type of issue identified. */
  public DetectedIssueBuilder withCode(@NonNull CodeableConcept code) {
    this.code = Optional.of(code);
    return this;
  }
  /**
   * @param author - Individual or device responsible for the issue being raised. For example, a
   *     decision support application or a pharmacist conducting a medication review.
   */
  public DetectedIssueBuilder withAuthor(@NonNull Reference author) {
    this.author = Optional.of(author);
    return this;
  }
  /** @param detail - A textual explanation of the detected issue. */
  public DetectedIssueBuilder withDetail(@NonNull String detail) {
    this.detail = Optional.of(detail);
    return this;
  }
  /** @param patient - Indicates the patient whose record the detected issue is associated with. */
  public DetectedIssueBuilder withPatient(@NonNull Reference patient) {
    this.patient = Optional.of(patient);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public DetectedIssueBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param severity - Indicates the degree of importance associated with the identified issue based
   *     on the potential impact on the patient.
   */
  public DetectedIssueBuilder withSeverity(@NonNull DETECTEDISSUE_SEVERITY severity) {
    this.severity = Optional.of(severity);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public DetectedIssueBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public DetectedIssueBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public DetectedIssueBuilder withExtension(@NonNull Extension... extension) {
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
  public DetectedIssueBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param reference - The literature, knowledge-base or similar reference that describes the
   *     propensity for the detected issue identified.
   */
  public DetectedIssueBuilder withReference(@NonNull String reference) {
    this.reference = Optional.of(reference);
    return this;
  }
  /** @param identifier - Business identifier associated with the detected issue record. */
  public DetectedIssueBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /** @param identifier - Business identifier associated with the detected issue record. */
  public DetectedIssueBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /**
   * @param implicated - Indicates the resource representing the current activity or proposed
   *     activity that is potentially problematic.
   */
  public DetectedIssueBuilder withImplicated(@NonNull Reference... implicated) {
    this.implicated = Arrays.asList(implicated);
    return this;
  }
  /**
   * @param implicated - Indicates the resource representing the current activity or proposed
   *     activity that is potentially problematic.
   */
  public DetectedIssueBuilder withImplicated(@NonNull Collection<Reference> implicated) {
    this.implicated = Collections.unmodifiableCollection(implicated);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public DetectedIssueBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param identified - The date or period when the detected issue was initially identified. Field
   *     is a 'choice' field. Type should be one of FHIRDateTime, Period.
   */
  public <T> DetectedIssueBuilder withIdentified(@NonNull T identified) {
    var guessedSuffix =
        autoSuffix(identified.getClass().getSimpleName(), DetectedIssue$.MODULE$.identified());
    return withIdentified(guessedSuffix, identified);
  }

  /**
   * Alternative to the 'main' withIdentified method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param identified - The value to be passed to the builder
   */
  public <T> DetectedIssueBuilder withIdentified(String suffix, @NonNull T identified) {
    guard(identified.getClass().getSimpleName(), suffix, DetectedIssue$.MODULE$.identified());
    this.identified =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix, identified, DetectedIssue$.MODULE$.identified()));
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
  public DetectedIssueBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public DetectedIssueBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param evidence - Supporting evidence or manifestations that provide the basis for identifying
   *     the detected issue such as a GuidanceResponse or MeasureReport.
   */
  public DetectedIssueBuilder withEvidence(@NonNull DetectedIssue.Evidence... evidence) {
    this.evidence = Arrays.asList(evidence);
    return this;
  }
  /**
   * @param evidence - Supporting evidence or manifestations that provide the basis for identifying
   *     the detected issue such as a GuidanceResponse or MeasureReport.
   */
  public DetectedIssueBuilder withEvidence(@NonNull Collection<DetectedIssue.Evidence> evidence) {
    this.evidence = Collections.unmodifiableCollection(evidence);
    return this;
  }
  /**
   * @param mitigation - Indicates an action that has been taken or is committed to reduce or
   *     eliminate the likelihood of the risk identified by the detected issue from manifesting. Can
   *     also reflect an observation of known mitigating factors that may reduce/eliminate the need
   *     for any action.
   */
  public DetectedIssueBuilder withMitigation(@NonNull DetectedIssue.Mitigation... mitigation) {
    this.mitigation = Arrays.asList(mitigation);
    return this;
  }
  /**
   * @param mitigation - Indicates an action that has been taken or is committed to reduce or
   *     eliminate the likelihood of the risk identified by the detected issue from manifesting. Can
   *     also reflect an observation of known mitigating factors that may reduce/eliminate the need
   *     for any action.
   */
  public DetectedIssueBuilder withMitigation(
      @NonNull Collection<DetectedIssue.Mitigation> mitigation) {
    this.mitigation = Collections.unmodifiableCollection(mitigation);
    return this;
  }

  public DetectedIssueBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public DetectedIssue build() {
    return new DetectedIssue(
        OptionConverters.toScala(id),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        OptionConverters.toScala(code),
        status,
        OptionConverters.toScala(author),
        OptionConverters.toScala(detail),
        OptionConverters.toScala(patient),
        OptionConverters.toScala(language),
        OptionConverters.toScala(severity),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(reference),
        identifier.stream().collect(new LitSeqJCollector<>()),
        implicated.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(implicitRules),
        OptionConverters.toScala(identified),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        evidence.stream().collect(new LitSeqJCollector<>()),
        mitigation.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
