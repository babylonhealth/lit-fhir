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
import com.babylonhealth.lit.core.TRIGGER_TYPE;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.ParamDistinguisher;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class TriggerDefinitionBuilder {
  private Optional<String> id = Optional.empty();
  private TRIGGER_TYPE _type;
  private Optional<String> name = Optional.empty();
  private Collection<DataRequirement> data = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<
          Choice<$bslash$div<$bslash$div<$bslash$div<FHIRDate, FHIRDateTime>, Reference>, Timing>>>
      timing = Optional.empty();
  private Optional<Expression> condition = Optional.empty();

  /**
   * Required fields for {@link TriggerDefinition}
   *
   * @param _type - The type of triggering event.
   */
  public TriggerDefinitionBuilder(TRIGGER_TYPE _type) {
    this._type = _type;
  }

  /**
   * @param id - Unique id for the element within a resource (for internal references). This may be
   *     any string value that does not contain spaces.
   */
  public TriggerDefinitionBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param name - A formal name for the event. This may be an absolute URI that identifies the
   *     event formally (e.g. from a trigger registry), or a simple relative URI that identifies the
   *     event in a local context.
   */
  public TriggerDefinitionBuilder withName(@NonNull String name) {
    this.name = Optional.of(name);
    return this;
  }
  /**
   * @param data - The triggering data of the event (if this is a data trigger). If more than one
   *     data is requirement is specified, then all the data requirements must be true.
   */
  public TriggerDefinitionBuilder withData(@NonNull DataRequirement... data) {
    this.data = Arrays.asList(data);
    return this;
  }
  /**
   * @param data - The triggering data of the event (if this is a data trigger). If more than one
   *     data is requirement is specified, then all the data requirements must be true.
   */
  public TriggerDefinitionBuilder withData(@NonNull Collection<DataRequirement> data) {
    this.data = Collections.unmodifiableCollection(data);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the element. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public TriggerDefinitionBuilder withExtension(@NonNull Extension... extension) {
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
  public TriggerDefinitionBuilder withExtension(@NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /**
   * @param timing - The timing of the event (if this is a periodic trigger). Field is a 'choice'
   *     field. Type should be one of FHIRDate, FHIRDateTime, Reference, Timing.
   */
  public <T> TriggerDefinitionBuilder withTiming(@NonNull T timing) {
    var guessedSuffix =
        autoSuffix(timing.getClass().getSimpleName(), TriggerDefinition$.MODULE$.timing());
    return withTiming(guessedSuffix, timing);
  }

  /**
   * Alternative to the 'main' withTiming method. This will be marginally faster than the other
   * method, but requires that you know the correct suffix for your data type.
   *
   * @param suffix - The suffix of the produced FHIR json -- can be considered a string to
   *     disambiguate between types.
   * @param timing - The value to be passed to the builder
   */
  public <T> TriggerDefinitionBuilder withTiming(String suffix, @NonNull T timing) {
    guard(timing.getClass().getSimpleName(), suffix, TriggerDefinition$.MODULE$.timing());
    this.timing =
        Optional.of(
            (Choice)
                Choice$.MODULE$.fromSuffix(suffix, timing, TriggerDefinition$.MODULE$.timing()));
    return this;
  }
  /**
   * @param condition - A boolean-valued expression that is evaluated in the context of the
   *     container of the trigger definition and returns whether or not the trigger fires.
   */
  public TriggerDefinitionBuilder withCondition(@NonNull Expression condition) {
    this.condition = Optional.of(condition);
    return this;
  }

  public TriggerDefinition build() {
    return new TriggerDefinition(
        OptionConverters.toScala(id),
        _type,
        OptionConverters.toScala(name),
        data.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(timing),
        OptionConverters.toScala(condition),
        LitUtils.emptyMetaElMap());
  }
}