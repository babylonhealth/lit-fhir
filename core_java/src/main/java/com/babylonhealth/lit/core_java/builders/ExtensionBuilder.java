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

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class ExtensionBuilder {
  private Optional<String> id = Optional.empty();
  private String url;
  private Optional<Choice> value = Optional.empty();
  private Collection<Extension> extension = Collections.emptyList();

  /**
   * Required fields for {@link Extension}
   *
   * @param url - Source of the definition for the extension code - a logical name or a URL.
   */
  public ExtensionBuilder(String url) {
    this.url = url;
  }

  /**
   * @param id - Unique id for the element within a resource (for internal references). This may be
   *     any string value that does not contain spaces.
   */
  public ExtensionBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param value - Value of extension - must be one of a constrained set of the data types (see
   *     [Extensibility](extensibility.html) for a list). Field is a 'choice' field. Type should be
   *     one of Address, Age, Annotation, Attachment, byte[], BigDecimal, Boolean, String,
   *     CodeableConcept, Coding, ContactDetail, ContactPoint, Contributor, Count, DataRequirement,
   *     Distance, Dosage, Duration, Expression, FHIRDate, FHIRDateTime, HumanName, Identifier,
   *     Integer, LocalTime, Meta, Money, ParameterDefinition, Period, Quantity, Range, Ratio,
   *     Reference, RelatedArtifact, SampledData, Signature, Timing, TriggerDefinition, UUID,
   *     UsageContext, ZonedDateTime.
   */
  public <T> ExtensionBuilder withValue(@NonNull T value) {
    var guessedSuffix = autoSuffix(value.getClass().getSimpleName(), Extension$.MODULE$.value());
    return withValue(guessedSuffix, value);
  }

  /**
   * Alternative to the 'main' withValue method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type. When the parameter is
   * one of Integer or String then there are multiple candidate 'types' for the FHIR object, and we
   * are unable to automagically disambiguate
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types. For values of type Integer, the valid values are Integer,
   *     PositiveInt, UnsignedInt. For values of type String, the valid values are Canonical, Code,
   *     Id, Markdown, Oid, String, Uri, Url.
   * @param value - The value to be passed to the builder
   */
  public <T> ExtensionBuilder withValue(String suffix, @NonNull T value) {
    guard(value.getClass().getSimpleName(), suffix, Extension$.MODULE$.value());
    this.value =
        Optional.of((Choice) Choice$.MODULE$.fromSuffix(suffix, value, Extension$.MODULE$.value()));
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the element. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public ExtensionBuilder withExtension(@NonNull Extension... extension) {
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
  public ExtensionBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }

  public Extension build() {
    return new Extension(
        OptionConverters.toScala(id),
        url,
        (Option) OptionConverters.toScala(value),
        extension.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
