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

public interface StatisticBuilder extends BackboneTypeBuilder {
  public Statistic build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements StatisticBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Annotation> note = Collections.emptyList();
    private Optional<CodeableConcept> category = Optional.empty();
    private Optional<Quantity> quantity = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Optional<CodeableConcept> statisticType = Optional.empty();
    private Optional<Integer> numberOfEvents = Optional.empty();
    private Optional<Integer> numberAffected = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<Statistic.SampleSize> sampleSize = Optional.empty();
    private Collection<Statistic.AttributeEstimate> attributeEstimate = Collections.emptyList();
    private Collection<Statistic.ModelCharacteristic> modelCharacteristic = Collections.emptyList();

    /** Required fields for {@link Statistic} */
    public Impl() {}

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public StatisticBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param note - Footnotes and/or explanatory notes. */
    public StatisticBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /** @param note - Footnotes and/or explanatory notes. */
    public StatisticBuilder.Impl withNote(@NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public StatisticBuilder.Impl withNote(@NonNull AnnotationBuilder... note) {
      this.note = Arrays.stream(note).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param category - When the measured variable is handled categorically, the category element
     *     is used to define which category the statistic is reporting.
     */
    public StatisticBuilder.Impl withCategory(@NonNull CodeableConcept category) {
      this.category = Optional.of(category);
      return this;
    }

    public StatisticBuilder.Impl withCategory(@NonNull CodeableConceptBuilder category) {
      this.category = Optional.of(category.build());
      return this;
    }
    /** @param quantity - Statistic value. */
    public StatisticBuilder.Impl withQuantity(@NonNull Quantity quantity) {
      this.quantity = Optional.of(quantity);
      return this;
    }

    public StatisticBuilder.Impl withQuantity(@NonNull QuantityBuilder quantity) {
      this.quantity = Optional.of(quantity.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public StatisticBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public StatisticBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public StatisticBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param description - A description of the content value of the statistic. */
    public StatisticBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /** @param statisticType - Type of statistic, eg relative risk. */
    public StatisticBuilder.Impl withStatisticType(@NonNull CodeableConcept statisticType) {
      this.statisticType = Optional.of(statisticType);
      return this;
    }

    public StatisticBuilder.Impl withStatisticType(@NonNull CodeableConceptBuilder statisticType) {
      this.statisticType = Optional.of(statisticType.build());
      return this;
    }
    /**
     * @param numberOfEvents - The number of events associated with the statistic, where the unit of
     *     analysis is different from numberAffected, sampleSize.knownDataCount and
     *     sampleSize.numberOfParticipants.
     */
    public StatisticBuilder.Impl withNumberOfEvents(@NonNull Integer numberOfEvents) {
      this.numberOfEvents = Optional.of(numberOfEvents);
      return this;
    }
    /**
     * @param numberAffected - The number of participants affected where the unit of analysis is the
     *     same as sampleSize.knownDataCount and sampleSize.numberOfParticipants.
     */
    public StatisticBuilder.Impl withNumberAffected(@NonNull Integer numberAffected) {
      this.numberAffected = Optional.of(numberAffected);
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the element and that modifies the understanding of the element
     *     in which it is contained and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer can define an extension, there
     *     is a set of requirements that SHALL be met as part of the definition of the extension.
     *     Applications processing a resource are required to check for modifier extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public StatisticBuilder.Impl withModifierExtension(@NonNull Extension... modifierExtension) {
      this.modifierExtension = Arrays.asList(modifierExtension);
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the element and that modifies the understanding of the element
     *     in which it is contained and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer can define an extension, there
     *     is a set of requirements that SHALL be met as part of the definition of the extension.
     *     Applications processing a resource are required to check for modifier extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public StatisticBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public StatisticBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param sampleSize - Number of samples in the statistic. */
    public StatisticBuilder.Impl withSampleSize(@NonNull Statistic.SampleSize sampleSize) {
      this.sampleSize = Optional.of(sampleSize);
      return this;
    }

    public StatisticBuilder.Impl withSampleSize(@NonNull Statistic_SampleSizeBuilder sampleSize) {
      this.sampleSize = Optional.of(sampleSize.build());
      return this;
    }
    /**
     * @param attributeEstimate - A statistical attribute of the statistic such as a measure of
     *     heterogeneity.
     */
    public StatisticBuilder.Impl withAttributeEstimate(
        @NonNull Statistic.AttributeEstimate... attributeEstimate) {
      this.attributeEstimate = Arrays.asList(attributeEstimate);
      return this;
    }
    /**
     * @param attributeEstimate - A statistical attribute of the statistic such as a measure of
     *     heterogeneity.
     */
    public StatisticBuilder.Impl withAttributeEstimate(
        @NonNull Collection<Statistic.AttributeEstimate> attributeEstimate) {
      this.attributeEstimate = Collections.unmodifiableCollection(attributeEstimate);
      return this;
    }

    public StatisticBuilder.Impl withAttributeEstimate(
        @NonNull Statistic_AttributeEstimateBuilder... attributeEstimate) {
      this.attributeEstimate =
          Arrays.stream(attributeEstimate).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param modelCharacteristic - A component of the method to generate the statistic. */
    public StatisticBuilder.Impl withModelCharacteristic(
        @NonNull Statistic.ModelCharacteristic... modelCharacteristic) {
      this.modelCharacteristic = Arrays.asList(modelCharacteristic);
      return this;
    }
    /** @param modelCharacteristic - A component of the method to generate the statistic. */
    public StatisticBuilder.Impl withModelCharacteristic(
        @NonNull Collection<Statistic.ModelCharacteristic> modelCharacteristic) {
      this.modelCharacteristic = Collections.unmodifiableCollection(modelCharacteristic);
      return this;
    }

    public StatisticBuilder.Impl withModelCharacteristic(
        @NonNull Statistic_ModelCharacteristicBuilder... modelCharacteristic) {
      this.modelCharacteristic =
          Arrays.stream(modelCharacteristic).map(e -> e.build()).collect(toList());
      return this;
    }

    public Statistic build() {
      return new Statistic(
          OptionConverters.toScala(id),
          note.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(category),
          OptionConverters.toScala(quantity),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          OptionConverters.toScala(statisticType),
          OptionConverters.toScala(numberOfEvents.map(x -> (Object) x)),
          OptionConverters.toScala(numberAffected.map(x -> (Object) x)),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(sampleSize),
          attributeEstimate.stream().collect(new LitSeqJCollector<>()),
          modelCharacteristic.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
