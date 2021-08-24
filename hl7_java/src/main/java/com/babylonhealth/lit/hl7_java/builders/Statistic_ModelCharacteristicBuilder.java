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

public interface Statistic_ModelCharacteristicBuilder {
  public Statistic.ModelCharacteristic build();

  public static Impl init(CodeableConcept code) {
    return new Impl(code);
  }

  public static Impl builder(CodeableConceptBuilder code) {
    return new Impl(code.build());
  }

  public class Impl implements Statistic_ModelCharacteristicBuilder {
    private Optional<String> id = Optional.empty();
    private CodeableConcept code;
    private Optional<Quantity> value = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Collection<Statistic$ModelCharacteristic$Variable> variable = Collections.emptyList();

    /**
     * Required fields for {@link Statistic.ModelCharacteristic}
     *
     * @param code
     */
    public Impl(CodeableConcept code) {
      this.code = code;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public Statistic_ModelCharacteristicBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param value */
    public Statistic_ModelCharacteristicBuilder.Impl withValue(@NonNull Quantity value) {
      this.value = Optional.of(value);
      return this;
    }

    public Statistic_ModelCharacteristicBuilder.Impl withValue(@NonNull QuantityBuilder value) {
      this.value = Optional.of(value.build());
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the element. To make the use of extensions safe and manageable, there
     *     is a strict set of governance applied to the definition and use of extensions. Though any
     *     implementer can define an extension, there is a set of requirements that SHALL be met as
     *     part of the definition of the extension.
     */
    public Statistic_ModelCharacteristicBuilder.Impl withExtension(
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
    public Statistic_ModelCharacteristicBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Statistic_ModelCharacteristicBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param variable */
    public Statistic_ModelCharacteristicBuilder.Impl withVariable(
        @NonNull Statistic$ModelCharacteristic$Variable... variable) {
      this.variable = Arrays.asList(variable);
      return this;
    }
    /** @param variable */
    public Statistic_ModelCharacteristicBuilder.Impl withVariable(
        @NonNull Collection<Statistic$ModelCharacteristic$Variable> variable) {
      this.variable = Collections.unmodifiableCollection(variable);
      return this;
    }

    public Statistic_ModelCharacteristicBuilder.Impl withVariable(
        @NonNull Statistic_ModelCharacteristic_VariableBuilder... variable) {
      this.variable = Arrays.stream(variable).map(e -> e.build()).collect(toList());
      return this;
    }

    public Statistic.ModelCharacteristic build() {
      return new Statistic.ModelCharacteristic(
          OptionConverters.toScala(id),
          code,
          OptionConverters.toScala(value),
          extension.stream().collect(new LitSeqJCollector<>()),
          variable.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
