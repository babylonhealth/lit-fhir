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

public interface Statistic_AttributeEstimateBuilder {
  public Statistic.AttributeEstimate build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements Statistic_AttributeEstimateBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Annotation> note = Collections.emptyList();
    private Optional<CodeableConcept> _type = Optional.empty();
    private Optional<BigDecimal> level = Optional.empty();
    private Optional<Range> range = Optional.empty();
    private Optional<Quantity> quantity = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Collection<Statistic$AttributeEstimate$AttributeEstimate> attributeEstimate =
        Collections.emptyList();

    /** Required fields for {@link Statistic.AttributeEstimate} */
    public Impl() {}

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Statistic_AttributeEstimateBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param note - Footnotes and/or explanatory notes. */
    public Statistic_AttributeEstimateBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /** @param note - Footnotes and/or explanatory notes. */
    public Statistic_AttributeEstimateBuilder.Impl withNote(@NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public Statistic_AttributeEstimateBuilder.Impl withNote(@NonNull AnnotationBuilder... note) {
      this.note = Arrays.stream(note).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param _type */
    public Statistic_AttributeEstimateBuilder.Impl withType(@NonNull CodeableConcept _type) {
      this._type = Optional.of(_type);
      return this;
    }

    public Statistic_AttributeEstimateBuilder.Impl withType(@NonNull CodeableConceptBuilder _type) {
      this._type = Optional.of(_type.build());
      return this;
    }
    /** @param level */
    public Statistic_AttributeEstimateBuilder.Impl withLevel(@NonNull BigDecimal level) {
      this.level = Optional.of(level);
      return this;
    }
    /** @param range */
    public Statistic_AttributeEstimateBuilder.Impl withRange(@NonNull Range range) {
      this.range = Optional.of(range);
      return this;
    }

    public Statistic_AttributeEstimateBuilder.Impl withRange(@NonNull RangeBuilder range) {
      this.range = Optional.of(range.build());
      return this;
    }
    /** @param quantity - Statistic value. */
    public Statistic_AttributeEstimateBuilder.Impl withQuantity(@NonNull Quantity quantity) {
      this.quantity = Optional.of(quantity);
      return this;
    }

    public Statistic_AttributeEstimateBuilder.Impl withQuantity(@NonNull QuantityBuilder quantity) {
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
    public Statistic_AttributeEstimateBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Statistic_AttributeEstimateBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Statistic_AttributeEstimateBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param description - A description of the content value of the statistic. */
    public Statistic_AttributeEstimateBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /**
     * @param attributeEstimate - A statistical attribute of the statistic such as a measure of
     *     heterogeneity.
     */
    public Statistic_AttributeEstimateBuilder.Impl withAttributeEstimate(
        @NonNull Statistic$AttributeEstimate$AttributeEstimate... attributeEstimate) {
      this.attributeEstimate = Arrays.asList(attributeEstimate);
      return this;
    }
    /**
     * @param attributeEstimate - A statistical attribute of the statistic such as a measure of
     *     heterogeneity.
     */
    public Statistic_AttributeEstimateBuilder.Impl withAttributeEstimate(
        @NonNull Collection<Statistic$AttributeEstimate$AttributeEstimate> attributeEstimate) {
      this.attributeEstimate = Collections.unmodifiableCollection(attributeEstimate);
      return this;
    }

    public Statistic_AttributeEstimateBuilder.Impl withAttributeEstimate(
        @NonNull Statistic_AttributeEstimate_AttributeEstimateBuilder... attributeEstimate) {
      this.attributeEstimate =
          Arrays.stream(attributeEstimate).map(e -> e.build()).collect(toList());
      return this;
    }

    public Statistic.AttributeEstimate build() {
      return new Statistic.AttributeEstimate(
          OptionConverters.toScala(id),
          note.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(_type),
          OptionConverters.toScala(level),
          OptionConverters.toScala(range),
          OptionConverters.toScala(quantity),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          attributeEstimate.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
