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
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class CodingBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<String> code = Optional.empty();
  private Optional<String> system = Optional.empty();
  private Optional<String> version = Optional.empty();
  private Optional<String> display = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Boolean> userSelected = Optional.empty();

  /** Required fields for {@link Coding} */
  public CodingBuilder() {}

  /**
   * @param id - Unique id for the element within a resource (for internal references). This may be
   *     any string value that does not contain spaces.
   */
  public CodingBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param code - A symbol in syntax defined by the system. The symbol may be a predefined code or
   *     an expression in a syntax defined by the coding system (e.g. post-coordination).
   */
  public CodingBuilder withCode(@NonNull String code) {
    this.code = Optional.of(code);
    return this;
  }
  /**
   * @param system - The identification of the code system that defines the meaning of the symbol in
   *     the code.
   */
  public CodingBuilder withSystem(@NonNull String system) {
    this.system = Optional.of(system);
    return this;
  }
  /**
   * @param version - The version of the code system which was used when choosing this code. Note
   *     that a well-maintained code system does not need the version reported, because the meaning
   *     of codes is consistent across versions. However this cannot consistently be assured, and
   *     when the meaning is not guaranteed to be consistent, the version SHOULD be exchanged.
   */
  public CodingBuilder withVersion(@NonNull String version) {
    this.version = Optional.of(version);
    return this;
  }
  /**
   * @param display - A representation of the meaning of the code in the system, following the rules
   *     of the system.
   */
  public CodingBuilder withDisplay(@NonNull String display) {
    this.display = Optional.of(display);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the element. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public CodingBuilder withExtension(@NonNull Extension... extension) {
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
  public CodingBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param userSelected - Indicates that this coding was chosen by a user directly - e.g. off a
   *     pick list of available items (codes or displays).
   */
  public CodingBuilder withUserSelected(@NonNull Boolean userSelected) {
    this.userSelected = Optional.of(userSelected);
    return this;
  }

  public Coding build() {
    return new Coding(
        OptionConverters.toScala(id),
        OptionConverters.toScala(code),
        OptionConverters.toScala(system),
        OptionConverters.toScala(version),
        OptionConverters.toScala(display),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(userSelected.map(x -> (Object) x)),
        LitUtils.emptyMetaElMap());
  }
}
