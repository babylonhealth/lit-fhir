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

public class Observation_ReferenceRangeBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Quantity> low = Optional.empty();
  private Optional<Range> age = Optional.empty();
  private Optional<Quantity> high = Optional.empty();
  private Optional<CodeableConcept> _type = Optional.empty();
  private Optional<String> text = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Collection<CodeableConcept> appliesTo = Collections.emptyList();
  private Collection<Extension> modifierExtension = Collections.emptyList();

  /** Required fields for {@link Observation.ReferenceRange} */
  public Observation_ReferenceRangeBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public Observation_ReferenceRangeBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param low */
  public Observation_ReferenceRangeBuilder withLow(@NonNull Quantity low) {
    this.low = Optional.of(low);
    return this;
  }
  /** @param age */
  public Observation_ReferenceRangeBuilder withAge(@NonNull Range age) {
    this.age = Optional.of(age);
    return this;
  }
  /** @param high */
  public Observation_ReferenceRangeBuilder withHigh(@NonNull Quantity high) {
    this.high = Optional.of(high);
    return this;
  }
  /** @param _type */
  public Observation_ReferenceRangeBuilder withType(@NonNull CodeableConcept _type) {
    this._type = Optional.of(_type);
    return this;
  }
  /**
   * @param text - A human-readable narrative that contains a summary of the resource and can be
   *     used to represent the content of the resource to a human. The narrative need not encode all
   *     the structured data, but is required to contain sufficient detail to make it "clinically
   *     safe" for a human to just read the narrative. Resource definitions may define what content
   *     should be represented in the narrative to ensure clinical safety.
   */
  public Observation_ReferenceRangeBuilder withText(@NonNull String text) {
    this.text = Optional.of(text);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public Observation_ReferenceRangeBuilder withExtension(@NonNull Extension... extension) {
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
  public Observation_ReferenceRangeBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param appliesTo */
  public Observation_ReferenceRangeBuilder withAppliesTo(@NonNull CodeableConcept... appliesTo) {
    this.appliesTo = Arrays.asList(appliesTo);
    return this;
  }
  /** @param appliesTo */
  public Observation_ReferenceRangeBuilder withAppliesTo(
      @NonNull Collection<CodeableConcept> appliesTo) {
    this.appliesTo = Collections.unmodifiableCollection(appliesTo);
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
  public Observation_ReferenceRangeBuilder withModifierExtension(
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
  public Observation_ReferenceRangeBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }

  public Observation.ReferenceRange build() {
    return new Observation.ReferenceRange(
        OptionConverters.toScala(id),
        OptionConverters.toScala(low),
        OptionConverters.toScala(age),
        OptionConverters.toScala(high),
        OptionConverters.toScala(_type),
        OptionConverters.toScala(text),
        extension.stream().collect(new LitSeqJCollector<>()),
        appliesTo.stream().collect(new LitSeqJCollector<>()),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
