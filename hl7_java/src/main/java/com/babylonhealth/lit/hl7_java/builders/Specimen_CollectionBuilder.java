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

public interface Specimen_CollectionBuilder {
  public Specimen.Collection build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public static ChoiceDateTimeOrPeriod collected(FHIRDateTime f) {
    return new ChoiceDateTimeOrPeriod(f);
  }

  public static ChoiceDateTimeOrPeriod collected(Period p) {
    return new ChoiceDateTimeOrPeriod(p);
  }

  public static ChoiceCodeableConceptOrDuration fastingStatus(CodeableConcept c) {
    return new ChoiceCodeableConceptOrDuration(c);
  }

  public static ChoiceCodeableConceptOrDuration fastingStatus(Duration d) {
    return new ChoiceCodeableConceptOrDuration(d);
  }

  public class Impl implements Specimen_CollectionBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<CodeableConcept> method = Optional.empty();
    private Optional<Duration> duration = Optional.empty();
    private Optional<Quantity> quantity = Optional.empty();
    private Optional<CodeableConcept> bodySite = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> collector = Optional.empty();
    private Optional<ChoiceDateTimeOrPeriod> collected = Optional.empty();
    private Optional<ChoiceCodeableConceptOrDuration> fastingStatus = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /** Required fields for {@link Specimen.Collection} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Specimen_CollectionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param method */
    public Specimen_CollectionBuilder.Impl withMethod(@NonNull CodeableConcept method) {
      this.method = Optional.of(method);
      return this;
    }

    public Specimen_CollectionBuilder.Impl withMethod(@NonNull CodeableConceptBuilder method) {
      this.method = Optional.of(method.build());
      return this;
    }
    /** @param duration */
    public Specimen_CollectionBuilder.Impl withDuration(@NonNull Duration duration) {
      this.duration = Optional.of(duration);
      return this;
    }

    public Specimen_CollectionBuilder.Impl withDuration(@NonNull DurationBuilder duration) {
      this.duration = Optional.of(duration.build());
      return this;
    }
    /** @param quantity */
    public Specimen_CollectionBuilder.Impl withQuantity(@NonNull Quantity quantity) {
      this.quantity = Optional.of(quantity);
      return this;
    }

    public Specimen_CollectionBuilder.Impl withQuantity(@NonNull QuantityBuilder quantity) {
      this.quantity = Optional.of(quantity.build());
      return this;
    }
    /** @param bodySite */
    public Specimen_CollectionBuilder.Impl withBodySite(@NonNull CodeableConcept bodySite) {
      this.bodySite = Optional.of(bodySite);
      return this;
    }

    public Specimen_CollectionBuilder.Impl withBodySite(@NonNull CodeableConceptBuilder bodySite) {
      this.bodySite = Optional.of(bodySite.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public Specimen_CollectionBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Specimen_CollectionBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Specimen_CollectionBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param collector */
    public Specimen_CollectionBuilder.Impl withCollector(@NonNull Reference collector) {
      this.collector = Optional.of(collector);
      return this;
    }

    public Specimen_CollectionBuilder.Impl withCollector(@NonNull ReferenceBuilder collector) {
      this.collector = Optional.of(collector.build());
      return this;
    }
    /**
     * @param collected Field is a 'choice' field. Type should be one of FHIRDateTime, Period. To
     *     pass the value in, wrap with one of the Specimen_CollectionBuilder.collected static
     *     methods
     */
    public Specimen_CollectionBuilder.Impl withCollected(
        @NonNull ChoiceDateTimeOrPeriod collected) {
      this.collected = Optional.of(collected);
      return this;
    }
    /**
     * @param fastingStatus Field is a 'choice' field. Type should be one of CodeableConcept,
     *     Duration. To pass the value in, wrap with one of the
     *     Specimen_CollectionBuilder.fastingStatus static methods
     */
    public Specimen_CollectionBuilder.Impl withFastingStatus(
        @NonNull ChoiceCodeableConceptOrDuration fastingStatus) {
      this.fastingStatus = Optional.of(fastingStatus);
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
    public Specimen_CollectionBuilder.Impl withModifierExtension(
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
    public Specimen_CollectionBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Specimen_CollectionBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public Specimen.Collection build() {
      return new Specimen.Collection(
          OptionConverters.toScala(id),
          OptionConverters.toScala(method),
          OptionConverters.toScala(duration),
          OptionConverters.toScala(quantity),
          OptionConverters.toScala(bodySite),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(collector),
          (Option) OptionConverters.toScala(collected),
          (Option) OptionConverters.toScala(fastingStatus),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
