package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.Option;
import scala.jdk.javaapi.OptionConverters;

public interface Observation_ComponentBuilder {
  public Observation.Component build();

  public static Impl init(CodeableConcept code) {
    return new Impl(code);
  }

  public static Impl builder(CodeableConceptBuilder code) {
    return new Impl(code.build());
  }

  public static Choice02118820890 value(Boolean b) {
    return new Choice02118820890(b);
  }

  public static Choice02118820890 value(CodeableConcept c) {
    return new Choice02118820890(c);
  }

  public static Choice02118820890 value(FHIRDateTime f) {
    return new Choice02118820890(f);
  }

  public static Choice02118820890 value(Integer i) {
    return new Choice02118820890(i);
  }

  public static Choice02118820890 value(LocalTime l) {
    return new Choice02118820890(l);
  }

  public static Choice02118820890 value(Period p) {
    return new Choice02118820890(p);
  }

  public static Choice02118820890 value(Quantity q) {
    return new Choice02118820890(q);
  }

  public static Choice02118820890 value(Range r) {
    return new Choice02118820890(r);
  }

  public static Choice02118820890 value(Ratio r) {
    return new Choice02118820890(r);
  }

  public static Choice02118820890 value(SampledData s) {
    return new Choice02118820890(s);
  }

  public static Choice02118820890 value(String s) {
    return new Choice02118820890(s);
  }

  public class Impl implements Observation_ComponentBuilder {
    private Optional<String> id = Optional.empty();
    private CodeableConcept code;
    private Optional<Choice02118820890> value = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<CodeableConcept> interpretation = Collections.emptyList();
    private Collection<Observation.ReferenceRange> referenceRange = Collections.emptyList();
    private Optional<CodeableConcept> dataAbsentReason = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link Observation.Component}
     *
     * @param code - Describes what was observed. Sometimes this is called the observation "name".
     */
    public Impl(CodeableConcept code) {
      this.code = code;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Observation_ComponentBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param value - The information determined as a result of making the observation, if the
     *     information has a simple value. Field is a 'choice' field. Type should be one of Boolean,
     *     CodeableConcept, FHIRDateTime, Integer, LocalTime, Period, Quantity, Range, Ratio,
     *     SampledData, String. To pass the value in, wrap with one of the
     *     Observation_ComponentBuilder.value static methods
     */
    public Observation_ComponentBuilder.Impl withValue(@NonNull Choice02118820890 value) {
      this.value = Optional.of(value);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public Observation_ComponentBuilder.Impl withExtension(@NonNull Extension... extension) {
      this.extension = Arrays.asList(extension);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public Observation_ComponentBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Observation_ComponentBuilder.Impl withExtension(@NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param interpretation - A categorical assessment of an observation value. For example, high,
     *     low, normal.
     */
    public Observation_ComponentBuilder.Impl withInterpretation(
        @NonNull CodeableConcept... interpretation) {
      this.interpretation = Arrays.asList(interpretation);
      return this;
    }
    /**
     * @param interpretation - A categorical assessment of an observation value. For example, high,
     *     low, normal.
     */
    public Observation_ComponentBuilder.Impl withInterpretation(
        @NonNull Collection<CodeableConcept> interpretation) {
      this.interpretation = Collections.unmodifiableCollection(interpretation);
      return this;
    }

    public Observation_ComponentBuilder.Impl withInterpretation(
        @NonNull CodeableConceptBuilder... interpretation) {
      this.interpretation = Arrays.stream(interpretation).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param referenceRange - Guidance on how to interpret the value by comparison to a normal or
     *     recommended range. Multiple reference ranges are interpreted as an "OR". In other words,
     *     to represent two distinct target populations, two `referenceRange` elements would be
     *     used.
     */
    public Observation_ComponentBuilder.Impl withReferenceRange(
        @NonNull Observation.ReferenceRange... referenceRange) {
      this.referenceRange = Arrays.asList(referenceRange);
      return this;
    }
    /**
     * @param referenceRange - Guidance on how to interpret the value by comparison to a normal or
     *     recommended range. Multiple reference ranges are interpreted as an "OR". In other words,
     *     to represent two distinct target populations, two `referenceRange` elements would be
     *     used.
     */
    public Observation_ComponentBuilder.Impl withReferenceRange(
        @NonNull Collection<Observation.ReferenceRange> referenceRange) {
      this.referenceRange = Collections.unmodifiableCollection(referenceRange);
      return this;
    }

    public Observation_ComponentBuilder.Impl withReferenceRange(
        @NonNull Observation_ReferenceRangeBuilder... referenceRange) {
      this.referenceRange = Arrays.stream(referenceRange).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param dataAbsentReason - Provides a reason why the expected value in the element
     *     Observation.value[x] is missing.
     */
    public Observation_ComponentBuilder.Impl withDataAbsentReason(
        @NonNull CodeableConcept dataAbsentReason) {
      this.dataAbsentReason = Optional.of(dataAbsentReason);
      return this;
    }

    public Observation_ComponentBuilder.Impl withDataAbsentReason(
        @NonNull CodeableConceptBuilder dataAbsentReason) {
      this.dataAbsentReason = Optional.of(dataAbsentReason.build());
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the resource and that modifies the understanding of the
     *     element that contains it and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer is allowed to define an
     *     extension, there is a set of requirements that SHALL be met as part of the definition of
     *     the extension. Applications processing a resource are required to check for modifier
     *     extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public Observation_ComponentBuilder.Impl withModifierExtension(
        @NonNull Extension... modifierExtension) {
      this.modifierExtension = Arrays.asList(modifierExtension);
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the resource and that modifies the understanding of the
     *     element that contains it and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer is allowed to define an
     *     extension, there is a set of requirements that SHALL be met as part of the definition of
     *     the extension. Applications processing a resource are required to check for modifier
     *     extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public Observation_ComponentBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Observation_ComponentBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public Observation.Component build() {
      return new Observation.Component(
          OptionConverters.toScala(id),
          code,
          (Option) OptionConverters.toScala(value),
          extension.stream().collect(new LitSeqJCollector<>()),
          interpretation.stream().collect(new LitSeqJCollector<>()),
          referenceRange.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(dataAbsentReason),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
