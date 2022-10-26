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
import scala.Option;
import scala.jdk.javaapi.OptionConverters;

public interface DataRequirement_DateFilterBuilder {
  public DataRequirement.DateFilter build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public static ChoiceDurationOrDateTimeOrPeriod value(Duration d) {
    return new ChoiceDurationOrDateTimeOrPeriod(d);
  }

  public static ChoiceDurationOrDateTimeOrPeriod value(FHIRDateTime f) {
    return new ChoiceDurationOrDateTimeOrPeriod(f);
  }

  public static ChoiceDurationOrDateTimeOrPeriod value(Period p) {
    return new ChoiceDurationOrDateTimeOrPeriod(p);
  }

  public class Impl implements DataRequirement_DateFilterBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> path = Optional.empty();
    private Optional<ChoiceDurationOrDateTimeOrPeriod> value = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<String> searchParam = Optional.empty();

    /** Required fields for {@link DataRequirement.DateFilter} */
    public Impl() {}

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public DataRequirement_DateFilterBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param path */
    public DataRequirement_DateFilterBuilder.Impl withPath(@NonNull String path) {
      this.path = Optional.of(path);
      return this;
    }
    /**
     * @param value Field is a 'choice' field. Type should be one of Duration, FHIRDateTime, Period.
     *     To pass the value in, wrap with one of the DataRequirement_DateFilterBuilder.value static
     *     methods
     */
    public DataRequirement_DateFilterBuilder.Impl withValue(
        @NonNull ChoiceDurationOrDateTimeOrPeriod value) {
      this.value = Optional.of(value);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public DataRequirement_DateFilterBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public DataRequirement_DateFilterBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public DataRequirement_DateFilterBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param searchParam */
    public DataRequirement_DateFilterBuilder.Impl withSearchParam(@NonNull String searchParam) {
      this.searchParam = Optional.of(searchParam);
      return this;
    }

    public DataRequirement.DateFilter build() {
      return new DataRequirement.DateFilter(
          OptionConverters.toScala(id),
          OptionConverters.toScala(path),
          (Option) OptionConverters.toScala(value),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(searchParam),
          LitUtils.emptyMetaElMap());
    }
  }
}
