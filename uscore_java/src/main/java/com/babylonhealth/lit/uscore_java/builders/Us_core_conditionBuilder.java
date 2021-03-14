package com.babylonhealth.lit.uscore_java.builders;

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
import com.babylonhealth.lit.uscore.model.*;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.usbase_java.builders.*;
import com.babylonhealth.lit.uscore_java.builders.*;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class Us_core_conditionBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta =
      Optional.of(
          new MetaBuilder()
              .withProfile("http://hl7.org/fhir/us/core/StructureDefinition/us-core-condition")
              .build());
  private Optional<Narrative> text = Optional.empty();
  private CodeableConcept code;
  private Collection<Annotation> note = Collections.emptyList();
  private Reference subject;
  private Optional<LANGUAGES> language = Optional.empty();
  private Collection<CodeableConcept> category;
  private Optional<CodeableConcept> severity = Optional.empty();
  private Collection<CodeableConcept> bodySite = Collections.emptyList();
  private Optional<
          Choice<
              $bslash$div<
                  $bslash$div<$bslash$div<$bslash$div<Age, FHIRDateTime>, Period>, Range>, String>>>
      onset = Optional.empty();
  private Optional<Reference> recorder = Optional.empty();
  private Optional<Reference> asserter = Optional.empty();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Reference> encounter = Optional.empty();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Optional<
          Choice<
              $bslash$div<
                  $bslash$div<$bslash$div<$bslash$div<Age, FHIRDateTime>, Period>, Range>, String>>>
      abatement = Optional.empty();
  private Optional<FHIRDateTime> recordedDate = Optional.empty();
  private Optional<String> implicitRules = Optional.empty();
  private Optional<CodeableConcept> clinicalStatus = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<CodeableConcept> verificationStatus = Optional.empty();
  private Collection<Condition.Stage> stage = Collections.emptyList();
  private Collection<Condition.Evidence> evidence = Collections.emptyList();

  /**
   * Required fields for {@link Us_core_condition}
   *
   * @param code - Identification of the condition, problem or diagnosis.
   * @param subject - Indicates the patient or group who the condition record is associated with.
   * @param category - A category assigned to the condition.
   */
  public Us_core_conditionBuilder(
      CodeableConcept code, Reference subject, Collection<CodeableConcept> category) {
    this.code = code;
    this.subject = subject;
    this.category = category;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public Us_core_conditionBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public Us_core_conditionBuilder withMeta(@NonNull Meta meta) {
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
  public Us_core_conditionBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param note - Additional information about the Condition. This is a general notes/comments
   *     entry for description of the Condition, its diagnosis and prognosis.
   */
  public Us_core_conditionBuilder withNote(@NonNull Annotation... note) {
    this.note = Arrays.asList(note);
    return this;
  }
  /**
   * @param note - Additional information about the Condition. This is a general notes/comments
   *     entry for description of the Condition, its diagnosis and prognosis.
   */
  public Us_core_conditionBuilder withNote(@NonNull Collection<Annotation> note) {
    this.note = Collections.unmodifiableCollection(note);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public Us_core_conditionBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param severity - A subjective assessment of the severity of the condition as evaluated by the
   *     clinician.
   */
  public Us_core_conditionBuilder withSeverity(@NonNull CodeableConcept severity) {
    this.severity = Optional.of(severity);
    return this;
  }
  /** @param bodySite - The anatomical location where this condition manifests itself. */
  public Us_core_conditionBuilder withBodySite(@NonNull CodeableConcept... bodySite) {
    this.bodySite = Arrays.asList(bodySite);
    return this;
  }
  /** @param bodySite - The anatomical location where this condition manifests itself. */
  public Us_core_conditionBuilder withBodySite(@NonNull Collection<CodeableConcept> bodySite) {
    this.bodySite = Collections.unmodifiableCollection(bodySite);
    return this;
  }
  /**
   * @param onset - Estimated or actual date or date-time the condition began, in the opinion of the
   *     clinician. Field is a 'choice' field. Type should be one of Age, FHIRDateTime, Period,
   *     Range, String.
   */
  public <T> Us_core_conditionBuilder withOnset(@NonNull T onset) {
    var guessedSuffix =
        autoSuffix(onset.getClass().getSimpleName(), Us_core_condition$.MODULE$.onset());
    return withOnset(guessedSuffix, onset);
  }

  /**
   * Alternative to the 'main' withOnset method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param onset - The value to be passed to the builder
   */
  public <T> Us_core_conditionBuilder withOnset(String suffix, @NonNull T onset) {
    guard(onset.getClass().getSimpleName(), suffix, Us_core_condition$.MODULE$.onset());
    this.onset =
        Optional.of(
            (Choice) Choice$.MODULE$.fromSuffix(suffix, onset, Us_core_condition$.MODULE$.onset()));
    return this;
  }
  /**
   * @param recorder - Individual who recorded the record and takes responsibility for its content.
   */
  public Us_core_conditionBuilder withRecorder(@NonNull Reference recorder) {
    this.recorder = Optional.of(recorder);
    return this;
  }
  /** @param asserter - Individual who is making the condition statement. */
  public Us_core_conditionBuilder withAsserter(@NonNull Reference asserter) {
    this.asserter = Optional.of(asserter);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public Us_core_conditionBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public Us_core_conditionBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public Us_core_conditionBuilder withExtension(@NonNull Extension... extension) {
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
  public Us_core_conditionBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param encounter - The Encounter during which this Condition was created or to which the
   *     creation of this record is tightly associated.
   */
  public Us_core_conditionBuilder withEncounter(@NonNull Reference encounter) {
    this.encounter = Optional.of(encounter);
    return this;
  }
  /**
   * @param identifier - Business identifiers assigned to this condition by the performer or other
   *     systems which remain constant as the resource is updated and propagates from server to
   *     server.
   */
  public Us_core_conditionBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /**
   * @param identifier - Business identifiers assigned to this condition by the performer or other
   *     systems which remain constant as the resource is updated and propagates from server to
   *     server.
   */
  public Us_core_conditionBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /**
   * @param abatement - The date or estimated date that the condition resolved or went into
   *     remission. This is called "abatement" because of the many overloaded connotations
   *     associated with "remission" or "resolution" - Conditions are never really resolved, but
   *     they can abate. Field is a 'choice' field. Type should be one of Age, FHIRDateTime, Period,
   *     Range, String.
   */
  public <T> Us_core_conditionBuilder withAbatement(@NonNull T abatement) {
    var guessedSuffix =
        autoSuffix(abatement.getClass().getSimpleName(), Us_core_condition$.MODULE$.abatement());
    return withAbatement(guessedSuffix, abatement);
  }

  /**
   * Alternative to the 'main' withAbatement method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param abatement - The value to be passed to the builder
   */
  public <T> Us_core_conditionBuilder withAbatement(String suffix, @NonNull T abatement) {
    guard(abatement.getClass().getSimpleName(), suffix, Us_core_condition$.MODULE$.abatement());
    this.abatement =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix, abatement, Us_core_condition$.MODULE$.abatement()));
    return this;
  }
  /**
   * @param recordedDate - The recordedDate represents when this particular Condition record was
   *     created in the system, which is often a system-generated date.
   */
  public Us_core_conditionBuilder withRecordedDate(@NonNull FHIRDateTime recordedDate) {
    this.recordedDate = Optional.of(recordedDate);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public Us_core_conditionBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /** @param clinicalStatus - The clinical status of the condition. */
  public Us_core_conditionBuilder withClinicalStatus(@NonNull CodeableConcept clinicalStatus) {
    this.clinicalStatus = Optional.of(clinicalStatus);
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
  public Us_core_conditionBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public Us_core_conditionBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param verificationStatus - The verification status to support the clinical status of the
   *     condition.
   */
  public Us_core_conditionBuilder withVerificationStatus(
      @NonNull CodeableConcept verificationStatus) {
    this.verificationStatus = Optional.of(verificationStatus);
    return this;
  }
  /**
   * @param stage - Clinical stage or grade of a condition. May include formal severity assessments.
   */
  public Us_core_conditionBuilder withStage(@NonNull Condition.Stage... stage) {
    this.stage = Arrays.asList(stage);
    return this;
  }
  /**
   * @param stage - Clinical stage or grade of a condition. May include formal severity assessments.
   */
  public Us_core_conditionBuilder withStage(@NonNull Collection<Condition.Stage> stage) {
    this.stage = Collections.unmodifiableCollection(stage);
    return this;
  }
  /**
   * @param evidence - Supporting evidence / manifestations that are the basis of the Condition's
   *     verification status, such as evidence that confirmed or refuted the condition.
   */
  public Us_core_conditionBuilder withEvidence(@NonNull Condition.Evidence... evidence) {
    this.evidence = Arrays.asList(evidence);
    return this;
  }
  /**
   * @param evidence - Supporting evidence / manifestations that are the basis of the Condition's
   *     verification status, such as evidence that confirmed or refuted the condition.
   */
  public Us_core_conditionBuilder withEvidence(@NonNull Collection<Condition.Evidence> evidence) {
    this.evidence = Collections.unmodifiableCollection(evidence);
    return this;
  }

  public Us_core_conditionBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public Us_core_condition build() {
    return new Us_core_condition(
        OptionConverters.toScala(id),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        code,
        note.stream().collect(new LitSeqJCollector<>()),
        subject,
        OptionConverters.toScala(language),
        category.stream().collect(new NonEmptyLitSeqJCollector<>()),
        OptionConverters.toScala(severity),
        bodySite.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(onset),
        OptionConverters.toScala(recorder),
        OptionConverters.toScala(asserter),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(encounter),
        identifier.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(abatement),
        OptionConverters.toScala(recordedDate),
        OptionConverters.toScala(implicitRules),
        OptionConverters.toScala(clinicalStatus),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(verificationStatus),
        stage.stream().collect(new LitSeqJCollector<>()),
        evidence.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
