package com.babylonhealth.lit.usbase_java.builders;

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
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.usbase_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface MaxValueBuilder extends ExtensionBuilder {
  public MaxValue build();

  public static Impl init(@NonNull ChoiceMaxValue_Value value) {
    return new Impl(value);
  }

  public static Impl builder(@NonNull ChoiceMaxValue_Value value) {
    return new Impl(value);
  }

  public static ChoiceMaxValue_Value value(BigDecimal b) {
    return new ChoiceMaxValue_Value(b);
  }

  public static ChoiceMaxValue_Value value(FHIRDate f) {
    return new ChoiceMaxValue_Value(f);
  }

  public static ChoiceMaxValue_Value value(FHIRDateTime f) {
    return new ChoiceMaxValue_Value(f);
  }

  public static ChoiceMaxValue_Value value(Integer i) {
    return new ChoiceMaxValue_Value(i);
  }

  public static ChoiceMaxValue_Value value(LocalTime l) {
    return new ChoiceMaxValue_Value(l);
  }

  public static ChoiceMaxValue_Value value(ZonedDateTime z) {
    return new ChoiceMaxValue_Value(z);
  }

  public class Impl implements MaxValueBuilder {
    private Optional<String> id = Optional.empty();
    private ChoiceMaxValue_Value value;

    /**
     * Required fields for {@link MaxValue}
     *
     * @param value - Value of extension - must be one of a constrained set of the data types (see
     *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list). Field is a 'choice'
     *     field. Type should be one of BigDecimal, FHIRDate, FHIRDateTime, Integer, LocalTime,
     *     ZonedDateTime. To pass the value in, wrap with one of the MaxValueBuilder.value static
     *     methods
     */
    public Impl(@NonNull ChoiceMaxValue_Value value) {
      this.value = value;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public MaxValueBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }

    public MaxValue build() {
      return new MaxValue(OptionConverters.toScala(id), (Choice) value, LitUtils.emptyMetaElMap());
    }
  }
}
