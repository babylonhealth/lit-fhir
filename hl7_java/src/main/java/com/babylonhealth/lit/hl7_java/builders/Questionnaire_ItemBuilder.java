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
import com.babylonhealth.lit.hl7.ITEM_TYPE;
import com.babylonhealth.lit.hl7.QUESTIONNAIRE_ENABLE_BEHAVIOR;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class Questionnaire_ItemBuilder {
  private Optional<String> id = Optional.empty();
  private Collection<Coding> code = Collections.emptyList();
  private Optional<String> text = Optional.empty();
  private ITEM_TYPE _type;
  private Collection<Questionnaire.Item> item = Collections.emptyList();
  private String linkId;
  private Optional<String> prefix = Optional.empty();
  private Optional<Boolean> repeats = Optional.empty();
  private Optional<Boolean> required = Optional.empty();
  private Optional<Boolean> readOnly = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Integer> maxLength = Optional.empty();
  private Optional<String> definition = Optional.empty();
  private Optional<QUESTIONNAIRE_ENABLE_BEHAVIOR> enableBehavior = Optional.empty();
  private Optional<String> answerValueSet = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Collection<Questionnaire$Item$Initial> initial = Collections.emptyList();
  private Collection<Questionnaire$Item$EnableWhen> enableWhen = Collections.emptyList();
  private Collection<Questionnaire$Item$AnswerOption> answerOption = Collections.emptyList();

  /**
   * Required fields for {@link Questionnaire.Item}
   *
   * @param _type
   * @param linkId
   */
  public Questionnaire_ItemBuilder(ITEM_TYPE _type, String linkId) {
    this._type = _type;
    this.linkId = linkId;
  }

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public Questionnaire_ItemBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param code - An identifier for this question or group of questions in a particular terminology
   *     such as LOINC.
   */
  public Questionnaire_ItemBuilder withCode(@NonNull Coding... code) {
    this.code = Arrays.asList(code);
    return this;
  }
  /**
   * @param code - An identifier for this question or group of questions in a particular terminology
   *     such as LOINC.
   */
  public Questionnaire_ItemBuilder withCode(@NonNull Collection<Coding> code) {
    this.code = Collections.unmodifiableCollection(code);
    return this;
  }
  /**
   * @param text - A human-readable narrative that contains a summary of the resource and can be
   *     used to represent the content of the resource to a human. The narrative need not encode all
   *     the structured data, but is required to contain sufficient detail to make it "clinically
   *     safe" for a human to just read the narrative. Resource definitions may define what content
   *     should be represented in the narrative to ensure clinical safety.
   */
  public Questionnaire_ItemBuilder withText(@NonNull String text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param item - A particular question, question grouping or display text that is part of the
   *     questionnaire.
   */
  public Questionnaire_ItemBuilder withItem(@NonNull Questionnaire.Item... item) {
    this.item = Arrays.asList(item);
    return this;
  }
  /**
   * @param item - A particular question, question grouping or display text that is part of the
   *     questionnaire.
   */
  public Questionnaire_ItemBuilder withItem(@NonNull Collection<Questionnaire.Item> item) {
    this.item = Collections.unmodifiableCollection(item);
    return this;
  }
  /** @param prefix */
  public Questionnaire_ItemBuilder withPrefix(@NonNull String prefix) {
    this.prefix = Optional.of(prefix);
    return this;
  }
  /** @param repeats */
  public Questionnaire_ItemBuilder withRepeats(@NonNull Boolean repeats) {
    this.repeats = Optional.of(repeats);
    return this;
  }
  /** @param required */
  public Questionnaire_ItemBuilder withRequired(@NonNull Boolean required) {
    this.required = Optional.of(required);
    return this;
  }
  /** @param readOnly */
  public Questionnaire_ItemBuilder withReadOnly(@NonNull Boolean readOnly) {
    this.readOnly = Optional.of(readOnly);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public Questionnaire_ItemBuilder withExtension(@NonNull Extension... extension) {
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
  public Questionnaire_ItemBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param maxLength */
  public Questionnaire_ItemBuilder withMaxLength(@NonNull Integer maxLength) {
    this.maxLength = Optional.of(maxLength);
    return this;
  }
  /** @param definition */
  public Questionnaire_ItemBuilder withDefinition(@NonNull String definition) {
    this.definition = Optional.of(definition);
    return this;
  }
  /** @param enableBehavior */
  public Questionnaire_ItemBuilder withEnableBehavior(
      @NonNull QUESTIONNAIRE_ENABLE_BEHAVIOR enableBehavior) {
    this.enableBehavior = Optional.of(enableBehavior);
    return this;
  }
  /** @param answerValueSet */
  public Questionnaire_ItemBuilder withAnswerValueSet(@NonNull String answerValueSet) {
    this.answerValueSet = Optional.of(answerValueSet);
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
  public Questionnaire_ItemBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
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
  public Questionnaire_ItemBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /** @param initial */
  public Questionnaire_ItemBuilder withInitial(@NonNull Questionnaire$Item$Initial... initial) {
    this.initial = Arrays.asList(initial);
    return this;
  }
  /** @param initial */
  public Questionnaire_ItemBuilder withInitial(
      @NonNull Collection<Questionnaire$Item$Initial> initial) {
    this.initial = Collections.unmodifiableCollection(initial);
    return this;
  }
  /** @param enableWhen */
  public Questionnaire_ItemBuilder withEnableWhen(
      @NonNull Questionnaire$Item$EnableWhen... enableWhen) {
    this.enableWhen = Arrays.asList(enableWhen);
    return this;
  }
  /** @param enableWhen */
  public Questionnaire_ItemBuilder withEnableWhen(
      @NonNull Collection<Questionnaire$Item$EnableWhen> enableWhen) {
    this.enableWhen = Collections.unmodifiableCollection(enableWhen);
    return this;
  }
  /** @param answerOption */
  public Questionnaire_ItemBuilder withAnswerOption(
      @NonNull Questionnaire$Item$AnswerOption... answerOption) {
    this.answerOption = Arrays.asList(answerOption);
    return this;
  }
  /** @param answerOption */
  public Questionnaire_ItemBuilder withAnswerOption(
      @NonNull Collection<Questionnaire$Item$AnswerOption> answerOption) {
    this.answerOption = Collections.unmodifiableCollection(answerOption);
    return this;
  }

  public Questionnaire.Item build() {
    return new Questionnaire.Item(
        OptionConverters.toScala(id),
        code.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(text),
        _type,
        item.stream().collect(new LitSeqJCollector<>()),
        linkId,
        OptionConverters.toScala(prefix),
        OptionConverters.toScala(repeats.map(x -> (Object) x)),
        OptionConverters.toScala(required.map(x -> (Object) x)),
        OptionConverters.toScala(readOnly.map(x -> (Object) x)),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(maxLength.map(x -> (Object) x)),
        OptionConverters.toScala(definition),
        OptionConverters.toScala(enableBehavior),
        OptionConverters.toScala(answerValueSet),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        initial.stream().collect(new LitSeqJCollector<>()),
        enableWhen.stream().collect(new LitSeqJCollector<>()),
        answerOption.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
