package com.babylonhealth.lit.core_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface PeriodBuilder extends ElementBuilder {
  public Period build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements PeriodBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<FHIRDateTime> end = Optional.empty();
    private Optional<FHIRDateTime> start = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();

    /** Required fields for {@link Period} */
    public Impl() {}

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public PeriodBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param end - The end of the period. If the end of the period is missing, it means no end was
     *     known or planned at the time the instance was created. The start may be in the past, and
     *     the end date in the future, which means that period is expected/planned to end at that
     *     time.
     */
    public PeriodBuilder.Impl withEnd(@NonNull FHIRDateTime end) {
      this.end = Optional.of(end);
      return this;
    }
    /** @param start - The start of the period. The boundary is inclusive. */
    public PeriodBuilder.Impl withStart(@NonNull FHIRDateTime start) {
      this.start = Optional.of(start);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public PeriodBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public PeriodBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public PeriodBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }

    public Period build() {
      return new Period(
          OptionConverters.toScala(id),
          OptionConverters.toScala(end),
          OptionConverters.toScala(start),
          extension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
