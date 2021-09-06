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

public interface MinValueBuilder extends ExtensionBuilder {
  public MinValue build();

  public static Impl init(@NonNull ChoiceMinValue_Value value) {
    return new Impl(value);
  }

  public static Impl builder(@NonNull ChoiceMinValue_Value value) {
    return new Impl(value);
  }

  public static ChoiceMinValue_Value value(BigDecimal b) {
    return new ChoiceMinValue_Value(b);
  }

  public static ChoiceMinValue_Value value(FHIRDate f) {
    return new ChoiceMinValue_Value(f);
  }

  public static ChoiceMinValue_Value value(FHIRDateTime f) {
    return new ChoiceMinValue_Value(f);
  }

  public static ChoiceMinValue_Value value(Integer i) {
    return new ChoiceMinValue_Value(i);
  }

  public static ChoiceMinValue_Value value(LocalTime l) {
    return new ChoiceMinValue_Value(l);
  }

  public class Impl implements MinValueBuilder {
    private Optional<String> id = Optional.empty();
    private ChoiceMinValue_Value value;

    /**
     * Required fields for {@link MinValue}
     *
     * @param value - Value of extension - must be one of a constrained set of the data types (see
     *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list). Field is a 'choice'
     *     field. Type should be one of BigDecimal, FHIRDate, FHIRDateTime, Integer, LocalTime. To
     *     pass the value in, wrap with one of the MinValueBuilder.value static methods
     */
    public Impl(@NonNull ChoiceMinValue_Value value) {
      this.value = value;
    }

    /**
     * @param id - Unique id for the element within a resource (for internal references). This may
     *     be any string value that does not contain spaces.
     */
    public MinValueBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }

    public MinValue build() {
      return new MinValue(OptionConverters.toScala(id), (Choice) value, LitUtils.emptyMetaElMap());
    }
  }
}
