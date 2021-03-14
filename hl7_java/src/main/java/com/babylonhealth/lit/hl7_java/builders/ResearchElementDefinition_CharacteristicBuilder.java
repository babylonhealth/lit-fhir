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
import com.babylonhealth.lit.hl7.GROUP_MEASURE;
import com.babylonhealth.lit.hl7.GROUP_MEASURE;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class ResearchElementDefinition_CharacteristicBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Boolean> exclude = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<UsageContext> usageContext = Collections.emptyList();
  private Choice<
          $bslash$div<
              $bslash$div<$bslash$div<String, CodeableConcept>, DataRequirement>, Expression>>
      definition;
  private Optional<CodeableConcept> unitOfMeasure = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<
          Choice<$bslash$div<$bslash$div<$bslash$div<Duration, FHIRDateTime>, Period>, Timing>>>
      studyEffective = Optional.empty();
  private Optional<
          Choice<$bslash$div<$bslash$div<$bslash$div<Duration, FHIRDateTime>, Period>, Timing>>>
      participantEffective = Optional.empty();
  private Optional<String> studyEffectiveDescription = Optional.empty();
  private Optional<GROUP_MEASURE> studyEffectiveGroupMeasure = Optional.empty();
  private Optional<Duration> studyEffectiveTimeFromStart = Optional.empty();
  private Optional<String> participantEffectiveDescription = Optional.empty();
  private Optional<GROUP_MEASURE> participantEffectiveGroupMeasure = Optional.empty();
  private Optional<Duration> participantEffectiveTimeFromStart = Optional.empty();

  /**
   * Required fields for {@link ResearchElementDefinition.Characteristic}
   *
   * @param definition Field is a 'choice' field. Type should be one of String, CodeableConcept,
   *     DataRequirement, Expression.
   */
  public ResearchElementDefinition_CharacteristicBuilder(@NonNull Object definition) {
    this.definition =
        (Choice)
            Choice$.MODULE$.fromSuffix(
                autoSuffix(
                    definition.getClass().getSimpleName(),
                    ResearchElementDefinition.Characteristic$.MODULE$.definition()),
                definition,
                ResearchElementDefinition.Characteristic$.MODULE$.definition());
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public ResearchElementDefinition_CharacteristicBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param exclude */
  public ResearchElementDefinition_CharacteristicBuilder withExclude(@NonNull Boolean exclude) {
    this.exclude = Optional.of(exclude);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public ResearchElementDefinition_CharacteristicBuilder withExtension(
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
  public ResearchElementDefinition_CharacteristicBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param usageContext */
  public ResearchElementDefinition_CharacteristicBuilder withUsageContext(
      @NonNull UsageContext... usageContext) {
    this.usageContext = Arrays.asList(usageContext);
    return this;
  }
  /** @param usageContext */
  public ResearchElementDefinition_CharacteristicBuilder withUsageContext(
      @NonNull Collection<UsageContext> usageContext) {
    this.usageContext = Collections.unmodifiableCollection(usageContext);
    return this;
  }
  /** @param unitOfMeasure */
  public ResearchElementDefinition_CharacteristicBuilder withUnitOfMeasure(
      @NonNull CodeableConcept unitOfMeasure) {
    this.unitOfMeasure = Optional.of(unitOfMeasure);
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
  public ResearchElementDefinition_CharacteristicBuilder withModifierExtension(
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
  public ResearchElementDefinition_CharacteristicBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param studyEffective Field is a 'choice' field. Type should be one of Duration, FHIRDateTime,
   *     Period, Timing.
   */
  public <T> ResearchElementDefinition_CharacteristicBuilder withStudyEffective(
      @NonNull T studyEffective) {
    var guessedSuffix =
        autoSuffix(
            studyEffective.getClass().getSimpleName(),
            ResearchElementDefinition.Characteristic$.MODULE$.studyEffective());
    return withStudyEffective(guessedSuffix, studyEffective);
  }

  /**
   * Alternative to the 'main' withStudyEffective method. This will be marginally faster than the
   * other method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param studyEffective - The value to be passed to the builder
   */
  public <T> ResearchElementDefinition_CharacteristicBuilder withStudyEffective(
      String suffix, @NonNull T studyEffective) {
    guard(
        studyEffective.getClass().getSimpleName(),
        suffix,
        ResearchElementDefinition.Characteristic$.MODULE$.studyEffective());
    this.studyEffective =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix,
                    studyEffective,
                    ResearchElementDefinition.Characteristic$.MODULE$.studyEffective()));
    return this;
  }
  /**
   * @param participantEffective Field is a 'choice' field. Type should be one of Duration,
   *     FHIRDateTime, Period, Timing.
   */
  public <T> ResearchElementDefinition_CharacteristicBuilder withParticipantEffective(
      @NonNull T participantEffective) {
    var guessedSuffix =
        autoSuffix(
            participantEffective.getClass().getSimpleName(),
            ResearchElementDefinition.Characteristic$.MODULE$.participantEffective());
    return withParticipantEffective(guessedSuffix, participantEffective);
  }

  /**
   * Alternative to the 'main' withParticipantEffective method. This will be marginally faster than
   * the other method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param participantEffective - The value to be passed to the builder
   */
  public <T> ResearchElementDefinition_CharacteristicBuilder withParticipantEffective(
      String suffix, @NonNull T participantEffective) {
    guard(
        participantEffective.getClass().getSimpleName(),
        suffix,
        ResearchElementDefinition.Characteristic$.MODULE$.participantEffective());
    this.participantEffective =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix,
                    participantEffective,
                    ResearchElementDefinition.Characteristic$.MODULE$.participantEffective()));
    return this;
  }
  /** @param studyEffectiveDescription */
  public ResearchElementDefinition_CharacteristicBuilder withStudyEffectiveDescription(
      @NonNull String studyEffectiveDescription) {
    this.studyEffectiveDescription = Optional.of(studyEffectiveDescription);
    return this;
  }
  /** @param studyEffectiveGroupMeasure */
  public ResearchElementDefinition_CharacteristicBuilder withStudyEffectiveGroupMeasure(
      @NonNull GROUP_MEASURE studyEffectiveGroupMeasure) {
    this.studyEffectiveGroupMeasure = Optional.of(studyEffectiveGroupMeasure);
    return this;
  }
  /** @param studyEffectiveTimeFromStart */
  public ResearchElementDefinition_CharacteristicBuilder withStudyEffectiveTimeFromStart(
      @NonNull Duration studyEffectiveTimeFromStart) {
    this.studyEffectiveTimeFromStart = Optional.of(studyEffectiveTimeFromStart);
    return this;
  }
  /** @param participantEffectiveDescription */
  public ResearchElementDefinition_CharacteristicBuilder withParticipantEffectiveDescription(
      @NonNull String participantEffectiveDescription) {
    this.participantEffectiveDescription = Optional.of(participantEffectiveDescription);
    return this;
  }
  /** @param participantEffectiveGroupMeasure */
  public ResearchElementDefinition_CharacteristicBuilder withParticipantEffectiveGroupMeasure(
      @NonNull GROUP_MEASURE participantEffectiveGroupMeasure) {
    this.participantEffectiveGroupMeasure = Optional.of(participantEffectiveGroupMeasure);
    return this;
  }
  /** @param participantEffectiveTimeFromStart */
  public ResearchElementDefinition_CharacteristicBuilder withParticipantEffectiveTimeFromStart(
      @NonNull Duration participantEffectiveTimeFromStart) {
    this.participantEffectiveTimeFromStart = Optional.of(participantEffectiveTimeFromStart);
    return this;
  }

  public ResearchElementDefinition.Characteristic build() {
    return new ResearchElementDefinition.Characteristic(
        OptionConverters.toScala(id),
        OptionConverters.toScala(exclude.map(x -> (Object) x)),
        extension.stream().collect(new LitSeqJCollector<>()),
        usageContext.stream().collect(new LitSeqJCollector<>()),
        definition,
        OptionConverters.toScala(unitOfMeasure),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(studyEffective),
        OptionConverters.toScala(participantEffective),
        OptionConverters.toScala(studyEffectiveDescription),
        OptionConverters.toScala(studyEffectiveGroupMeasure),
        OptionConverters.toScala(studyEffectiveTimeFromStart),
        OptionConverters.toScala(participantEffectiveDescription),
        OptionConverters.toScala(participantEffectiveGroupMeasure),
        OptionConverters.toScala(participantEffectiveTimeFromStart),
        LitUtils.emptyMetaElMap());
  }
}