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
import com.babylonhealth.lit.hl7.GROUP_MEASURE;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class EvidenceVariable_CharacteristicBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Boolean> exclude = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<String> description = Optional.empty();
  private Collection<UsageContext> usageContext = Collections.emptyList();
  private Optional<GROUP_MEASURE> groupMeasure = Optional.empty();
  private Choice_0358050020 definition;
  private Optional<Duration> timeFromStart = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<Choice00607514014> participantEffective = Optional.empty();

  /**
   * Required fields for {@link EvidenceVariable.Characteristic}
   *
   * @param definition Field is a 'choice' field. Type should be one of String, CodeableConcept,
   *     DataRequirement, Expression, Reference, TriggerDefinition.
   */
  public EvidenceVariable_CharacteristicBuilder(@NonNull Choice_0358050020 definition) {
    this.definition = definition;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public EvidenceVariable_CharacteristicBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param exclude */
  public EvidenceVariable_CharacteristicBuilder withExclude(@NonNull Boolean exclude) {
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
  public EvidenceVariable_CharacteristicBuilder withExtension(@NonNull Extension... extension) {
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
  public EvidenceVariable_CharacteristicBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param description - A free text natural language description of the evidence variable from a
   *     consumer's perspective.
   */
  public EvidenceVariable_CharacteristicBuilder withDescription(@NonNull String description) {
    this.description = Optional.of(description);
    return this;
  }
  /** @param usageContext */
  public EvidenceVariable_CharacteristicBuilder withUsageContext(
      @NonNull UsageContext... usageContext) {
    this.usageContext = Arrays.asList(usageContext);
    return this;
  }
  /** @param usageContext */
  public EvidenceVariable_CharacteristicBuilder withUsageContext(
      @NonNull Collection<UsageContext> usageContext) {
    this.usageContext = Collections.unmodifiableCollection(usageContext);
    return this;
  }
  /** @param groupMeasure */
  public EvidenceVariable_CharacteristicBuilder withGroupMeasure(
      @NonNull GROUP_MEASURE groupMeasure) {
    this.groupMeasure = Optional.of(groupMeasure);
    return this;
  }
  /** @param timeFromStart */
  public EvidenceVariable_CharacteristicBuilder withTimeFromStart(@NonNull Duration timeFromStart) {
    this.timeFromStart = Optional.of(timeFromStart);
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
  public EvidenceVariable_CharacteristicBuilder withModifierExtension(
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
  public EvidenceVariable_CharacteristicBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param participantEffective Field is a 'choice' field. Type should be one of Duration,
   *     FHIRDateTime, Period, Timing.
   */
  public EvidenceVariable_CharacteristicBuilder withParticipantEffective(
      @NonNull Choice00607514014 participantEffective) {
    this.participantEffective = Optional.of(participantEffective);
    return this;
  }

  public EvidenceVariable.Characteristic build() {
    return new EvidenceVariable.Characteristic(
        OptionConverters.toScala(id),
        OptionConverters.toScala(exclude.map(x -> (Object) x)),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(description),
        usageContext.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(groupMeasure),
        definition,
        OptionConverters.toScala(timeFromStart),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        (Option) OptionConverters.toScala(participantEffective),
        LitUtils.emptyMetaElMap());
  }
}
