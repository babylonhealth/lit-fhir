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
import com.babylonhealth.lit.core.IDENTIFIER_USE;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class IdentifierBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<IDENTIFIER_USE> use = Optional.empty();
  private Optional<CodeableConcept> _type = Optional.empty();
  private Optional<String> value = Optional.empty();
  private Optional<String> system = Optional.empty();
  private Optional<Period> period = Optional.empty();
  private Optional<Reference> assigner = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();

  /** Required fields for {@link Identifier} */
  public IdentifierBuilder() {}

  /**
   * @param id - Unique id for the element within a resource (for internal references). This may be
   *     any string value that does not contain spaces.
   */
  public IdentifierBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param use - The purpose of this identifier. */
  public IdentifierBuilder withUse(@NonNull IDENTIFIER_USE use) {
    this.use = Optional.of(use);
    return this;
  }
  /**
   * @param _type - A coded type for the identifier that can be used to determine which identifier
   *     to use for a specific purpose.
   */
  public IdentifierBuilder withType(@NonNull CodeableConcept _type) {
    this._type = Optional.of(_type);
    return this;
  }
  /**
   * @param value - The portion of the identifier typically relevant to the user and which is unique
   *     within the context of the system.
   */
  public IdentifierBuilder withValue(@NonNull String value) {
    this.value = Optional.of(value);
    return this;
  }
  /**
   * @param system - Establishes the namespace for the value - that is, a URL that describes a set
   *     values that are unique.
   */
  public IdentifierBuilder withSystem(@NonNull String system) {
    this.system = Optional.of(system);
    return this;
  }
  /** @param period - Time period during which identifier is/was valid for use. */
  public IdentifierBuilder withPeriod(@NonNull Period period) {
    this.period = Optional.of(period);
    return this;
  }
  /** @param assigner - Organization that issued/manages the identifier. */
  public IdentifierBuilder withAssigner(@NonNull Reference assigner) {
    this.assigner = Optional.of(assigner);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the element. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public IdentifierBuilder withExtension(@NonNull Extension... extension) {
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
  public IdentifierBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }

  public Identifier build() {
    return new Identifier(
        OptionConverters.toScala(id),
        OptionConverters.toScala(use),
        OptionConverters.toScala(_type),
        OptionConverters.toScala(value),
        OptionConverters.toScala(system),
        OptionConverters.toScala(period),
        OptionConverters.toScala(assigner),
        extension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
