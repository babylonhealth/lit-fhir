package com.babylonhealth.lit.hl7_java.builders;

import static java.util.stream.Collectors.toList;

import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;

public interface SpecimenDefinition_TypeTested_HandlingBuilder {
  public SpecimenDefinition$TypeTested$Handling build();

  public static Impl init() {
    return new Impl();
  }

  public static Impl builder() {
    return new Impl();
  }

  public class Impl implements SpecimenDefinition_TypeTested_HandlingBuilder {
    private Optional<String> id = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Duration> maxDuration = Optional.empty();
    private Optional<String> instruction = Optional.empty();
    private Optional<Range> temperatureRange = Optional.empty();
    private Collection<Extension> modifierExtension = Collections.emptyList();
    private Optional<CodeableConcept> temperatureQualifier = Optional.empty();

    /** Required fields for {@link SpecimenDefinition$TypeTested$Handling} */
    public Impl() {}

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public SpecimenDefinition_TypeTested_HandlingBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public SpecimenDefinition_TypeTested_HandlingBuilder.Impl withExtension(
        @NonNull Extension... extension) {
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
    public SpecimenDefinition_TypeTested_HandlingBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public SpecimenDefinition_TypeTested_HandlingBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param maxDuration */
    public SpecimenDefinition_TypeTested_HandlingBuilder.Impl withMaxDuration(
        @NonNull Duration maxDuration) {
      this.maxDuration = Optional.of(maxDuration);
      return this;
    }

    public SpecimenDefinition_TypeTested_HandlingBuilder.Impl withMaxDuration(
        @NonNull DurationBuilder maxDuration) {
      this.maxDuration = Optional.of(maxDuration.build());
      return this;
    }
    /** @param instruction */
    public SpecimenDefinition_TypeTested_HandlingBuilder.Impl withInstruction(
        @NonNull String instruction) {
      this.instruction = Optional.of(instruction);
      return this;
    }
    /** @param temperatureRange */
    public SpecimenDefinition_TypeTested_HandlingBuilder.Impl withTemperatureRange(
        @NonNull Range temperatureRange) {
      this.temperatureRange = Optional.of(temperatureRange);
      return this;
    }

    public SpecimenDefinition_TypeTested_HandlingBuilder.Impl withTemperatureRange(
        @NonNull RangeBuilder temperatureRange) {
      this.temperatureRange = Optional.of(temperatureRange.build());
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
    public SpecimenDefinition_TypeTested_HandlingBuilder.Impl withModifierExtension(
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
    public SpecimenDefinition_TypeTested_HandlingBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public SpecimenDefinition_TypeTested_HandlingBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param temperatureQualifier */
    public SpecimenDefinition_TypeTested_HandlingBuilder.Impl withTemperatureQualifier(
        @NonNull CodeableConcept temperatureQualifier) {
      this.temperatureQualifier = Optional.of(temperatureQualifier);
      return this;
    }

    public SpecimenDefinition_TypeTested_HandlingBuilder.Impl withTemperatureQualifier(
        @NonNull CodeableConceptBuilder temperatureQualifier) {
      this.temperatureQualifier = Optional.of(temperatureQualifier.build());
      return this;
    }

    public SpecimenDefinition$TypeTested$Handling build() {
      return new SpecimenDefinition$TypeTested$Handling(
          OptionConverters.toScala(id),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(maxDuration),
          OptionConverters.toScala(instruction),
          OptionConverters.toScala(temperatureRange),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(temperatureQualifier),
          LitUtils.emptyMetaElMap());
    }
  }
}
