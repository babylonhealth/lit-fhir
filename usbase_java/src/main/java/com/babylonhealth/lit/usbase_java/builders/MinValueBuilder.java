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
import java.util.Optional;
import lombok.NonNull;
import scala.jdk.javaapi.OptionConverters;
import scala.math.BigDecimal;

public interface MinValueBuilder extends ExtensionBuilder {
  public MinValue build();

  public static Impl init(@NonNull Choice01845407622 value) {
    return new Impl(value);
  }

  public static Impl builder(@NonNull Choice01845407622 value) {
    return new Impl(value);
  }

  public static Choice01845407622 value(BigDecimal b) {
    return new Choice01845407622(b);
  }

  public static Choice01845407622 value(FHIRDate f) {
    return new Choice01845407622(f);
  }

  public static Choice01845407622 value(FHIRDateTime f) {
    return new Choice01845407622(f);
  }

  public static Choice01845407622 value(Integer i) {
    return new Choice01845407622(i);
  }

  public static Choice01845407622 value(LocalTime l) {
    return new Choice01845407622(l);
  }

  public class Impl implements MinValueBuilder {
    private Optional<String> id = Optional.empty();
    private Choice01845407622 value;

    /**
     * Required fields for {@link MinValue}
     *
     * @param value - Value of extension - must be one of a constrained set of the data types (see
     *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list). Field is a 'choice'
     *     field. Type should be one of BigDecimal, FHIRDate, FHIRDateTime, Integer, LocalTime. To
     *     pass the value in, wrap with one of the MinValueBuilder.value static methods
     */
    public Impl(@NonNull Choice01845407622 value) {
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
