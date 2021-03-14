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

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class ImmunizationRecommendation_RecommendationBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<String> series = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<CodeableConcept> vaccineCode = Collections.emptyList();
  private Optional<String> description = Optional.empty();
  private Optional<CodeableConcept> targetDisease = Optional.empty();
  private Optional<Choice> doseNumber = Optional.empty();
  private CodeableConcept forecastStatus;
  private Collection<CodeableConcept> forecastReason = Collections.emptyList();
  private Optional<Choice> seriesDoses = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<Reference> supportingImmunization = Collections.emptyList();
  private Collection<CodeableConcept> contraindicatedVaccineCode = Collections.emptyList();
  private Collection<Reference> supportingPatientInformation = Collections.emptyList();
  private Collection<ImmunizationRecommendation$Recommendation$DateCriterion> dateCriterion =
      Collections.emptyList();

  /**
   * Required fields for {@link ImmunizationRecommendation.Recommendation}
   *
   * @param forecastStatus
   */
  public ImmunizationRecommendation_RecommendationBuilder(CodeableConcept forecastStatus) {
    this.forecastStatus = forecastStatus;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public ImmunizationRecommendation_RecommendationBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param series */
  public ImmunizationRecommendation_RecommendationBuilder withSeries(@NonNull String series) {
    this.series = Optional.of(series);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public ImmunizationRecommendation_RecommendationBuilder withExtension(
      @NonNull Extension... extension) {
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
  public ImmunizationRecommendation_RecommendationBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param vaccineCode */
  public ImmunizationRecommendation_RecommendationBuilder withVaccineCode(
      @NonNull CodeableConcept... vaccineCode) {
    this.vaccineCode = Arrays.asList(vaccineCode);
    return this;
  }
  /** @param vaccineCode */
  public ImmunizationRecommendation_RecommendationBuilder withVaccineCode(
      @NonNull Collection<CodeableConcept> vaccineCode) {
    this.vaccineCode = Collections.unmodifiableCollection(vaccineCode);
    return this;
  }
  /** @param description */
  public ImmunizationRecommendation_RecommendationBuilder withDescription(
      @NonNull String description) {
    this.description = Optional.of(description);
    return this;
  }
  /** @param targetDisease */
  public ImmunizationRecommendation_RecommendationBuilder withTargetDisease(
      @NonNull CodeableConcept targetDisease) {
    this.targetDisease = Optional.of(targetDisease);
    return this;
  }
  /** @param doseNumber Field is a 'choice' field. Type should be one of Integer, String. */
  public <T> ImmunizationRecommendation_RecommendationBuilder withDoseNumber(
      @NonNull T doseNumber) {
    var guessedSuffix =
        autoSuffix(
            doseNumber.getClass().getSimpleName(),
            ImmunizationRecommendation.Recommendation$.MODULE$.doseNumber());
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
  public <T> ImmunizationRecommendation_RecommendationBuilder withDoseNumber(
      String suffix, @NonNull T doseNumber) {
    guard(
        doseNumber.getClass().getSimpleName(),
        suffix,
        ImmunizationRecommendation.Recommendation$.MODULE$.doseNumber());
    this.doseNumber =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix,
                    doseNumber,
                    ImmunizationRecommendation.Recommendation$.MODULE$.doseNumber()));
    return this;
  }
  /** @param forecastReason */
  public ImmunizationRecommendation_RecommendationBuilder withForecastReason(
      @NonNull CodeableConcept... forecastReason) {
    this.forecastReason = Arrays.asList(forecastReason);
    return this;
  }
  /** @param forecastReason */
  public ImmunizationRecommendation_RecommendationBuilder withForecastReason(
      @NonNull Collection<CodeableConcept> forecastReason) {
    this.forecastReason = Collections.unmodifiableCollection(forecastReason);
    return this;
  }
  /** @param seriesDoses Field is a 'choice' field. Type should be one of Integer, String. */
  public <T> ImmunizationRecommendation_RecommendationBuilder withSeriesDoses(
      @NonNull T seriesDoses) {
    var guessedSuffix =
        autoSuffix(
            seriesDoses.getClass().getSimpleName(),
            ImmunizationRecommendation.Recommendation$.MODULE$.seriesDoses());
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
  public <T> ImmunizationRecommendation_RecommendationBuilder withSeriesDoses(
      String suffix, @NonNull T seriesDoses) {
    guard(
        seriesDoses.getClass().getSimpleName(),
        suffix,
        ImmunizationRecommendation.Recommendation$.MODULE$.seriesDoses());
    this.seriesDoses =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix,
                    seriesDoses,
                    ImmunizationRecommendation.Recommendation$.MODULE$.seriesDoses()));
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
  public ImmunizationRecommendation_RecommendationBuilder withModifierExtension(
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
  public ImmunizationRecommendation_RecommendationBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param supportingImmunization */
  public ImmunizationRecommendation_RecommendationBuilder withSupportingImmunization(
      @NonNull Reference... supportingImmunization) {
    this.supportingImmunization = Arrays.asList(supportingImmunization);
    return this;
  }
  /** @param supportingImmunization */
  public ImmunizationRecommendation_RecommendationBuilder withSupportingImmunization(
      @NonNull Collection<Reference> supportingImmunization) {
    this.supportingImmunization = Collections.unmodifiableCollection(supportingImmunization);
    return this;
  }
  /** @param contraindicatedVaccineCode */
  public ImmunizationRecommendation_RecommendationBuilder withContraindicatedVaccineCode(
      @NonNull CodeableConcept... contraindicatedVaccineCode) {
    this.contraindicatedVaccineCode = Arrays.asList(contraindicatedVaccineCode);
    return this;
  }
  /** @param contraindicatedVaccineCode */
  public ImmunizationRecommendation_RecommendationBuilder withContraindicatedVaccineCode(
      @NonNull Collection<CodeableConcept> contraindicatedVaccineCode) {
    this.contraindicatedVaccineCode =
        Collections.unmodifiableCollection(contraindicatedVaccineCode);
    return this;
  }
  /** @param supportingPatientInformation */
  public ImmunizationRecommendation_RecommendationBuilder withSupportingPatientInformation(
      @NonNull Reference... supportingPatientInformation) {
    this.supportingPatientInformation = Arrays.asList(supportingPatientInformation);
    return this;
  }
  /** @param supportingPatientInformation */
  public ImmunizationRecommendation_RecommendationBuilder withSupportingPatientInformation(
      @NonNull Collection<Reference> supportingPatientInformation) {
    this.supportingPatientInformation =
        Collections.unmodifiableCollection(supportingPatientInformation);
    return this;
  }
  /** @param dateCriterion */
  public ImmunizationRecommendation_RecommendationBuilder withDateCriterion(
      @NonNull ImmunizationRecommendation$Recommendation$DateCriterion... dateCriterion) {
    this.dateCriterion = Arrays.asList(dateCriterion);
    return this;
  }
  /** @param dateCriterion */
  public ImmunizationRecommendation_RecommendationBuilder withDateCriterion(
      @NonNull Collection<ImmunizationRecommendation$Recommendation$DateCriterion> dateCriterion) {
    this.dateCriterion = Collections.unmodifiableCollection(dateCriterion);
    return this;
  }

  public ImmunizationRecommendation.Recommendation build() {
    return new ImmunizationRecommendation.Recommendation(
        OptionConverters.toScala(id),
        OptionConverters.toScala(series),
        extension.stream().collect(new LitSeqJCollector<>()),
        vaccineCode.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(description),
        OptionConverters.toScala(targetDisease),
        (Option) OptionConverters.toScala(doseNumber),
        forecastStatus,
        forecastReason.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(seriesDoses),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        supportingImmunization.stream().collect(new LitSeqJCollector<>()),
        contraindicatedVaccineCode.stream().collect(new LitSeqJCollector<>()),
        supportingPatientInformation.stream().collect(new LitSeqJCollector<>()),
        dateCriterion.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
