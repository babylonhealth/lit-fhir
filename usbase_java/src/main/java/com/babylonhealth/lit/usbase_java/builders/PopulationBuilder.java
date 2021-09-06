package com.babylonhealth.lit.usbase_java.builders;

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
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.usbase_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class PopulationBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<CodeableConcept> race = Optional.empty();
  private Optional<Choice_1946587936> age = Optional.empty();
  private Optional<CodeableConcept> gender = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<CodeableConcept> physiologicalCondition = Optional.empty();

  /** Required fields for {@link Population} */
  public PopulationBuilder() {}

  public static Choice_1946587936 age(CodeableConcept c) {
    return new Choice_1946587936(c);
  }

  public static Choice_1946587936 age(Range r) {
    return new Choice_1946587936(r);
  }

  /**
   * @param id - Unique id for the element within a resource (for internal references). This may be
   *     any string value that does not contain spaces.
   */
  public PopulationBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param race - Race of the specific population. */
  public PopulationBuilder withRace(@NonNull CodeableConcept race) {
    this.race = Optional.of(race);
    return this;
  }
  /**
   * @param age - The age of the specific population. Field is a 'choice' field. Type should be one
   *     of CodeableConcept, Range. To pass the value in, wrap with one of the PopulationBuilder.age
   *     static methods
   */
  public PopulationBuilder withAge(@NonNull Choice_1946587936 age) {
    this.age = Optional.of(age);
    return this;
  }
  /** @param gender - The gender of the specific population. */
  public PopulationBuilder withGender(@NonNull CodeableConcept gender) {
    this.gender = Optional.of(gender);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the element. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public PopulationBuilder withExtension(@NonNull Extension... extension) {
    this.extension = Arrays.asList(extension);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the element. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public PopulationBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the element and that modifies the understanding of the element in
   *     which it is contained and/or the understanding of the containing element's descendants.
   *     Usually modifier elements provide negation or qualification. To make the use of extensions
   *     safe and manageable, there is a strict set of governance applied to the definition and use
   *     of extensions. Though any implementer can define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public PopulationBuilder withModifierExtension(@NonNull Extension... modifierExtension) {
    this.modifierExtension = Arrays.asList(modifierExtension);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the element and that modifies the understanding of the element in
   *     which it is contained and/or the understanding of the containing element's descendants.
   *     Usually modifier elements provide negation or qualification. To make the use of extensions
   *     safe and manageable, there is a strict set of governance applied to the definition and use
   *     of extensions. Though any implementer can define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public PopulationBuilder withModifierExtension(@NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param physiologicalCondition - The existing physiological conditions of the specific
   *     population to which this applies.
   */
  public PopulationBuilder withPhysiologicalCondition(
      @NonNull CodeableConcept physiologicalCondition) {
    this.physiologicalCondition = Optional.of(physiologicalCondition);
    return this;
  }

  public Population build() {
    return new Population(
        OptionConverters.toScala(id),
        OptionConverters.toScala(race),
        (Option) OptionConverters.toScala(age),
        OptionConverters.toScala(gender),
        extension.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(physiologicalCondition),
        LitUtils.emptyMetaElMap());
  }
}
