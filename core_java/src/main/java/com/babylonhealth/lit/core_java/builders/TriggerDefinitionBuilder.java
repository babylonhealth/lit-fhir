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
import com.babylonhealth.lit.core.TRIGGER_TYPE;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface TriggerDefinitionBuilder extends ElementBuilder {
  public TriggerDefinition build();

  public static Impl init(TRIGGER_TYPE _type) {
    return new Impl(_type);
  }

  public static Impl builder(TRIGGER_TYPE _type) {
    return new Impl(_type);
  }

  public static Choice01658422381 timing(FHIRDate f) {
    return new Choice01658422381(f);
  }

  public static Choice01658422381 timing(FHIRDateTime f) {
    return new Choice01658422381(f);
  }

  public static Choice01658422381 timing(Reference r) {
    return new Choice01658422381(r);
  }

  public static Choice01658422381 timing(Timing t) {
    return new Choice01658422381(t);
  }

  public class Impl implements TriggerDefinitionBuilder {
    private Optional<String> id = Optional.empty();
    private TRIGGER_TYPE _type;
    private Optional<String> name = Optional.empty();
    private Collection<DataRequirement> data = Collections.emptyList();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Choice01658422381> timing = Optional.empty();
    private Optional<Expression> condition = Optional.empty();

    /**
     * Required fields for {@link TriggerDefinition}
     *
     * @param _type - The type of triggering event.
     */
    public Impl(TRIGGER_TYPE _type) {
      this._type = _type;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public TriggerDefinitionBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param name - A formal name for the event. This may be an absolute URI that identifies the
     *     event formally (e.g. from a trigger registry), or a simple relative URI that identifies
     *     the event in a local context.
     */
    public TriggerDefinitionBuilder.Impl withName(@NonNull String name) {
      this.name = Optional.of(name);
      return this;
    }
    /**
     * @param data - The triggering data of the event (if this is a data trigger). If more than one
     *     data is requirement is specified, then all the data requirements must be true.
     */
    public TriggerDefinitionBuilder.Impl withData(@NonNull DataRequirement... data) {
      this.data = Arrays.asList(data);
      return this;
    }
    /**
     * @param data - The triggering data of the event (if this is a data trigger). If more than one
     *     data is requirement is specified, then all the data requirements must be true.
     */
    public TriggerDefinitionBuilder.Impl withData(@NonNull Collection<DataRequirement> data) {
      this.data = Collections.unmodifiableCollection(data);
      return this;
    }

    public TriggerDefinitionBuilder.Impl withData(@NonNull DataRequirementBuilder... data) {
      this.data = Arrays.stream(data).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public TriggerDefinitionBuilder.Impl withExtension(@NonNull Extension... extension) {
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
    public TriggerDefinitionBuilder.Impl withExtension(@NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public TriggerDefinitionBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param timing - The timing of the event (if this is a periodic trigger). Field is a 'choice'
     *     field. Type should be one of FHIRDate, FHIRDateTime, Reference, Timing. To pass the value
     *     in, wrap with one of the TriggerDefinitionBuilder.timing static methods
     */
    public TriggerDefinitionBuilder.Impl withTiming(@NonNull Choice01658422381 timing) {
      this.timing = Optional.of(timing);
      return this;
    }
    /**
     * @param condition - A boolean-valued expression that is evaluated in the context of the
     *     container of the trigger definition and returns whether or not the trigger fires.
     */
    public TriggerDefinitionBuilder.Impl withCondition(@NonNull Expression condition) {
      this.condition = Optional.of(condition);
      return this;
    }

    public TriggerDefinitionBuilder.Impl withCondition(@NonNull ExpressionBuilder condition) {
      this.condition = Optional.of(condition.build());
      return this;
    }

    public TriggerDefinition build() {
      return new TriggerDefinition(
          OptionConverters.toScala(id),
          _type,
          OptionConverters.toScala(name),
          data.stream().collect(new LitSeqJCollector<>()),
          extension.stream().collect(new LitSeqJCollector<>()),
          (Option) OptionConverters.toScala(timing),
          OptionConverters.toScala(condition),
          LitUtils.emptyMetaElMap());
    }
  }
}
