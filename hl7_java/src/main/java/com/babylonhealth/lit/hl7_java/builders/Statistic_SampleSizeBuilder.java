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

public interface Statistic_SampleSizeBuilder {
  public Statistic.SampleSize build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements Statistic_SampleSizeBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Annotation> note = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> description = Optional.empty();
    private Optional<Integer> knownDataCount = Optional.empty();
    private Optional<Integer> numberOfStudies = Optional.empty();
    private Optional<Integer> numberOfParticipants = Optional.empty();

    /** Required fields for {@link Statistic.SampleSize} */
    public Impl() {}

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Statistic_SampleSizeBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param note - Footnotes and/or explanatory notes. */
    public Statistic_SampleSizeBuilder.Impl withNote(@NonNull Annotation... note) {
      this.note = Arrays.asList(note);
      return this;
    }
    /** @param note - Footnotes and/or explanatory notes. */
    public Statistic_SampleSizeBuilder.Impl withNote(@NonNull Collection<Annotation> note) {
      this.note = Collections.unmodifiableCollection(note);
      return this;
    }

    public Statistic_SampleSizeBuilder.Impl withNote(@NonNull AnnotationBuilder... note) {
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
    public Statistic_SampleSizeBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public Statistic_SampleSizeBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Statistic_SampleSizeBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param description - A description of the content value of the statistic. */
    public Statistic_SampleSizeBuilder.Impl withDescription(@NonNull String description) {
      this.description = Optional.of(description);
      return this;
    }
    /** @param knownDataCount */
    public Statistic_SampleSizeBuilder.Impl withKnownDataCount(@NonNull Integer knownDataCount) {
      this.knownDataCount = Optional.of(knownDataCount);
      return this;
    }
    /** @param numberOfStudies */
    public Statistic_SampleSizeBuilder.Impl withNumberOfStudies(@NonNull Integer numberOfStudies) {
      this.numberOfStudies = Optional.of(numberOfStudies);
      return this;
    }
    /** @param numberOfParticipants */
    public Statistic_SampleSizeBuilder.Impl withNumberOfParticipants(
        @NonNull Integer numberOfParticipants) {
      this.numberOfParticipants = Optional.of(numberOfParticipants);
      return this;
    }

    public Statistic.SampleSize build() {
      return new Statistic.SampleSize(
          OptionConverters.toScala(id),
          note.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(description),
          OptionConverters.toScala(knownDataCount.map(x -> (Object) x)),
          OptionConverters.toScala(numberOfStudies.map(x -> (Object) x)),
          OptionConverters.toScala(numberOfParticipants.map(x -> (Object) x)),
          LitUtils.emptyMetaElMap());
    }
  }
}
