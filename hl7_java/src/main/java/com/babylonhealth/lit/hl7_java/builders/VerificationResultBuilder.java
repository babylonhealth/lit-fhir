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
import com.babylonhealth.lit.hl7.VERIFICATIONRESULT_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class VerificationResultBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private Optional<CodeableConcept> need = Optional.empty();
  private Collection<Reference> target = Collections.emptyList();
  private VERIFICATIONRESULT_STATUS status;
  private Optional<LANGUAGES> language = Optional.empty();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Timing> frequency = Optional.empty();
  private Optional<FHIRDateTime> statusDate = Optional.empty();
  private Optional<String> implicitRules = Optional.empty();
  private Optional<FHIRDateTime> lastPerformed = Optional.empty();
  private Optional<FHIRDate> nextScheduled = Optional.empty();
  private Optional<CodeableConcept> failureAction = Optional.empty();
  private Collection<String> targetLocation = Collections.emptyList();
  private Optional<CodeableConcept> validationType = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<CodeableConcept> validationProcess = Collections.emptyList();
  private Collection<VerificationResult.Validator> validator = Collections.emptyList();
  private Collection<VerificationResult.PrimarySource> primarySource = Collections.emptyList();
  private Optional<VerificationResult.Attestation> attestation = Optional.empty();

  /**
   * Required fields for {@link VerificationResult}
   *
   * @param status - The validation status of the target (attested; validated; in process; requires
   *     revalidation; validation failed; revalidation failed).
   */
  public VerificationResultBuilder(VERIFICATIONRESULT_STATUS status) {
    this.status = status;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public VerificationResultBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public VerificationResultBuilder withMeta(@NonNull Meta meta) {
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
  public VerificationResultBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param need - The frequency with which the target must be validated (none; initial; periodic).
   */
  public VerificationResultBuilder withNeed(@NonNull CodeableConcept need) {
    this.need = Optional.of(need);
    return this;
  }
  /** @param target - A resource that was validated. */
  public VerificationResultBuilder withTarget(@NonNull Reference... target) {
    this.target = Arrays.asList(target);
    return this;
  }
  /** @param target - A resource that was validated. */
  public VerificationResultBuilder withTarget(@NonNull Collection<Reference> target) {
    this.target = Collections.unmodifiableCollection(target);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public VerificationResultBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public VerificationResultBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public VerificationResultBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public VerificationResultBuilder withExtension(@NonNull Extension... extension) {
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
  public VerificationResultBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param frequency - Frequency of revalidation. */
  public VerificationResultBuilder withFrequency(@NonNull Timing frequency) {
    this.frequency = Optional.of(frequency);
    return this;
  }
  /** @param statusDate - When the validation status was updated. */
  public VerificationResultBuilder withStatusDate(@NonNull FHIRDateTime statusDate) {
    this.statusDate = Optional.of(statusDate);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public VerificationResultBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param lastPerformed - The date/time validation was last completed (including failed
   *     validations).
   */
  public VerificationResultBuilder withLastPerformed(@NonNull FHIRDateTime lastPerformed) {
    this.lastPerformed = Optional.of(lastPerformed);
    return this;
  }
  /** @param nextScheduled - The date when target is next validated, if appropriate. */
  public VerificationResultBuilder withNextScheduled(@NonNull FHIRDate nextScheduled) {
    this.nextScheduled = Optional.of(nextScheduled);
    return this;
  }
  /** @param failureAction - The result if validation fails (fatal; warning; record only; none). */
  public VerificationResultBuilder withFailureAction(@NonNull CodeableConcept failureAction) {
    this.failureAction = Optional.of(failureAction);
    return this;
  }
  /** @param targetLocation - The fhirpath location(s) within the resource that was validated. */
  public VerificationResultBuilder withTargetLocation(@NonNull String... targetLocation) {
    this.targetLocation = Arrays.asList(targetLocation);
    return this;
  }
  /** @param targetLocation - The fhirpath location(s) within the resource that was validated. */
  public VerificationResultBuilder withTargetLocation(@NonNull Collection<String> targetLocation) {
    this.targetLocation = Collections.unmodifiableCollection(targetLocation);
    return this;
  }
  /**
   * @param validationType - What the target is validated against (nothing; primary source; multiple
   *     sources).
   */
  public VerificationResultBuilder withValidationType(@NonNull CodeableConcept validationType) {
    this.validationType = Optional.of(validationType);
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
  public VerificationResultBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public VerificationResultBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param validationProcess - The primary process by which the target is validated (edit check;
   *     value set; primary source; multiple sources; standalone; in context).
   */
  public VerificationResultBuilder withValidationProcess(
      @NonNull CodeableConcept... validationProcess) {
    this.validationProcess = Arrays.asList(validationProcess);
    return this;
  }
  /**
   * @param validationProcess - The primary process by which the target is validated (edit check;
   *     value set; primary source; multiple sources; standalone; in context).
   */
  public VerificationResultBuilder withValidationProcess(
      @NonNull Collection<CodeableConcept> validationProcess) {
    this.validationProcess = Collections.unmodifiableCollection(validationProcess);
    return this;
  }
  /** @param validator - Information about the entity validating information. */
  public VerificationResultBuilder withValidator(
      @NonNull VerificationResult.Validator... validator) {
    this.validator = Arrays.asList(validator);
    return this;
  }
  /** @param validator - Information about the entity validating information. */
  public VerificationResultBuilder withValidator(
      @NonNull Collection<VerificationResult.Validator> validator) {
    this.validator = Collections.unmodifiableCollection(validator);
    return this;
  }
  /** @param primarySource - Information about the primary source(s) involved in validation. */
  public VerificationResultBuilder withPrimarySource(
      @NonNull VerificationResult.PrimarySource... primarySource) {
    this.primarySource = Arrays.asList(primarySource);
    return this;
  }
  /** @param primarySource - Information about the primary source(s) involved in validation. */
  public VerificationResultBuilder withPrimarySource(
      @NonNull Collection<VerificationResult.PrimarySource> primarySource) {
    this.primarySource = Collections.unmodifiableCollection(primarySource);
    return this;
  }
  /** @param attestation - Information about the entity attesting to information. */
  public VerificationResultBuilder withAttestation(
      @NonNull VerificationResult.Attestation attestation) {
    this.attestation = Optional.of(attestation);
    return this;
  }

  public VerificationResultBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public VerificationResult build() {
    return new VerificationResult(
        (Option) OptionConverters.toScala(id),
        (Option) OptionConverters.toScala(meta),
        (Option) OptionConverters.toScala(text),
        (Option) OptionConverters.toScala(need),
        target.stream().collect(new LitSeqJCollector<>()),
        status,
        (Option) OptionConverters.toScala(language),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(frequency),
        (Option) OptionConverters.toScala(statusDate),
        (Option) OptionConverters.toScala(implicitRules),
        (Option) OptionConverters.toScala(lastPerformed),
        (Option) OptionConverters.toScala(nextScheduled),
        (Option) OptionConverters.toScala(failureAction),
        targetLocation.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(validationType),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        validationProcess.stream().collect(new LitSeqJCollector<>()),
        validator.stream().collect(new LitSeqJCollector<>()),
        primarySource.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(attestation),
        LitUtils.emptyMetaElMap());
  }
}
