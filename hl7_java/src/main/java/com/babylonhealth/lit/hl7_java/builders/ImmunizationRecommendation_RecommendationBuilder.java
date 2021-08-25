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

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface ImmunizationRecommendation_RecommendationBuilder {
  public ImmunizationRecommendation.Recommendation build();

  public static Impl init(CodeableConcept forecastStatus) {
    return new Impl(forecastStatus);
  }

  public static Impl builder(CodeableConceptBuilder forecastStatus) {
    return new Impl(forecastStatus.build());
  }

  public class Impl implements ImmunizationRecommendation_RecommendationBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> series = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> doseNumber = Optional.empty();
    private Collection<CodeableConcept> vaccineCode = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Optional<String> seriesDoses = Optional.empty();
    private Collection<CodeableConcept> targetDisease = Collections.emptyList();
    private CodeableConcept forecastStatus;
    private Collection<CodeableConcept> forecastReason = Collections.emptyList();
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
    public Impl(CodeableConcept forecastStatus) {
      this.forecastStatus = forecastStatus;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ImmunizationRecommendation_RecommendationBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param series */
    public ImmunizationRecommendation_RecommendationBuilder.Impl withSeries(
        @NonNull String series) {
      this.series = Optional.of(series);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ImmunizationRecommendation_RecommendationBuilder.Impl withExtension(
        @NonNull Extension... extension) {
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
    public ImmunizationRecommendation_RecommendationBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ImmunizationRecommendation_RecommendationBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param doseNumber */
    public ImmunizationRecommendation_RecommendationBuilder.Impl withDoseNumber(
        @NonNull String doseNumber) {
      this.doseNumber = Optional.of(doseNumber);
      return this;
    }
    /** @param vaccineCode */
    public ImmunizationRecommendation_RecommendationBuilder.Impl withVaccineCode(
        @NonNull CodeableConcept... vaccineCode) {
      this.vaccineCode = Arrays.asList(vaccineCode);
      return this;
    }
    /** @param vaccineCode */
    public ImmunizationRecommendation_RecommendationBuilder.Impl withVaccineCode(
        @NonNull Collection<CodeableConcept> vaccineCode) {
      this.vaccineCode = Collections.unmodifiableCollection(vaccineCode);
      return this;
    }

    public ImmunizationRecommendation_RecommendationBuilder.Impl withVaccineCode(
        @NonNull CodeableConceptBuilder... vaccineCode) {
      this.vaccineCode = Arrays.stream(vaccineCode).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param description */
    public ImmunizationRecommendation_RecommendationBuilder.Impl withDescription(
        @NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /** @param seriesDoses */
    public ImmunizationRecommendation_RecommendationBuilder.Impl withSeriesDoses(
        @NonNull String seriesDoses) {
      this.seriesDoses = Optional.of(seriesDoses);
      return this;
    }
    /** @param targetDisease */
    public ImmunizationRecommendation_RecommendationBuilder.Impl withTargetDisease(
        @NonNull CodeableConcept... targetDisease) {
      this.targetDisease = Arrays.asList(targetDisease);
      return this;
    }
    /** @param targetDisease */
    public ImmunizationRecommendation_RecommendationBuilder.Impl withTargetDisease(
        @NonNull Collection<CodeableConcept> targetDisease) {
      this.targetDisease = Collections.unmodifiableCollection(targetDisease);
      return this;
    }

    public ImmunizationRecommendation_RecommendationBuilder.Impl withTargetDisease(
        @NonNull CodeableConceptBuilder... targetDisease) {
      this.targetDisease = Arrays.stream(targetDisease).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param forecastReason */
    public ImmunizationRecommendation_RecommendationBuilder.Impl withForecastReason(
        @NonNull CodeableConcept... forecastReason) {
      this.forecastReason = Arrays.asList(forecastReason);
      return this;
    }
    /** @param forecastReason */
    public ImmunizationRecommendation_RecommendationBuilder.Impl withForecastReason(
        @NonNull Collection<CodeableConcept> forecastReason) {
      this.forecastReason = Collections.unmodifiableCollection(forecastReason);
      return this;
    }

    public ImmunizationRecommendation_RecommendationBuilder.Impl withForecastReason(
        @NonNull CodeableConceptBuilder... forecastReason) {
      this.forecastReason = Arrays.stream(forecastReason).map(e -> e.build()).collect(toList());
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
    public ImmunizationRecommendation_RecommendationBuilder.Impl withModifierExtension(
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
    public ImmunizationRecommendation_RecommendationBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ImmunizationRecommendation_RecommendationBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param supportingImmunization */
    public ImmunizationRecommendation_RecommendationBuilder.Impl withSupportingImmunization(
        @NonNull Reference... supportingImmunization) {
      this.supportingImmunization = Arrays.asList(supportingImmunization);
      return this;
    }
    /** @param supportingImmunization */
    public ImmunizationRecommendation_RecommendationBuilder.Impl withSupportingImmunization(
        @NonNull Collection<Reference> supportingImmunization) {
      this.supportingImmunization = Collections.unmodifiableCollection(supportingImmunization);
      return this;
    }

    public ImmunizationRecommendation_RecommendationBuilder.Impl withSupportingImmunization(
        @NonNull ReferenceBuilder... supportingImmunization) {
      this.supportingImmunization =
          Arrays.stream(supportingImmunization).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param contraindicatedVaccineCode */
    public ImmunizationRecommendation_RecommendationBuilder.Impl withContraindicatedVaccineCode(
        @NonNull CodeableConcept... contraindicatedVaccineCode) {
      this.contraindicatedVaccineCode = Arrays.asList(contraindicatedVaccineCode);
      return this;
    }
    /** @param contraindicatedVaccineCode */
    public ImmunizationRecommendation_RecommendationBuilder.Impl withContraindicatedVaccineCode(
        @NonNull Collection<CodeableConcept> contraindicatedVaccineCode) {
      this.contraindicatedVaccineCode =
          Collections.unmodifiableCollection(contraindicatedVaccineCode);
      return this;
    }

    public ImmunizationRecommendation_RecommendationBuilder.Impl withContraindicatedVaccineCode(
        @NonNull CodeableConceptBuilder... contraindicatedVaccineCode) {
      this.contraindicatedVaccineCode =
          Arrays.stream(contraindicatedVaccineCode).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param supportingPatientInformation */
    public ImmunizationRecommendation_RecommendationBuilder.Impl withSupportingPatientInformation(
        @NonNull Reference... supportingPatientInformation) {
      this.supportingPatientInformation = Arrays.asList(supportingPatientInformation);
      return this;
    }
    /** @param supportingPatientInformation */
    public ImmunizationRecommendation_RecommendationBuilder.Impl withSupportingPatientInformation(
        @NonNull Collection<Reference> supportingPatientInformation) {
      this.supportingPatientInformation =
          Collections.unmodifiableCollection(supportingPatientInformation);
      return this;
    }

    public ImmunizationRecommendation_RecommendationBuilder.Impl withSupportingPatientInformation(
        @NonNull ReferenceBuilder... supportingPatientInformation) {
      this.supportingPatientInformation =
          Arrays.stream(supportingPatientInformation).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param dateCriterion */
    public ImmunizationRecommendation_RecommendationBuilder.Impl withDateCriterion(
        @NonNull ImmunizationRecommendation$Recommendation$DateCriterion... dateCriterion) {
      this.dateCriterion = Arrays.asList(dateCriterion);
      return this;
    }
    /** @param dateCriterion */
    public ImmunizationRecommendation_RecommendationBuilder.Impl withDateCriterion(
        @NonNull
            Collection<ImmunizationRecommendation$Recommendation$DateCriterion> dateCriterion) {
      this.dateCriterion = Collections.unmodifiableCollection(dateCriterion);
      return this;
    }

    public ImmunizationRecommendation_RecommendationBuilder.Impl withDateCriterion(
        @NonNull ImmunizationRecommendation_Recommendation_DateCriterionBuilder... dateCriterion) {
      this.dateCriterion = Arrays.stream(dateCriterion).map(e -> e.build()).collect(toList());
      return this;
    }

    public ImmunizationRecommendation.Recommendation build() {
      return new ImmunizationRecommendation.Recommendation(
          OptionConverters.toScala(id),
          OptionConverters.toScala(series),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(doseNumber),
          vaccineCode.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          OptionConverters.toScala(seriesDoses),
          targetDisease.stream().collect(new LitSeqJCollector<>()),
          forecastStatus,
          forecastReason.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          supportingImmunization.stream().collect(new LitSeqJCollector<>()),
          contraindicatedVaccineCode.stream().collect(new LitSeqJCollector<>()),
          supportingPatientInformation.stream().collect(new LitSeqJCollector<>()),
          dateCriterion.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
