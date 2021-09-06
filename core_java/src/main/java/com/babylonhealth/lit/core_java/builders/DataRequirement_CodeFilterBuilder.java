package com.babylonhealth.lit.core_java.builders;

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
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class DataRequirement_CodeFilterBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<String> path = Optional.empty();
  private Collection<Coding> code = Collections.emptyList();
  private Optional<String> valueSet = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<String> searchParam = Optional.empty();

  /** Required fields for {@link DataRequirement.CodeFilter} */
  public DataRequirement_CodeFilterBuilder() {}

  /**
   * @param id - Unique id for the element within a resource (for internal references). This may be
   *     any string value that does not contain spaces.
   */
  public DataRequirement_CodeFilterBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param path */
  public DataRequirement_CodeFilterBuilder withPath(@NonNull String path) {
    this.path = Optional.of(path);
    return this;
  }
  /** @param code */
  public DataRequirement_CodeFilterBuilder withCode(@NonNull Coding... code) {
    this.code = Arrays.asList(code);
    return this;
  }
  /** @param code */
  public DataRequirement_CodeFilterBuilder withCode(@NonNull Collection<Coding> code) {
    this.code = Collections.unmodifiableCollection(code);
    return this;
  }
  /** @param valueSet */
  public DataRequirement_CodeFilterBuilder withValueSet(@NonNull String valueSet) {
    this.valueSet = Optional.of(valueSet);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the element. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public DataRequirement_CodeFilterBuilder withExtension(@NonNull Extension... extension) {
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
  public DataRequirement_CodeFilterBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param searchParam */
  public DataRequirement_CodeFilterBuilder withSearchParam(@NonNull String searchParam) {
    this.searchParam = Optional.of(searchParam);
    return this;
  }

  public DataRequirement.CodeFilter build() {
    return new DataRequirement.CodeFilter(
        OptionConverters.toScala(id),
        OptionConverters.toScala(path),
        code.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(valueSet),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(searchParam),
        LitUtils.emptyMetaElMap());
  }
}
