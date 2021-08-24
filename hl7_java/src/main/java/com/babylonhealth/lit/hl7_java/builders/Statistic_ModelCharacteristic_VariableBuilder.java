package com.babylonhealth.lit.hl7_java.builders;

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
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface Statistic_ModelCharacteristic_VariableBuilder {
  public Statistic$ModelCharacteristic$Variable build();

  public static Impl init(Reference variableDefinition) {
    return new Impl(variableDefinition);
  }

  public static Impl builder(ReferenceBuilder variableDefinition) {
    return new Impl(variableDefinition.build());
  }

  public class Impl implements Statistic_ModelCharacteristic_VariableBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> handling = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Range> valueRange = Collections.emptyList();
    private Collection<CodeableConcept> valueCategory = Collections.emptyList();
    private Collection<Quantity> valueQuantity = Collections.emptyList();
    private Reference variableDefinition;

    /**
     * Required fields for {@link Statistic$ModelCharacteristic$Variable}
     *
     * @param variableDefinition
     */
    public Impl(Reference variableDefinition) {
      this.variableDefinition = variableDefinition;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Statistic_ModelCharacteristic_VariableBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param handling */
    public Statistic_ModelCharacteristic_VariableBuilder.Impl withHandling(
        @NonNull String handling) {
      this.handling = Optional.of(handling);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public Statistic_ModelCharacteristic_VariableBuilder.Impl withExtension(
        @NonNull Extension... extension) {
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
    public Statistic_ModelCharacteristic_VariableBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Statistic_ModelCharacteristic_VariableBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param valueRange */
    public Statistic_ModelCharacteristic_VariableBuilder.Impl withValueRange(
        @NonNull Range... valueRange) {
      this.valueRange = Arrays.asList(valueRange);
      return this;
    }
    /** @param valueRange */
    public Statistic_ModelCharacteristic_VariableBuilder.Impl withValueRange(
        @NonNull Collection<Range> valueRange) {
      this.valueRange = Collections.unmodifiableCollection(valueRange);
      return this;
    }

    public Statistic_ModelCharacteristic_VariableBuilder.Impl withValueRange(
        @NonNull RangeBuilder... valueRange) {
      this.valueRange = Arrays.stream(valueRange).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param valueCategory */
    public Statistic_ModelCharacteristic_VariableBuilder.Impl withValueCategory(
        @NonNull CodeableConcept... valueCategory) {
      this.valueCategory = Arrays.asList(valueCategory);
      return this;
    }
    /** @param valueCategory */
    public Statistic_ModelCharacteristic_VariableBuilder.Impl withValueCategory(
        @NonNull Collection<CodeableConcept> valueCategory) {
      this.valueCategory = Collections.unmodifiableCollection(valueCategory);
      return this;
    }

    public Statistic_ModelCharacteristic_VariableBuilder.Impl withValueCategory(
        @NonNull CodeableConceptBuilder... valueCategory) {
      this.valueCategory = Arrays.stream(valueCategory).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param valueQuantity */
    public Statistic_ModelCharacteristic_VariableBuilder.Impl withValueQuantity(
        @NonNull Quantity... valueQuantity) {
      this.valueQuantity = Arrays.asList(valueQuantity);
      return this;
    }
    /** @param valueQuantity */
    public Statistic_ModelCharacteristic_VariableBuilder.Impl withValueQuantity(
        @NonNull Collection<Quantity> valueQuantity) {
      this.valueQuantity = Collections.unmodifiableCollection(valueQuantity);
      return this;
    }

    public Statistic_ModelCharacteristic_VariableBuilder.Impl withValueQuantity(
        @NonNull QuantityBuilder... valueQuantity) {
      this.valueQuantity = Arrays.stream(valueQuantity).map(e -> e.build()).collect(toList());
      return this;
    }

    public Statistic$ModelCharacteristic$Variable build() {
      return new Statistic$ModelCharacteristic$Variable(
          OptionConverters.toScala(id),
          OptionConverters.toScala(handling),
          extension.stream().collect(new LitSeqJCollector<>()),
          valueRange.stream().collect(new LitSeqJCollector<>()),
          valueCategory.stream().collect(new LitSeqJCollector<>()),
          valueQuantity.stream().collect(new LitSeqJCollector<>()),
          variableDefinition,
          LitUtils.emptyMetaElMap());
    }
  }
}
