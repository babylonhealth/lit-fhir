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
import com.babylonhealth.lit.core.CONTACT_POINT_USE;
import com.babylonhealth.lit.core.CONTACT_POINT_SYSTEM;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class ContactPointBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<CONTACT_POINT_USE> use = Optional.empty();
  private Optional<Integer> rank = Optional.empty();
  private Optional<String> value = Optional.empty();
  private Optional<CONTACT_POINT_SYSTEM> system = Optional.empty();
  private Optional<Period> period = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();

  /** Required fields for {@link ContactPoint} */
  public ContactPointBuilder() {}

  /**
   * @param id - Unique id for the element within a resource (for internal references). This may be
   *     any string value that does not contain spaces.
   */
  public ContactPointBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /** @param use - Identifies the purpose for the contact point. */
  public ContactPointBuilder withUse(@NonNull CONTACT_POINT_USE use) {
    this.use = Optional.of(use);
    return this;
  }
  /**
   * @param rank - Specifies a preferred order in which to use a set of contacts. ContactPoints with
   *     lower rank values are more preferred than those with higher rank values.
   */
  public ContactPointBuilder withRank(@NonNull Integer rank) {
    this.rank = Optional.of(rank);
    return this;
  }
  /**
   * @param value - The actual contact point details, in a form that is meaningful to the designated
   *     communication system (i.e. phone number or email address).
   */
  public ContactPointBuilder withValue(@NonNull String value) {
    this.value = Optional.of(value);
    return this;
  }
  /**
   * @param system - Telecommunications form for contact point - what communications system is
   *     required to make use of the contact.
   */
  public ContactPointBuilder withSystem(@NonNull CONTACT_POINT_SYSTEM system) {
    this.system = Optional.of(system);
    return this;
  }
  /** @param period - Time period when the contact point was/is in use. */
  public ContactPointBuilder withPeriod(@NonNull Period period) {
    this.period = Optional.of(period);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the element. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public ContactPointBuilder withExtension(@NonNull Extension... extension) {
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
  public ContactPointBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }

  public ContactPoint build() {
    return new ContactPoint(
        OptionConverters.toScala(id),
        OptionConverters.toScala(use),
        OptionConverters.toScala(rank.map(x -> (Object) x)),
        OptionConverters.toScala(value),
        OptionConverters.toScala(system),
        OptionConverters.toScala(period),
        extension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
