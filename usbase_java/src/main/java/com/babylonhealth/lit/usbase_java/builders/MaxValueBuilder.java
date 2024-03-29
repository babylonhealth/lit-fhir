package com.babylonhealth.lit.usbase_java.builders;

import com.babylonhealth.lit.core.Choice;
import com.babylonhealth.lit.core.FHIRDate;
import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.core_java.LitUtils;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.usbase.model.*;
import com.babylonhealth.lit.usbase_java.model.Unions.*;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;
import scala.math.BigDecimal;

public interface MaxValueBuilder extends ExtensionBuilder {
  public MaxValue build();

  public static Impl init(@NonNull Choice00916299533 value) {
    return new Impl(value);
  }

  public static Impl builder(@NonNull Choice00916299533 value) {
    return new Impl(value);
  }

  public static Choice00916299533 value(BigDecimal b) {
    return new Choice00916299533(b);
  }

  public static Choice00916299533 value(FHIRDate f) {
    return new Choice00916299533(f);
  }

  public static Choice00916299533 value(FHIRDateTime f) {
    return new Choice00916299533(f);
  }

  public static Choice00916299533 value(Integer i) {
    return new Choice00916299533(i);
  }

  public static Choice00916299533 value(LocalTime l) {
    return new Choice00916299533(l);
  }

  public static Choice00916299533 value(ZonedDateTime z) {
    return new Choice00916299533(z);
  }

  public class Impl implements MaxValueBuilder {
    private Optional<String> id = Optional.empty();
    private Choice00916299533 value;

    /**
     * Required fields for {@link MaxValue}
     *
     * @param value - Value of extension - must be one of a constrained set of the data types (see
     *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list). Field is a 'choice'
     *     field. Type should be one of BigDecimal, FHIRDate, FHIRDateTime, Integer, LocalTime,
     *     ZonedDateTime. To pass the value in, wrap with one of the MaxValueBuilder.value static
     *     methods
     */
    public Impl(@NonNull Choice00916299533 value) {
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
