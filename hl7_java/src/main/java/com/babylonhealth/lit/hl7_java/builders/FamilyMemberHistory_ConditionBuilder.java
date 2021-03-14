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

public class FamilyMemberHistory_ConditionBuilder {
  private Optional<String> id = Optional.empty();
  private CodeableConcept code;
  private Collection<Annotation> note = Collections.emptyList();
  private Optional<CodeableConcept> outcome = Optional.empty();
  private Optional<Choice<$bslash$div<$bslash$div<$bslash$div<Age, Period>, Range>, String>>>
      onset = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<Boolean> contributedToDeath = Optional.empty();

  /**
   * Required fields for {@link FamilyMemberHistory.Condition}
   *
   * @param code
   */
  public FamilyMemberHistory_ConditionBuilder(CodeableConcept code) {
    this.code = code;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public FamilyMemberHistory_ConditionBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param note - This property allows a non condition-specific note to the made about the related
   *     person. Ideally, the note would be in the condition property, but this is not always
   *     possible.
   */
  public FamilyMemberHistory_ConditionBuilder withNote(@NonNull Annotation... note) {
    this.note = Arrays.asList(note);
    return this;
  }
  /**
   * @param note - This property allows a non condition-specific note to the made about the related
   *     person. Ideally, the note would be in the condition property, but this is not always
   *     possible.
   */
  public FamilyMemberHistory_ConditionBuilder withNote(@NonNull Collection<Annotation> note) {
    this.note = Collections.unmodifiableCollection(note);
    return this;
  }
  /** @param outcome */
  public FamilyMemberHistory_ConditionBuilder withOutcome(@NonNull CodeableConcept outcome) {
    this.outcome = Optional.of(outcome);
    return this;
  }
  /** @param onset Field is a 'choice' field. Type should be one of Age, Period, Range, String. */
  public <T> FamilyMemberHistory_ConditionBuilder withOnset(@NonNull T onset) {
    var guessedSuffix =
        autoSuffix(
            onset.getClass().getSimpleName(), FamilyMemberHistory.Condition$.MODULE$.onset());
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
  public <T> FamilyMemberHistory_ConditionBuilder withOnset(String suffix, @NonNull T onset) {
    guard(onset.getClass().getSimpleName(), suffix, FamilyMemberHistory.Condition$.MODULE$.onset());
    this.onset =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(
                    suffix, onset, FamilyMemberHistory.Condition$.MODULE$.onset()));
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public FamilyMemberHistory_ConditionBuilder withExtension(@NonNull Extension... extension) {
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
  public FamilyMemberHistory_ConditionBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
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
  public FamilyMemberHistory_ConditionBuilder withModifierExtension(
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
  public FamilyMemberHistory_ConditionBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param contributedToDeath */
  public FamilyMemberHistory_ConditionBuilder withContributedToDeath(
      @NonNull Boolean contributedToDeath) {
    this.contributedToDeath = Optional.of(contributedToDeath);
    return this;
  }

  public FamilyMemberHistory.Condition build() {
    return new FamilyMemberHistory.Condition(
        OptionConverters.toScala(id),
        code,
        note.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(outcome),
        OptionConverters.toScala(onset),
        extension.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(contributedToDeath.map(x -> (Object) x)),
        LitUtils.emptyMetaElMap());
  }
}
