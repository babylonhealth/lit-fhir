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
import com.babylonhealth.lit.hl7.IMMUNIZATION_EVALUATION_STATUS;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class ImmunizationEvaluationBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private Optional<FHIRDateTime> date = Optional.empty();
  private IMMUNIZATION_EVALUATION_STATUS status;
  private Optional<String> series = Optional.empty();
  private Reference patient;
  private Optional<LANGUAGES> language = Optional.empty();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Reference> authority = Optional.empty();
  private Collection<Identifier> identifier = Collections.emptyList();
  private CodeableConcept doseStatus;
  private Optional<String> description = Optional.empty();
  private Optional<String> implicitRules = Optional.empty();
  private CodeableConcept targetDisease;
  private Optional<Choice> doseNumber = Optional.empty();
  private Optional<Choice> seriesDoses = Optional.empty();
  private Collection<CodeableConcept> doseStatusReason = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Reference immunizationEvent;

  /**
   * Required fields for {@link ImmunizationEvaluation}
   *
   * @param status - Indicates the current status of the evaluation of the vaccination
   *     administration event.
   * @param patient - The individual for whom the evaluation is being done.
   * @param doseStatus - Indicates if the dose is valid or not valid with respect to the published
   *     recommendations.
   * @param targetDisease - The vaccine preventable disease the dose is being evaluated against.
   * @param immunizationEvent - The vaccine administration event being evaluated.
   */
  public ImmunizationEvaluationBuilder(
      IMMUNIZATION_EVALUATION_STATUS status,
      Reference patient,
      CodeableConcept doseStatus,
      CodeableConcept targetDisease,
      Reference immunizationEvent) {
    this.status = status;
    this.patient = patient;
    this.doseStatus = doseStatus;
    this.targetDisease = targetDisease;
    this.immunizationEvent = immunizationEvent;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public ImmunizationEvaluationBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public ImmunizationEvaluationBuilder withMeta(@NonNull Meta meta) {
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
  public ImmunizationEvaluationBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /** @param date - The date the evaluation of the vaccine administration event was performed. */
  public ImmunizationEvaluationBuilder withDate(@NonNull FHIRDateTime date) {
    this.date = Optional.of(date);
    return this;
  }
  /**
   * @param series - One possible path to achieve presumed immunity against a disease - within the
   *     context of an authority.
   */
  public ImmunizationEvaluationBuilder withSeries(@NonNull String series) {
    this.series = Optional.of(series);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public ImmunizationEvaluationBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public ImmunizationEvaluationBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public ImmunizationEvaluationBuilder withContained(@NonNull Collection<Resource> contained) {
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
  public ImmunizationEvaluationBuilder withExtension(@NonNull Extension... extension) {
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
  public ImmunizationEvaluationBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param authority - Indicates the authority who published the protocol (e.g. ACIP). */
  public ImmunizationEvaluationBuilder withAuthority(@NonNull Reference authority) {
    this.authority = Optional.of(authority);
    return this;
  }
  /** @param identifier - A unique identifier assigned to this immunization evaluation record. */
  public ImmunizationEvaluationBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /** @param identifier - A unique identifier assigned to this immunization evaluation record. */
  public ImmunizationEvaluationBuilder withIdentifier(@NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /** @param description - Additional information about the evaluation. */
  public ImmunizationEvaluationBuilder withDescription(@NonNull String description) {
    this.description = Optional.of(description);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public ImmunizationEvaluationBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param doseNumber - Nominal position in a series. Field is a 'choice' field. Type should be one
   *     of Integer, String.
   */
  public <T> ImmunizationEvaluationBuilder withDoseNumber(@NonNull T doseNumber) {
    var guessedSuffix =
        autoSuffix(
            doseNumber.getClass().getSimpleName(), ImmunizationEvaluation$.MODULE$.doseNumber());
    return withDoseNumber(guessedSuffix, doseNumber);
  }

  /**
   * Alternative to the 'main' withDoseNumber method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param doseNumber - The value to be passed to the builder
   */
  public <T> ImmunizationEvaluationBuilder withDoseNumber(String suffix, @NonNull T doseNumber) {
    guard(
        doseNumber.getClass().getSimpleName(),
        suffix,
        ImmunizationEvaluation$.MODULE$.doseNumber());
    this.doseNumber =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix, doseNumber, ImmunizationEvaluation$.MODULE$.doseNumber()));
    return this;
  }
  /**
   * @param seriesDoses - The recommended number of doses to achieve immunity. Field is a 'choice'
   *     field. Type should be one of Integer, String.
   */
  public <T> ImmunizationEvaluationBuilder withSeriesDoses(@NonNull T seriesDoses) {
    var guessedSuffix =
        autoSuffix(
            seriesDoses.getClass().getSimpleName(), ImmunizationEvaluation$.MODULE$.seriesDoses());
    return withSeriesDoses(guessedSuffix, seriesDoses);
  }

  /**
   * Alternative to the 'main' withSeriesDoses method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param seriesDoses - The value to be passed to the builder
   */
  public <T> ImmunizationEvaluationBuilder withSeriesDoses(String suffix, @NonNull T seriesDoses) {
    guard(
        seriesDoses.getClass().getSimpleName(),
        suffix,
        ImmunizationEvaluation$.MODULE$.seriesDoses());
    this.seriesDoses =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix, seriesDoses, ImmunizationEvaluation$.MODULE$.seriesDoses()));
    return this;
  }
  /**
   * @param doseStatusReason - Provides an explanation as to why the vaccine administration event is
   *     valid or not relative to the published recommendations.
   */
  public ImmunizationEvaluationBuilder withDoseStatusReason(
      @NonNull CodeableConcept... doseStatusReason) {
    this.doseStatusReason = Arrays.asList(doseStatusReason);
    return this;
  }
  /**
   * @param doseStatusReason - Provides an explanation as to why the vaccine administration event is
   *     valid or not relative to the published recommendations.
   */
  public ImmunizationEvaluationBuilder withDoseStatusReason(
      @NonNull Collection<CodeableConcept> doseStatusReason) {
    this.doseStatusReason = Collections.unmodifiableCollection(doseStatusReason);
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
  public ImmunizationEvaluationBuilder withModifierExtension(
      @NonNull Extension... modifierExtension) {
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
  public ImmunizationEvaluationBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }

  public ImmunizationEvaluationBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public ImmunizationEvaluation build() {
    return new ImmunizationEvaluation(
        OptionConverters.toScala(id),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        OptionConverters.toScala(date),
        status,
        OptionConverters.toScala(series),
        patient,
        OptionConverters.toScala(language),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(authority),
        identifier.stream().collect(new LitSeqJCollector<>()),
        doseStatus,
        OptionConverters.toScala(description),
        OptionConverters.toScala(implicitRules),
        targetDisease,
        (Option) OptionConverters.toScala(doseNumber),
        (Option) OptionConverters.toScala(seriesDoses),
        doseStatusReason.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        immunizationEvent,
        LitUtils.emptyMetaElMap());
  }
}