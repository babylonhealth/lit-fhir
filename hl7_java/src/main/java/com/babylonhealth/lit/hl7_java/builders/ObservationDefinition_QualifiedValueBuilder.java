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
import com.babylonhealth.lit.hl7.ADMINISTRATIVE_GENDER;
import com.babylonhealth.lit.hl7.OBSERVATION_RANGE_CATEGORY;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface ObservationDefinition_QualifiedValueBuilder {
  public ObservationDefinition.QualifiedValue build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements ObservationDefinition_QualifiedValueBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<Range> age = Optional.empty();
    private Optional<Range> range = Optional.empty();
    private Optional<ADMINISTRATIVE_GENDER> gender = Optional.empty();
    private Optional<CodeableConcept> context = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<CodeableConcept> appliesTo = Collections.emptyList();
    private Optional<String> condition = Optional.empty();
    private Optional<OBSERVATION_RANGE_CATEGORY> rangeCategory = Optional.empty();
    private Optional<Range> gestationalAge = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<String> validCodedValueSet = Optional.empty();
    private Optional<String> normalCodedValueSet = Optional.empty();
    private Optional<String> abnormalCodedValueSet = Optional.empty();
    private Optional<String> criticalCodedValueSet = Optional.empty();

    /** Required fields for {@link ObservationDefinition.QualifiedValue} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public ObservationDefinition_QualifiedValueBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param age */
    public ObservationDefinition_QualifiedValueBuilder.Impl withAge(@NonNull Range age) {
      this.age = Optional.of(age);
      return this;
    }

    public ObservationDefinition_QualifiedValueBuilder.Impl withAge(@NonNull RangeBuilder age) {
      this.age = Optional.of(age.build());
      return this;
    }
    /** @param range */
    public ObservationDefinition_QualifiedValueBuilder.Impl withRange(@NonNull Range range) {
      this.range = Optional.of(range);
      return this;
    }

    public ObservationDefinition_QualifiedValueBuilder.Impl withRange(@NonNull RangeBuilder range) {
      this.range = Optional.of(range.build());
      return this;
    }
    /** @param gender */
    public ObservationDefinition_QualifiedValueBuilder.Impl withGender(
        @NonNull ADMINISTRATIVE_GENDER gender) {
      this.gender = Optional.of(gender);
      return this;
    }
    /** @param context */
    public ObservationDefinition_QualifiedValueBuilder.Impl withContext(
        @NonNull CodeableConcept context) {
      this.context = Optional.of(context);
      return this;
    }

    public ObservationDefinition_QualifiedValueBuilder.Impl withContext(
        @NonNull CodeableConceptBuilder context) {
      this.context = Optional.of(context.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public ObservationDefinition_QualifiedValueBuilder.Impl withExtension(
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
    public ObservationDefinition_QualifiedValueBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public ObservationDefinition_QualifiedValueBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param appliesTo */
    public ObservationDefinition_QualifiedValueBuilder.Impl withAppliesTo(
        @NonNull CodeableConcept... appliesTo) {
      this.appliesTo = Arrays.asList(appliesTo);
      return this;
    }
    /** @param appliesTo */
    public ObservationDefinition_QualifiedValueBuilder.Impl withAppliesTo(
        @NonNull Collection<CodeableConcept> appliesTo) {
      this.appliesTo = Collections.unmodifiableCollection(appliesTo);
      return this;
    }

    public ObservationDefinition_QualifiedValueBuilder.Impl withAppliesTo(
        @NonNull CodeableConceptBuilder... appliesTo) {
      this.appliesTo = Arrays.stream(appliesTo).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param condition */
    public ObservationDefinition_QualifiedValueBuilder.Impl withCondition(
        @NonNull String condition) {
      this.condition = Optional.of(condition);
      return this;
    }
    /** @param rangeCategory */
    public ObservationDefinition_QualifiedValueBuilder.Impl withRangeCategory(
        @NonNull OBSERVATION_RANGE_CATEGORY rangeCategory) {
      this.rangeCategory = Optional.of(rangeCategory);
      return this;
    }
    /** @param gestationalAge */
    public ObservationDefinition_QualifiedValueBuilder.Impl withGestationalAge(
        @NonNull Range gestationalAge) {
      this.gestationalAge = Optional.of(gestationalAge);
      return this;
    }

    public ObservationDefinition_QualifiedValueBuilder.Impl withGestationalAge(
        @NonNull RangeBuilder gestationalAge) {
      this.gestationalAge = Optional.of(gestationalAge.build());
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
    public ObservationDefinition_QualifiedValueBuilder.Impl withModifierExtension(
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
    public ObservationDefinition_QualifiedValueBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public ObservationDefinition_QualifiedValueBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param validCodedValueSet */
    public ObservationDefinition_QualifiedValueBuilder.Impl withValidCodedValueSet(
        @NonNull String validCodedValueSet) {
      this.validCodedValueSet = Optional.of(validCodedValueSet);
      return this;
    }
    /** @param normalCodedValueSet */
    public ObservationDefinition_QualifiedValueBuilder.Impl withNormalCodedValueSet(
        @NonNull String normalCodedValueSet) {
      this.normalCodedValueSet = Optional.of(normalCodedValueSet);
      return this;
    }
    /** @param abnormalCodedValueSet */
    public ObservationDefinition_QualifiedValueBuilder.Impl withAbnormalCodedValueSet(
        @NonNull String abnormalCodedValueSet) {
      this.abnormalCodedValueSet = Optional.of(abnormalCodedValueSet);
      return this;
    }
    /** @param criticalCodedValueSet */
    public ObservationDefinition_QualifiedValueBuilder.Impl withCriticalCodedValueSet(
        @NonNull String criticalCodedValueSet) {
      this.criticalCodedValueSet = Optional.of(criticalCodedValueSet);
      return this;
    }

    public ObservationDefinition.QualifiedValue build() {
      return new ObservationDefinition.QualifiedValue(
          OptionConverters.toScala(id),
          OptionConverters.toScala(age),
          OptionConverters.toScala(range),
          OptionConverters.toScala(gender),
          OptionConverters.toScala(context),
          extension.stream().collect(new LitSeqJCollector<>()),
          appliesTo.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(condition),
          OptionConverters.toScala(rangeCategory),
          OptionConverters.toScala(gestationalAge),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(validCodedValueSet),
          OptionConverters.toScala(normalCodedValueSet),
          OptionConverters.toScala(abnormalCodedValueSet),
          OptionConverters.toScala(criticalCodedValueSet),
          LitUtils.emptyMetaElMap());
    }
  }
}
