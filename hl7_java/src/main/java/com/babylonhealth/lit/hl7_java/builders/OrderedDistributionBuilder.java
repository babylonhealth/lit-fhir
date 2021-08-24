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

public interface OrderedDistributionBuilder extends BackboneTypeBuilder {
  public OrderedDistribution build();

  public static Impl init(
      Integer numberOfIntervals, Collection<OrderedDistribution.Interval> interval) {
    return new Impl(numberOfIntervals, interval);
  }

  public static Impl builder(
      Integer numberOfIntervals, Collection<OrderedDistribution_IntervalBuilder> interval) {
    return new Impl(
        numberOfIntervals, new LitSeq<>(interval).map(OrderedDistribution_IntervalBuilder::build));
  }

  public class Impl implements OrderedDistributionBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Annotation> note = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Optional<Quantity> topOfInterval = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Integer numberOfIntervals;
    private Optional<Quantity> bottomOfFirstInterval = Optional.empty();
    private Collection<OrderedDistribution.Interval> interval;

    /**
     * Required fields for {@link OrderedDistribution}
     *
     * @param numberOfIntervals - Number of intervals in an array, eg 4 for quartiles.
     * @param interval - Interval.
     */
    public Impl(Integer numberOfIntervals, Collection<OrderedDistribution.Interval> interval) {
      this.numberOfIntervals = numberOfIntervals;
      this.interval = interval;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public OrderedDistributionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param note - Footnotes and/or explanatory notes. */
    public OrderedDistributionBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /** @param note - Footnotes and/or explanatory notes. */
    public OrderedDistributionBuilder.Impl withNote(@NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public OrderedDistributionBuilder.Impl withNote(@NonNull AnnotationBuilder... note) {
      this.note = Arrays.stream(note).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public OrderedDistributionBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public OrderedDistributionBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public OrderedDistributionBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param description - A description of the content and value of the statistic. */
    public OrderedDistributionBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /**
     * @param topOfInterval - Singular value of the statistic at the upper bound of the interval.
     */
    public OrderedDistributionBuilder.Impl withTopOfInterval(@NonNull Quantity topOfInterval) {
      this.topOfInterval = Optional.of(topOfInterval);
      return this;
    }

    public OrderedDistributionBuilder.Impl withTopOfInterval(
        @NonNull QuantityBuilder topOfInterval) {
      this.topOfInterval = Optional.of(topOfInterval.build());
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
    public OrderedDistributionBuilder.Impl withModifierExtension(
        @NonNull Extension... modifierExtension) {
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
    public OrderedDistributionBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public OrderedDistributionBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param bottomOfFirstInterval - Bottom of first interval. */
    public OrderedDistributionBuilder.Impl withBottomOfFirstInterval(
        @NonNull Quantity bottomOfFirstInterval) {
      this.bottomOfFirstInterval = Optional.of(bottomOfFirstInterval);
      return this;
    }

    public OrderedDistributionBuilder.Impl withBottomOfFirstInterval(
        @NonNull QuantityBuilder bottomOfFirstInterval) {
      this.bottomOfFirstInterval = Optional.of(bottomOfFirstInterval.build());
      return this;
    }

    public OrderedDistribution build() {
      return new OrderedDistribution(
          OptionConverters.toScala(id),
          note.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          OptionConverters.toScala(topOfInterval),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          numberOfIntervals,
          OptionConverters.toScala(bottomOfFirstInterval),
          interval.stream().collect(new NonEmptyLitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
